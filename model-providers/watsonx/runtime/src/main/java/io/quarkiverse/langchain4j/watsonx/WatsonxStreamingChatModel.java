package io.quarkiverse.langchain4j.watsonx;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.ChatMessage;
import dev.langchain4j.model.StreamingResponseHandler;
import dev.langchain4j.model.chat.StreamingChatLanguageModel;
import dev.langchain4j.model.chat.TokenCountEstimator;
import dev.langchain4j.model.output.FinishReason;
import dev.langchain4j.model.output.Response;
import dev.langchain4j.model.output.TokenUsage;
import io.quarkiverse.langchain4j.watsonx.bean.Parameters;
import io.quarkiverse.langchain4j.watsonx.bean.Parameters.LengthPenalty;
import io.quarkiverse.langchain4j.watsonx.bean.TextGenerationRequest;
import io.quarkiverse.langchain4j.watsonx.bean.TextGenerationResponse;
import io.quarkiverse.langchain4j.watsonx.bean.TokenizationRequest;
import io.smallrye.mutiny.Context;

public class WatsonxStreamingChatModel extends WatsonxModel implements StreamingChatLanguageModel, TokenCountEstimator {

    public WatsonxStreamingChatModel(WatsonxModel.Builder config) {
        super(config);
    }

    @Override
    public void generate(List<ChatMessage> messages, StreamingResponseHandler<AiMessage> handler) {

        LengthPenalty lengthPenalty = null;
        if (Objects.nonNull(decayFactor) || Objects.nonNull(startIndex)) {
            lengthPenalty = new LengthPenalty(decayFactor, startIndex);
        }

        Parameters parameters = Parameters.builder()
                .decodingMethod(decodingMethod)
                .lengthPenalty(lengthPenalty)
                .minNewTokens(minNewTokens)
                .maxNewTokens(maxNewTokens)
                .randomSeed(randomSeed)
                .stopSequences(stopSequences)
                .temperature(temperature)
                .topP(topP)
                .topK(topK)
                .repetitionPenalty(repetitionPenalty)
                .truncateInputTokens(truncateInputTokens)
                .includeStopSequence(includeStopSequence)
                .build();

        TextGenerationRequest request = new TextGenerationRequest(modelId, projectId, toInput(messages), parameters);
        Context context = Context.of("response", new ArrayList<TextGenerationResponse>());

        client.chatStreaming(request, version)
                .subscribe()
                .with(context,
                        new Consumer<TextGenerationResponse>() {
                            @Override
                            @SuppressWarnings("unchecked")
                            public void accept(TextGenerationResponse response) {
                                try {

                                    if (response == null || response.results() == null || response.results().isEmpty())
                                        return;

                                    ((List<TextGenerationResponse>) context.get("response")).add(response);
                                    handler.onNext(response.results().get(0).generatedText());

                                } catch (Exception e) {
                                    handler.onError(e);
                                }
                            }
                        },
                        new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable error) {
                                handler.onError(error);
                            }
                        },
                        new Runnable() {
                            @Override
                            @SuppressWarnings("unchecked")
                            public void run() {
                                var list = ((List<TextGenerationResponse>) context.get("response"));

                                int inputTokenCount = 0;
                                int outputTokenCount = 0;
                                String stopReason = null;
                                StringBuilder builder = new StringBuilder();

                                for (int i = 0; i < list.size(); i++) {

                                    TextGenerationResponse.Result response = list.get(i).results().get(0);

                                    if (i == 0)
                                        inputTokenCount = response.inputTokenCount();

                                    if (i == list.size() - 1) {
                                        outputTokenCount = response.generatedTokenCount();
                                        stopReason = response.stopReason();
                                    }

                                    builder.append(response.generatedText());
                                }

                                AiMessage message = new AiMessage(builder.toString());
                                TokenUsage tokenUsage = new TokenUsage(inputTokenCount, outputTokenCount);
                                FinishReason finishReason = toFinishReason(stopReason);
                                handler.onComplete(Response.from(message, tokenUsage, finishReason));
                            }
                        });
    }

    @Override
    public int estimateTokenCount(List<ChatMessage> messages) {

        var input = toInput(messages);
        var request = new TokenizationRequest(modelId, input, projectId);
        return retryOn(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return client.tokenization(request, version).result().tokenCount();
            }
        });
    }
}

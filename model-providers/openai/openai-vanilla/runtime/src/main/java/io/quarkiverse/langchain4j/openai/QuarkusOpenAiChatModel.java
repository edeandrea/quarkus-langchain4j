package io.quarkiverse.langchain4j.openai;

import java.net.Proxy;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import dev.langchain4j.agent.tool.ToolSpecification;
import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.ChatMessage;
import dev.langchain4j.model.Tokenizer;
import dev.langchain4j.model.chat.DisabledChatLanguageModel;
import dev.langchain4j.model.chat.listener.ChatModelListener;
import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;
import dev.langchain4j.model.openai.spi.OpenAiChatModelBuilderFactory;
import dev.langchain4j.model.output.Response;

public class QuarkusOpenAiChatModel extends OpenAiChatModel {
    private final DisabledChatLanguageModel disabledModel;

    public QuarkusOpenAiChatModel(String baseUrl, String apiKey, String organizationId, String modelName, Double temperature,
            Double topP, List<String> stop, Integer maxTokens, Double presencePenalty, Double frequencyPenalty,
            Map<String, Integer> logitBias, String responseFormat, Integer seed, String user, Duration timeout,
            Integer maxRetries, Proxy proxy, Boolean logRequests, Boolean logResponses, Tokenizer tokenizer,
            Map<String, String> customHeaders, List<ChatModelListener> listeners, boolean enableIntegration) {

        super(baseUrl, apiKey, organizationId, modelName, temperature, topP, stop, maxTokens, presencePenalty, frequencyPenalty,
                logitBias, responseFormat, seed, user, timeout, maxRetries, proxy, logRequests, logResponses, tokenizer,
                customHeaders, listeners);

        this.disabledModel = !enableIntegration ? new DisabledChatLanguageModel() : null;
    }

    protected QuarkusOpenAiChatModel() {
        // Needed for CDI
        this(null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, null, null, null,
                null, null, false);
    }

    @Override
    public String generate(String userMessage) {
        return (this.disabledModel != null) ? this.disabledModel.generate(userMessage) : super.generate(userMessage);
    }

    @Override
    public Response<AiMessage> generate(ChatMessage... messages) {
        return (this.disabledModel != null) ? this.disabledModel.generate(messages) : super.generate(messages);
    }

    @Override
    public Response<AiMessage> generate(List<ChatMessage> messages) {
        return (this.disabledModel != null) ? this.disabledModel.generate(messages) : super.generate(messages);
    }

    @Override
    public Response<AiMessage> generate(List<ChatMessage> messages, List<ToolSpecification> toolSpecifications) {
        return (this.disabledModel != null) ? this.disabledModel.generate(messages, toolSpecifications)
                : super.generate(messages, toolSpecifications);
    }

    @Override
    public Response<AiMessage> generate(List<ChatMessage> messages, ToolSpecification toolSpecification) {
        return (this.disabledModel != null) ? this.disabledModel.generate(messages, toolSpecification)
                : super.generate(messages, toolSpecification);
    }

    public static class QuarkusOpenAiChatModelBuilderFactory implements OpenAiChatModelBuilderFactory {
        @Override
        public QuarkusOpenAiChatModelBuilder get() {
            return new QuarkusOpenAiChatModelBuilder();
        }
    }

    /**
     * For now this repeats what's in OpenAiChatModel.OpenAiChatModelBuilder because the attributes are private there
     * If we decide to go this route we can make a change in upstream that makes the attributes of the
     * model builder classes protected so that then we could remove the duplication.
     */
    public static class QuarkusOpenAiChatModelBuilder extends OpenAiChatModelBuilder {
        private boolean enableIntegration = true;
        private String baseUrl;
        private String apiKey;
        private String organizationId;
        private String modelName;
        private Double temperature;
        private Double topP;
        private List<String> stop;
        private Integer maxTokens;
        private Double presencePenalty;
        private Double frequencyPenalty;
        private Map<String, Integer> logitBias;
        private String responseFormat;
        private Integer seed;
        private String user;
        private Duration timeout;
        private Integer maxRetries;
        private Proxy proxy;
        private Boolean logRequests;
        private Boolean logResponses;
        private Tokenizer tokenizer;
        private Map<String, String> customHeaders;
        private List<ChatModelListener> listeners;

        public QuarkusOpenAiChatModelBuilder disableIntegration() {
            this.enableIntegration = false;
            return this;
        }

        public QuarkusOpenAiChatModelBuilder enableIntegration(boolean enableIntegration) {
            this.enableIntegration = enableIntegration;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModel build() {
            return new QuarkusOpenAiChatModel(
                    this.baseUrl,
                    this.apiKey,
                    this.organizationId,
                    this.modelName,
                    this.temperature,
                    this.topP,
                    this.stop,
                    this.maxTokens,
                    this.presencePenalty,
                    this.frequencyPenalty,
                    this.logitBias,
                    this.responseFormat,
                    this.seed,
                    this.user,
                    this.timeout,
                    this.maxRetries,
                    this.proxy,
                    this.logRequests,
                    this.logResponses,
                    this.tokenizer,
                    this.customHeaders,
                    this.listeners,
                    this.enableIntegration);
        }

        /**
         * Everything else below here will disappear once the above-mentioned change
         * to OpenAiChatModel.OpenAiChatModelBuilder is made
         */

        @Override
        public QuarkusOpenAiChatModelBuilder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder modelName(OpenAiChatModelName modelName) {
            this.modelName = modelName.toString();
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder organizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder temperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder topP(Double topP) {
            this.topP = topP;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder stop(List<String> stop) {
            this.stop = stop;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder maxTokens(Integer maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder presencePenalty(Double presencePenalty) {
            this.presencePenalty = presencePenalty;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder frequencyPenalty(Double frequencyPenalty) {
            this.frequencyPenalty = frequencyPenalty;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder logitBias(Map<String, Integer> logitBias) {
            this.logitBias = logitBias;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder responseFormat(String responseFormat) {
            this.responseFormat = responseFormat;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder seed(Integer seed) {
            this.seed = seed;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder user(String user) {
            this.user = user;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder timeout(Duration timeout) {
            this.timeout = timeout;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder maxRetries(Integer maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder proxy(Proxy proxy) {
            this.proxy = proxy;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder logRequests(Boolean logRequests) {
            this.logRequests = logRequests;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder logResponses(Boolean logResponses) {
            this.logResponses = logResponses;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder tokenizer(Tokenizer tokenizer) {
            this.tokenizer = tokenizer;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder customHeaders(Map<String, String> customHeaders) {
            this.customHeaders = customHeaders;
            return this;
        }

        @Override
        public QuarkusOpenAiChatModelBuilder listeners(List<ChatModelListener> listeners) {
            this.listeners = listeners;
            return this;
        }
    }
}

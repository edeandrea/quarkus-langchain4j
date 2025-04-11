package io.quarkiverse.langchain4j.docling.runtime;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import org.jboss.resteasy.reactive.client.api.LoggingScope;

import io.quarkiverse.langchain4j.docling.client.DoclingClientLogger;
import io.quarkiverse.langchain4j.docling.client.DoclingRestApi;
import io.quarkiverse.langchain4j.docling.runtime.config.DoclingRuntimeConfig;
import io.quarkus.rest.client.reactive.QuarkusRestClientBuilder;

public final class DoclingClientBuilder {
    private String baseUrl;
    private Duration timeout;
    private boolean logRequests;
    private boolean logResponses;

    public DoclingClientBuilder(DoclingRuntimeConfig config) {
        config.baseUrl().ifPresent(this::baseUrl);
        config.timeout().ifPresent(this::timeout);
        config.logRequests().ifPresent(this::logRequests);
        config.logResponses().ifPresent(this::logResponses);
    }

    public DoclingClientBuilder baseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    public DoclingClientBuilder timeout(Duration timeout) {
        this.timeout = timeout;
        return this;
    }

    public DoclingClientBuilder logRequests(boolean logRequests) {
        this.logRequests = logRequests;
        return this;
    }

    public DoclingClientBuilder logResponses(boolean logResponses) {
        this.logResponses = logResponses;
        return this;
    }

    public DoclingRestApi build() {
        if ((baseUrl == null) || baseUrl.trim().isBlank()) {
            throw new IllegalArgumentException("quarkus.langchain4j.docling.base-url cannot be null or empty");
        }

        var defaultTimeout = Optional.ofNullable(this.timeout).orElse(Duration.ofMinutes(1));

        try {
            var restApiBuilder = QuarkusRestClientBuilder.newBuilder()
                    .baseUri(new URI(baseUrl))
                    .connectTimeout(defaultTimeout.toSeconds(), TimeUnit.SECONDS)
                    .readTimeout(defaultTimeout.toSeconds(), TimeUnit.SECONDS);

            if (logRequests || logResponses) {
                restApiBuilder
                        .loggingScope(LoggingScope.REQUEST_RESPONSE)
                        .clientLogger(new DoclingClientLogger(logRequests, logResponses));
            }

            return restApiBuilder.build(DoclingRestApi.class);
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex);
        }
    }
}

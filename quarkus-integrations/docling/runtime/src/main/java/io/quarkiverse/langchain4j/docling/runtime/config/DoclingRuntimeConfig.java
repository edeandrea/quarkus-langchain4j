package io.quarkiverse.langchain4j.docling.runtime.config;

import static io.quarkus.runtime.annotations.ConfigPhase.RUN_TIME;

import java.time.Duration;
import java.util.Optional;

import io.quarkus.runtime.annotations.ConfigDocDefault;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

@ConfigRoot(phase = RUN_TIME)
@ConfigMapping(prefix = "quarkus.langchain4j.docling")
public interface DoclingRuntimeConfig {
    /**
     * The key for the base url
     */
    String BASE_URL_KEY = "quarkus.langchain4j.docling.base-url";

    /**
     * The default base url of where docling is
     */
    Optional<String> baseUrl();

    /**
     * Timeout for Docling calls
     */
    @ConfigDocDefault("1m")
    @WithDefault("${quarkus.langchain4j.timeout:1m}")
    Optional<Duration> timeout();

    /**
     * Whether the Docling client should log requests
     */
    @ConfigDocDefault("false")
    @WithDefault("${quarkus.langchain4j.log-requests}")
    Optional<Boolean> logRequests();

    /**
     * Whether the Docling client should log responses
     */
    @ConfigDocDefault("false")
    @WithDefault("${quarkus.langchain4j.log-responses}")
    Optional<Boolean> logResponses();
}

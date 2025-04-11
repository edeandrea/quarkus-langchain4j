package io.quarkiverse.langchain4j.docling.deployment.config;

import static io.quarkus.runtime.annotations.ConfigPhase.BUILD_TIME;

import io.quarkiverse.langchain4j.docling.deployment.devservices.config.DoclingDevServicesConfig;
import io.quarkus.runtime.annotations.ConfigRoot;
import io.smallrye.config.ConfigMapping;

@ConfigRoot(phase = BUILD_TIME)
@ConfigMapping(prefix = "quarkus.langchain4j.docling")
public interface DoclingBuildTimeConfig {
    /**
     * Dev services related settings
     */
    DoclingDevServicesConfig devservices();
}

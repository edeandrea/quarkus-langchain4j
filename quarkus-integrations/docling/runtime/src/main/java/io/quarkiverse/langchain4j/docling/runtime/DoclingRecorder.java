package io.quarkiverse.langchain4j.docling.runtime;

import java.util.function.Supplier;

import io.quarkiverse.langchain4j.docling.client.DoclingRestApi;
import io.quarkiverse.langchain4j.docling.runtime.config.DoclingRuntimeConfig;
import io.quarkus.runtime.RuntimeValue;
import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class DoclingRecorder {
    private final RuntimeValue<DoclingRuntimeConfig> config;

    public DoclingRecorder(RuntimeValue<DoclingRuntimeConfig> config) {
        this.config = config;
    }

    public Supplier<DoclingRestApi> doclingClient() {
        return new Supplier<DoclingRestApi>() {
            @Override
            public DoclingRestApi get() {
                return new DoclingClientBuilder(config.getValue()).build();
            }
        };
    }
}

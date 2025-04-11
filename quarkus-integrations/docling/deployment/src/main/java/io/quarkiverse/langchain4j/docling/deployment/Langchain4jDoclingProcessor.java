package io.quarkiverse.langchain4j.docling.deployment;

import jakarta.enterprise.context.ApplicationScoped;

import org.jboss.jandex.DotName;

import io.quarkiverse.langchain4j.docling.client.DoclingRestApi;
import io.quarkiverse.langchain4j.docling.runtime.DoclingRecorder;
import io.quarkus.arc.deployment.SyntheticBeanBuildItem;
import io.quarkus.deployment.annotations.BuildStep;
import io.quarkus.deployment.annotations.ExecutionTime;
import io.quarkus.deployment.annotations.Record;
import io.quarkus.deployment.builditem.FeatureBuildItem;

class Langchain4jDoclingProcessor {
    private static final String FEATURE = "langchain4j-docling";
    private static final DotName DOCLING_CLIENT = DotName.createSimple(DoclingRestApi.class);

    @BuildStep
    FeatureBuildItem feature() {
        return new FeatureBuildItem(FEATURE);
    }

    @BuildStep
    @Record(ExecutionTime.RUNTIME_INIT)
    SyntheticBeanBuildItem generateDoclingRestClient(DoclingRecorder recorder) {
        return SyntheticBeanBuildItem
                .configure(DOCLING_CLIENT)
                .setRuntimeInit()
                .defaultBean()
                .scope(ApplicationScoped.class)
                .supplier(recorder.doclingClient())
                .done();
    }
}

package io.quarkiverse.langchain4j.docling.deployment;

import static org.assertj.core.api.Assertions.assertThat;

import jakarta.inject.Inject;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import io.quarkiverse.langchain4j.docling.client.DoclingRestApi;
import io.quarkiverse.langchain4j.docling.client.model.HealthCheckResponse;
import io.quarkus.test.QuarkusUnitTest;

class DoclingDevServiceWorksTests {
    @RegisterExtension
    static final QuarkusUnitTest unitTest = new QuarkusUnitTest()
            .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class))
            .overrideRuntimeConfigKey("quarkus.langchain4j.docling.log-requests", "true")
            .overrideRuntimeConfigKey("quarkus.langchain4j.docling.log-responses", "true");

    @Inject
    DoclingRestApi doclingRestApi;

    @Test
    void hello() {
        assertThat(doclingRestApi.healthHealthGet())
                .isNotNull()
                .extracting(HealthCheckResponse::getStatus)
                .isEqualTo("ok");
    }

    // @TODO This is where we need to add some tests for other operations...
}

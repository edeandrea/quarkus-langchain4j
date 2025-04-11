package io.quarkiverse.langchain4j.docling.deployment;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import jakarta.inject.Inject;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import io.quarkiverse.langchain4j.docling.client.DoclingRestApi;
import io.quarkus.test.QuarkusUnitTest;

class NoDoclingBaseUrlSetTests {
    @RegisterExtension
    static final QuarkusUnitTest unitTest = new QuarkusUnitTest()
            .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class))
            .overrideConfigKey("quarkus.langchain4j.docling.devservices.enabled", "false");

    @Inject
    DoclingRestApi doclingRestApi;

    @Test
    void test() {
        assertThatThrownBy(() -> doclingRestApi.healthHealthGet())
                .hasMessageContaining("quarkus.langchain4j.docling.base-url cannot be null or empty")
                .hasCauseInstanceOf(IllegalArgumentException.class);
    }
}

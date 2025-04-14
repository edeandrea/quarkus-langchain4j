package io.quarkiverse.langchain4j.docling.deployment;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.atIndex;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.LogRecord;

import jakarta.inject.Inject;
import jakarta.ws.rs.HttpMethod;
import jakarta.ws.rs.core.Response.Status;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import io.quarkiverse.langchain4j.docling.client.DoclingRestApi;
import io.quarkiverse.langchain4j.docling.client.model.HealthCheckResponse;
import io.quarkiverse.langchain4j.docling.runtime.config.DoclingRuntimeConfig;
import io.quarkus.test.QuarkusUnitTest;

class DoclingRestApiLogRequestsResponsesTests extends RequestResponseLoggingTests {
    @RegisterExtension
    static final QuarkusUnitTest unitTest = new QuarkusUnitTest()
            .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class))
            .overrideConfigKey("quarkus.langchain4j.docling.devservices.enabled", "false")
            .overrideRuntimeConfigKey(DoclingRuntimeConfig.BASE_URL_KEY, wiremockUrlForConfig())
            .overrideRuntimeConfigKey("quarkus.langchain4j.docling.log-requests", "true")
            .overrideRuntimeConfigKey("quarkus.langchain4j.docling.log-responses", "true");

    @Inject
    DoclingRestApi doclingRestApi;

    @Test
    void requestResponseLogged() {
        assertThat(doclingRestApi.healthHealthGet())
                .isNotNull()
                .extracting(HealthCheckResponse::getStatus)
                .isEqualTo("ok");

        assertThat(LOG_HANDLER.getRecords())
                .hasSize(2)
                .satisfies(
                        logRecord -> assertThat(logRecord)
                                .isNotNull()
                                .extracting(
                                        LogRecord::getLevel,
                                        l -> Objects.toString(l.getParameters()[0]),
                                        l -> l.getParameters()[1])
                                .containsExactly(
                                        Level.INFO,
                                        HttpMethod.GET,
                                        resolvedWiremockUrl("/health")),
                        atIndex(0))
                .satisfies(
                        logRecord -> assertThat(logRecord)
                                .isNotNull()
                                .extracting(
                                        LogRecord::getLevel,
                                        l -> l.getParameters()[0])
                                .containsExactly(
                                        Level.INFO,
                                        Status.OK.getStatusCode()),
                        atIndex(1));
    }
}

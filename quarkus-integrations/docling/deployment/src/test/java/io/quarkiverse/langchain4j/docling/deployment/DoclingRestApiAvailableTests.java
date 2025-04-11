package io.quarkiverse.langchain4j.docling.deployment;

import static com.github.tomakehurst.wiremock.client.WireMock.equalTo;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.okJson;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.assertj.core.api.Assertions.assertThat;

import jakarta.inject.Inject;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import io.quarkiverse.langchain4j.docling.client.DoclingRestApi;
import io.quarkiverse.langchain4j.docling.client.model.HealthCheckResponse;
import io.quarkiverse.langchain4j.docling.runtime.config.DoclingRuntimeConfig;
import io.quarkus.test.QuarkusUnitTest;

class DoclingRestApiAvailableTests extends RequestResponseLoggingTests {
    @RegisterExtension
    static final QuarkusUnitTest unitTest = new QuarkusUnitTest()
            .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class))
            .overrideConfigKey("quarkus.langchain4j.docling.devservices.enabled", "false")
            .overrideRuntimeConfigKey(DoclingRuntimeConfig.BASE_URL_KEY, wiremockUrlForConfig());

    @Inject
    DoclingRestApi doclingRestApi;

    @Test
    void helloNoLogging() {
        wiremock().register(
                get(urlPathEqualTo("/health"))
                        .withHeader(HttpHeaders.ACCEPT, equalTo(MediaType.APPLICATION_JSON))
                        .willReturn(okJson("""
                                {
                                  "status": "ok"
                                }
                                """)));

        assertThat(doclingRestApi.healthHealthGet())
                .isNotNull()
                .extracting(HealthCheckResponse::getStatus)
                .isEqualTo("ok");

        assertThat(LOG_HANDLER.getRecords())
                .isEmpty();
    }
}

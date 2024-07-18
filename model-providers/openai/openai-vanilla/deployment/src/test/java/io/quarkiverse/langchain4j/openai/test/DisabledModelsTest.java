package io.quarkiverse.langchain4j.openai.test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import jakarta.inject.Inject;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import io.quarkus.test.QuarkusUnitTest;

import dev.langchain4j.model.ModelDisabledException;
import dev.langchain4j.model.openai.OpenAiChatModel;

public class DisabledModelsTest {
    @RegisterExtension
    static final QuarkusUnitTest unitTest = new QuarkusUnitTest()
            .setArchiveProducer(() -> ShrinkWrap.create(JavaArchive.class))
            .overrideRuntimeConfigKey("quarkus.langchain4j.openai.api-key", "123")
            .overrideRuntimeConfigKey("quarkus.langchain4j.openai.enable-integration", "false");

    @Inject
    OpenAiChatModel model;

    @Test
    void test() {
        assertThatThrownBy(() -> model.generate("test"))
          .isInstanceOf(ModelDisabledException.class);
    }
}

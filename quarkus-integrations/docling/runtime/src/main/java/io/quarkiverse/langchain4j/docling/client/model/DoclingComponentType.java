package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Gets or Sets DoclingComponentType
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum DoclingComponentType {
    DOCUMENT_BACKEND(String.valueOf("document_backend")),
    MODEL(String.valueOf("model")),
    DOC_ASSEMBLER(String.valueOf("doc_assembler")),
    USER_INPUT(String.valueOf("user_input"));

    // caching enum access
    private static final java.util.EnumSet<DoclingComponentType> values = java.util.EnumSet.allOf(DoclingComponentType.class);

    private String value;

    DoclingComponentType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static DoclingComponentType fromString(String text) {
        for (DoclingComponentType b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

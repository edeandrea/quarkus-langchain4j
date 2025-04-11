package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Gets or Sets ProfilingScope
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum ProfilingScope {
    PAGE(String.valueOf("page")),
    DOCUMENT(String.valueOf("document"));

    // caching enum access
    private static final java.util.EnumSet<ProfilingScope> values = java.util.EnumSet.allOf(ProfilingScope.class);

    private String value;

    ProfilingScope(String value) {
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
    public static ProfilingScope fromString(String text) {
        for (ProfilingScope b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

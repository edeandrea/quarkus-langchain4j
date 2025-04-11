package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Gets or Sets OutputFormat
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum OutputFormat {
    MD(String.valueOf("md")),
    JSON(String.valueOf("json")),
    HTML(String.valueOf("html")),
    TEXT(String.valueOf("text")),
    DOCTAGS(String.valueOf("doctags"));

    // caching enum access
    private static final java.util.EnumSet<OutputFormat> values = java.util.EnumSet.allOf(OutputFormat.class);

    private String value;

    OutputFormat(String value) {
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
    public static OutputFormat fromString(String text) {
        for (OutputFormat b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

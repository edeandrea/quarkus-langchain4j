package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Gets or Sets ConversionStatus
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum ConversionStatus {
    PENDING(String.valueOf("pending")),
    STARTED(String.valueOf("started")),
    FAILURE(String.valueOf("failure")),
    SUCCESS(String.valueOf("success")),
    PARTIAL_SUCCESS(String.valueOf("partial_success")),
    SKIPPED(String.valueOf("skipped"));

    // caching enum access
    private static final java.util.EnumSet<ConversionStatus> values = java.util.EnumSet.allOf(ConversionStatus.class);

    private String value;

    ConversionStatus(String value) {
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
    public static ConversionStatus fromString(String text) {
        for (ConversionStatus b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

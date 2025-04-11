package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Gets or Sets TableFormerModeModes for the TableFormer model.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum TableFormerMode {
    FAST(String.valueOf("fast")),
    ACCURATE(String.valueOf("accurate"));

    // caching enum access
    private static final java.util.EnumSet<TableFormerMode> values = java.util.EnumSet.allOf(TableFormerMode.class);

    private String value;

    TableFormerMode(String value) {
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
    public static TableFormerMode fromString(String text) {
        for (TableFormerMode b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

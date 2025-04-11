package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Gets or Sets GraphCellLabelGraphCellLabel.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum GraphCellLabel {
    UNSPECIFIED(String.valueOf("unspecified")),
    KEY(String.valueOf("key")),
    VALUE(String.valueOf("value")),
    CHECKBOX(String.valueOf("checkbox"));

    // caching enum access
    private static final java.util.EnumSet<GraphCellLabel> values = java.util.EnumSet.allOf(GraphCellLabel.class);

    private String value;

    GraphCellLabel(String value) {
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
    public static GraphCellLabel fromString(String text) {
        for (GraphCellLabel b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

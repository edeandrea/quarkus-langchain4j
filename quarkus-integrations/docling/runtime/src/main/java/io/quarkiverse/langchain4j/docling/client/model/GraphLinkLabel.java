package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Gets or Sets GraphLinkLabelGraphLinkLabel.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum GraphLinkLabel {
    UNSPECIFIED(String.valueOf("unspecified")),
    TO_VALUE(String.valueOf("to_value")),
    TO_KEY(String.valueOf("to_key")),
    TO_PARENT(String.valueOf("to_parent")),
    TO_CHILD(String.valueOf("to_child"));

    // caching enum access
    private static final java.util.EnumSet<GraphLinkLabel> values = java.util.EnumSet.allOf(GraphLinkLabel.class);

    private String value;

    GraphLinkLabel(String value) {
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
    public static GraphLinkLabel fromString(String text) {
        for (GraphLinkLabel b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

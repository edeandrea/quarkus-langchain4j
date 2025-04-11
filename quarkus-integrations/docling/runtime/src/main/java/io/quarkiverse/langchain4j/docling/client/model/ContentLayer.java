package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Gets or Sets ContentLayerContentLayer.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum ContentLayer {
    BODY(String.valueOf("body")),
    FURNITURE(String.valueOf("furniture"));

    // caching enum access
    private static final java.util.EnumSet<ContentLayer> values = java.util.EnumSet.allOf(ContentLayer.class);

    private String value;

    ContentLayer(String value) {
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
    public static ContentLayer fromString(String text) {
        for (ContentLayer b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

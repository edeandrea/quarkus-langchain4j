package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Gets or Sets ImageRefModeImageRefMode.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum ImageRefMode {
    PLACEHOLDER(String.valueOf("placeholder")),
    EMBEDDED(String.valueOf("embedded")),
    REFERENCED(String.valueOf("referenced"));

    // caching enum access
    private static final java.util.EnumSet<ImageRefMode> values = java.util.EnumSet.allOf(ImageRefMode.class);

    private String value;

    ImageRefMode(String value) {
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
    public static ImageRefMode fromString(String text) {
        for (ImageRefMode b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

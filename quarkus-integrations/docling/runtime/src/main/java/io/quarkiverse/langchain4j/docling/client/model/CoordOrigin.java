package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Gets or Sets CoordOriginCoordOrigin.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum CoordOrigin {
    TOPLEFT(String.valueOf("TOPLEFT")),
    BOTTOMLEFT(String.valueOf("BOTTOMLEFT"));

    // caching enum access
    private static final java.util.EnumSet<CoordOrigin> values = java.util.EnumSet.allOf(CoordOrigin.class);

    private String value;

    CoordOrigin(String value) {
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
    public static CoordOrigin fromString(String text) {
        for (CoordOrigin b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

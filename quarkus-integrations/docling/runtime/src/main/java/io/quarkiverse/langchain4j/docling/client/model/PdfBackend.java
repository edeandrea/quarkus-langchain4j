package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Gets or Sets PdfBackendEnum of valid PDF backends.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum PdfBackend {
    PYPDFIUM2(String.valueOf("pypdfium2")),
    DLPARSE_V1(String.valueOf("dlparse_v1")),
    DLPARSE_V2(String.valueOf("dlparse_v2")),
    DLPARSE_V4(String.valueOf("dlparse_v4"));

    // caching enum access
    private static final java.util.EnumSet<PdfBackend> values = java.util.EnumSet.allOf(PdfBackend.class);

    private String value;

    PdfBackend(String value) {
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
    public static PdfBackend fromString(String text) {
        for (PdfBackend b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Gets or Sets ocr_engines_enum
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum OcrEnginesEnum {
    EASYOCR(String.valueOf("easyocr")),
    OCRMAC(String.valueOf("ocrmac")),
    RAPIDOCR(String.valueOf("rapidocr")),
    TESSEROCR(String.valueOf("tesserocr")),
    TESSERACT(String.valueOf("tesseract"));

    // caching enum access
    private static final java.util.EnumSet<OcrEnginesEnum> values = java.util.EnumSet.allOf(OcrEnginesEnum.class);

    private String value;

    OcrEnginesEnum(String value) {
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
    public static OcrEnginesEnum fromString(String text) {
        for (OcrEnginesEnum b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

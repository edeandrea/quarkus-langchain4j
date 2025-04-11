package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Gets or Sets InputFormatA document format supported by document backend parsers.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum InputFormat {
    DOCX(String.valueOf("docx")),
    PPTX(String.valueOf("pptx")),
    HTML(String.valueOf("html")),
    IMAGE(String.valueOf("image")),
    PDF(String.valueOf("pdf")),
    ASCIIDOC(String.valueOf("asciidoc")),
    MD(String.valueOf("md")),
    CSV(String.valueOf("csv")),
    XLSX(String.valueOf("xlsx")),
    XML_USPTO(String.valueOf("xml_uspto")),
    XML_JATS(String.valueOf("xml_jats")),
    JSON_DOCLING(String.valueOf("json_docling"));

    // caching enum access
    private static final java.util.EnumSet<InputFormat> values = java.util.EnumSet.allOf(InputFormat.class);

    private String value;

    InputFormat(String value) {
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
    public static InputFormat fromString(String text) {
        for (InputFormat b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

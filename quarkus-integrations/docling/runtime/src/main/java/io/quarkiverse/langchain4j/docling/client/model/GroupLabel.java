package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Gets or Sets GroupLabelGroupLabel.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum GroupLabel {
    UNSPECIFIED(String.valueOf("unspecified")),
    LIST(String.valueOf("list")),
    ORDERED_LIST(String.valueOf("ordered_list")),
    CHAPTER(String.valueOf("chapter")),
    SECTION(String.valueOf("section")),
    SHEET(String.valueOf("sheet")),
    SLIDE(String.valueOf("slide")),
    FORM_AREA(String.valueOf("form_area")),
    KEY_VALUE_AREA(String.valueOf("key_value_area")),
    COMMENT_SECTION(String.valueOf("comment_section")),
    INLINE(String.valueOf("inline"));

    // caching enum access
    private static final java.util.EnumSet<GroupLabel> values = java.util.EnumSet.allOf(GroupLabel.class);

    private String value;

    GroupLabel(String value) {
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
    public static GroupLabel fromString(String text) {
        for (GroupLabel b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

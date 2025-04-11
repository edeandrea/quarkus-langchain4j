package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * SectionItem.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class SectionHeaderItem {

    private String selfRef;
    private RefItem parent;
    private List<RefItem> children;
    private ContentLayer contentLayer;

    public enum LabelEnum {
        SECTION_HEADER(String.valueOf("section_header"));

        // caching enum access
        private static final java.util.EnumSet<LabelEnum> values = java.util.EnumSet.allOf(LabelEnum.class);

        String value;

        LabelEnum(String v) {
            value = v;
        }

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LabelEnum fromString(String v) {
            for (LabelEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }

    private LabelEnum label = LabelEnum.SECTION_HEADER;
    private List<ProvenanceItem> prov;
    private String orig;
    private String text;
    private Formatting formatting;
    private Hyperlink hyperlink;
    private Integer level = 1;

    /**
     * Get selfRef
     *
     * @return selfRef
     **/
    @JsonProperty("self_ref")
    public String getSelfRef() {
        return selfRef;
    }

    /**
     * Set selfRef
     **/
    public void setSelfRef(String selfRef) {
        this.selfRef = selfRef;
    }

    public SectionHeaderItem selfRef(String selfRef) {
        this.selfRef = selfRef;
        return this;
    }

    /**
     * Get parent
     *
     * @return parent
     **/
    @JsonProperty("parent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RefItem getParent() {
        return parent;
    }

    /**
     * Set parent
     **/
    public void setParent(RefItem parent) {
        this.parent = parent;
    }

    public SectionHeaderItem parent(RefItem parent) {
        this.parent = parent;
        return this;
    }

    /**
     * Get children
     *
     * @return children
     **/
    @JsonProperty("children")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<RefItem> getChildren() {
        return children;
    }

    /**
     * Set children
     **/
    public void setChildren(List<RefItem> children) {
        this.children = children;
    }

    public SectionHeaderItem children(List<RefItem> children) {
        this.children = children;
        return this;
    }

    public SectionHeaderItem addChildrenItem(RefItem childrenItem) {
        if (this.children == null) {
            children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    /**
     * Get contentLayer
     *
     * @return contentLayer
     **/
    @JsonProperty("content_layer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ContentLayer getContentLayer() {
        return contentLayer;
    }

    /**
     * Set contentLayer
     **/
    public void setContentLayer(ContentLayer contentLayer) {
        this.contentLayer = contentLayer;
    }

    public SectionHeaderItem contentLayer(ContentLayer contentLayer) {
        this.contentLayer = contentLayer;
        return this;
    }

    /**
     * Get label
     *
     * @return label
     **/
    @JsonProperty("label")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public LabelEnum getLabel() {
        return label;
    }

    /**
     * Set label
     **/
    public void setLabel(LabelEnum label) {
        this.label = label;
    }

    public SectionHeaderItem label(LabelEnum label) {
        this.label = label;
        return this;
    }

    /**
     * Get prov
     *
     * @return prov
     **/
    @JsonProperty("prov")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ProvenanceItem> getProv() {
        return prov;
    }

    /**
     * Set prov
     **/
    public void setProv(List<ProvenanceItem> prov) {
        this.prov = prov;
    }

    public SectionHeaderItem prov(List<ProvenanceItem> prov) {
        this.prov = prov;
        return this;
    }

    public SectionHeaderItem addProvItem(ProvenanceItem provItem) {
        if (this.prov == null) {
            prov = new ArrayList<>();
        }
        this.prov.add(provItem);
        return this;
    }

    /**
     * Get orig
     *
     * @return orig
     **/
    @JsonProperty("orig")
    public String getOrig() {
        return orig;
    }

    /**
     * Set orig
     **/
    public void setOrig(String orig) {
        this.orig = orig;
    }

    public SectionHeaderItem orig(String orig) {
        this.orig = orig;
        return this;
    }

    /**
     * Get text
     *
     * @return text
     **/
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Set text
     **/
    public void setText(String text) {
        this.text = text;
    }

    public SectionHeaderItem text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get formatting
     *
     * @return formatting
     **/
    @JsonProperty("formatting")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Formatting getFormatting() {
        return formatting;
    }

    /**
     * Set formatting
     **/
    public void setFormatting(Formatting formatting) {
        this.formatting = formatting;
    }

    public SectionHeaderItem formatting(Formatting formatting) {
        this.formatting = formatting;
        return this;
    }

    /**
     * Get hyperlink
     *
     * @return hyperlink
     **/
    @JsonProperty("hyperlink")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Hyperlink getHyperlink() {
        return hyperlink;
    }

    /**
     * Set hyperlink
     **/
    public void setHyperlink(Hyperlink hyperlink) {
        this.hyperlink = hyperlink;
    }

    public SectionHeaderItem hyperlink(Hyperlink hyperlink) {
        this.hyperlink = hyperlink;
        return this;
    }

    /**
     * Get level
     * minimum: 1
     * maximum: 100
     *
     * @return level
     **/
    @JsonProperty("level")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLevel() {
        return level;
    }

    /**
     * Set level
     **/
    public void setLevel(Integer level) {
        this.level = level;
    }

    public SectionHeaderItem level(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SectionHeaderItem {\n");

        sb.append("    selfRef: ").append(toIndentedString(selfRef)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    contentLayer: ").append(toIndentedString(contentLayer)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    prov: ").append(toIndentedString(prov)).append("\n");
        sb.append("    orig: ").append(toIndentedString(orig)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    formatting: ").append(toIndentedString(formatting)).append("\n");
        sb.append("    hyperlink: ").append(toIndentedString(hyperlink)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code SectionHeaderItem} object that
     * contains the same values as this object.
     *
     * @param obj the object to compare with.
     * @return {@code true} if the objects are the same;
     *         {@code false} otherwise.
     **/
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        SectionHeaderItem model = (SectionHeaderItem) obj;

        return java.util.Objects.equals(selfRef, model.selfRef) &&
                java.util.Objects.equals(parent, model.parent) &&
                java.util.Objects.equals(children, model.children) &&
                java.util.Objects.equals(contentLayer, model.contentLayer) &&
                java.util.Objects.equals(label, model.label) &&
                java.util.Objects.equals(prov, model.prov) &&
                java.util.Objects.equals(orig, model.orig) &&
                java.util.Objects.equals(text, model.text) &&
                java.util.Objects.equals(formatting, model.formatting) &&
                java.util.Objects.equals(hyperlink, model.hyperlink) &&
                java.util.Objects.equals(level, model.level);
    }

    /**
     * Returns a hash code for a {@code SectionHeaderItem}.
     *
     * @return a hash code value for a {@code SectionHeaderItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(selfRef,
                parent,
                children,
                contentLayer,
                label,
                prov,
                orig,
                text,
                formatting,
                hyperlink,
                level);
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * SectionItem.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SectionHeaderItemQueryParam {

        /**
         * SectionItem.
         **/
        @jakarta.ws.rs.QueryParam("selfRef")
        private String selfRef;
        /**
         * SectionItem.
         **/
        @jakarta.ws.rs.QueryParam("parent")
        private RefItem parent;
        /**
         * SectionItem.
         **/
        @jakarta.ws.rs.QueryParam("children")
        private List<RefItem> children = null;
        /**
         * SectionItem.
         **/
        @jakarta.ws.rs.QueryParam("contentLayer")
        private ContentLayer contentLayer;

        public enum LabelEnum {
            SECTION_HEADER(String.valueOf("section_header"));

            // caching enum access
            private static final java.util.EnumSet<LabelEnum> values = java.util.EnumSet.allOf(LabelEnum.class);

            String value;

            LabelEnum(String v) {
                value = v;
            }

            @JsonValue
            public String value() {
                return value;
            }

            @Override
            public String toString() {
                return String.valueOf(value);
            }

            @JsonCreator
            public static LabelEnum fromString(String v) {
                for (LabelEnum b : values) {
                    if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                        return b;
                    }
                }
                throw new IllegalArgumentException("Unexpected value '" + v + "'");
            }
        }

        /**
         * SectionItem.
         **/
        private LabelEnum label = LabelEnum.SECTION_HEADER;
        /**
         * SectionItem.
         **/
        @jakarta.ws.rs.QueryParam("prov")
        private List<ProvenanceItem> prov = null;
        /**
         * SectionItem.
         **/
        @jakarta.ws.rs.QueryParam("orig")
        private String orig;
        /**
         * SectionItem.
         **/
        @jakarta.ws.rs.QueryParam("text")
        private String text;
        /**
         * SectionItem.
         **/
        @jakarta.ws.rs.QueryParam("formatting")
        private Formatting formatting;
        /**
         * SectionItem.
         **/
        @jakarta.ws.rs.QueryParam("hyperlink")
        private Hyperlink hyperlink;
        /**
         * SectionItem.
         **/
        @jakarta.ws.rs.QueryParam("level")
        private Integer level = 1;

        /**
         * Get selfRef
         *
         * @return selfRef
         **/
        @JsonProperty("self_ref")
        public String getSelfRef() {
            return selfRef;
        }

        /**
         * Set selfRef
         **/
        public void setSelfRef(String selfRef) {
            this.selfRef = selfRef;
        }

        public SectionHeaderItemQueryParam selfRef(String selfRef) {
            this.selfRef = selfRef;
            return this;
        }

        /**
         * Get parent
         *
         * @return parent
         **/
        @JsonProperty("parent")
        public RefItem getParent() {
            return parent;
        }

        /**
         * Set parent
         **/
        public void setParent(RefItem parent) {
            this.parent = parent;
        }

        public SectionHeaderItemQueryParam parent(RefItem parent) {
            this.parent = parent;
            return this;
        }

        /**
         * Get children
         *
         * @return children
         **/
        @JsonProperty("children")
        public List<RefItem> getChildren() {
            return children;
        }

        /**
         * Set children
         **/
        public void setChildren(List<RefItem> children) {
            this.children = children;
        }

        public SectionHeaderItemQueryParam children(List<RefItem> children) {
            this.children = children;
            return this;
        }

        public SectionHeaderItemQueryParam addChildrenItem(RefItem childrenItem) {
            this.children.add(childrenItem);
            return this;
        }

        /**
         * Get contentLayer
         *
         * @return contentLayer
         **/
        @JsonProperty("content_layer")
        public ContentLayer getContentLayer() {
            return contentLayer;
        }

        /**
         * Set contentLayer
         **/
        public void setContentLayer(ContentLayer contentLayer) {
            this.contentLayer = contentLayer;
        }

        public SectionHeaderItemQueryParam contentLayer(ContentLayer contentLayer) {
            this.contentLayer = contentLayer;
            return this;
        }

        /**
         * Get label
         *
         * @return label
         **/
        @JsonProperty("label")
        public LabelEnum getLabel() {
            return label;
        }

        /**
         * Set label
         **/
        public void setLabel(LabelEnum label) {
            this.label = label;
        }

        public SectionHeaderItemQueryParam label(LabelEnum label) {
            this.label = label;
            return this;
        }

        /**
         * Get prov
         *
         * @return prov
         **/
        @JsonProperty("prov")
        public List<ProvenanceItem> getProv() {
            return prov;
        }

        /**
         * Set prov
         **/
        public void setProv(List<ProvenanceItem> prov) {
            this.prov = prov;
        }

        public SectionHeaderItemQueryParam prov(List<ProvenanceItem> prov) {
            this.prov = prov;
            return this;
        }

        public SectionHeaderItemQueryParam addProvItem(ProvenanceItem provItem) {
            this.prov.add(provItem);
            return this;
        }

        /**
         * Get orig
         *
         * @return orig
         **/
        @JsonProperty("orig")
        public String getOrig() {
            return orig;
        }

        /**
         * Set orig
         **/
        public void setOrig(String orig) {
            this.orig = orig;
        }

        public SectionHeaderItemQueryParam orig(String orig) {
            this.orig = orig;
            return this;
        }

        /**
         * Get text
         *
         * @return text
         **/
        @JsonProperty("text")
        public String getText() {
            return text;
        }

        /**
         * Set text
         **/
        public void setText(String text) {
            this.text = text;
        }

        public SectionHeaderItemQueryParam text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Get formatting
         *
         * @return formatting
         **/
        @JsonProperty("formatting")
        public Formatting getFormatting() {
            return formatting;
        }

        /**
         * Set formatting
         **/
        public void setFormatting(Formatting formatting) {
            this.formatting = formatting;
        }

        public SectionHeaderItemQueryParam formatting(Formatting formatting) {
            this.formatting = formatting;
            return this;
        }

        /**
         * Get hyperlink
         *
         * @return hyperlink
         **/
        @JsonProperty("hyperlink")
        public Hyperlink getHyperlink() {
            return hyperlink;
        }

        /**
         * Set hyperlink
         **/
        public void setHyperlink(Hyperlink hyperlink) {
            this.hyperlink = hyperlink;
        }

        public SectionHeaderItemQueryParam hyperlink(Hyperlink hyperlink) {
            this.hyperlink = hyperlink;
            return this;
        }

        /**
         * Get level
         * minimum: 1
         * maximum: 100
         *
         * @return level
         **/
        @JsonProperty("level")
        public Integer getLevel() {
            return level;
        }

        /**
         * Set level
         **/
        public void setLevel(Integer level) {
            this.level = level;
        }

        public SectionHeaderItemQueryParam level(Integer level) {
            this.level = level;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SectionHeaderItemQueryParam {\n");

            sb.append("    selfRef: ").append(toIndentedString(selfRef)).append("\n");
            sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
            sb.append("    children: ").append(toIndentedString(children)).append("\n");
            sb.append("    contentLayer: ").append(toIndentedString(contentLayer)).append("\n");
            sb.append("    label: ").append(toIndentedString(label)).append("\n");
            sb.append("    prov: ").append(toIndentedString(prov)).append("\n");
            sb.append("    orig: ").append(toIndentedString(orig)).append("\n");
            sb.append("    text: ").append(toIndentedString(text)).append("\n");
            sb.append("    formatting: ").append(toIndentedString(formatting)).append("\n");
            sb.append("    hyperlink: ").append(toIndentedString(hyperlink)).append("\n");
            sb.append("    level: ").append(toIndentedString(level)).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4 spaces
         * (except the first line).
         */
        private static String toIndentedString(Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }
}

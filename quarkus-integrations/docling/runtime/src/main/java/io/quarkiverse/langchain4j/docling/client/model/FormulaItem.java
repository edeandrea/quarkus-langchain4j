package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * FormulaItem.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class FormulaItem {

    private String selfRef;
    private RefItem parent;
    private List<RefItem> children;
    private ContentLayer contentLayer;

    public enum LabelEnum {
        FORMULA(String.valueOf("formula"));

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

    private LabelEnum label = LabelEnum.FORMULA;
    private List<ProvenanceItem> prov;
    private String orig;
    private String text;
    private Formatting formatting;
    private Hyperlink hyperlink;

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

    public FormulaItem selfRef(String selfRef) {
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

    public FormulaItem parent(RefItem parent) {
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

    public FormulaItem children(List<RefItem> children) {
        this.children = children;
        return this;
    }

    public FormulaItem addChildrenItem(RefItem childrenItem) {
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

    public FormulaItem contentLayer(ContentLayer contentLayer) {
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

    public FormulaItem label(LabelEnum label) {
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

    public FormulaItem prov(List<ProvenanceItem> prov) {
        this.prov = prov;
        return this;
    }

    public FormulaItem addProvItem(ProvenanceItem provItem) {
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

    public FormulaItem orig(String orig) {
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

    public FormulaItem text(String text) {
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

    public FormulaItem formatting(Formatting formatting) {
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

    public FormulaItem hyperlink(Hyperlink hyperlink) {
        this.hyperlink = hyperlink;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FormulaItem {\n");

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

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code FormulaItem} object that
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

        FormulaItem model = (FormulaItem) obj;

        return java.util.Objects.equals(selfRef, model.selfRef) &&
                java.util.Objects.equals(parent, model.parent) &&
                java.util.Objects.equals(children, model.children) &&
                java.util.Objects.equals(contentLayer, model.contentLayer) &&
                java.util.Objects.equals(label, model.label) &&
                java.util.Objects.equals(prov, model.prov) &&
                java.util.Objects.equals(orig, model.orig) &&
                java.util.Objects.equals(text, model.text) &&
                java.util.Objects.equals(formatting, model.formatting) &&
                java.util.Objects.equals(hyperlink, model.hyperlink);
    }

    /**
     * Returns a hash code for a {@code FormulaItem}.
     *
     * @return a hash code value for a {@code FormulaItem}.
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
                hyperlink);
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
     * FormulaItem.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class FormulaItemQueryParam {

        /**
         * FormulaItem.
         **/
        @jakarta.ws.rs.QueryParam("selfRef")
        private String selfRef;
        /**
         * FormulaItem.
         **/
        @jakarta.ws.rs.QueryParam("parent")
        private RefItem parent;
        /**
         * FormulaItem.
         **/
        @jakarta.ws.rs.QueryParam("children")
        private List<RefItem> children = null;
        /**
         * FormulaItem.
         **/
        @jakarta.ws.rs.QueryParam("contentLayer")
        private ContentLayer contentLayer;

        public enum LabelEnum {
            FORMULA(String.valueOf("formula"));

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
         * FormulaItem.
         **/
        private LabelEnum label = LabelEnum.FORMULA;
        /**
         * FormulaItem.
         **/
        @jakarta.ws.rs.QueryParam("prov")
        private List<ProvenanceItem> prov = null;
        /**
         * FormulaItem.
         **/
        @jakarta.ws.rs.QueryParam("orig")
        private String orig;
        /**
         * FormulaItem.
         **/
        @jakarta.ws.rs.QueryParam("text")
        private String text;
        /**
         * FormulaItem.
         **/
        @jakarta.ws.rs.QueryParam("formatting")
        private Formatting formatting;
        /**
         * FormulaItem.
         **/
        @jakarta.ws.rs.QueryParam("hyperlink")
        private Hyperlink hyperlink;

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

        public FormulaItemQueryParam selfRef(String selfRef) {
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

        public FormulaItemQueryParam parent(RefItem parent) {
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

        public FormulaItemQueryParam children(List<RefItem> children) {
            this.children = children;
            return this;
        }

        public FormulaItemQueryParam addChildrenItem(RefItem childrenItem) {
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

        public FormulaItemQueryParam contentLayer(ContentLayer contentLayer) {
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

        public FormulaItemQueryParam label(LabelEnum label) {
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

        public FormulaItemQueryParam prov(List<ProvenanceItem> prov) {
            this.prov = prov;
            return this;
        }

        public FormulaItemQueryParam addProvItem(ProvenanceItem provItem) {
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

        public FormulaItemQueryParam orig(String orig) {
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

        public FormulaItemQueryParam text(String text) {
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

        public FormulaItemQueryParam formatting(Formatting formatting) {
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

        public FormulaItemQueryParam hyperlink(Hyperlink hyperlink) {
            this.hyperlink = hyperlink;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class FormulaItemQueryParam {\n");

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

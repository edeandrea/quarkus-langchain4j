package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * CodeItem.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class CodeItem {

    private String selfRef;
    private RefItem parent;
    private List<RefItem> children;
    private ContentLayer contentLayer;

    public enum LabelEnum {
        CODE(String.valueOf("code"));

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

    private LabelEnum label = LabelEnum.CODE;
    private List<ProvenanceItem> prov;
    private String orig;
    private String text;
    private Formatting formatting;
    private Hyperlink hyperlink;
    private List<RefItem> captions;
    private List<RefItem> references;
    private List<RefItem> footnotes;
    private ImageRef image;
    private CodeLanguageLabel codeLanguage;

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

    public CodeItem selfRef(String selfRef) {
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

    public CodeItem parent(RefItem parent) {
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

    public CodeItem children(List<RefItem> children) {
        this.children = children;
        return this;
    }

    public CodeItem addChildrenItem(RefItem childrenItem) {
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

    public CodeItem contentLayer(ContentLayer contentLayer) {
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

    public CodeItem label(LabelEnum label) {
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

    public CodeItem prov(List<ProvenanceItem> prov) {
        this.prov = prov;
        return this;
    }

    public CodeItem addProvItem(ProvenanceItem provItem) {
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

    public CodeItem orig(String orig) {
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

    public CodeItem text(String text) {
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

    public CodeItem formatting(Formatting formatting) {
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

    public CodeItem hyperlink(Hyperlink hyperlink) {
        this.hyperlink = hyperlink;
        return this;
    }

    /**
     * Get captions
     *
     * @return captions
     **/
    @JsonProperty("captions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<RefItem> getCaptions() {
        return captions;
    }

    /**
     * Set captions
     **/
    public void setCaptions(List<RefItem> captions) {
        this.captions = captions;
    }

    public CodeItem captions(List<RefItem> captions) {
        this.captions = captions;
        return this;
    }

    public CodeItem addCaptionsItem(RefItem captionsItem) {
        if (this.captions == null) {
            captions = new ArrayList<>();
        }
        this.captions.add(captionsItem);
        return this;
    }

    /**
     * Get references
     *
     * @return references
     **/
    @JsonProperty("references")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<RefItem> getReferences() {
        return references;
    }

    /**
     * Set references
     **/
    public void setReferences(List<RefItem> references) {
        this.references = references;
    }

    public CodeItem references(List<RefItem> references) {
        this.references = references;
        return this;
    }

    public CodeItem addReferencesItem(RefItem referencesItem) {
        if (this.references == null) {
            references = new ArrayList<>();
        }
        this.references.add(referencesItem);
        return this;
    }

    /**
     * Get footnotes
     *
     * @return footnotes
     **/
    @JsonProperty("footnotes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<RefItem> getFootnotes() {
        return footnotes;
    }

    /**
     * Set footnotes
     **/
    public void setFootnotes(List<RefItem> footnotes) {
        this.footnotes = footnotes;
    }

    public CodeItem footnotes(List<RefItem> footnotes) {
        this.footnotes = footnotes;
        return this;
    }

    public CodeItem addFootnotesItem(RefItem footnotesItem) {
        if (this.footnotes == null) {
            footnotes = new ArrayList<>();
        }
        this.footnotes.add(footnotesItem);
        return this;
    }

    /**
     * Get image
     *
     * @return image
     **/
    @JsonProperty("image")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ImageRef getImage() {
        return image;
    }

    /**
     * Set image
     **/
    public void setImage(ImageRef image) {
        this.image = image;
    }

    public CodeItem image(ImageRef image) {
        this.image = image;
        return this;
    }

    /**
     * Get codeLanguage
     *
     * @return codeLanguage
     **/
    @JsonProperty("code_language")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CodeLanguageLabel getCodeLanguage() {
        return codeLanguage;
    }

    /**
     * Set codeLanguage
     **/
    public void setCodeLanguage(CodeLanguageLabel codeLanguage) {
        this.codeLanguage = codeLanguage;
    }

    public CodeItem codeLanguage(CodeLanguageLabel codeLanguage) {
        this.codeLanguage = codeLanguage;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeItem {\n");

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
        sb.append("    captions: ").append(toIndentedString(captions)).append("\n");
        sb.append("    references: ").append(toIndentedString(references)).append("\n");
        sb.append("    footnotes: ").append(toIndentedString(footnotes)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    codeLanguage: ").append(toIndentedString(codeLanguage)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code CodeItem} object that
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

        CodeItem model = (CodeItem) obj;

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
                java.util.Objects.equals(captions, model.captions) &&
                java.util.Objects.equals(references, model.references) &&
                java.util.Objects.equals(footnotes, model.footnotes) &&
                java.util.Objects.equals(image, model.image) &&
                java.util.Objects.equals(codeLanguage, model.codeLanguage);
    }

    /**
     * Returns a hash code for a {@code CodeItem}.
     *
     * @return a hash code value for a {@code CodeItem}.
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
                captions,
                references,
                footnotes,
                image,
                codeLanguage);
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
     * CodeItem.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class CodeItemQueryParam {

        /**
         * CodeItem.
         **/
        @jakarta.ws.rs.QueryParam("selfRef")
        private String selfRef;
        /**
         * CodeItem.
         **/
        @jakarta.ws.rs.QueryParam("parent")
        private RefItem parent;
        /**
         * CodeItem.
         **/
        @jakarta.ws.rs.QueryParam("children")
        private List<RefItem> children = null;
        /**
         * CodeItem.
         **/
        @jakarta.ws.rs.QueryParam("contentLayer")
        private ContentLayer contentLayer;

        public enum LabelEnum {
            CODE(String.valueOf("code"));

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
         * CodeItem.
         **/
        private LabelEnum label = LabelEnum.CODE;
        /**
         * CodeItem.
         **/
        @jakarta.ws.rs.QueryParam("prov")
        private List<ProvenanceItem> prov = null;
        /**
         * CodeItem.
         **/
        @jakarta.ws.rs.QueryParam("orig")
        private String orig;
        /**
         * CodeItem.
         **/
        @jakarta.ws.rs.QueryParam("text")
        private String text;
        /**
         * CodeItem.
         **/
        @jakarta.ws.rs.QueryParam("formatting")
        private Formatting formatting;
        /**
         * CodeItem.
         **/
        @jakarta.ws.rs.QueryParam("hyperlink")
        private Hyperlink hyperlink;
        /**
         * CodeItem.
         **/
        @jakarta.ws.rs.QueryParam("captions")
        private List<RefItem> captions = null;
        /**
         * CodeItem.
         **/
        @jakarta.ws.rs.QueryParam("references")
        private List<RefItem> references = null;
        /**
         * CodeItem.
         **/
        @jakarta.ws.rs.QueryParam("footnotes")
        private List<RefItem> footnotes = null;
        /**
         * CodeItem.
         **/
        @jakarta.ws.rs.QueryParam("image")
        private ImageRef image;
        /**
         * CodeItem.
         **/
        @jakarta.ws.rs.QueryParam("codeLanguage")
        private CodeLanguageLabel codeLanguage;

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

        public CodeItemQueryParam selfRef(String selfRef) {
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

        public CodeItemQueryParam parent(RefItem parent) {
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

        public CodeItemQueryParam children(List<RefItem> children) {
            this.children = children;
            return this;
        }

        public CodeItemQueryParam addChildrenItem(RefItem childrenItem) {
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

        public CodeItemQueryParam contentLayer(ContentLayer contentLayer) {
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

        public CodeItemQueryParam label(LabelEnum label) {
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

        public CodeItemQueryParam prov(List<ProvenanceItem> prov) {
            this.prov = prov;
            return this;
        }

        public CodeItemQueryParam addProvItem(ProvenanceItem provItem) {
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

        public CodeItemQueryParam orig(String orig) {
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

        public CodeItemQueryParam text(String text) {
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

        public CodeItemQueryParam formatting(Formatting formatting) {
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

        public CodeItemQueryParam hyperlink(Hyperlink hyperlink) {
            this.hyperlink = hyperlink;
            return this;
        }

        /**
         * Get captions
         *
         * @return captions
         **/
        @JsonProperty("captions")
        public List<RefItem> getCaptions() {
            return captions;
        }

        /**
         * Set captions
         **/
        public void setCaptions(List<RefItem> captions) {
            this.captions = captions;
        }

        public CodeItemQueryParam captions(List<RefItem> captions) {
            this.captions = captions;
            return this;
        }

        public CodeItemQueryParam addCaptionsItem(RefItem captionsItem) {
            this.captions.add(captionsItem);
            return this;
        }

        /**
         * Get references
         *
         * @return references
         **/
        @JsonProperty("references")
        public List<RefItem> getReferences() {
            return references;
        }

        /**
         * Set references
         **/
        public void setReferences(List<RefItem> references) {
            this.references = references;
        }

        public CodeItemQueryParam references(List<RefItem> references) {
            this.references = references;
            return this;
        }

        public CodeItemQueryParam addReferencesItem(RefItem referencesItem) {
            this.references.add(referencesItem);
            return this;
        }

        /**
         * Get footnotes
         *
         * @return footnotes
         **/
        @JsonProperty("footnotes")
        public List<RefItem> getFootnotes() {
            return footnotes;
        }

        /**
         * Set footnotes
         **/
        public void setFootnotes(List<RefItem> footnotes) {
            this.footnotes = footnotes;
        }

        public CodeItemQueryParam footnotes(List<RefItem> footnotes) {
            this.footnotes = footnotes;
            return this;
        }

        public CodeItemQueryParam addFootnotesItem(RefItem footnotesItem) {
            this.footnotes.add(footnotesItem);
            return this;
        }

        /**
         * Get image
         *
         * @return image
         **/
        @JsonProperty("image")
        public ImageRef getImage() {
            return image;
        }

        /**
         * Set image
         **/
        public void setImage(ImageRef image) {
            this.image = image;
        }

        public CodeItemQueryParam image(ImageRef image) {
            this.image = image;
            return this;
        }

        /**
         * Get codeLanguage
         *
         * @return codeLanguage
         **/
        @JsonProperty("code_language")
        public CodeLanguageLabel getCodeLanguage() {
            return codeLanguage;
        }

        /**
         * Set codeLanguage
         **/
        public void setCodeLanguage(CodeLanguageLabel codeLanguage) {
            this.codeLanguage = codeLanguage;
        }

        public CodeItemQueryParam codeLanguage(CodeLanguageLabel codeLanguage) {
            this.codeLanguage = codeLanguage;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CodeItemQueryParam {\n");

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
            sb.append("    captions: ").append(toIndentedString(captions)).append("\n");
            sb.append("    references: ").append(toIndentedString(references)).append("\n");
            sb.append("    footnotes: ").append(toIndentedString(footnotes)).append("\n");
            sb.append("    image: ").append(toIndentedString(image)).append("\n");
            sb.append("    codeLanguage: ").append(toIndentedString(codeLanguage)).append("\n");
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

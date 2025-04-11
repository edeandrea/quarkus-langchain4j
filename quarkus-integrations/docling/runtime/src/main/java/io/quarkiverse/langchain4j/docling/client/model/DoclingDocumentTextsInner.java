package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DoclingDocumentTextsInner {

    private String selfRef;
    private RefItem parent;
    private List<RefItem> children;
    private ContentLayer contentLayer;

    public enum LabelEnum {
        CAPTION(String.valueOf("caption")),
        CHECKBOX_SELECTED(String.valueOf("checkbox_selected")),
        CHECKBOX_UNSELECTED(String.valueOf("checkbox_unselected")),
        FOOTNOTE(String.valueOf("footnote")),
        PAGE_FOOTER(String.valueOf("page_footer")),
        PAGE_HEADER(String.valueOf("page_header")),
        PARAGRAPH(String.valueOf("paragraph")),
        REFERENCE(String.valueOf("reference")),
        TEXT(String.valueOf("text"));

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

    private LabelEnum label;
    private List<ProvenanceItem> prov;
    private String orig;
    private String text;
    private Formatting formatting;
    private Hyperlink hyperlink;
    private Integer level = 1;
    private Boolean enumerated = false;
    private String marker = "-";
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

    public DoclingDocumentTextsInner selfRef(String selfRef) {
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

    public DoclingDocumentTextsInner parent(RefItem parent) {
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

    public DoclingDocumentTextsInner children(List<RefItem> children) {
        this.children = children;
        return this;
    }

    public DoclingDocumentTextsInner addChildrenItem(RefItem childrenItem) {
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

    public DoclingDocumentTextsInner contentLayer(ContentLayer contentLayer) {
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

    public DoclingDocumentTextsInner label(LabelEnum label) {
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

    public DoclingDocumentTextsInner prov(List<ProvenanceItem> prov) {
        this.prov = prov;
        return this;
    }

    public DoclingDocumentTextsInner addProvItem(ProvenanceItem provItem) {
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

    public DoclingDocumentTextsInner orig(String orig) {
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

    public DoclingDocumentTextsInner text(String text) {
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

    public DoclingDocumentTextsInner formatting(Formatting formatting) {
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

    public DoclingDocumentTextsInner hyperlink(Hyperlink hyperlink) {
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

    public DoclingDocumentTextsInner level(Integer level) {
        this.level = level;
        return this;
    }

    /**
     * Get enumerated
     *
     * @return enumerated
     **/
    @JsonProperty("enumerated")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnumerated() {
        return enumerated;
    }

    /**
     * Set enumerated
     **/
    public void setEnumerated(Boolean enumerated) {
        this.enumerated = enumerated;
    }

    public DoclingDocumentTextsInner enumerated(Boolean enumerated) {
        this.enumerated = enumerated;
        return this;
    }

    /**
     * Get marker
     *
     * @return marker
     **/
    @JsonProperty("marker")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMarker() {
        return marker;
    }

    /**
     * Set marker
     **/
    public void setMarker(String marker) {
        this.marker = marker;
    }

    public DoclingDocumentTextsInner marker(String marker) {
        this.marker = marker;
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

    public DoclingDocumentTextsInner captions(List<RefItem> captions) {
        this.captions = captions;
        return this;
    }

    public DoclingDocumentTextsInner addCaptionsItem(RefItem captionsItem) {
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

    public DoclingDocumentTextsInner references(List<RefItem> references) {
        this.references = references;
        return this;
    }

    public DoclingDocumentTextsInner addReferencesItem(RefItem referencesItem) {
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

    public DoclingDocumentTextsInner footnotes(List<RefItem> footnotes) {
        this.footnotes = footnotes;
        return this;
    }

    public DoclingDocumentTextsInner addFootnotesItem(RefItem footnotesItem) {
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

    public DoclingDocumentTextsInner image(ImageRef image) {
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

    public DoclingDocumentTextsInner codeLanguage(CodeLanguageLabel codeLanguage) {
        this.codeLanguage = codeLanguage;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DoclingDocumentTextsInner {\n");

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
        sb.append("    enumerated: ").append(toIndentedString(enumerated)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
     * {@code null} and is a {@code DoclingDocumentTextsInner} object that
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

        DoclingDocumentTextsInner model = (DoclingDocumentTextsInner) obj;

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
                java.util.Objects.equals(level, model.level) &&
                java.util.Objects.equals(enumerated, model.enumerated) &&
                java.util.Objects.equals(marker, model.marker) &&
                java.util.Objects.equals(captions, model.captions) &&
                java.util.Objects.equals(references, model.references) &&
                java.util.Objects.equals(footnotes, model.footnotes) &&
                java.util.Objects.equals(image, model.image) &&
                java.util.Objects.equals(codeLanguage, model.codeLanguage);
    }

    /**
     * Returns a hash code for a {@code DoclingDocumentTextsInner}.
     *
     * @return a hash code value for a {@code DoclingDocumentTextsInner}.
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
                level,
                enumerated,
                marker,
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DoclingDocumentTextsInnerQueryParam {

        @jakarta.ws.rs.QueryParam("selfRef")
        private String selfRef;
        @jakarta.ws.rs.QueryParam("parent")
        private RefItem parent;
        @jakarta.ws.rs.QueryParam("children")
        private List<RefItem> children = null;
        @jakarta.ws.rs.QueryParam("contentLayer")
        private ContentLayer contentLayer;

        public enum LabelEnum {
            CAPTION(String.valueOf("caption")),
            CHECKBOX_SELECTED(String.valueOf("checkbox_selected")),
            CHECKBOX_UNSELECTED(String.valueOf("checkbox_unselected")),
            FOOTNOTE(String.valueOf("footnote")),
            PAGE_FOOTER(String.valueOf("page_footer")),
            PAGE_HEADER(String.valueOf("page_header")),
            PARAGRAPH(String.valueOf("paragraph")),
            REFERENCE(String.valueOf("reference")),
            TEXT(String.valueOf("text"));

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

        private LabelEnum label;
        @jakarta.ws.rs.QueryParam("prov")
        private List<ProvenanceItem> prov = null;
        @jakarta.ws.rs.QueryParam("orig")
        private String orig;
        @jakarta.ws.rs.QueryParam("text")
        private String text;
        @jakarta.ws.rs.QueryParam("formatting")
        private Formatting formatting;
        @jakarta.ws.rs.QueryParam("hyperlink")
        private Hyperlink hyperlink;
        @jakarta.ws.rs.QueryParam("level")
        private Integer level = 1;
        @jakarta.ws.rs.QueryParam("enumerated")
        private Boolean enumerated = false;
        @jakarta.ws.rs.QueryParam("marker")
        private String marker = "-";
        @jakarta.ws.rs.QueryParam("captions")
        private List<RefItem> captions = null;
        @jakarta.ws.rs.QueryParam("references")
        private List<RefItem> references = null;
        @jakarta.ws.rs.QueryParam("footnotes")
        private List<RefItem> footnotes = null;
        @jakarta.ws.rs.QueryParam("image")
        private ImageRef image;
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

        public DoclingDocumentTextsInnerQueryParam selfRef(String selfRef) {
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

        public DoclingDocumentTextsInnerQueryParam parent(RefItem parent) {
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

        public DoclingDocumentTextsInnerQueryParam children(List<RefItem> children) {
            this.children = children;
            return this;
        }

        public DoclingDocumentTextsInnerQueryParam addChildrenItem(RefItem childrenItem) {
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

        public DoclingDocumentTextsInnerQueryParam contentLayer(ContentLayer contentLayer) {
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

        public DoclingDocumentTextsInnerQueryParam label(LabelEnum label) {
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

        public DoclingDocumentTextsInnerQueryParam prov(List<ProvenanceItem> prov) {
            this.prov = prov;
            return this;
        }

        public DoclingDocumentTextsInnerQueryParam addProvItem(ProvenanceItem provItem) {
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

        public DoclingDocumentTextsInnerQueryParam orig(String orig) {
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

        public DoclingDocumentTextsInnerQueryParam text(String text) {
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

        public DoclingDocumentTextsInnerQueryParam formatting(Formatting formatting) {
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

        public DoclingDocumentTextsInnerQueryParam hyperlink(Hyperlink hyperlink) {
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

        public DoclingDocumentTextsInnerQueryParam level(Integer level) {
            this.level = level;
            return this;
        }

        /**
         * Get enumerated
         *
         * @return enumerated
         **/
        @JsonProperty("enumerated")
        public Boolean getEnumerated() {
            return enumerated;
        }

        /**
         * Set enumerated
         **/
        public void setEnumerated(Boolean enumerated) {
            this.enumerated = enumerated;
        }

        public DoclingDocumentTextsInnerQueryParam enumerated(Boolean enumerated) {
            this.enumerated = enumerated;
            return this;
        }

        /**
         * Get marker
         *
         * @return marker
         **/
        @JsonProperty("marker")
        public String getMarker() {
            return marker;
        }

        /**
         * Set marker
         **/
        public void setMarker(String marker) {
            this.marker = marker;
        }

        public DoclingDocumentTextsInnerQueryParam marker(String marker) {
            this.marker = marker;
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

        public DoclingDocumentTextsInnerQueryParam captions(List<RefItem> captions) {
            this.captions = captions;
            return this;
        }

        public DoclingDocumentTextsInnerQueryParam addCaptionsItem(RefItem captionsItem) {
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

        public DoclingDocumentTextsInnerQueryParam references(List<RefItem> references) {
            this.references = references;
            return this;
        }

        public DoclingDocumentTextsInnerQueryParam addReferencesItem(RefItem referencesItem) {
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

        public DoclingDocumentTextsInnerQueryParam footnotes(List<RefItem> footnotes) {
            this.footnotes = footnotes;
            return this;
        }

        public DoclingDocumentTextsInnerQueryParam addFootnotesItem(RefItem footnotesItem) {
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

        public DoclingDocumentTextsInnerQueryParam image(ImageRef image) {
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

        public DoclingDocumentTextsInnerQueryParam codeLanguage(CodeLanguageLabel codeLanguage) {
            this.codeLanguage = codeLanguage;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DoclingDocumentTextsInnerQueryParam {\n");

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
            sb.append("    enumerated: ").append(toIndentedString(enumerated)).append("\n");
            sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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

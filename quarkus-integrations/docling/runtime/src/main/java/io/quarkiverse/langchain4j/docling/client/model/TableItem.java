package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * TableItem.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class TableItem {

    private String selfRef;
    private RefItem parent;
    private List<RefItem> children;
    private ContentLayer contentLayer;

    public enum LabelEnum {
        DOCUMENT_INDEX(String.valueOf("document_index")),
        TABLE(String.valueOf("table"));

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

    private LabelEnum label = LabelEnum.TABLE;
    private List<ProvenanceItem> prov;
    private List<RefItem> captions;
    private List<RefItem> references;
    private List<RefItem> footnotes;
    private ImageRef image;
    private TableData data;

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

    public TableItem selfRef(String selfRef) {
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

    public TableItem parent(RefItem parent) {
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

    public TableItem children(List<RefItem> children) {
        this.children = children;
        return this;
    }

    public TableItem addChildrenItem(RefItem childrenItem) {
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

    public TableItem contentLayer(ContentLayer contentLayer) {
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

    public TableItem label(LabelEnum label) {
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

    public TableItem prov(List<ProvenanceItem> prov) {
        this.prov = prov;
        return this;
    }

    public TableItem addProvItem(ProvenanceItem provItem) {
        if (this.prov == null) {
            prov = new ArrayList<>();
        }
        this.prov.add(provItem);
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

    public TableItem captions(List<RefItem> captions) {
        this.captions = captions;
        return this;
    }

    public TableItem addCaptionsItem(RefItem captionsItem) {
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

    public TableItem references(List<RefItem> references) {
        this.references = references;
        return this;
    }

    public TableItem addReferencesItem(RefItem referencesItem) {
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

    public TableItem footnotes(List<RefItem> footnotes) {
        this.footnotes = footnotes;
        return this;
    }

    public TableItem addFootnotesItem(RefItem footnotesItem) {
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

    public TableItem image(ImageRef image) {
        this.image = image;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @JsonProperty("data")
    public TableData getData() {
        return data;
    }

    /**
     * Set data
     **/
    public void setData(TableData data) {
        this.data = data;
    }

    public TableItem data(TableData data) {
        this.data = data;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableItem {\n");

        sb.append("    selfRef: ").append(toIndentedString(selfRef)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    contentLayer: ").append(toIndentedString(contentLayer)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    prov: ").append(toIndentedString(prov)).append("\n");
        sb.append("    captions: ").append(toIndentedString(captions)).append("\n");
        sb.append("    references: ").append(toIndentedString(references)).append("\n");
        sb.append("    footnotes: ").append(toIndentedString(footnotes)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code TableItem} object that
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

        TableItem model = (TableItem) obj;

        return java.util.Objects.equals(selfRef, model.selfRef) &&
                java.util.Objects.equals(parent, model.parent) &&
                java.util.Objects.equals(children, model.children) &&
                java.util.Objects.equals(contentLayer, model.contentLayer) &&
                java.util.Objects.equals(label, model.label) &&
                java.util.Objects.equals(prov, model.prov) &&
                java.util.Objects.equals(captions, model.captions) &&
                java.util.Objects.equals(references, model.references) &&
                java.util.Objects.equals(footnotes, model.footnotes) &&
                java.util.Objects.equals(image, model.image) &&
                java.util.Objects.equals(data, model.data);
    }

    /**
     * Returns a hash code for a {@code TableItem}.
     *
     * @return a hash code value for a {@code TableItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(selfRef,
                parent,
                children,
                contentLayer,
                label,
                prov,
                captions,
                references,
                footnotes,
                image,
                data);
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
     * TableItem.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TableItemQueryParam {

        /**
         * TableItem.
         **/
        @jakarta.ws.rs.QueryParam("selfRef")
        private String selfRef;
        /**
         * TableItem.
         **/
        @jakarta.ws.rs.QueryParam("parent")
        private RefItem parent;
        /**
         * TableItem.
         **/
        @jakarta.ws.rs.QueryParam("children")
        private List<RefItem> children = null;
        /**
         * TableItem.
         **/
        @jakarta.ws.rs.QueryParam("contentLayer")
        private ContentLayer contentLayer;

        public enum LabelEnum {
            DOCUMENT_INDEX(String.valueOf("document_index")),
            TABLE(String.valueOf("table"));

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
         * TableItem.
         **/
        private LabelEnum label = LabelEnum.TABLE;
        /**
         * TableItem.
         **/
        @jakarta.ws.rs.QueryParam("prov")
        private List<ProvenanceItem> prov = null;
        /**
         * TableItem.
         **/
        @jakarta.ws.rs.QueryParam("captions")
        private List<RefItem> captions = null;
        /**
         * TableItem.
         **/
        @jakarta.ws.rs.QueryParam("references")
        private List<RefItem> references = null;
        /**
         * TableItem.
         **/
        @jakarta.ws.rs.QueryParam("footnotes")
        private List<RefItem> footnotes = null;
        /**
         * TableItem.
         **/
        @jakarta.ws.rs.QueryParam("image")
        private ImageRef image;
        /**
         * TableItem.
         **/
        @jakarta.ws.rs.QueryParam("data")
        private TableData data;

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

        public TableItemQueryParam selfRef(String selfRef) {
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

        public TableItemQueryParam parent(RefItem parent) {
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

        public TableItemQueryParam children(List<RefItem> children) {
            this.children = children;
            return this;
        }

        public TableItemQueryParam addChildrenItem(RefItem childrenItem) {
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

        public TableItemQueryParam contentLayer(ContentLayer contentLayer) {
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

        public TableItemQueryParam label(LabelEnum label) {
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

        public TableItemQueryParam prov(List<ProvenanceItem> prov) {
            this.prov = prov;
            return this;
        }

        public TableItemQueryParam addProvItem(ProvenanceItem provItem) {
            this.prov.add(provItem);
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

        public TableItemQueryParam captions(List<RefItem> captions) {
            this.captions = captions;
            return this;
        }

        public TableItemQueryParam addCaptionsItem(RefItem captionsItem) {
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

        public TableItemQueryParam references(List<RefItem> references) {
            this.references = references;
            return this;
        }

        public TableItemQueryParam addReferencesItem(RefItem referencesItem) {
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

        public TableItemQueryParam footnotes(List<RefItem> footnotes) {
            this.footnotes = footnotes;
            return this;
        }

        public TableItemQueryParam addFootnotesItem(RefItem footnotesItem) {
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

        public TableItemQueryParam image(ImageRef image) {
            this.image = image;
            return this;
        }

        /**
         * Get data
         *
         * @return data
         **/
        @JsonProperty("data")
        public TableData getData() {
            return data;
        }

        /**
         * Set data
         **/
        public void setData(TableData data) {
            this.data = data;
        }

        public TableItemQueryParam data(TableData data) {
            this.data = data;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TableItemQueryParam {\n");

            sb.append("    selfRef: ").append(toIndentedString(selfRef)).append("\n");
            sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
            sb.append("    children: ").append(toIndentedString(children)).append("\n");
            sb.append("    contentLayer: ").append(toIndentedString(contentLayer)).append("\n");
            sb.append("    label: ").append(toIndentedString(label)).append("\n");
            sb.append("    prov: ").append(toIndentedString(prov)).append("\n");
            sb.append("    captions: ").append(toIndentedString(captions)).append("\n");
            sb.append("    references: ").append(toIndentedString(references)).append("\n");
            sb.append("    footnotes: ").append(toIndentedString(footnotes)).append("\n");
            sb.append("    image: ").append(toIndentedString(image)).append("\n");
            sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

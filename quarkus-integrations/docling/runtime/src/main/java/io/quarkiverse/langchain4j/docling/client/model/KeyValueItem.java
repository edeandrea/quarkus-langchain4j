package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * KeyValueItem.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class KeyValueItem {

    private String selfRef;
    private RefItem parent;
    private List<RefItem> children;
    private ContentLayer contentLayer;

    public enum LabelEnum {
        KEY_VALUE_REGION(String.valueOf("key_value_region"));

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

    private LabelEnum label = LabelEnum.KEY_VALUE_REGION;
    private List<ProvenanceItem> prov;
    private List<RefItem> captions;
    private List<RefItem> references;
    private List<RefItem> footnotes;
    private ImageRef image;
    private GraphData graph;

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

    public KeyValueItem selfRef(String selfRef) {
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

    public KeyValueItem parent(RefItem parent) {
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

    public KeyValueItem children(List<RefItem> children) {
        this.children = children;
        return this;
    }

    public KeyValueItem addChildrenItem(RefItem childrenItem) {
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

    public KeyValueItem contentLayer(ContentLayer contentLayer) {
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

    public KeyValueItem label(LabelEnum label) {
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

    public KeyValueItem prov(List<ProvenanceItem> prov) {
        this.prov = prov;
        return this;
    }

    public KeyValueItem addProvItem(ProvenanceItem provItem) {
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

    public KeyValueItem captions(List<RefItem> captions) {
        this.captions = captions;
        return this;
    }

    public KeyValueItem addCaptionsItem(RefItem captionsItem) {
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

    public KeyValueItem references(List<RefItem> references) {
        this.references = references;
        return this;
    }

    public KeyValueItem addReferencesItem(RefItem referencesItem) {
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

    public KeyValueItem footnotes(List<RefItem> footnotes) {
        this.footnotes = footnotes;
        return this;
    }

    public KeyValueItem addFootnotesItem(RefItem footnotesItem) {
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

    public KeyValueItem image(ImageRef image) {
        this.image = image;
        return this;
    }

    /**
     * Get graph
     *
     * @return graph
     **/
    @JsonProperty("graph")
    public GraphData getGraph() {
        return graph;
    }

    /**
     * Set graph
     **/
    public void setGraph(GraphData graph) {
        this.graph = graph;
    }

    public KeyValueItem graph(GraphData graph) {
        this.graph = graph;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyValueItem {\n");

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
        sb.append("    graph: ").append(toIndentedString(graph)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code KeyValueItem} object that
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

        KeyValueItem model = (KeyValueItem) obj;

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
                java.util.Objects.equals(graph, model.graph);
    }

    /**
     * Returns a hash code for a {@code KeyValueItem}.
     *
     * @return a hash code value for a {@code KeyValueItem}.
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
                graph);
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
     * KeyValueItem.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class KeyValueItemQueryParam {

        /**
         * KeyValueItem.
         **/
        @jakarta.ws.rs.QueryParam("selfRef")
        private String selfRef;
        /**
         * KeyValueItem.
         **/
        @jakarta.ws.rs.QueryParam("parent")
        private RefItem parent;
        /**
         * KeyValueItem.
         **/
        @jakarta.ws.rs.QueryParam("children")
        private List<RefItem> children = null;
        /**
         * KeyValueItem.
         **/
        @jakarta.ws.rs.QueryParam("contentLayer")
        private ContentLayer contentLayer;

        public enum LabelEnum {
            KEY_VALUE_REGION(String.valueOf("key_value_region"));

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
         * KeyValueItem.
         **/
        private LabelEnum label = LabelEnum.KEY_VALUE_REGION;
        /**
         * KeyValueItem.
         **/
        @jakarta.ws.rs.QueryParam("prov")
        private List<ProvenanceItem> prov = null;
        /**
         * KeyValueItem.
         **/
        @jakarta.ws.rs.QueryParam("captions")
        private List<RefItem> captions = null;
        /**
         * KeyValueItem.
         **/
        @jakarta.ws.rs.QueryParam("references")
        private List<RefItem> references = null;
        /**
         * KeyValueItem.
         **/
        @jakarta.ws.rs.QueryParam("footnotes")
        private List<RefItem> footnotes = null;
        /**
         * KeyValueItem.
         **/
        @jakarta.ws.rs.QueryParam("image")
        private ImageRef image;
        /**
         * KeyValueItem.
         **/
        @jakarta.ws.rs.QueryParam("graph")
        private GraphData graph;

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

        public KeyValueItemQueryParam selfRef(String selfRef) {
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

        public KeyValueItemQueryParam parent(RefItem parent) {
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

        public KeyValueItemQueryParam children(List<RefItem> children) {
            this.children = children;
            return this;
        }

        public KeyValueItemQueryParam addChildrenItem(RefItem childrenItem) {
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

        public KeyValueItemQueryParam contentLayer(ContentLayer contentLayer) {
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

        public KeyValueItemQueryParam label(LabelEnum label) {
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

        public KeyValueItemQueryParam prov(List<ProvenanceItem> prov) {
            this.prov = prov;
            return this;
        }

        public KeyValueItemQueryParam addProvItem(ProvenanceItem provItem) {
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

        public KeyValueItemQueryParam captions(List<RefItem> captions) {
            this.captions = captions;
            return this;
        }

        public KeyValueItemQueryParam addCaptionsItem(RefItem captionsItem) {
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

        public KeyValueItemQueryParam references(List<RefItem> references) {
            this.references = references;
            return this;
        }

        public KeyValueItemQueryParam addReferencesItem(RefItem referencesItem) {
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

        public KeyValueItemQueryParam footnotes(List<RefItem> footnotes) {
            this.footnotes = footnotes;
            return this;
        }

        public KeyValueItemQueryParam addFootnotesItem(RefItem footnotesItem) {
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

        public KeyValueItemQueryParam image(ImageRef image) {
            this.image = image;
            return this;
        }

        /**
         * Get graph
         *
         * @return graph
         **/
        @JsonProperty("graph")
        public GraphData getGraph() {
            return graph;
        }

        /**
         * Set graph
         **/
        public void setGraph(GraphData graph) {
            this.graph = graph;
        }

        public KeyValueItemQueryParam graph(GraphData graph) {
            this.graph = graph;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class KeyValueItemQueryParam {\n");

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
            sb.append("    graph: ").append(toIndentedString(graph)).append("\n");
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

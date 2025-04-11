package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GraphCell.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class GraphCell {

    private GraphCellLabel label;
    private Integer cellId;
    private String text;
    private String orig;
    private ProvenanceItem prov;
    private RefItem itemRef;

    /**
     * Get label
     *
     * @return label
     **/
    @JsonProperty("label")
    public GraphCellLabel getLabel() {
        return label;
    }

    /**
     * Set label
     **/
    public void setLabel(GraphCellLabel label) {
        this.label = label;
    }

    public GraphCell label(GraphCellLabel label) {
        this.label = label;
        return this;
    }

    /**
     * Get cellId
     *
     * @return cellId
     **/
    @JsonProperty("cell_id")
    public Integer getCellId() {
        return cellId;
    }

    /**
     * Set cellId
     **/
    public void setCellId(Integer cellId) {
        this.cellId = cellId;
    }

    public GraphCell cellId(Integer cellId) {
        this.cellId = cellId;
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

    public GraphCell text(String text) {
        this.text = text;
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

    public GraphCell orig(String orig) {
        this.orig = orig;
        return this;
    }

    /**
     * Get prov
     *
     * @return prov
     **/
    @JsonProperty("prov")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ProvenanceItem getProv() {
        return prov;
    }

    /**
     * Set prov
     **/
    public void setProv(ProvenanceItem prov) {
        this.prov = prov;
    }

    public GraphCell prov(ProvenanceItem prov) {
        this.prov = prov;
        return this;
    }

    /**
     * Get itemRef
     *
     * @return itemRef
     **/
    @JsonProperty("item_ref")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RefItem getItemRef() {
        return itemRef;
    }

    /**
     * Set itemRef
     **/
    public void setItemRef(RefItem itemRef) {
        this.itemRef = itemRef;
    }

    public GraphCell itemRef(RefItem itemRef) {
        this.itemRef = itemRef;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GraphCell {\n");

        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    cellId: ").append(toIndentedString(cellId)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    orig: ").append(toIndentedString(orig)).append("\n");
        sb.append("    prov: ").append(toIndentedString(prov)).append("\n");
        sb.append("    itemRef: ").append(toIndentedString(itemRef)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GraphCell} object that
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

        GraphCell model = (GraphCell) obj;

        return java.util.Objects.equals(label, model.label) &&
                java.util.Objects.equals(cellId, model.cellId) &&
                java.util.Objects.equals(text, model.text) &&
                java.util.Objects.equals(orig, model.orig) &&
                java.util.Objects.equals(prov, model.prov) &&
                java.util.Objects.equals(itemRef, model.itemRef);
    }

    /**
     * Returns a hash code for a {@code GraphCell}.
     *
     * @return a hash code value for a {@code GraphCell}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(label,
                cellId,
                text,
                orig,
                prov,
                itemRef);
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
     * GraphCell.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GraphCellQueryParam {

        /**
         * GraphCell.
         **/
        @jakarta.ws.rs.QueryParam("label")
        private GraphCellLabel label;
        /**
         * GraphCell.
         **/
        @jakarta.ws.rs.QueryParam("cellId")
        private Integer cellId;
        /**
         * GraphCell.
         **/
        @jakarta.ws.rs.QueryParam("text")
        private String text;
        /**
         * GraphCell.
         **/
        @jakarta.ws.rs.QueryParam("orig")
        private String orig;
        /**
         * GraphCell.
         **/
        @jakarta.ws.rs.QueryParam("prov")
        private ProvenanceItem prov;
        /**
         * GraphCell.
         **/
        @jakarta.ws.rs.QueryParam("itemRef")
        private RefItem itemRef;

        /**
         * Get label
         *
         * @return label
         **/
        @JsonProperty("label")
        public GraphCellLabel getLabel() {
            return label;
        }

        /**
         * Set label
         **/
        public void setLabel(GraphCellLabel label) {
            this.label = label;
        }

        public GraphCellQueryParam label(GraphCellLabel label) {
            this.label = label;
            return this;
        }

        /**
         * Get cellId
         *
         * @return cellId
         **/
        @JsonProperty("cell_id")
        public Integer getCellId() {
            return cellId;
        }

        /**
         * Set cellId
         **/
        public void setCellId(Integer cellId) {
            this.cellId = cellId;
        }

        public GraphCellQueryParam cellId(Integer cellId) {
            this.cellId = cellId;
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

        public GraphCellQueryParam text(String text) {
            this.text = text;
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

        public GraphCellQueryParam orig(String orig) {
            this.orig = orig;
            return this;
        }

        /**
         * Get prov
         *
         * @return prov
         **/
        @JsonProperty("prov")
        public ProvenanceItem getProv() {
            return prov;
        }

        /**
         * Set prov
         **/
        public void setProv(ProvenanceItem prov) {
            this.prov = prov;
        }

        public GraphCellQueryParam prov(ProvenanceItem prov) {
            this.prov = prov;
            return this;
        }

        /**
         * Get itemRef
         *
         * @return itemRef
         **/
        @JsonProperty("item_ref")
        public RefItem getItemRef() {
            return itemRef;
        }

        /**
         * Set itemRef
         **/
        public void setItemRef(RefItem itemRef) {
            this.itemRef = itemRef;
        }

        public GraphCellQueryParam itemRef(RefItem itemRef) {
            this.itemRef = itemRef;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GraphCellQueryParam {\n");

            sb.append("    label: ").append(toIndentedString(label)).append("\n");
            sb.append("    cellId: ").append(toIndentedString(cellId)).append("\n");
            sb.append("    text: ").append(toIndentedString(text)).append("\n");
            sb.append("    orig: ").append(toIndentedString(orig)).append("\n");
            sb.append("    prov: ").append(toIndentedString(prov)).append("\n");
            sb.append("    itemRef: ").append(toIndentedString(itemRef)).append("\n");
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

package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GraphLink.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class GraphLink {

    private GraphLinkLabel label;
    private Integer sourceCellId;
    private Integer targetCellId;

    /**
     * Get label
     *
     * @return label
     **/
    @JsonProperty("label")
    public GraphLinkLabel getLabel() {
        return label;
    }

    /**
     * Set label
     **/
    public void setLabel(GraphLinkLabel label) {
        this.label = label;
    }

    public GraphLink label(GraphLinkLabel label) {
        this.label = label;
        return this;
    }

    /**
     * Get sourceCellId
     *
     * @return sourceCellId
     **/
    @JsonProperty("source_cell_id")
    public Integer getSourceCellId() {
        return sourceCellId;
    }

    /**
     * Set sourceCellId
     **/
    public void setSourceCellId(Integer sourceCellId) {
        this.sourceCellId = sourceCellId;
    }

    public GraphLink sourceCellId(Integer sourceCellId) {
        this.sourceCellId = sourceCellId;
        return this;
    }

    /**
     * Get targetCellId
     *
     * @return targetCellId
     **/
    @JsonProperty("target_cell_id")
    public Integer getTargetCellId() {
        return targetCellId;
    }

    /**
     * Set targetCellId
     **/
    public void setTargetCellId(Integer targetCellId) {
        this.targetCellId = targetCellId;
    }

    public GraphLink targetCellId(Integer targetCellId) {
        this.targetCellId = targetCellId;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GraphLink {\n");

        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    sourceCellId: ").append(toIndentedString(sourceCellId)).append("\n");
        sb.append("    targetCellId: ").append(toIndentedString(targetCellId)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GraphLink} object that
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

        GraphLink model = (GraphLink) obj;

        return java.util.Objects.equals(label, model.label) &&
                java.util.Objects.equals(sourceCellId, model.sourceCellId) &&
                java.util.Objects.equals(targetCellId, model.targetCellId);
    }

    /**
     * Returns a hash code for a {@code GraphLink}.
     *
     * @return a hash code value for a {@code GraphLink}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(label,
                sourceCellId,
                targetCellId);
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
     * GraphLink.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GraphLinkQueryParam {

        /**
         * GraphLink.
         **/
        @jakarta.ws.rs.QueryParam("label")
        private GraphLinkLabel label;
        /**
         * GraphLink.
         **/
        @jakarta.ws.rs.QueryParam("sourceCellId")
        private Integer sourceCellId;
        /**
         * GraphLink.
         **/
        @jakarta.ws.rs.QueryParam("targetCellId")
        private Integer targetCellId;

        /**
         * Get label
         *
         * @return label
         **/
        @JsonProperty("label")
        public GraphLinkLabel getLabel() {
            return label;
        }

        /**
         * Set label
         **/
        public void setLabel(GraphLinkLabel label) {
            this.label = label;
        }

        public GraphLinkQueryParam label(GraphLinkLabel label) {
            this.label = label;
            return this;
        }

        /**
         * Get sourceCellId
         *
         * @return sourceCellId
         **/
        @JsonProperty("source_cell_id")
        public Integer getSourceCellId() {
            return sourceCellId;
        }

        /**
         * Set sourceCellId
         **/
        public void setSourceCellId(Integer sourceCellId) {
            this.sourceCellId = sourceCellId;
        }

        public GraphLinkQueryParam sourceCellId(Integer sourceCellId) {
            this.sourceCellId = sourceCellId;
            return this;
        }

        /**
         * Get targetCellId
         *
         * @return targetCellId
         **/
        @JsonProperty("target_cell_id")
        public Integer getTargetCellId() {
            return targetCellId;
        }

        /**
         * Set targetCellId
         **/
        public void setTargetCellId(Integer targetCellId) {
            this.targetCellId = targetCellId;
        }

        public GraphLinkQueryParam targetCellId(Integer targetCellId) {
            this.targetCellId = targetCellId;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GraphLinkQueryParam {\n");

            sb.append("    label: ").append(toIndentedString(label)).append("\n");
            sb.append("    sourceCellId: ").append(toIndentedString(sourceCellId)).append("\n");
            sb.append("    targetCellId: ").append(toIndentedString(targetCellId)).append("\n");
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

package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ProvenanceItem.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProvenanceItem {

    private Integer pageNo;
    private BoundingBox bbox;
    private List<Object> charspan = new ArrayList<>();

    /**
     * Get pageNo
     *
     * @return pageNo
     **/
    @JsonProperty("page_no")
    public Integer getPageNo() {
        return pageNo;
    }

    /**
     * Set pageNo
     **/
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public ProvenanceItem pageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * Get bbox
     *
     * @return bbox
     **/
    @JsonProperty("bbox")
    public BoundingBox getBbox() {
        return bbox;
    }

    /**
     * Set bbox
     **/
    public void setBbox(BoundingBox bbox) {
        this.bbox = bbox;
    }

    public ProvenanceItem bbox(BoundingBox bbox) {
        this.bbox = bbox;
        return this;
    }

    /**
     * Get charspan
     *
     * @return charspan
     **/
    @JsonProperty("charspan")
    public List<Object> getCharspan() {
        return charspan;
    }

    /**
     * Set charspan
     **/
    public void setCharspan(List<Object> charspan) {
        this.charspan = charspan;
    }

    public ProvenanceItem charspan(List<Object> charspan) {
        this.charspan = charspan;
        return this;
    }

    public ProvenanceItem addCharspanItem(Object charspanItem) {
        if (this.charspan == null) {
            charspan = new ArrayList<>();
        }
        this.charspan.add(charspanItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProvenanceItem {\n");

        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    bbox: ").append(toIndentedString(bbox)).append("\n");
        sb.append("    charspan: ").append(toIndentedString(charspan)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ProvenanceItem} object that
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

        ProvenanceItem model = (ProvenanceItem) obj;

        return java.util.Objects.equals(pageNo, model.pageNo) &&
                java.util.Objects.equals(bbox, model.bbox) &&
                java.util.Objects.equals(charspan, model.charspan);
    }

    /**
     * Returns a hash code for a {@code ProvenanceItem}.
     *
     * @return a hash code value for a {@code ProvenanceItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(pageNo,
                bbox,
                charspan);
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
     * ProvenanceItem.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ProvenanceItemQueryParam {

        /**
         * ProvenanceItem.
         **/
        @jakarta.ws.rs.QueryParam("pageNo")
        private Integer pageNo;
        /**
         * ProvenanceItem.
         **/
        @jakarta.ws.rs.QueryParam("bbox")
        private BoundingBox bbox;
        /**
         * ProvenanceItem.
         **/
        @jakarta.ws.rs.QueryParam("charspan")
        private List<Object> charspan = new ArrayList<>();

        /**
         * Get pageNo
         *
         * @return pageNo
         **/
        @JsonProperty("page_no")
        public Integer getPageNo() {
            return pageNo;
        }

        /**
         * Set pageNo
         **/
        public void setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
        }

        public ProvenanceItemQueryParam pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * Get bbox
         *
         * @return bbox
         **/
        @JsonProperty("bbox")
        public BoundingBox getBbox() {
            return bbox;
        }

        /**
         * Set bbox
         **/
        public void setBbox(BoundingBox bbox) {
            this.bbox = bbox;
        }

        public ProvenanceItemQueryParam bbox(BoundingBox bbox) {
            this.bbox = bbox;
            return this;
        }

        /**
         * Get charspan
         *
         * @return charspan
         **/
        @JsonProperty("charspan")
        public List<Object> getCharspan() {
            return charspan;
        }

        /**
         * Set charspan
         **/
        public void setCharspan(List<Object> charspan) {
            this.charspan = charspan;
        }

        public ProvenanceItemQueryParam charspan(List<Object> charspan) {
            this.charspan = charspan;
            return this;
        }

        public ProvenanceItemQueryParam addCharspanItem(Object charspanItem) {
            this.charspan.add(charspanItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ProvenanceItemQueryParam {\n");

            sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
            sb.append("    bbox: ").append(toIndentedString(bbox)).append("\n");
            sb.append("    charspan: ").append(toIndentedString(charspan)).append("\n");
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

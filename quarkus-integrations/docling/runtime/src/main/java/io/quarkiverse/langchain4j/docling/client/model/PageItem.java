package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PageItem.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class PageItem {

    private Size size;
    private ImageRef image;
    private Integer pageNo;

    /**
     * Get size
     *
     * @return size
     **/
    @JsonProperty("size")
    public Size getSize() {
        return size;
    }

    /**
     * Set size
     **/
    public void setSize(Size size) {
        this.size = size;
    }

    public PageItem size(Size size) {
        this.size = size;
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

    public PageItem image(ImageRef image) {
        this.image = image;
        return this;
    }

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

    public PageItem pageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PageItem {\n");

        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PageItem} object that
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

        PageItem model = (PageItem) obj;

        return java.util.Objects.equals(size, model.size) &&
                java.util.Objects.equals(image, model.image) &&
                java.util.Objects.equals(pageNo, model.pageNo);
    }

    /**
     * Returns a hash code for a {@code PageItem}.
     *
     * @return a hash code value for a {@code PageItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(size,
                image,
                pageNo);
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
     * PageItem.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PageItemQueryParam {

        /**
         * PageItem.
         **/
        @jakarta.ws.rs.QueryParam("size")
        private Size size;
        /**
         * PageItem.
         **/
        @jakarta.ws.rs.QueryParam("image")
        private ImageRef image;
        /**
         * PageItem.
         **/
        @jakarta.ws.rs.QueryParam("pageNo")
        private Integer pageNo;

        /**
         * Get size
         *
         * @return size
         **/
        @JsonProperty("size")
        public Size getSize() {
            return size;
        }

        /**
         * Set size
         **/
        public void setSize(Size size) {
            this.size = size;
        }

        public PageItemQueryParam size(Size size) {
            this.size = size;
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

        public PageItemQueryParam image(ImageRef image) {
            this.image = image;
            return this;
        }

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

        public PageItemQueryParam pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PageItemQueryParam {\n");

            sb.append("    size: ").append(toIndentedString(size)).append("\n");
            sb.append("    image: ").append(toIndentedString(image)).append("\n");
            sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
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

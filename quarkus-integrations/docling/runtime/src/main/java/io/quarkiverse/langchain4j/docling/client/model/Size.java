package io.quarkiverse.langchain4j.docling.client.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Size.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class Size {

    private BigDecimal width = new BigDecimal("0");
    private BigDecimal height = new BigDecimal("0");

    /**
     * Get width
     *
     * @return width
     **/
    @JsonProperty("width")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getWidth() {
        return width;
    }

    /**
     * Set width
     **/
    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public Size width(BigDecimal width) {
        this.width = width;
        return this;
    }

    /**
     * Get height
     *
     * @return height
     **/
    @JsonProperty("height")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * Set height
     **/
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public Size height(BigDecimal height) {
        this.height = height;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Size {\n");

        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code Size} object that
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

        Size model = (Size) obj;

        return java.util.Objects.equals(width, model.width) &&
                java.util.Objects.equals(height, model.height);
    }

    /**
     * Returns a hash code for a {@code Size}.
     *
     * @return a hash code value for a {@code Size}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(width,
                height);
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
     * Size.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SizeQueryParam {

        /**
         * Size.
         **/
        @jakarta.ws.rs.QueryParam("width")
        private BigDecimal width = new BigDecimal("0");
        /**
         * Size.
         **/
        @jakarta.ws.rs.QueryParam("height")
        private BigDecimal height = new BigDecimal("0");

        /**
         * Get width
         *
         * @return width
         **/
        @JsonProperty("width")
        public BigDecimal getWidth() {
            return width;
        }

        /**
         * Set width
         **/
        public void setWidth(BigDecimal width) {
            this.width = width;
        }

        public SizeQueryParam width(BigDecimal width) {
            this.width = width;
            return this;
        }

        /**
         * Get height
         *
         * @return height
         **/
        @JsonProperty("height")
        public BigDecimal getHeight() {
            return height;
        }

        /**
         * Set height
         **/
        public void setHeight(BigDecimal height) {
            this.height = height;
        }

        public SizeQueryParam height(BigDecimal height) {
            this.height = height;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SizeQueryParam {\n");

            sb.append("    width: ").append(toIndentedString(width)).append("\n");
            sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

package io.quarkiverse.langchain4j.docling.client.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * PictureClassificationData.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class PictureClassificationClass {

    private String className;
    private BigDecimal confidence;

    /**
     * Get className
     *
     * @return className
     **/
    @JsonProperty("class_name")
    public String getClassName() {
        return className;
    }

    /**
     * Set className
     **/
    public void setClassName(String className) {
        this.className = className;
    }

    public PictureClassificationClass className(String className) {
        this.className = className;
        return this;
    }

    /**
     * Get confidence
     *
     * @return confidence
     **/
    @JsonProperty("confidence")
    public BigDecimal getConfidence() {
        return confidence;
    }

    /**
     * Set confidence
     **/
    public void setConfidence(BigDecimal confidence) {
        this.confidence = confidence;
    }

    public PictureClassificationClass confidence(BigDecimal confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PictureClassificationClass {\n");

        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PictureClassificationClass} object that
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

        PictureClassificationClass model = (PictureClassificationClass) obj;

        return java.util.Objects.equals(className, model.className) &&
                java.util.Objects.equals(confidence, model.confidence);
    }

    /**
     * Returns a hash code for a {@code PictureClassificationClass}.
     *
     * @return a hash code value for a {@code PictureClassificationClass}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(className,
                confidence);
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
     * PictureClassificationData.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PictureClassificationClassQueryParam {

        /**
         * PictureClassificationData.
         **/
        @jakarta.ws.rs.QueryParam("className")
        private String className;
        /**
         * PictureClassificationData.
         **/
        @jakarta.ws.rs.QueryParam("confidence")
        private BigDecimal confidence;

        /**
         * Get className
         *
         * @return className
         **/
        @JsonProperty("class_name")
        public String getClassName() {
            return className;
        }

        /**
         * Set className
         **/
        public void setClassName(String className) {
            this.className = className;
        }

        public PictureClassificationClassQueryParam className(String className) {
            this.className = className;
            return this;
        }

        /**
         * Get confidence
         *
         * @return confidence
         **/
        @JsonProperty("confidence")
        public BigDecimal getConfidence() {
            return confidence;
        }

        /**
         * Set confidence
         **/
        public void setConfidence(BigDecimal confidence) {
            this.confidence = confidence;
        }

        public PictureClassificationClassQueryParam confidence(BigDecimal confidence) {
            this.confidence = confidence;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PictureClassificationClassQueryParam {\n");

            sb.append("    className: ").append(toIndentedString(className)).append("\n");
            sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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

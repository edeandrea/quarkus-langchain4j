package io.quarkiverse.langchain4j.docling.client.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConvertDocumentResponse {

    private DocumentResponse document;
    private ConversionStatus status;
    private List<ErrorItem> errors;
    private BigDecimal processingTime;
    private Map<String, ProfilingItem> timings;

    /**
     * Get document
     *
     * @return document
     **/
    @JsonProperty("document")
    public DocumentResponse getDocument() {
        return document;
    }

    /**
     * Set document
     **/
    public void setDocument(DocumentResponse document) {
        this.document = document;
    }

    public ConvertDocumentResponse document(DocumentResponse document) {
        this.document = document;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @JsonProperty("status")
    public ConversionStatus getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(ConversionStatus status) {
        this.status = status;
    }

    public ConvertDocumentResponse status(ConversionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get errors
     *
     * @return errors
     **/
    @JsonProperty("errors")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ErrorItem> getErrors() {
        return errors;
    }

    /**
     * Set errors
     **/
    public void setErrors(List<ErrorItem> errors) {
        this.errors = errors;
    }

    public ConvertDocumentResponse errors(List<ErrorItem> errors) {
        this.errors = errors;
        return this;
    }

    public ConvertDocumentResponse addErrorsItem(ErrorItem errorsItem) {
        if (this.errors == null) {
            errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Get processingTime
     *
     * @return processingTime
     **/
    @JsonProperty("processing_time")
    public BigDecimal getProcessingTime() {
        return processingTime;
    }

    /**
     * Set processingTime
     **/
    public void setProcessingTime(BigDecimal processingTime) {
        this.processingTime = processingTime;
    }

    public ConvertDocumentResponse processingTime(BigDecimal processingTime) {
        this.processingTime = processingTime;
        return this;
    }

    /**
     * Get timings
     *
     * @return timings
     **/
    @JsonProperty("timings")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, ProfilingItem> getTimings() {
        return timings;
    }

    /**
     * Set timings
     **/
    public void setTimings(Map<String, ProfilingItem> timings) {
        this.timings = timings;
    }

    public ConvertDocumentResponse timings(Map<String, ProfilingItem> timings) {
        this.timings = timings;
        return this;
    }

    public ConvertDocumentResponse putTimingsItem(String key, ProfilingItem timingsItem) {
        if (this.timings == null) {
            timings = new HashMap<>();
        }
        this.timings.put(key, timingsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConvertDocumentResponse {\n");

        sb.append("    document: ").append(toIndentedString(document)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
        sb.append("    processingTime: ").append(toIndentedString(processingTime)).append("\n");
        sb.append("    timings: ").append(toIndentedString(timings)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ConvertDocumentResponse} object that
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

        ConvertDocumentResponse model = (ConvertDocumentResponse) obj;

        return java.util.Objects.equals(document, model.document) &&
                java.util.Objects.equals(status, model.status) &&
                java.util.Objects.equals(errors, model.errors) &&
                java.util.Objects.equals(processingTime, model.processingTime) &&
                java.util.Objects.equals(timings, model.timings);
    }

    /**
     * Returns a hash code for a {@code ConvertDocumentResponse}.
     *
     * @return a hash code value for a {@code ConvertDocumentResponse}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(document,
                status,
                errors,
                processingTime,
                timings);
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
    public static class ConvertDocumentResponseQueryParam {

        @jakarta.ws.rs.QueryParam("document")
        private DocumentResponse document;
        @jakarta.ws.rs.QueryParam("status")
        private ConversionStatus status;
        @jakarta.ws.rs.QueryParam("errors")
        private List<ErrorItem> errors = null;
        @jakarta.ws.rs.QueryParam("processingTime")
        private BigDecimal processingTime;
        @jakarta.ws.rs.QueryParam("timings")
        private Map<String, ProfilingItem> timings = null;

        /**
         * Get document
         *
         * @return document
         **/
        @JsonProperty("document")
        public DocumentResponse getDocument() {
            return document;
        }

        /**
         * Set document
         **/
        public void setDocument(DocumentResponse document) {
            this.document = document;
        }

        public ConvertDocumentResponseQueryParam document(DocumentResponse document) {
            this.document = document;
            return this;
        }

        /**
         * Get status
         *
         * @return status
         **/
        @JsonProperty("status")
        public ConversionStatus getStatus() {
            return status;
        }

        /**
         * Set status
         **/
        public void setStatus(ConversionStatus status) {
            this.status = status;
        }

        public ConvertDocumentResponseQueryParam status(ConversionStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Get errors
         *
         * @return errors
         **/
        @JsonProperty("errors")
        public List<ErrorItem> getErrors() {
            return errors;
        }

        /**
         * Set errors
         **/
        public void setErrors(List<ErrorItem> errors) {
            this.errors = errors;
        }

        public ConvertDocumentResponseQueryParam errors(List<ErrorItem> errors) {
            this.errors = errors;
            return this;
        }

        public ConvertDocumentResponseQueryParam addErrorsItem(ErrorItem errorsItem) {
            this.errors.add(errorsItem);
            return this;
        }

        /**
         * Get processingTime
         *
         * @return processingTime
         **/
        @JsonProperty("processing_time")
        public BigDecimal getProcessingTime() {
            return processingTime;
        }

        /**
         * Set processingTime
         **/
        public void setProcessingTime(BigDecimal processingTime) {
            this.processingTime = processingTime;
        }

        public ConvertDocumentResponseQueryParam processingTime(BigDecimal processingTime) {
            this.processingTime = processingTime;
            return this;
        }

        /**
         * Get timings
         *
         * @return timings
         **/
        @JsonProperty("timings")
        public Map<String, ProfilingItem> getTimings() {
            return timings;
        }

        /**
         * Set timings
         **/
        public void setTimings(Map<String, ProfilingItem> timings) {
            this.timings = timings;
        }

        public ConvertDocumentResponseQueryParam timings(Map<String, ProfilingItem> timings) {
            this.timings = timings;
            return this;
        }

        public ConvertDocumentResponseQueryParam putTimingsItem(String key, ProfilingItem timingsItem) {
            this.timings.put(key, timingsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ConvertDocumentResponseQueryParam {\n");

            sb.append("    document: ").append(toIndentedString(document)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
            sb.append("    processingTime: ").append(toIndentedString(processingTime)).append("\n");
            sb.append("    timings: ").append(toIndentedString(timings)).append("\n");
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

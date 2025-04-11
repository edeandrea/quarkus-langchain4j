package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HTTPValidationError {

    private List<ValidationError> detail;

    /**
     * Get detail
     *
     * @return detail
     **/
    @JsonProperty("detail")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<ValidationError> getDetail() {
        return detail;
    }

    /**
     * Set detail
     **/
    public void setDetail(List<ValidationError> detail) {
        this.detail = detail;
    }

    public HTTPValidationError detail(List<ValidationError> detail) {
        this.detail = detail;
        return this;
    }

    public HTTPValidationError addDetailItem(ValidationError detailItem) {
        if (this.detail == null) {
            detail = new ArrayList<>();
        }
        this.detail.add(detailItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HTTPValidationError {\n");

        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code HTTPValidationError} object that
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

        HTTPValidationError model = (HTTPValidationError) obj;

        return java.util.Objects.equals(detail, model.detail);
    }

    /**
     * Returns a hash code for a {@code HTTPValidationError}.
     *
     * @return a hash code value for a {@code HTTPValidationError}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(detail);
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
    public static class HTTPValidationErrorQueryParam {

        @jakarta.ws.rs.QueryParam("detail")
        private List<ValidationError> detail = null;

        /**
         * Get detail
         *
         * @return detail
         **/
        @JsonProperty("detail")
        public List<ValidationError> getDetail() {
            return detail;
        }

        /**
         * Set detail
         **/
        public void setDetail(List<ValidationError> detail) {
            this.detail = detail;
        }

        public HTTPValidationErrorQueryParam detail(List<ValidationError> detail) {
            this.detail = detail;
            return this;
        }

        public HTTPValidationErrorQueryParam addDetailItem(ValidationError detailItem) {
            this.detail.add(detailItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class HTTPValidationErrorQueryParam {\n");

            sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

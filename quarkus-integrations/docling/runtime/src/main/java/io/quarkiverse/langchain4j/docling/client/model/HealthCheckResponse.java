package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HealthCheckResponse {

    private String status = "ok";

    /**
     * Get status
     *
     * @return status
     **/
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStatus() {
        return status;
    }

    /**
     * Set status
     **/
    public void setStatus(String status) {
        this.status = status;
    }

    public HealthCheckResponse status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthCheckResponse {\n");

        sb.append("    status: ").append(toIndentedString(status)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code HealthCheckResponse} object that
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

        HealthCheckResponse model = (HealthCheckResponse) obj;

        return java.util.Objects.equals(status, model.status);
    }

    /**
     * Returns a hash code for a {@code HealthCheckResponse}.
     *
     * @return a hash code value for a {@code HealthCheckResponse}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(status);
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
    public static class HealthCheckResponseQueryParam {

        @jakarta.ws.rs.QueryParam("status")
        private String status = "ok";

        /**
         * Get status
         *
         * @return status
         **/
        @JsonProperty("status")
        public String getStatus() {
            return status;
        }

        /**
         * Set status
         **/
        public void setStatus(String status) {
            this.status = status;
        }

        public HealthCheckResponseQueryParam status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class HealthCheckResponseQueryParam {\n");

            sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

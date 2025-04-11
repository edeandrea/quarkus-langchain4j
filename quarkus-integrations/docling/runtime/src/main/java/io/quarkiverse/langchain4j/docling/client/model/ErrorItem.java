package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorItem {

    private DoclingComponentType componentType;
    private String moduleName;
    private String errorMessage;

    /**
     * Get componentType
     *
     * @return componentType
     **/
    @JsonProperty("component_type")
    public DoclingComponentType getComponentType() {
        return componentType;
    }

    /**
     * Set componentType
     **/
    public void setComponentType(DoclingComponentType componentType) {
        this.componentType = componentType;
    }

    public ErrorItem componentType(DoclingComponentType componentType) {
        this.componentType = componentType;
        return this;
    }

    /**
     * Get moduleName
     *
     * @return moduleName
     **/
    @JsonProperty("module_name")
    public String getModuleName() {
        return moduleName;
    }

    /**
     * Set moduleName
     **/
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public ErrorItem moduleName(String moduleName) {
        this.moduleName = moduleName;
        return this;
    }

    /**
     * Get errorMessage
     *
     * @return errorMessage
     **/
    @JsonProperty("error_message")
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Set errorMessage
     **/
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorItem errorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorItem {\n");

        sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ErrorItem} object that
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

        ErrorItem model = (ErrorItem) obj;

        return java.util.Objects.equals(componentType, model.componentType) &&
                java.util.Objects.equals(moduleName, model.moduleName) &&
                java.util.Objects.equals(errorMessage, model.errorMessage);
    }

    /**
     * Returns a hash code for a {@code ErrorItem}.
     *
     * @return a hash code value for a {@code ErrorItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(componentType,
                moduleName,
                errorMessage);
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
    public static class ErrorItemQueryParam {

        @jakarta.ws.rs.QueryParam("componentType")
        private DoclingComponentType componentType;
        @jakarta.ws.rs.QueryParam("moduleName")
        private String moduleName;
        @jakarta.ws.rs.QueryParam("errorMessage")
        private String errorMessage;

        /**
         * Get componentType
         *
         * @return componentType
         **/
        @JsonProperty("component_type")
        public DoclingComponentType getComponentType() {
            return componentType;
        }

        /**
         * Set componentType
         **/
        public void setComponentType(DoclingComponentType componentType) {
            this.componentType = componentType;
        }

        public ErrorItemQueryParam componentType(DoclingComponentType componentType) {
            this.componentType = componentType;
            return this;
        }

        /**
         * Get moduleName
         *
         * @return moduleName
         **/
        @JsonProperty("module_name")
        public String getModuleName() {
            return moduleName;
        }

        /**
         * Set moduleName
         **/
        public void setModuleName(String moduleName) {
            this.moduleName = moduleName;
        }

        public ErrorItemQueryParam moduleName(String moduleName) {
            this.moduleName = moduleName;
            return this;
        }

        /**
         * Get errorMessage
         *
         * @return errorMessage
         **/
        @JsonProperty("error_message")
        public String getErrorMessage() {
            return errorMessage;
        }

        /**
         * Set errorMessage
         **/
        public void setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
        }

        public ErrorItemQueryParam errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ErrorItemQueryParam {\n");

            sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
            sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
            sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

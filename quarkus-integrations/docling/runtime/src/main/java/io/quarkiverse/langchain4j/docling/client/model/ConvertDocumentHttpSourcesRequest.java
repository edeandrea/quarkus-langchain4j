package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConvertDocumentHttpSourcesRequest {

    private ConvertDocumentsOptions options;
    private List<HttpSource> httpSources = new ArrayList<>();

    /**
     * Get options
     *
     * @return options
     **/
    @JsonProperty("options")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ConvertDocumentsOptions getOptions() {
        return options;
    }

    /**
     * Set options
     **/
    public void setOptions(ConvertDocumentsOptions options) {
        this.options = options;
    }

    public ConvertDocumentHttpSourcesRequest options(ConvertDocumentsOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Get httpSources
     *
     * @return httpSources
     **/
    @JsonProperty("http_sources")
    public List<HttpSource> getHttpSources() {
        return httpSources;
    }

    /**
     * Set httpSources
     **/
    public void setHttpSources(List<HttpSource> httpSources) {
        this.httpSources = httpSources;
    }

    public ConvertDocumentHttpSourcesRequest httpSources(List<HttpSource> httpSources) {
        this.httpSources = httpSources;
        return this;
    }

    public ConvertDocumentHttpSourcesRequest addHttpSourcesItem(HttpSource httpSourcesItem) {
        if (this.httpSources == null) {
            httpSources = new ArrayList<>();
        }
        this.httpSources.add(httpSourcesItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConvertDocumentHttpSourcesRequest {\n");

        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    httpSources: ").append(toIndentedString(httpSources)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ConvertDocumentHttpSourcesRequest} object that
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

        ConvertDocumentHttpSourcesRequest model = (ConvertDocumentHttpSourcesRequest) obj;

        return java.util.Objects.equals(options, model.options) &&
                java.util.Objects.equals(httpSources, model.httpSources);
    }

    /**
     * Returns a hash code for a {@code ConvertDocumentHttpSourcesRequest}.
     *
     * @return a hash code value for a {@code ConvertDocumentHttpSourcesRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(options,
                httpSources);
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
    public static class ConvertDocumentHttpSourcesRequestQueryParam {

        @jakarta.ws.rs.QueryParam("options")
        private ConvertDocumentsOptions options;
        @jakarta.ws.rs.QueryParam("httpSources")
        private List<HttpSource> httpSources = new ArrayList<>();

        /**
         * Get options
         *
         * @return options
         **/
        @JsonProperty("options")
        public ConvertDocumentsOptions getOptions() {
            return options;
        }

        /**
         * Set options
         **/
        public void setOptions(ConvertDocumentsOptions options) {
            this.options = options;
        }

        public ConvertDocumentHttpSourcesRequestQueryParam options(ConvertDocumentsOptions options) {
            this.options = options;
            return this;
        }

        /**
         * Get httpSources
         *
         * @return httpSources
         **/
        @JsonProperty("http_sources")
        public List<HttpSource> getHttpSources() {
            return httpSources;
        }

        /**
         * Set httpSources
         **/
        public void setHttpSources(List<HttpSource> httpSources) {
            this.httpSources = httpSources;
        }

        public ConvertDocumentHttpSourcesRequestQueryParam httpSources(List<HttpSource> httpSources) {
            this.httpSources = httpSources;
            return this;
        }

        public ConvertDocumentHttpSourcesRequestQueryParam addHttpSourcesItem(HttpSource httpSourcesItem) {
            this.httpSources.add(httpSourcesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ConvertDocumentHttpSourcesRequestQueryParam {\n");

            sb.append("    options: ").append(toIndentedString(options)).append("\n");
            sb.append("    httpSources: ").append(toIndentedString(httpSources)).append("\n");
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

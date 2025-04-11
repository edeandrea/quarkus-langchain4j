package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConversionRequest {

    private ConvertDocumentsOptions options;
    private List<FileSource> fileSources = new ArrayList<>();
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

    public ConversionRequest options(ConvertDocumentsOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Get fileSources
     *
     * @return fileSources
     **/
    @JsonProperty("file_sources")
    public List<FileSource> getFileSources() {
        return fileSources;
    }

    /**
     * Set fileSources
     **/
    public void setFileSources(List<FileSource> fileSources) {
        this.fileSources = fileSources;
    }

    public ConversionRequest fileSources(List<FileSource> fileSources) {
        this.fileSources = fileSources;
        return this;
    }

    public ConversionRequest addFileSourcesItem(FileSource fileSourcesItem) {
        if (this.fileSources == null) {
            fileSources = new ArrayList<>();
        }
        this.fileSources.add(fileSourcesItem);
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

    public ConversionRequest httpSources(List<HttpSource> httpSources) {
        this.httpSources = httpSources;
        return this;
    }

    public ConversionRequest addHttpSourcesItem(HttpSource httpSourcesItem) {
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
        sb.append("class ConversionRequest {\n");

        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    fileSources: ").append(toIndentedString(fileSources)).append("\n");
        sb.append("    httpSources: ").append(toIndentedString(httpSources)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ConversionRequest} object that
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

        ConversionRequest model = (ConversionRequest) obj;

        return java.util.Objects.equals(options, model.options) &&
                java.util.Objects.equals(fileSources, model.fileSources) &&
                java.util.Objects.equals(httpSources, model.httpSources);
    }

    /**
     * Returns a hash code for a {@code ConversionRequest}.
     *
     * @return a hash code value for a {@code ConversionRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(options,
                fileSources,
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
    public static class ConversionRequestQueryParam {

        @jakarta.ws.rs.QueryParam("options")
        private ConvertDocumentsOptions options;
        @jakarta.ws.rs.QueryParam("fileSources")
        private List<FileSource> fileSources = new ArrayList<>();
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

        public ConversionRequestQueryParam options(ConvertDocumentsOptions options) {
            this.options = options;
            return this;
        }

        /**
         * Get fileSources
         *
         * @return fileSources
         **/
        @JsonProperty("file_sources")
        public List<FileSource> getFileSources() {
            return fileSources;
        }

        /**
         * Set fileSources
         **/
        public void setFileSources(List<FileSource> fileSources) {
            this.fileSources = fileSources;
        }

        public ConversionRequestQueryParam fileSources(List<FileSource> fileSources) {
            this.fileSources = fileSources;
            return this;
        }

        public ConversionRequestQueryParam addFileSourcesItem(FileSource fileSourcesItem) {
            this.fileSources.add(fileSourcesItem);
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

        public ConversionRequestQueryParam httpSources(List<HttpSource> httpSources) {
            this.httpSources = httpSources;
            return this;
        }

        public ConversionRequestQueryParam addHttpSourcesItem(HttpSource httpSourcesItem) {
            this.httpSources.add(httpSourcesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ConversionRequestQueryParam {\n");

            sb.append("    options: ").append(toIndentedString(options)).append("\n");
            sb.append("    fileSources: ").append(toIndentedString(fileSources)).append("\n");
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

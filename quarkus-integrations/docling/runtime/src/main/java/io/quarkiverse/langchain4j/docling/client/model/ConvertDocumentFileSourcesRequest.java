package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConvertDocumentFileSourcesRequest {

    private ConvertDocumentsOptions options;
    private List<FileSource> fileSources = new ArrayList<>();

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

    public ConvertDocumentFileSourcesRequest options(ConvertDocumentsOptions options) {
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

    public ConvertDocumentFileSourcesRequest fileSources(List<FileSource> fileSources) {
        this.fileSources = fileSources;
        return this;
    }

    public ConvertDocumentFileSourcesRequest addFileSourcesItem(FileSource fileSourcesItem) {
        if (this.fileSources == null) {
            fileSources = new ArrayList<>();
        }
        this.fileSources.add(fileSourcesItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConvertDocumentFileSourcesRequest {\n");

        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    fileSources: ").append(toIndentedString(fileSources)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ConvertDocumentFileSourcesRequest} object that
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

        ConvertDocumentFileSourcesRequest model = (ConvertDocumentFileSourcesRequest) obj;

        return java.util.Objects.equals(options, model.options) &&
                java.util.Objects.equals(fileSources, model.fileSources);
    }

    /**
     * Returns a hash code for a {@code ConvertDocumentFileSourcesRequest}.
     *
     * @return a hash code value for a {@code ConvertDocumentFileSourcesRequest}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(options,
                fileSources);
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
    public static class ConvertDocumentFileSourcesRequestQueryParam {

        @jakarta.ws.rs.QueryParam("options")
        private ConvertDocumentsOptions options;
        @jakarta.ws.rs.QueryParam("fileSources")
        private List<FileSource> fileSources = new ArrayList<>();

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

        public ConvertDocumentFileSourcesRequestQueryParam options(ConvertDocumentsOptions options) {
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

        public ConvertDocumentFileSourcesRequestQueryParam fileSources(List<FileSource> fileSources) {
            this.fileSources = fileSources;
            return this;
        }

        public ConvertDocumentFileSourcesRequestQueryParam addFileSourcesItem(FileSource fileSourcesItem) {
            this.fileSources.add(fileSourcesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ConvertDocumentFileSourcesRequestQueryParam {\n");

            sb.append("    options: ").append(toIndentedString(options)).append("\n");
            sb.append("    fileSources: ").append(toIndentedString(fileSources)).append("\n");
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

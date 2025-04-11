package io.quarkiverse.langchain4j.docling.client.model;

import java.net.URI;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * FileSource.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentOrigin {

    private String mimetype;
    private Integer binaryHash;
    private String filename;
    private URI uri;

    /**
     * Get mimetype
     *
     * @return mimetype
     **/
    @JsonProperty("mimetype")
    public String getMimetype() {
        return mimetype;
    }

    /**
     * Set mimetype
     **/
    public void setMimetype(String mimetype) {
        this.mimetype = mimetype;
    }

    public DocumentOrigin mimetype(String mimetype) {
        this.mimetype = mimetype;
        return this;
    }

    /**
     * Get binaryHash
     * minimum: 0
     * maximum: 384
     *
     * @return binaryHash
     **/
    @JsonProperty("binary_hash")
    public Integer getBinaryHash() {
        return binaryHash;
    }

    /**
     * Set binaryHash
     **/
    public void setBinaryHash(Integer binaryHash) {
        this.binaryHash = binaryHash;
    }

    public DocumentOrigin binaryHash(Integer binaryHash) {
        this.binaryHash = binaryHash;
        return this;
    }

    /**
     * Get filename
     *
     * @return filename
     **/
    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    /**
     * Set filename
     **/
    public void setFilename(String filename) {
        this.filename = filename;
    }

    public DocumentOrigin filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * Get uri
     *
     * @return uri
     **/
    @JsonProperty("uri")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public URI getUri() {
        return uri;
    }

    /**
     * Set uri
     **/
    public void setUri(URI uri) {
        this.uri = uri;
    }

    public DocumentOrigin uri(URI uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentOrigin {\n");

        sb.append("    mimetype: ").append(toIndentedString(mimetype)).append("\n");
        sb.append("    binaryHash: ").append(toIndentedString(binaryHash)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code DocumentOrigin} object that
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

        DocumentOrigin model = (DocumentOrigin) obj;

        return java.util.Objects.equals(mimetype, model.mimetype) &&
                java.util.Objects.equals(binaryHash, model.binaryHash) &&
                java.util.Objects.equals(filename, model.filename) &&
                java.util.Objects.equals(uri, model.uri);
    }

    /**
     * Returns a hash code for a {@code DocumentOrigin}.
     *
     * @return a hash code value for a {@code DocumentOrigin}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(mimetype,
                binaryHash,
                filename,
                uri);
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
     * FileSource.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DocumentOriginQueryParam {

        /**
         * FileSource.
         **/
        @jakarta.ws.rs.QueryParam("mimetype")
        private String mimetype;
        /**
         * FileSource.
         **/
        @jakarta.ws.rs.QueryParam("binaryHash")
        private Integer binaryHash;
        /**
         * FileSource.
         **/
        @jakarta.ws.rs.QueryParam("filename")
        private String filename;
        /**
         * FileSource.
         **/
        @jakarta.ws.rs.QueryParam("uri")
        private URI uri;

        /**
         * Get mimetype
         *
         * @return mimetype
         **/
        @JsonProperty("mimetype")
        public String getMimetype() {
            return mimetype;
        }

        /**
         * Set mimetype
         **/
        public void setMimetype(String mimetype) {
            this.mimetype = mimetype;
        }

        public DocumentOriginQueryParam mimetype(String mimetype) {
            this.mimetype = mimetype;
            return this;
        }

        /**
         * Get binaryHash
         * minimum: 0
         * maximum: 384
         *
         * @return binaryHash
         **/
        @JsonProperty("binary_hash")
        public Integer getBinaryHash() {
            return binaryHash;
        }

        /**
         * Set binaryHash
         **/
        public void setBinaryHash(Integer binaryHash) {
            this.binaryHash = binaryHash;
        }

        public DocumentOriginQueryParam binaryHash(Integer binaryHash) {
            this.binaryHash = binaryHash;
            return this;
        }

        /**
         * Get filename
         *
         * @return filename
         **/
        @JsonProperty("filename")
        public String getFilename() {
            return filename;
        }

        /**
         * Set filename
         **/
        public void setFilename(String filename) {
            this.filename = filename;
        }

        public DocumentOriginQueryParam filename(String filename) {
            this.filename = filename;
            return this;
        }

        /**
         * Get uri
         *
         * @return uri
         **/
        @JsonProperty("uri")
        public URI getUri() {
            return uri;
        }

        /**
         * Set uri
         **/
        public void setUri(URI uri) {
            this.uri = uri;
        }

        public DocumentOriginQueryParam uri(URI uri) {
            this.uri = uri;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DocumentOriginQueryParam {\n");

            sb.append("    mimetype: ").append(toIndentedString(mimetype)).append("\n");
            sb.append("    binaryHash: ").append(toIndentedString(binaryHash)).append("\n");
            sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
            sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FileSource {

    /**
     * Content of the file serialized in base64. For example it can be obtained via `base64 -w 0
     * /path/to/file/pdf-to-convert.pdf`.
     **/
    private String base64String;
    /**
     * Filename of the uploaded document
     **/
    private String filename;

    /**
     * Content of the file serialized in base64. For example it can be obtained via `base64 -w 0
     * /path/to/file/pdf-to-convert.pdf`.
     *
     * @return base64String
     **/
    @JsonProperty("base64_string")
    public String getBase64String() {
        return base64String;
    }

    /**
     * Set base64String
     **/
    public void setBase64String(String base64String) {
        this.base64String = base64String;
    }

    public FileSource base64String(String base64String) {
        this.base64String = base64String;
        return this;
    }

    /**
     * Filename of the uploaded document
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

    public FileSource filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileSource {\n");

        sb.append("    base64String: ").append(toIndentedString(base64String)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code FileSource} object that
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

        FileSource model = (FileSource) obj;

        return java.util.Objects.equals(base64String, model.base64String) &&
                java.util.Objects.equals(filename, model.filename);
    }

    /**
     * Returns a hash code for a {@code FileSource}.
     *
     * @return a hash code value for a {@code FileSource}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(base64String,
                filename);
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
    public static class FileSourceQueryParam {

        @jakarta.ws.rs.QueryParam("base64String")
        private String base64String;
        @jakarta.ws.rs.QueryParam("filename")
        private String filename;

        /**
         * Content of the file serialized in base64. For example it can be obtained via `base64 -w 0
         * /path/to/file/pdf-to-convert.pdf`.
         *
         * @return base64String
         **/
        @JsonProperty("base64_string")
        public String getBase64String() {
            return base64String;
        }

        /**
         * Set base64String
         **/
        public void setBase64String(String base64String) {
            this.base64String = base64String;
        }

        public FileSourceQueryParam base64String(String base64String) {
            this.base64String = base64String;
            return this;
        }

        /**
         * Filename of the uploaded document
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

        public FileSourceQueryParam filename(String filename) {
            this.filename = filename;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class FileSourceQueryParam {\n");

            sb.append("    base64String: ").append(toIndentedString(base64String)).append("\n");
            sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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

package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ImageRef.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageRef {

    private String mimetype;
    private Integer dpi;
    private Size size;
    private Uri uri;

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

    public ImageRef mimetype(String mimetype) {
        this.mimetype = mimetype;
        return this;
    }

    /**
     * Get dpi
     *
     * @return dpi
     **/
    @JsonProperty("dpi")
    public Integer getDpi() {
        return dpi;
    }

    /**
     * Set dpi
     **/
    public void setDpi(Integer dpi) {
        this.dpi = dpi;
    }

    public ImageRef dpi(Integer dpi) {
        this.dpi = dpi;
        return this;
    }

    /**
     * Get size
     *
     * @return size
     **/
    @JsonProperty("size")
    public Size getSize() {
        return size;
    }

    /**
     * Set size
     **/
    public void setSize(Size size) {
        this.size = size;
    }

    public ImageRef size(Size size) {
        this.size = size;
        return this;
    }

    /**
     * Get uri
     *
     * @return uri
     **/
    @JsonProperty("uri")
    public Uri getUri() {
        return uri;
    }

    /**
     * Set uri
     **/
    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public ImageRef uri(Uri uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageRef {\n");

        sb.append("    mimetype: ").append(toIndentedString(mimetype)).append("\n");
        sb.append("    dpi: ").append(toIndentedString(dpi)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ImageRef} object that
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

        ImageRef model = (ImageRef) obj;

        return java.util.Objects.equals(mimetype, model.mimetype) &&
                java.util.Objects.equals(dpi, model.dpi) &&
                java.util.Objects.equals(size, model.size) &&
                java.util.Objects.equals(uri, model.uri);
    }

    /**
     * Returns a hash code for a {@code ImageRef}.
     *
     * @return a hash code value for a {@code ImageRef}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(mimetype,
                dpi,
                size,
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
     * ImageRef.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ImageRefQueryParam {

        /**
         * ImageRef.
         **/
        @jakarta.ws.rs.QueryParam("mimetype")
        private String mimetype;
        /**
         * ImageRef.
         **/
        @jakarta.ws.rs.QueryParam("dpi")
        private Integer dpi;
        /**
         * ImageRef.
         **/
        @jakarta.ws.rs.QueryParam("size")
        private Size size;
        /**
         * ImageRef.
         **/
        @jakarta.ws.rs.QueryParam("uri")
        private Uri uri;

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

        public ImageRefQueryParam mimetype(String mimetype) {
            this.mimetype = mimetype;
            return this;
        }

        /**
         * Get dpi
         *
         * @return dpi
         **/
        @JsonProperty("dpi")
        public Integer getDpi() {
            return dpi;
        }

        /**
         * Set dpi
         **/
        public void setDpi(Integer dpi) {
            this.dpi = dpi;
        }

        public ImageRefQueryParam dpi(Integer dpi) {
            this.dpi = dpi;
            return this;
        }

        /**
         * Get size
         *
         * @return size
         **/
        @JsonProperty("size")
        public Size getSize() {
            return size;
        }

        /**
         * Set size
         **/
        public void setSize(Size size) {
            this.size = size;
        }

        public ImageRefQueryParam size(Size size) {
            this.size = size;
            return this;
        }

        /**
         * Get uri
         *
         * @return uri
         **/
        @JsonProperty("uri")
        public Uri getUri() {
            return uri;
        }

        /**
         * Set uri
         **/
        public void setUri(Uri uri) {
            this.uri = uri;
        }

        public ImageRefQueryParam uri(Uri uri) {
            this.uri = uri;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ImageRefQueryParam {\n");

            sb.append("    mimetype: ").append(toIndentedString(mimetype)).append("\n");
            sb.append("    dpi: ").append(toIndentedString(dpi)).append("\n");
            sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

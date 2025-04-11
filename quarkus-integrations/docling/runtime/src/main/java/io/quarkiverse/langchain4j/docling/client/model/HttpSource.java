package io.quarkiverse.langchain4j.docling.client.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HttpSource {

    /**
     * HTTP url to process
     **/
    private String url;
    /**
     * Additional headers used to fetch the urls, e.g. authorization, agent, etc
     **/
    private Map<String, String> headers = new HashMap<>();

    /**
     * HTTP url to process
     *
     * @return url
     **/
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Set url
     **/
    public void setUrl(String url) {
        this.url = url;
    }

    public HttpSource url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Additional headers used to fetch the urls, e.g. authorization, agent, etc
     *
     * @return headers
     **/
    @JsonProperty("headers")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getHeaders() {
        return headers;
    }

    /**
     * Set headers
     **/
    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public HttpSource headers(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HttpSource {\n");

        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    headers: ").append(toIndentedString(headers)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code HttpSource} object that
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

        HttpSource model = (HttpSource) obj;

        return java.util.Objects.equals(url, model.url) &&
                java.util.Objects.equals(headers, model.headers);
    }

    /**
     * Returns a hash code for a {@code HttpSource}.
     *
     * @return a hash code value for a {@code HttpSource}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(url,
                headers);
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
    public static class HttpSourceQueryParam {

        @jakarta.ws.rs.QueryParam("url")
        private String url;
        @jakarta.ws.rs.QueryParam("headers")
        private Map<String, String> headers = new HashMap<>();

        /**
         * HTTP url to process
         *
         * @return url
         **/
        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        /**
         * Set url
         **/
        public void setUrl(String url) {
            this.url = url;
        }

        public HttpSourceQueryParam url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Additional headers used to fetch the urls, e.g. authorization, agent, etc
         *
         * @return headers
         **/
        @JsonProperty("headers")
        public Map<String, String> getHeaders() {
            return headers;
        }

        /**
         * Set headers
         **/
        public void setHeaders(Map<String, String> headers) {
            this.headers.clear();

            if (headers != null) {
                this.headers.putAll(headers);
            }
        }

        public HttpSourceQueryParam headers(Map<String, String> headers) {
            setHeaders(headers);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class HttpSourceQueryParam {\n");

            sb.append("    url: ").append(toIndentedString(url)).append("\n");
            sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
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

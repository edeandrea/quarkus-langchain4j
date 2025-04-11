package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentResponse {

    private String filename;
    private String mdContent;
    private DoclingDocument jsonContent;
    private String htmlContent;
    private String textContent;
    private String doctagsContent;

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

    public DocumentResponse filename(String filename) {
        this.filename = filename;
        return this;
    }

    /**
     * Get mdContent
     *
     * @return mdContent
     **/
    @JsonProperty("md_content")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMdContent() {
        return mdContent;
    }

    /**
     * Set mdContent
     **/
    public void setMdContent(String mdContent) {
        this.mdContent = mdContent;
    }

    public DocumentResponse mdContent(String mdContent) {
        this.mdContent = mdContent;
        return this;
    }

    /**
     * Get jsonContent
     *
     * @return jsonContent
     **/
    @JsonProperty("json_content")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DoclingDocument getJsonContent() {
        return jsonContent;
    }

    /**
     * Set jsonContent
     **/
    public void setJsonContent(DoclingDocument jsonContent) {
        this.jsonContent = jsonContent;
    }

    public DocumentResponse jsonContent(DoclingDocument jsonContent) {
        this.jsonContent = jsonContent;
        return this;
    }

    /**
     * Get htmlContent
     *
     * @return htmlContent
     **/
    @JsonProperty("html_content")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getHtmlContent() {
        return htmlContent;
    }

    /**
     * Set htmlContent
     **/
    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public DocumentResponse htmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
        return this;
    }

    /**
     * Get textContent
     *
     * @return textContent
     **/
    @JsonProperty("text_content")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTextContent() {
        return textContent;
    }

    /**
     * Set textContent
     **/
    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public DocumentResponse textContent(String textContent) {
        this.textContent = textContent;
        return this;
    }

    /**
     * Get doctagsContent
     *
     * @return doctagsContent
     **/
    @JsonProperty("doctags_content")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDoctagsContent() {
        return doctagsContent;
    }

    /**
     * Set doctagsContent
     **/
    public void setDoctagsContent(String doctagsContent) {
        this.doctagsContent = doctagsContent;
    }

    public DocumentResponse doctagsContent(String doctagsContent) {
        this.doctagsContent = doctagsContent;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentResponse {\n");

        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    mdContent: ").append(toIndentedString(mdContent)).append("\n");
        sb.append("    jsonContent: ").append(toIndentedString(jsonContent)).append("\n");
        sb.append("    htmlContent: ").append(toIndentedString(htmlContent)).append("\n");
        sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
        sb.append("    doctagsContent: ").append(toIndentedString(doctagsContent)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code DocumentResponse} object that
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

        DocumentResponse model = (DocumentResponse) obj;

        return java.util.Objects.equals(filename, model.filename) &&
                java.util.Objects.equals(mdContent, model.mdContent) &&
                java.util.Objects.equals(jsonContent, model.jsonContent) &&
                java.util.Objects.equals(htmlContent, model.htmlContent) &&
                java.util.Objects.equals(textContent, model.textContent) &&
                java.util.Objects.equals(doctagsContent, model.doctagsContent);
    }

    /**
     * Returns a hash code for a {@code DocumentResponse}.
     *
     * @return a hash code value for a {@code DocumentResponse}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(filename,
                mdContent,
                jsonContent,
                htmlContent,
                textContent,
                doctagsContent);
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
    public static class DocumentResponseQueryParam {

        @jakarta.ws.rs.QueryParam("filename")
        private String filename;
        @jakarta.ws.rs.QueryParam("mdContent")
        private String mdContent;
        @jakarta.ws.rs.QueryParam("jsonContent")
        private DoclingDocument jsonContent;
        @jakarta.ws.rs.QueryParam("htmlContent")
        private String htmlContent;
        @jakarta.ws.rs.QueryParam("textContent")
        private String textContent;
        @jakarta.ws.rs.QueryParam("doctagsContent")
        private String doctagsContent;

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

        public DocumentResponseQueryParam filename(String filename) {
            this.filename = filename;
            return this;
        }

        /**
         * Get mdContent
         *
         * @return mdContent
         **/
        @JsonProperty("md_content")
        public String getMdContent() {
            return mdContent;
        }

        /**
         * Set mdContent
         **/
        public void setMdContent(String mdContent) {
            this.mdContent = mdContent;
        }

        public DocumentResponseQueryParam mdContent(String mdContent) {
            this.mdContent = mdContent;
            return this;
        }

        /**
         * Get jsonContent
         *
         * @return jsonContent
         **/
        @JsonProperty("json_content")
        public DoclingDocument getJsonContent() {
            return jsonContent;
        }

        /**
         * Set jsonContent
         **/
        public void setJsonContent(DoclingDocument jsonContent) {
            this.jsonContent = jsonContent;
        }

        public DocumentResponseQueryParam jsonContent(DoclingDocument jsonContent) {
            this.jsonContent = jsonContent;
            return this;
        }

        /**
         * Get htmlContent
         *
         * @return htmlContent
         **/
        @JsonProperty("html_content")
        public String getHtmlContent() {
            return htmlContent;
        }

        /**
         * Set htmlContent
         **/
        public void setHtmlContent(String htmlContent) {
            this.htmlContent = htmlContent;
        }

        public DocumentResponseQueryParam htmlContent(String htmlContent) {
            this.htmlContent = htmlContent;
            return this;
        }

        /**
         * Get textContent
         *
         * @return textContent
         **/
        @JsonProperty("text_content")
        public String getTextContent() {
            return textContent;
        }

        /**
         * Set textContent
         **/
        public void setTextContent(String textContent) {
            this.textContent = textContent;
        }

        public DocumentResponseQueryParam textContent(String textContent) {
            this.textContent = textContent;
            return this;
        }

        /**
         * Get doctagsContent
         *
         * @return doctagsContent
         **/
        @JsonProperty("doctags_content")
        public String getDoctagsContent() {
            return doctagsContent;
        }

        /**
         * Set doctagsContent
         **/
        public void setDoctagsContent(String doctagsContent) {
            this.doctagsContent = doctagsContent;
        }

        public DocumentResponseQueryParam doctagsContent(String doctagsContent) {
            this.doctagsContent = doctagsContent;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DocumentResponseQueryParam {\n");

            sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
            sb.append("    mdContent: ").append(toIndentedString(mdContent)).append("\n");
            sb.append("    jsonContent: ").append(toIndentedString(jsonContent)).append("\n");
            sb.append("    htmlContent: ").append(toIndentedString(htmlContent)).append("\n");
            sb.append("    textContent: ").append(toIndentedString(textContent)).append("\n");
            sb.append("    doctagsContent: ").append(toIndentedString(doctagsContent)).append("\n");
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

package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Formatting.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class Formatting {

    private Boolean bold = false;
    private Boolean italic = false;
    private Boolean underline = false;
    private Boolean strikethrough = false;

    /**
     * Get bold
     *
     * @return bold
     **/
    @JsonProperty("bold")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getBold() {
        return bold;
    }

    /**
     * Set bold
     **/
    public void setBold(Boolean bold) {
        this.bold = bold;
    }

    public Formatting bold(Boolean bold) {
        this.bold = bold;
        return this;
    }

    /**
     * Get italic
     *
     * @return italic
     **/
    @JsonProperty("italic")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getItalic() {
        return italic;
    }

    /**
     * Set italic
     **/
    public void setItalic(Boolean italic) {
        this.italic = italic;
    }

    public Formatting italic(Boolean italic) {
        this.italic = italic;
        return this;
    }

    /**
     * Get underline
     *
     * @return underline
     **/
    @JsonProperty("underline")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getUnderline() {
        return underline;
    }

    /**
     * Set underline
     **/
    public void setUnderline(Boolean underline) {
        this.underline = underline;
    }

    public Formatting underline(Boolean underline) {
        this.underline = underline;
        return this;
    }

    /**
     * Get strikethrough
     *
     * @return strikethrough
     **/
    @JsonProperty("strikethrough")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getStrikethrough() {
        return strikethrough;
    }

    /**
     * Set strikethrough
     **/
    public void setStrikethrough(Boolean strikethrough) {
        this.strikethrough = strikethrough;
    }

    public Formatting strikethrough(Boolean strikethrough) {
        this.strikethrough = strikethrough;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Formatting {\n");

        sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
        sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
        sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
        sb.append("    strikethrough: ").append(toIndentedString(strikethrough)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code Formatting} object that
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

        Formatting model = (Formatting) obj;

        return java.util.Objects.equals(bold, model.bold) &&
                java.util.Objects.equals(italic, model.italic) &&
                java.util.Objects.equals(underline, model.underline) &&
                java.util.Objects.equals(strikethrough, model.strikethrough);
    }

    /**
     * Returns a hash code for a {@code Formatting}.
     *
     * @return a hash code value for a {@code Formatting}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(bold,
                italic,
                underline,
                strikethrough);
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
     * Formatting.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class FormattingQueryParam {

        /**
         * Formatting.
         **/
        @jakarta.ws.rs.QueryParam("bold")
        private Boolean bold = false;
        /**
         * Formatting.
         **/
        @jakarta.ws.rs.QueryParam("italic")
        private Boolean italic = false;
        /**
         * Formatting.
         **/
        @jakarta.ws.rs.QueryParam("underline")
        private Boolean underline = false;
        /**
         * Formatting.
         **/
        @jakarta.ws.rs.QueryParam("strikethrough")
        private Boolean strikethrough = false;

        /**
         * Get bold
         *
         * @return bold
         **/
        @JsonProperty("bold")
        public Boolean getBold() {
            return bold;
        }

        /**
         * Set bold
         **/
        public void setBold(Boolean bold) {
            this.bold = bold;
        }

        public FormattingQueryParam bold(Boolean bold) {
            this.bold = bold;
            return this;
        }

        /**
         * Get italic
         *
         * @return italic
         **/
        @JsonProperty("italic")
        public Boolean getItalic() {
            return italic;
        }

        /**
         * Set italic
         **/
        public void setItalic(Boolean italic) {
            this.italic = italic;
        }

        public FormattingQueryParam italic(Boolean italic) {
            this.italic = italic;
            return this;
        }

        /**
         * Get underline
         *
         * @return underline
         **/
        @JsonProperty("underline")
        public Boolean getUnderline() {
            return underline;
        }

        /**
         * Set underline
         **/
        public void setUnderline(Boolean underline) {
            this.underline = underline;
        }

        public FormattingQueryParam underline(Boolean underline) {
            this.underline = underline;
            return this;
        }

        /**
         * Get strikethrough
         *
         * @return strikethrough
         **/
        @JsonProperty("strikethrough")
        public Boolean getStrikethrough() {
            return strikethrough;
        }

        /**
         * Set strikethrough
         **/
        public void setStrikethrough(Boolean strikethrough) {
            this.strikethrough = strikethrough;
        }

        public FormattingQueryParam strikethrough(Boolean strikethrough) {
            this.strikethrough = strikethrough;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class FormattingQueryParam {\n");

            sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
            sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
            sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
            sb.append("    strikethrough: ").append(toIndentedString(strikethrough)).append("\n");
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

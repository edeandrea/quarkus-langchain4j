package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PictureMiscData.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class PictureMiscData {

    public enum KindEnum {
        MISC(String.valueOf("misc"));

        // caching enum access
        private static final java.util.EnumSet<KindEnum> values = java.util.EnumSet.allOf(KindEnum.class);

        String value;

        KindEnum(String v) {
            value = v;
        }

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static KindEnum fromString(String v) {
            for (KindEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }

    private KindEnum kind = KindEnum.MISC;
    private Object content;

    /**
     * Get kind
     *
     * @return kind
     **/
    @JsonProperty("kind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public KindEnum getKind() {
        return kind;
    }

    /**
     * Set kind
     **/
    public void setKind(KindEnum kind) {
        this.kind = kind;
    }

    public PictureMiscData kind(KindEnum kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get content
     *
     * @return content
     **/
    @JsonProperty("content")
    public Object getContent() {
        return content;
    }

    /**
     * Set content
     **/
    public void setContent(Object content) {
        this.content = content;
    }

    public PictureMiscData content(Object content) {
        this.content = content;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PictureMiscData {\n");

        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PictureMiscData} object that
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

        PictureMiscData model = (PictureMiscData) obj;

        return java.util.Objects.equals(kind, model.kind) &&
                java.util.Objects.equals(content, model.content);
    }

    /**
     * Returns a hash code for a {@code PictureMiscData}.
     *
     * @return a hash code value for a {@code PictureMiscData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(kind,
                content);
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
     * PictureMiscData.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PictureMiscDataQueryParam {

        public enum KindEnum {
            MISC(String.valueOf("misc"));

            // caching enum access
            private static final java.util.EnumSet<KindEnum> values = java.util.EnumSet.allOf(KindEnum.class);

            String value;

            KindEnum(String v) {
                value = v;
            }

            @JsonValue
            public String value() {
                return value;
            }

            @Override
            public String toString() {
                return String.valueOf(value);
            }

            @JsonCreator
            public static KindEnum fromString(String v) {
                for (KindEnum b : values) {
                    if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                        return b;
                    }
                }
                throw new IllegalArgumentException("Unexpected value '" + v + "'");
            }
        }

        /**
         * PictureMiscData.
         **/
        private KindEnum kind = KindEnum.MISC;
        /**
         * PictureMiscData.
         **/
        @jakarta.ws.rs.QueryParam("content")
        private Object content;

        /**
         * Get kind
         *
         * @return kind
         **/
        @JsonProperty("kind")
        public KindEnum getKind() {
            return kind;
        }

        /**
         * Set kind
         **/
        public void setKind(KindEnum kind) {
            this.kind = kind;
        }

        public PictureMiscDataQueryParam kind(KindEnum kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Get content
         *
         * @return content
         **/
        @JsonProperty("content")
        public Object getContent() {
            return content;
        }

        /**
         * Set content
         **/
        public void setContent(Object content) {
            this.content = content;
        }

        public PictureMiscDataQueryParam content(Object content) {
            this.content = content;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PictureMiscDataQueryParam {\n");

            sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
            sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

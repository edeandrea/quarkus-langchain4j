package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PictureDescriptionData.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class PictureDescriptionData {

    public enum KindEnum {
        DESCRIPTION(String.valueOf("description"));

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

    private KindEnum kind = KindEnum.DESCRIPTION;
    private String text;
    private String provenance;

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

    public PictureDescriptionData kind(KindEnum kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get text
     *
     * @return text
     **/
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Set text
     **/
    public void setText(String text) {
        this.text = text;
    }

    public PictureDescriptionData text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get provenance
     *
     * @return provenance
     **/
    @JsonProperty("provenance")
    public String getProvenance() {
        return provenance;
    }

    /**
     * Set provenance
     **/
    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    public PictureDescriptionData provenance(String provenance) {
        this.provenance = provenance;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PictureDescriptionData {\n");

        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    provenance: ").append(toIndentedString(provenance)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PictureDescriptionData} object that
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

        PictureDescriptionData model = (PictureDescriptionData) obj;

        return java.util.Objects.equals(kind, model.kind) &&
                java.util.Objects.equals(text, model.text) &&
                java.util.Objects.equals(provenance, model.provenance);
    }

    /**
     * Returns a hash code for a {@code PictureDescriptionData}.
     *
     * @return a hash code value for a {@code PictureDescriptionData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(kind,
                text,
                provenance);
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
     * PictureDescriptionData.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PictureDescriptionDataQueryParam {

        public enum KindEnum {
            DESCRIPTION(String.valueOf("description"));

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
         * PictureDescriptionData.
         **/
        private KindEnum kind = KindEnum.DESCRIPTION;
        /**
         * PictureDescriptionData.
         **/
        @jakarta.ws.rs.QueryParam("text")
        private String text;
        /**
         * PictureDescriptionData.
         **/
        @jakarta.ws.rs.QueryParam("provenance")
        private String provenance;

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

        public PictureDescriptionDataQueryParam kind(KindEnum kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Get text
         *
         * @return text
         **/
        @JsonProperty("text")
        public String getText() {
            return text;
        }

        /**
         * Set text
         **/
        public void setText(String text) {
            this.text = text;
        }

        public PictureDescriptionDataQueryParam text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Get provenance
         *
         * @return provenance
         **/
        @JsonProperty("provenance")
        public String getProvenance() {
            return provenance;
        }

        /**
         * Set provenance
         **/
        public void setProvenance(String provenance) {
            this.provenance = provenance;
        }

        public PictureDescriptionDataQueryParam provenance(String provenance) {
            this.provenance = provenance;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PictureDescriptionDataQueryParam {\n");

            sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
            sb.append("    text: ").append(toIndentedString(text)).append("\n");
            sb.append("    provenance: ").append(toIndentedString(provenance)).append("\n");
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

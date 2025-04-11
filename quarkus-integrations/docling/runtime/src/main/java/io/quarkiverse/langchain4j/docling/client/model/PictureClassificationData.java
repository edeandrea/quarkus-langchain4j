package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PictureClassificationData.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class PictureClassificationData {

    public enum KindEnum {
        CLASSIFICATION(String.valueOf("classification"));

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

    private KindEnum kind = KindEnum.CLASSIFICATION;
    private String provenance;
    private List<PictureClassificationClass> predictedClasses = new ArrayList<>();

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

    public PictureClassificationData kind(KindEnum kind) {
        this.kind = kind;
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

    public PictureClassificationData provenance(String provenance) {
        this.provenance = provenance;
        return this;
    }

    /**
     * Get predictedClasses
     *
     * @return predictedClasses
     **/
    @JsonProperty("predicted_classes")
    public List<PictureClassificationClass> getPredictedClasses() {
        return predictedClasses;
    }

    /**
     * Set predictedClasses
     **/
    public void setPredictedClasses(List<PictureClassificationClass> predictedClasses) {
        this.predictedClasses = predictedClasses;
    }

    public PictureClassificationData predictedClasses(List<PictureClassificationClass> predictedClasses) {
        this.predictedClasses = predictedClasses;
        return this;
    }

    public PictureClassificationData addPredictedClassesItem(PictureClassificationClass predictedClassesItem) {
        if (this.predictedClasses == null) {
            predictedClasses = new ArrayList<>();
        }
        this.predictedClasses.add(predictedClassesItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PictureClassificationData {\n");

        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    provenance: ").append(toIndentedString(provenance)).append("\n");
        sb.append("    predictedClasses: ").append(toIndentedString(predictedClasses)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PictureClassificationData} object that
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

        PictureClassificationData model = (PictureClassificationData) obj;

        return java.util.Objects.equals(kind, model.kind) &&
                java.util.Objects.equals(provenance, model.provenance) &&
                java.util.Objects.equals(predictedClasses, model.predictedClasses);
    }

    /**
     * Returns a hash code for a {@code PictureClassificationData}.
     *
     * @return a hash code value for a {@code PictureClassificationData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(kind,
                provenance,
                predictedClasses);
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
     * PictureClassificationData.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PictureClassificationDataQueryParam {

        public enum KindEnum {
            CLASSIFICATION(String.valueOf("classification"));

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
         * PictureClassificationData.
         **/
        private KindEnum kind = KindEnum.CLASSIFICATION;
        /**
         * PictureClassificationData.
         **/
        @jakarta.ws.rs.QueryParam("provenance")
        private String provenance;
        /**
         * PictureClassificationData.
         **/
        @jakarta.ws.rs.QueryParam("predictedClasses")
        private List<PictureClassificationClass> predictedClasses = new ArrayList<>();

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

        public PictureClassificationDataQueryParam kind(KindEnum kind) {
            this.kind = kind;
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

        public PictureClassificationDataQueryParam provenance(String provenance) {
            this.provenance = provenance;
            return this;
        }

        /**
         * Get predictedClasses
         *
         * @return predictedClasses
         **/
        @JsonProperty("predicted_classes")
        public List<PictureClassificationClass> getPredictedClasses() {
            return predictedClasses;
        }

        /**
         * Set predictedClasses
         **/
        public void setPredictedClasses(List<PictureClassificationClass> predictedClasses) {
            this.predictedClasses = predictedClasses;
        }

        public PictureClassificationDataQueryParam predictedClasses(List<PictureClassificationClass> predictedClasses) {
            this.predictedClasses = predictedClasses;
            return this;
        }

        public PictureClassificationDataQueryParam addPredictedClassesItem(PictureClassificationClass predictedClassesItem) {
            this.predictedClasses.add(predictedClassesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PictureClassificationDataQueryParam {\n");

            sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
            sb.append("    provenance: ").append(toIndentedString(provenance)).append("\n");
            sb.append("    predictedClasses: ").append(toIndentedString(predictedClasses)).append("\n");
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

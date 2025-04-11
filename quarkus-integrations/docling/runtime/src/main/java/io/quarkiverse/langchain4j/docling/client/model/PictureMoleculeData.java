package io.quarkiverse.langchain4j.docling.client.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PictureMoleculeData.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class PictureMoleculeData {

    public enum KindEnum {
        MOLECULE_DATA(String.valueOf("molecule_data"));

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

    private KindEnum kind = KindEnum.MOLECULE_DATA;
    private String smi;
    private BigDecimal confidence;
    private String className;
    private List<List<Object>> segmentation = new ArrayList<>();
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

    public PictureMoleculeData kind(KindEnum kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get smi
     *
     * @return smi
     **/
    @JsonProperty("smi")
    public String getSmi() {
        return smi;
    }

    /**
     * Set smi
     **/
    public void setSmi(String smi) {
        this.smi = smi;
    }

    public PictureMoleculeData smi(String smi) {
        this.smi = smi;
        return this;
    }

    /**
     * Get confidence
     *
     * @return confidence
     **/
    @JsonProperty("confidence")
    public BigDecimal getConfidence() {
        return confidence;
    }

    /**
     * Set confidence
     **/
    public void setConfidence(BigDecimal confidence) {
        this.confidence = confidence;
    }

    public PictureMoleculeData confidence(BigDecimal confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Get className
     *
     * @return className
     **/
    @JsonProperty("class_name")
    public String getClassName() {
        return className;
    }

    /**
     * Set className
     **/
    public void setClassName(String className) {
        this.className = className;
    }

    public PictureMoleculeData className(String className) {
        this.className = className;
        return this;
    }

    /**
     * Get segmentation
     *
     * @return segmentation
     **/
    @JsonProperty("segmentation")
    public List<List<Object>> getSegmentation() {
        return segmentation;
    }

    /**
     * Set segmentation
     **/
    public void setSegmentation(List<List<Object>> segmentation) {
        this.segmentation = segmentation;
    }

    public PictureMoleculeData segmentation(List<List<Object>> segmentation) {
        this.segmentation = segmentation;
        return this;
    }

    public PictureMoleculeData addSegmentationItem(List<Object> segmentationItem) {
        if (this.segmentation == null) {
            segmentation = new ArrayList<>();
        }
        this.segmentation.add(segmentationItem);
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

    public PictureMoleculeData provenance(String provenance) {
        this.provenance = provenance;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PictureMoleculeData {\n");

        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    smi: ").append(toIndentedString(smi)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    segmentation: ").append(toIndentedString(segmentation)).append("\n");
        sb.append("    provenance: ").append(toIndentedString(provenance)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PictureMoleculeData} object that
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

        PictureMoleculeData model = (PictureMoleculeData) obj;

        return java.util.Objects.equals(kind, model.kind) &&
                java.util.Objects.equals(smi, model.smi) &&
                java.util.Objects.equals(confidence, model.confidence) &&
                java.util.Objects.equals(className, model.className) &&
                java.util.Objects.equals(segmentation, model.segmentation) &&
                java.util.Objects.equals(provenance, model.provenance);
    }

    /**
     * Returns a hash code for a {@code PictureMoleculeData}.
     *
     * @return a hash code value for a {@code PictureMoleculeData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(kind,
                smi,
                confidence,
                className,
                segmentation,
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
     * PictureMoleculeData.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PictureMoleculeDataQueryParam {

        public enum KindEnum {
            MOLECULE_DATA(String.valueOf("molecule_data"));

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
         * PictureMoleculeData.
         **/
        private KindEnum kind = KindEnum.MOLECULE_DATA;
        /**
         * PictureMoleculeData.
         **/
        @jakarta.ws.rs.QueryParam("smi")
        private String smi;
        /**
         * PictureMoleculeData.
         **/
        @jakarta.ws.rs.QueryParam("confidence")
        private BigDecimal confidence;
        /**
         * PictureMoleculeData.
         **/
        @jakarta.ws.rs.QueryParam("className")
        private String className;
        /**
         * PictureMoleculeData.
         **/
        @jakarta.ws.rs.QueryParam("segmentation")
        private List<List<Object>> segmentation = new ArrayList<>();
        /**
         * PictureMoleculeData.
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

        public PictureMoleculeDataQueryParam kind(KindEnum kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Get smi
         *
         * @return smi
         **/
        @JsonProperty("smi")
        public String getSmi() {
            return smi;
        }

        /**
         * Set smi
         **/
        public void setSmi(String smi) {
            this.smi = smi;
        }

        public PictureMoleculeDataQueryParam smi(String smi) {
            this.smi = smi;
            return this;
        }

        /**
         * Get confidence
         *
         * @return confidence
         **/
        @JsonProperty("confidence")
        public BigDecimal getConfidence() {
            return confidence;
        }

        /**
         * Set confidence
         **/
        public void setConfidence(BigDecimal confidence) {
            this.confidence = confidence;
        }

        public PictureMoleculeDataQueryParam confidence(BigDecimal confidence) {
            this.confidence = confidence;
            return this;
        }

        /**
         * Get className
         *
         * @return className
         **/
        @JsonProperty("class_name")
        public String getClassName() {
            return className;
        }

        /**
         * Set className
         **/
        public void setClassName(String className) {
            this.className = className;
        }

        public PictureMoleculeDataQueryParam className(String className) {
            this.className = className;
            return this;
        }

        /**
         * Get segmentation
         *
         * @return segmentation
         **/
        @JsonProperty("segmentation")
        public List<List<Object>> getSegmentation() {
            return segmentation;
        }

        /**
         * Set segmentation
         **/
        public void setSegmentation(List<List<Object>> segmentation) {
            this.segmentation = segmentation;
        }

        public PictureMoleculeDataQueryParam segmentation(List<List<Object>> segmentation) {
            this.segmentation = segmentation;
            return this;
        }

        public PictureMoleculeDataQueryParam addSegmentationItem(List<Object> segmentationItem) {
            this.segmentation.add(segmentationItem);
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

        public PictureMoleculeDataQueryParam provenance(String provenance) {
            this.provenance = provenance;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PictureMoleculeDataQueryParam {\n");

            sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
            sb.append("    smi: ").append(toIndentedString(smi)).append("\n");
            sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
            sb.append("    className: ").append(toIndentedString(className)).append("\n");
            sb.append("    segmentation: ").append(toIndentedString(segmentation)).append("\n");
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

package io.quarkiverse.langchain4j.docling.client.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PictureItemAnnotationsInner {

    public enum KindEnum {
        SCATTER_CHART_DATA(String.valueOf("scatter_chart_data"));

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

    private KindEnum kind = KindEnum.SCATTER_CHART_DATA;
    private String provenance;
    private List<PictureClassificationClass> predictedClasses = new ArrayList<>();
    private String text;
    private String smi;
    private BigDecimal confidence;
    private String className;
    private List<List<Object>> segmentation = new ArrayList<>();
    private Object content;
    private String title;
    private String xAxisLabel;
    private String yAxisLabel;
    private List<ChartLine> lines = new ArrayList<>();
    private List<ChartBar> bars = new ArrayList<>();
    private List<ChartStackedBar> stackedBars = new ArrayList<>();
    private List<ChartSlice> slices = new ArrayList<>();
    private List<ChartPoint> points = new ArrayList<>();

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

    public PictureItemAnnotationsInner kind(KindEnum kind) {
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

    public PictureItemAnnotationsInner provenance(String provenance) {
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

    public PictureItemAnnotationsInner predictedClasses(List<PictureClassificationClass> predictedClasses) {
        this.predictedClasses = predictedClasses;
        return this;
    }

    public PictureItemAnnotationsInner addPredictedClassesItem(PictureClassificationClass predictedClassesItem) {
        if (this.predictedClasses == null) {
            predictedClasses = new ArrayList<>();
        }
        this.predictedClasses.add(predictedClassesItem);
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

    public PictureItemAnnotationsInner text(String text) {
        this.text = text;
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

    public PictureItemAnnotationsInner smi(String smi) {
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

    public PictureItemAnnotationsInner confidence(BigDecimal confidence) {
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

    public PictureItemAnnotationsInner className(String className) {
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

    public PictureItemAnnotationsInner segmentation(List<List<Object>> segmentation) {
        this.segmentation = segmentation;
        return this;
    }

    public PictureItemAnnotationsInner addSegmentationItem(List<Object> segmentationItem) {
        if (this.segmentation == null) {
            segmentation = new ArrayList<>();
        }
        this.segmentation.add(segmentationItem);
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

    public PictureItemAnnotationsInner content(Object content) {
        this.content = content;
        return this;
    }

    /**
     * Get title
     *
     * @return title
     **/
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Set title
     **/
    public void setTitle(String title) {
        this.title = title;
    }

    public PictureItemAnnotationsInner title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get xAxisLabel
     *
     * @return xAxisLabel
     **/
    @JsonProperty("x_axis_label")
    public String getxAxisLabel() {
        return xAxisLabel;
    }

    /**
     * Set xAxisLabel
     **/
    public void setxAxisLabel(String xAxisLabel) {
        this.xAxisLabel = xAxisLabel;
    }

    public PictureItemAnnotationsInner xAxisLabel(String xAxisLabel) {
        this.xAxisLabel = xAxisLabel;
        return this;
    }

    /**
     * Get yAxisLabel
     *
     * @return yAxisLabel
     **/
    @JsonProperty("y_axis_label")
    public String getyAxisLabel() {
        return yAxisLabel;
    }

    /**
     * Set yAxisLabel
     **/
    public void setyAxisLabel(String yAxisLabel) {
        this.yAxisLabel = yAxisLabel;
    }

    public PictureItemAnnotationsInner yAxisLabel(String yAxisLabel) {
        this.yAxisLabel = yAxisLabel;
        return this;
    }

    /**
     * Get lines
     *
     * @return lines
     **/
    @JsonProperty("lines")
    public List<ChartLine> getLines() {
        return lines;
    }

    /**
     * Set lines
     **/
    public void setLines(List<ChartLine> lines) {
        this.lines = lines;
    }

    public PictureItemAnnotationsInner lines(List<ChartLine> lines) {
        this.lines = lines;
        return this;
    }

    public PictureItemAnnotationsInner addLinesItem(ChartLine linesItem) {
        if (this.lines == null) {
            lines = new ArrayList<>();
        }
        this.lines.add(linesItem);
        return this;
    }

    /**
     * Get bars
     *
     * @return bars
     **/
    @JsonProperty("bars")
    public List<ChartBar> getBars() {
        return bars;
    }

    /**
     * Set bars
     **/
    public void setBars(List<ChartBar> bars) {
        this.bars = bars;
    }

    public PictureItemAnnotationsInner bars(List<ChartBar> bars) {
        this.bars = bars;
        return this;
    }

    public PictureItemAnnotationsInner addBarsItem(ChartBar barsItem) {
        if (this.bars == null) {
            bars = new ArrayList<>();
        }
        this.bars.add(barsItem);
        return this;
    }

    /**
     * Get stackedBars
     *
     * @return stackedBars
     **/
    @JsonProperty("stacked_bars")
    public List<ChartStackedBar> getStackedBars() {
        return stackedBars;
    }

    /**
     * Set stackedBars
     **/
    public void setStackedBars(List<ChartStackedBar> stackedBars) {
        this.stackedBars = stackedBars;
    }

    public PictureItemAnnotationsInner stackedBars(List<ChartStackedBar> stackedBars) {
        this.stackedBars = stackedBars;
        return this;
    }

    public PictureItemAnnotationsInner addStackedBarsItem(ChartStackedBar stackedBarsItem) {
        if (this.stackedBars == null) {
            stackedBars = new ArrayList<>();
        }
        this.stackedBars.add(stackedBarsItem);
        return this;
    }

    /**
     * Get slices
     *
     * @return slices
     **/
    @JsonProperty("slices")
    public List<ChartSlice> getSlices() {
        return slices;
    }

    /**
     * Set slices
     **/
    public void setSlices(List<ChartSlice> slices) {
        this.slices = slices;
    }

    public PictureItemAnnotationsInner slices(List<ChartSlice> slices) {
        this.slices = slices;
        return this;
    }

    public PictureItemAnnotationsInner addSlicesItem(ChartSlice slicesItem) {
        if (this.slices == null) {
            slices = new ArrayList<>();
        }
        this.slices.add(slicesItem);
        return this;
    }

    /**
     * Get points
     *
     * @return points
     **/
    @JsonProperty("points")
    public List<ChartPoint> getPoints() {
        return points;
    }

    /**
     * Set points
     **/
    public void setPoints(List<ChartPoint> points) {
        this.points = points;
    }

    public PictureItemAnnotationsInner points(List<ChartPoint> points) {
        this.points = points;
        return this;
    }

    public PictureItemAnnotationsInner addPointsItem(ChartPoint pointsItem) {
        if (this.points == null) {
            points = new ArrayList<>();
        }
        this.points.add(pointsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PictureItemAnnotationsInner {\n");

        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    provenance: ").append(toIndentedString(provenance)).append("\n");
        sb.append("    predictedClasses: ").append(toIndentedString(predictedClasses)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    smi: ").append(toIndentedString(smi)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    className: ").append(toIndentedString(className)).append("\n");
        sb.append("    segmentation: ").append(toIndentedString(segmentation)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    xAxisLabel: ").append(toIndentedString(xAxisLabel)).append("\n");
        sb.append("    yAxisLabel: ").append(toIndentedString(yAxisLabel)).append("\n");
        sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
        sb.append("    bars: ").append(toIndentedString(bars)).append("\n");
        sb.append("    stackedBars: ").append(toIndentedString(stackedBars)).append("\n");
        sb.append("    slices: ").append(toIndentedString(slices)).append("\n");
        sb.append("    points: ").append(toIndentedString(points)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PictureItemAnnotationsInner} object that
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

        PictureItemAnnotationsInner model = (PictureItemAnnotationsInner) obj;

        return java.util.Objects.equals(kind, model.kind) &&
                java.util.Objects.equals(provenance, model.provenance) &&
                java.util.Objects.equals(predictedClasses, model.predictedClasses) &&
                java.util.Objects.equals(text, model.text) &&
                java.util.Objects.equals(smi, model.smi) &&
                java.util.Objects.equals(confidence, model.confidence) &&
                java.util.Objects.equals(className, model.className) &&
                java.util.Objects.equals(segmentation, model.segmentation) &&
                java.util.Objects.equals(content, model.content) &&
                java.util.Objects.equals(title, model.title) &&
                java.util.Objects.equals(xAxisLabel, model.xAxisLabel) &&
                java.util.Objects.equals(yAxisLabel, model.yAxisLabel) &&
                java.util.Objects.equals(lines, model.lines) &&
                java.util.Objects.equals(bars, model.bars) &&
                java.util.Objects.equals(stackedBars, model.stackedBars) &&
                java.util.Objects.equals(slices, model.slices) &&
                java.util.Objects.equals(points, model.points);
    }

    /**
     * Returns a hash code for a {@code PictureItemAnnotationsInner}.
     *
     * @return a hash code value for a {@code PictureItemAnnotationsInner}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(kind,
                provenance,
                predictedClasses,
                text,
                smi,
                confidence,
                className,
                segmentation,
                content,
                title,
                xAxisLabel,
                yAxisLabel,
                lines,
                bars,
                stackedBars,
                slices,
                points);
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
    public static class PictureItemAnnotationsInnerQueryParam {

        public enum KindEnum {
            SCATTER_CHART_DATA(String.valueOf("scatter_chart_data"));

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

        private KindEnum kind = KindEnum.SCATTER_CHART_DATA;
        @jakarta.ws.rs.QueryParam("provenance")
        private String provenance;
        @jakarta.ws.rs.QueryParam("predictedClasses")
        private List<PictureClassificationClass> predictedClasses = new ArrayList<>();
        @jakarta.ws.rs.QueryParam("text")
        private String text;
        @jakarta.ws.rs.QueryParam("smi")
        private String smi;
        @jakarta.ws.rs.QueryParam("confidence")
        private BigDecimal confidence;
        @jakarta.ws.rs.QueryParam("className")
        private String className;
        @jakarta.ws.rs.QueryParam("segmentation")
        private List<List<Object>> segmentation = new ArrayList<>();
        @jakarta.ws.rs.QueryParam("content")
        private Object content;
        @jakarta.ws.rs.QueryParam("title")
        private String title;
        @jakarta.ws.rs.QueryParam("xAxisLabel")
        private String xAxisLabel;
        @jakarta.ws.rs.QueryParam("yAxisLabel")
        private String yAxisLabel;
        @jakarta.ws.rs.QueryParam("lines")
        private List<ChartLine> lines = new ArrayList<>();
        @jakarta.ws.rs.QueryParam("bars")
        private List<ChartBar> bars = new ArrayList<>();
        @jakarta.ws.rs.QueryParam("stackedBars")
        private List<ChartStackedBar> stackedBars = new ArrayList<>();
        @jakarta.ws.rs.QueryParam("slices")
        private List<ChartSlice> slices = new ArrayList<>();
        @jakarta.ws.rs.QueryParam("points")
        private List<ChartPoint> points = new ArrayList<>();

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

        public PictureItemAnnotationsInnerQueryParam kind(KindEnum kind) {
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

        public PictureItemAnnotationsInnerQueryParam provenance(String provenance) {
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

        public PictureItemAnnotationsInnerQueryParam predictedClasses(List<PictureClassificationClass> predictedClasses) {
            this.predictedClasses = predictedClasses;
            return this;
        }

        public PictureItemAnnotationsInnerQueryParam addPredictedClassesItem(PictureClassificationClass predictedClassesItem) {
            this.predictedClasses.add(predictedClassesItem);
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

        public PictureItemAnnotationsInnerQueryParam text(String text) {
            this.text = text;
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

        public PictureItemAnnotationsInnerQueryParam smi(String smi) {
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

        public PictureItemAnnotationsInnerQueryParam confidence(BigDecimal confidence) {
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

        public PictureItemAnnotationsInnerQueryParam className(String className) {
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

        public PictureItemAnnotationsInnerQueryParam segmentation(List<List<Object>> segmentation) {
            this.segmentation = segmentation;
            return this;
        }

        public PictureItemAnnotationsInnerQueryParam addSegmentationItem(List<Object> segmentationItem) {
            this.segmentation.add(segmentationItem);
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

        public PictureItemAnnotationsInnerQueryParam content(Object content) {
            this.content = content;
            return this;
        }

        /**
         * Get title
         *
         * @return title
         **/
        @JsonProperty("title")
        public String getTitle() {
            return title;
        }

        /**
         * Set title
         **/
        public void setTitle(String title) {
            this.title = title;
        }

        public PictureItemAnnotationsInnerQueryParam title(String title) {
            this.title = title;
            return this;
        }

        /**
         * Get xAxisLabel
         *
         * @return xAxisLabel
         **/
        @JsonProperty("x_axis_label")
        public String getxAxisLabel() {
            return xAxisLabel;
        }

        /**
         * Set xAxisLabel
         **/
        public void setxAxisLabel(String xAxisLabel) {
            this.xAxisLabel = xAxisLabel;
        }

        public PictureItemAnnotationsInnerQueryParam xAxisLabel(String xAxisLabel) {
            this.xAxisLabel = xAxisLabel;
            return this;
        }

        /**
         * Get yAxisLabel
         *
         * @return yAxisLabel
         **/
        @JsonProperty("y_axis_label")
        public String getyAxisLabel() {
            return yAxisLabel;
        }

        /**
         * Set yAxisLabel
         **/
        public void setyAxisLabel(String yAxisLabel) {
            this.yAxisLabel = yAxisLabel;
        }

        public PictureItemAnnotationsInnerQueryParam yAxisLabel(String yAxisLabel) {
            this.yAxisLabel = yAxisLabel;
            return this;
        }

        /**
         * Get lines
         *
         * @return lines
         **/
        @JsonProperty("lines")
        public List<ChartLine> getLines() {
            return lines;
        }

        /**
         * Set lines
         **/
        public void setLines(List<ChartLine> lines) {
            this.lines = lines;
        }

        public PictureItemAnnotationsInnerQueryParam lines(List<ChartLine> lines) {
            this.lines = lines;
            return this;
        }

        public PictureItemAnnotationsInnerQueryParam addLinesItem(ChartLine linesItem) {
            this.lines.add(linesItem);
            return this;
        }

        /**
         * Get bars
         *
         * @return bars
         **/
        @JsonProperty("bars")
        public List<ChartBar> getBars() {
            return bars;
        }

        /**
         * Set bars
         **/
        public void setBars(List<ChartBar> bars) {
            this.bars = bars;
        }

        public PictureItemAnnotationsInnerQueryParam bars(List<ChartBar> bars) {
            this.bars = bars;
            return this;
        }

        public PictureItemAnnotationsInnerQueryParam addBarsItem(ChartBar barsItem) {
            this.bars.add(barsItem);
            return this;
        }

        /**
         * Get stackedBars
         *
         * @return stackedBars
         **/
        @JsonProperty("stacked_bars")
        public List<ChartStackedBar> getStackedBars() {
            return stackedBars;
        }

        /**
         * Set stackedBars
         **/
        public void setStackedBars(List<ChartStackedBar> stackedBars) {
            this.stackedBars = stackedBars;
        }

        public PictureItemAnnotationsInnerQueryParam stackedBars(List<ChartStackedBar> stackedBars) {
            this.stackedBars = stackedBars;
            return this;
        }

        public PictureItemAnnotationsInnerQueryParam addStackedBarsItem(ChartStackedBar stackedBarsItem) {
            this.stackedBars.add(stackedBarsItem);
            return this;
        }

        /**
         * Get slices
         *
         * @return slices
         **/
        @JsonProperty("slices")
        public List<ChartSlice> getSlices() {
            return slices;
        }

        /**
         * Set slices
         **/
        public void setSlices(List<ChartSlice> slices) {
            this.slices = slices;
        }

        public PictureItemAnnotationsInnerQueryParam slices(List<ChartSlice> slices) {
            this.slices = slices;
            return this;
        }

        public PictureItemAnnotationsInnerQueryParam addSlicesItem(ChartSlice slicesItem) {
            this.slices.add(slicesItem);
            return this;
        }

        /**
         * Get points
         *
         * @return points
         **/
        @JsonProperty("points")
        public List<ChartPoint> getPoints() {
            return points;
        }

        /**
         * Set points
         **/
        public void setPoints(List<ChartPoint> points) {
            this.points = points;
        }

        public PictureItemAnnotationsInnerQueryParam points(List<ChartPoint> points) {
            this.points = points;
            return this;
        }

        public PictureItemAnnotationsInnerQueryParam addPointsItem(ChartPoint pointsItem) {
            this.points.add(pointsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PictureItemAnnotationsInnerQueryParam {\n");

            sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
            sb.append("    provenance: ").append(toIndentedString(provenance)).append("\n");
            sb.append("    predictedClasses: ").append(toIndentedString(predictedClasses)).append("\n");
            sb.append("    text: ").append(toIndentedString(text)).append("\n");
            sb.append("    smi: ").append(toIndentedString(smi)).append("\n");
            sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
            sb.append("    className: ").append(toIndentedString(className)).append("\n");
            sb.append("    segmentation: ").append(toIndentedString(segmentation)).append("\n");
            sb.append("    content: ").append(toIndentedString(content)).append("\n");
            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    xAxisLabel: ").append(toIndentedString(xAxisLabel)).append("\n");
            sb.append("    yAxisLabel: ").append(toIndentedString(yAxisLabel)).append("\n");
            sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
            sb.append("    bars: ").append(toIndentedString(bars)).append("\n");
            sb.append("    stackedBars: ").append(toIndentedString(stackedBars)).append("\n");
            sb.append("    slices: ").append(toIndentedString(slices)).append("\n");
            sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

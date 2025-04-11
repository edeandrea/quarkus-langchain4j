package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents data of a line chart. Attributes: kind (Literal[\"line_chart_data\"]): The type of the chart. x_axis_label (str):
 * The label for the x-axis. y_axis_label (str): The label for the y-axis. lines (List[ChartLine]): A list of lines in the
 * chart.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class PictureLineChartData {

    private String title;

    public enum KindEnum {
        LINE_CHART_DATA(String.valueOf("line_chart_data"));

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

    private KindEnum kind = KindEnum.LINE_CHART_DATA;
    private String xAxisLabel;
    private String yAxisLabel;
    private List<ChartLine> lines = new ArrayList<>();

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

    public PictureLineChartData title(String title) {
        this.title = title;
        return this;
    }

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

    public PictureLineChartData kind(KindEnum kind) {
        this.kind = kind;
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

    public PictureLineChartData xAxisLabel(String xAxisLabel) {
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

    public PictureLineChartData yAxisLabel(String yAxisLabel) {
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

    public PictureLineChartData lines(List<ChartLine> lines) {
        this.lines = lines;
        return this;
    }

    public PictureLineChartData addLinesItem(ChartLine linesItem) {
        if (this.lines == null) {
            lines = new ArrayList<>();
        }
        this.lines.add(linesItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PictureLineChartData {\n");

        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    xAxisLabel: ").append(toIndentedString(xAxisLabel)).append("\n");
        sb.append("    yAxisLabel: ").append(toIndentedString(yAxisLabel)).append("\n");
        sb.append("    lines: ").append(toIndentedString(lines)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PictureLineChartData} object that
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

        PictureLineChartData model = (PictureLineChartData) obj;

        return java.util.Objects.equals(title, model.title) &&
                java.util.Objects.equals(kind, model.kind) &&
                java.util.Objects.equals(xAxisLabel, model.xAxisLabel) &&
                java.util.Objects.equals(yAxisLabel, model.yAxisLabel) &&
                java.util.Objects.equals(lines, model.lines);
    }

    /**
     * Returns a hash code for a {@code PictureLineChartData}.
     *
     * @return a hash code value for a {@code PictureLineChartData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title,
                kind,
                xAxisLabel,
                yAxisLabel,
                lines);
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
     * Represents data of a line chart. Attributes: kind (Literal[\"line_chart_data\"]): The type of the chart. x_axis_label
     * (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. lines (List[ChartLine]): A list of lines
     * in the chart.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PictureLineChartDataQueryParam {

        /**
         * Represents data of a line chart. Attributes: kind (Literal[\"line_chart_data\"]): The type of the chart. x_axis_label
         * (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. lines (List[ChartLine]): A list of
         * lines in the chart.
         **/
        @jakarta.ws.rs.QueryParam("title")
        private String title;

        public enum KindEnum {
            LINE_CHART_DATA(String.valueOf("line_chart_data"));

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
         * Represents data of a line chart. Attributes: kind (Literal[\"line_chart_data\"]): The type of the chart. x_axis_label
         * (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. lines (List[ChartLine]): A list of
         * lines in the chart.
         **/
        private KindEnum kind = KindEnum.LINE_CHART_DATA;
        /**
         * Represents data of a line chart. Attributes: kind (Literal[\"line_chart_data\"]): The type of the chart. x_axis_label
         * (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. lines (List[ChartLine]): A list of
         * lines in the chart.
         **/
        @jakarta.ws.rs.QueryParam("xAxisLabel")
        private String xAxisLabel;
        /**
         * Represents data of a line chart. Attributes: kind (Literal[\"line_chart_data\"]): The type of the chart. x_axis_label
         * (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. lines (List[ChartLine]): A list of
         * lines in the chart.
         **/
        @jakarta.ws.rs.QueryParam("yAxisLabel")
        private String yAxisLabel;
        /**
         * Represents data of a line chart. Attributes: kind (Literal[\"line_chart_data\"]): The type of the chart. x_axis_label
         * (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. lines (List[ChartLine]): A list of
         * lines in the chart.
         **/
        @jakarta.ws.rs.QueryParam("lines")
        private List<ChartLine> lines = new ArrayList<>();

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

        public PictureLineChartDataQueryParam title(String title) {
            this.title = title;
            return this;
        }

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

        public PictureLineChartDataQueryParam kind(KindEnum kind) {
            this.kind = kind;
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

        public PictureLineChartDataQueryParam xAxisLabel(String xAxisLabel) {
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

        public PictureLineChartDataQueryParam yAxisLabel(String yAxisLabel) {
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

        public PictureLineChartDataQueryParam lines(List<ChartLine> lines) {
            this.lines = lines;
            return this;
        }

        public PictureLineChartDataQueryParam addLinesItem(ChartLine linesItem) {
            this.lines.add(linesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PictureLineChartDataQueryParam {\n");

            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
            sb.append("    xAxisLabel: ").append(toIndentedString(xAxisLabel)).append("\n");
            sb.append("    yAxisLabel: ").append(toIndentedString(yAxisLabel)).append("\n");
            sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
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

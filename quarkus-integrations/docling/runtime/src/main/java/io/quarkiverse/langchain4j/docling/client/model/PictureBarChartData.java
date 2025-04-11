package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents data of a bar chart. Attributes: kind (Literal[\"bar_chart_data\"]): The type of the chart. x_axis_label (str):
 * The label for the x-axis. y_axis_label (str): The label for the y-axis. bars (List[ChartBar]): A list of bars in the chart.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class PictureBarChartData {

    private String title;

    public enum KindEnum {
        BAR_CHART_DATA(String.valueOf("bar_chart_data"));

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

    private KindEnum kind = KindEnum.BAR_CHART_DATA;
    private String xAxisLabel;
    private String yAxisLabel;
    private List<ChartBar> bars = new ArrayList<>();

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

    public PictureBarChartData title(String title) {
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

    public PictureBarChartData kind(KindEnum kind) {
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

    public PictureBarChartData xAxisLabel(String xAxisLabel) {
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

    public PictureBarChartData yAxisLabel(String yAxisLabel) {
        this.yAxisLabel = yAxisLabel;
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

    public PictureBarChartData bars(List<ChartBar> bars) {
        this.bars = bars;
        return this;
    }

    public PictureBarChartData addBarsItem(ChartBar barsItem) {
        if (this.bars == null) {
            bars = new ArrayList<>();
        }
        this.bars.add(barsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PictureBarChartData {\n");

        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    xAxisLabel: ").append(toIndentedString(xAxisLabel)).append("\n");
        sb.append("    yAxisLabel: ").append(toIndentedString(yAxisLabel)).append("\n");
        sb.append("    bars: ").append(toIndentedString(bars)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PictureBarChartData} object that
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

        PictureBarChartData model = (PictureBarChartData) obj;

        return java.util.Objects.equals(title, model.title) &&
                java.util.Objects.equals(kind, model.kind) &&
                java.util.Objects.equals(xAxisLabel, model.xAxisLabel) &&
                java.util.Objects.equals(yAxisLabel, model.yAxisLabel) &&
                java.util.Objects.equals(bars, model.bars);
    }

    /**
     * Returns a hash code for a {@code PictureBarChartData}.
     *
     * @return a hash code value for a {@code PictureBarChartData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title,
                kind,
                xAxisLabel,
                yAxisLabel,
                bars);
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
     * Represents data of a bar chart. Attributes: kind (Literal[\"bar_chart_data\"]): The type of the chart. x_axis_label
     * (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. bars (List[ChartBar]): A list of bars in
     * the chart.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PictureBarChartDataQueryParam {

        /**
         * Represents data of a bar chart. Attributes: kind (Literal[\"bar_chart_data\"]): The type of the chart. x_axis_label
         * (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. bars (List[ChartBar]): A list of bars
         * in the chart.
         **/
        @jakarta.ws.rs.QueryParam("title")
        private String title;

        public enum KindEnum {
            BAR_CHART_DATA(String.valueOf("bar_chart_data"));

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
         * Represents data of a bar chart. Attributes: kind (Literal[\"bar_chart_data\"]): The type of the chart. x_axis_label
         * (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. bars (List[ChartBar]): A list of bars
         * in the chart.
         **/
        private KindEnum kind = KindEnum.BAR_CHART_DATA;
        /**
         * Represents data of a bar chart. Attributes: kind (Literal[\"bar_chart_data\"]): The type of the chart. x_axis_label
         * (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. bars (List[ChartBar]): A list of bars
         * in the chart.
         **/
        @jakarta.ws.rs.QueryParam("xAxisLabel")
        private String xAxisLabel;
        /**
         * Represents data of a bar chart. Attributes: kind (Literal[\"bar_chart_data\"]): The type of the chart. x_axis_label
         * (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. bars (List[ChartBar]): A list of bars
         * in the chart.
         **/
        @jakarta.ws.rs.QueryParam("yAxisLabel")
        private String yAxisLabel;
        /**
         * Represents data of a bar chart. Attributes: kind (Literal[\"bar_chart_data\"]): The type of the chart. x_axis_label
         * (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. bars (List[ChartBar]): A list of bars
         * in the chart.
         **/
        @jakarta.ws.rs.QueryParam("bars")
        private List<ChartBar> bars = new ArrayList<>();

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

        public PictureBarChartDataQueryParam title(String title) {
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

        public PictureBarChartDataQueryParam kind(KindEnum kind) {
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

        public PictureBarChartDataQueryParam xAxisLabel(String xAxisLabel) {
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

        public PictureBarChartDataQueryParam yAxisLabel(String yAxisLabel) {
            this.yAxisLabel = yAxisLabel;
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

        public PictureBarChartDataQueryParam bars(List<ChartBar> bars) {
            this.bars = bars;
            return this;
        }

        public PictureBarChartDataQueryParam addBarsItem(ChartBar barsItem) {
            this.bars.add(barsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PictureBarChartDataQueryParam {\n");

            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
            sb.append("    xAxisLabel: ").append(toIndentedString(xAxisLabel)).append("\n");
            sb.append("    yAxisLabel: ").append(toIndentedString(yAxisLabel)).append("\n");
            sb.append("    bars: ").append(toIndentedString(bars)).append("\n");
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

package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents data of a scatter chart. Attributes: kind (Literal[\"scatter_chart_data\"]): The type of the chart. x_axis_label
 * (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. points (List[ChartPoint]): A list of points in
 * the scatter chart.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class PictureScatterChartData {

    private String title;

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
    private String xAxisLabel;
    private String yAxisLabel;
    private List<ChartPoint> points = new ArrayList<>();

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

    public PictureScatterChartData title(String title) {
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

    public PictureScatterChartData kind(KindEnum kind) {
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

    public PictureScatterChartData xAxisLabel(String xAxisLabel) {
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

    public PictureScatterChartData yAxisLabel(String yAxisLabel) {
        this.yAxisLabel = yAxisLabel;
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

    public PictureScatterChartData points(List<ChartPoint> points) {
        this.points = points;
        return this;
    }

    public PictureScatterChartData addPointsItem(ChartPoint pointsItem) {
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
        sb.append("class PictureScatterChartData {\n");

        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    xAxisLabel: ").append(toIndentedString(xAxisLabel)).append("\n");
        sb.append("    yAxisLabel: ").append(toIndentedString(yAxisLabel)).append("\n");
        sb.append("    points: ").append(toIndentedString(points)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PictureScatterChartData} object that
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

        PictureScatterChartData model = (PictureScatterChartData) obj;

        return java.util.Objects.equals(title, model.title) &&
                java.util.Objects.equals(kind, model.kind) &&
                java.util.Objects.equals(xAxisLabel, model.xAxisLabel) &&
                java.util.Objects.equals(yAxisLabel, model.yAxisLabel) &&
                java.util.Objects.equals(points, model.points);
    }

    /**
     * Returns a hash code for a {@code PictureScatterChartData}.
     *
     * @return a hash code value for a {@code PictureScatterChartData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title,
                kind,
                xAxisLabel,
                yAxisLabel,
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

    /**
     * Represents data of a scatter chart. Attributes: kind (Literal[\"scatter_chart_data\"]): The type of the chart.
     * x_axis_label (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. points (List[ChartPoint]): A
     * list of points in the scatter chart.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PictureScatterChartDataQueryParam {

        /**
         * Represents data of a scatter chart. Attributes: kind (Literal[\"scatter_chart_data\"]): The type of the chart.
         * x_axis_label (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. points
         * (List[ChartPoint]): A list of points in the scatter chart.
         **/
        @jakarta.ws.rs.QueryParam("title")
        private String title;

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

        /**
         * Represents data of a scatter chart. Attributes: kind (Literal[\"scatter_chart_data\"]): The type of the chart.
         * x_axis_label (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. points
         * (List[ChartPoint]): A list of points in the scatter chart.
         **/
        private KindEnum kind = KindEnum.SCATTER_CHART_DATA;
        /**
         * Represents data of a scatter chart. Attributes: kind (Literal[\"scatter_chart_data\"]): The type of the chart.
         * x_axis_label (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. points
         * (List[ChartPoint]): A list of points in the scatter chart.
         **/
        @jakarta.ws.rs.QueryParam("xAxisLabel")
        private String xAxisLabel;
        /**
         * Represents data of a scatter chart. Attributes: kind (Literal[\"scatter_chart_data\"]): The type of the chart.
         * x_axis_label (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. points
         * (List[ChartPoint]): A list of points in the scatter chart.
         **/
        @jakarta.ws.rs.QueryParam("yAxisLabel")
        private String yAxisLabel;
        /**
         * Represents data of a scatter chart. Attributes: kind (Literal[\"scatter_chart_data\"]): The type of the chart.
         * x_axis_label (str): The label for the x-axis. y_axis_label (str): The label for the y-axis. points
         * (List[ChartPoint]): A list of points in the scatter chart.
         **/
        @jakarta.ws.rs.QueryParam("points")
        private List<ChartPoint> points = new ArrayList<>();

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

        public PictureScatterChartDataQueryParam title(String title) {
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

        public PictureScatterChartDataQueryParam kind(KindEnum kind) {
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

        public PictureScatterChartDataQueryParam xAxisLabel(String xAxisLabel) {
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

        public PictureScatterChartDataQueryParam yAxisLabel(String yAxisLabel) {
            this.yAxisLabel = yAxisLabel;
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

        public PictureScatterChartDataQueryParam points(List<ChartPoint> points) {
            this.points = points;
            return this;
        }

        public PictureScatterChartDataQueryParam addPointsItem(ChartPoint pointsItem) {
            this.points.add(pointsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PictureScatterChartDataQueryParam {\n");

            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
            sb.append("    xAxisLabel: ").append(toIndentedString(xAxisLabel)).append("\n");
            sb.append("    yAxisLabel: ").append(toIndentedString(yAxisLabel)).append("\n");
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

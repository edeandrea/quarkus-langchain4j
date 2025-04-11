package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Represents data of a pie chart. Attributes: kind (Literal[\"pie_chart_data\"]): The type of the chart. slices
 * (List[ChartSlice]): A list of slices in the pie chart.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class PicturePieChartData {

    private String title;

    public enum KindEnum {
        PIE_CHART_DATA(String.valueOf("pie_chart_data"));

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

    private KindEnum kind = KindEnum.PIE_CHART_DATA;
    private List<ChartSlice> slices = new ArrayList<>();

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

    public PicturePieChartData title(String title) {
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

    public PicturePieChartData kind(KindEnum kind) {
        this.kind = kind;
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

    public PicturePieChartData slices(List<ChartSlice> slices) {
        this.slices = slices;
        return this;
    }

    public PicturePieChartData addSlicesItem(ChartSlice slicesItem) {
        if (this.slices == null) {
            slices = new ArrayList<>();
        }
        this.slices.add(slicesItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PicturePieChartData {\n");

        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    slices: ").append(toIndentedString(slices)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code PicturePieChartData} object that
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

        PicturePieChartData model = (PicturePieChartData) obj;

        return java.util.Objects.equals(title, model.title) &&
                java.util.Objects.equals(kind, model.kind) &&
                java.util.Objects.equals(slices, model.slices);
    }

    /**
     * Returns a hash code for a {@code PicturePieChartData}.
     *
     * @return a hash code value for a {@code PicturePieChartData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title,
                kind,
                slices);
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
     * Represents data of a pie chart. Attributes: kind (Literal[\"pie_chart_data\"]): The type of the chart. slices
     * (List[ChartSlice]): A list of slices in the pie chart.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PicturePieChartDataQueryParam {

        /**
         * Represents data of a pie chart. Attributes: kind (Literal[\"pie_chart_data\"]): The type of the chart. slices
         * (List[ChartSlice]): A list of slices in the pie chart.
         **/
        @jakarta.ws.rs.QueryParam("title")
        private String title;

        public enum KindEnum {
            PIE_CHART_DATA(String.valueOf("pie_chart_data"));

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
         * Represents data of a pie chart. Attributes: kind (Literal[\"pie_chart_data\"]): The type of the chart. slices
         * (List[ChartSlice]): A list of slices in the pie chart.
         **/
        private KindEnum kind = KindEnum.PIE_CHART_DATA;
        /**
         * Represents data of a pie chart. Attributes: kind (Literal[\"pie_chart_data\"]): The type of the chart. slices
         * (List[ChartSlice]): A list of slices in the pie chart.
         **/
        @jakarta.ws.rs.QueryParam("slices")
        private List<ChartSlice> slices = new ArrayList<>();

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

        public PicturePieChartDataQueryParam title(String title) {
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

        public PicturePieChartDataQueryParam kind(KindEnum kind) {
            this.kind = kind;
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

        public PicturePieChartDataQueryParam slices(List<ChartSlice> slices) {
            this.slices = slices;
            return this;
        }

        public PicturePieChartDataQueryParam addSlicesItem(ChartSlice slicesItem) {
            this.slices.add(slicesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PicturePieChartDataQueryParam {\n");

            sb.append("    title: ").append(toIndentedString(title)).append("\n");
            sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
            sb.append("    slices: ").append(toIndentedString(slices)).append("\n");
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

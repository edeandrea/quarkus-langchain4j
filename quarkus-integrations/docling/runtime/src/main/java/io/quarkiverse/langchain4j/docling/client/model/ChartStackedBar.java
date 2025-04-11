package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a stacked bar in a stacked bar chart. Attributes: label (List[str]): The labels for the stacked bars. Multiple
 * values are stored in cases where the chart is \"double stacked,\" meaning bars are stacked both horizontally and vertically.
 * values (List[Tuple[str, int]]): A list of values representing different segments of the stacked bar along with their label.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChartStackedBar {

    private List<String> label = new ArrayList<>();
    private List<List<Object>> values = new ArrayList<>();

    /**
     * Get label
     *
     * @return label
     **/
    @JsonProperty("label")
    public List<String> getLabel() {
        return label;
    }

    /**
     * Set label
     **/
    public void setLabel(List<String> label) {
        this.label = label;
    }

    public ChartStackedBar label(List<String> label) {
        this.label = label;
        return this;
    }

    public ChartStackedBar addLabelItem(String labelItem) {
        if (this.label == null) {
            label = new ArrayList<>();
        }
        this.label.add(labelItem);
        return this;
    }

    /**
     * Get values
     *
     * @return values
     **/
    @JsonProperty("values")
    public List<List<Object>> getValues() {
        return values;
    }

    /**
     * Set values
     **/
    public void setValues(List<List<Object>> values) {
        this.values = values;
    }

    public ChartStackedBar values(List<List<Object>> values) {
        this.values = values;
        return this;
    }

    public ChartStackedBar addValuesItem(List<Object> valuesItem) {
        if (this.values == null) {
            values = new ArrayList<>();
        }
        this.values.add(valuesItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChartStackedBar {\n");

        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ChartStackedBar} object that
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

        ChartStackedBar model = (ChartStackedBar) obj;

        return java.util.Objects.equals(label, model.label) &&
                java.util.Objects.equals(values, model.values);
    }

    /**
     * Returns a hash code for a {@code ChartStackedBar}.
     *
     * @return a hash code value for a {@code ChartStackedBar}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(label,
                values);
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
     * Represents a stacked bar in a stacked bar chart. Attributes: label (List[str]): The labels for the stacked bars. Multiple
     * values are stored in cases where the chart is \"double stacked,\" meaning bars are stacked both horizontally and
     * vertically. values (List[Tuple[str, int]]): A list of values representing different segments of the stacked bar along
     * with their label.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ChartStackedBarQueryParam {

        /**
         * Represents a stacked bar in a stacked bar chart. Attributes: label (List[str]): The labels for the stacked bars.
         * Multiple values are stored in cases where the chart is \"double stacked,\" meaning bars are stacked both horizontally
         * and vertically. values (List[Tuple[str, int]]): A list of values representing different segments of the stacked bar
         * along with their label.
         **/
        @jakarta.ws.rs.QueryParam("label")
        private List<String> label = new ArrayList<>();
        /**
         * Represents a stacked bar in a stacked bar chart. Attributes: label (List[str]): The labels for the stacked bars.
         * Multiple values are stored in cases where the chart is \"double stacked,\" meaning bars are stacked both horizontally
         * and vertically. values (List[Tuple[str, int]]): A list of values representing different segments of the stacked bar
         * along with their label.
         **/
        @jakarta.ws.rs.QueryParam("values")
        private List<List<Object>> values = new ArrayList<>();

        /**
         * Get label
         *
         * @return label
         **/
        @JsonProperty("label")
        public List<String> getLabel() {
            return label;
        }

        /**
         * Set label
         **/
        public void setLabel(List<String> label) {
            this.label = label;
        }

        public ChartStackedBarQueryParam label(List<String> label) {
            this.label = label;
            return this;
        }

        public ChartStackedBarQueryParam addLabelItem(String labelItem) {
            this.label.add(labelItem);
            return this;
        }

        /**
         * Get values
         *
         * @return values
         **/
        @JsonProperty("values")
        public List<List<Object>> getValues() {
            return values;
        }

        /**
         * Set values
         **/
        public void setValues(List<List<Object>> values) {
            this.values = values;
        }

        public ChartStackedBarQueryParam values(List<List<Object>> values) {
            this.values = values;
            return this;
        }

        public ChartStackedBarQueryParam addValuesItem(List<Object> valuesItem) {
            this.values.add(valuesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ChartStackedBarQueryParam {\n");

            sb.append("    label: ").append(toIndentedString(label)).append("\n");
            sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

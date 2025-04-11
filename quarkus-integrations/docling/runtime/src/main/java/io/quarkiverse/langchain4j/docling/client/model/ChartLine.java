package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a line in a line chart. Attributes: label (str): The label for the line. values (List[Tuple[float, float]]): A
 * list of (x, y) coordinate pairs representing the line's data points.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChartLine {

    private String label;
    private List<List<Object>> values = new ArrayList<>();

    /**
     * Get label
     *
     * @return label
     **/
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * Set label
     **/
    public void setLabel(String label) {
        this.label = label;
    }

    public ChartLine label(String label) {
        this.label = label;
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

    public ChartLine values(List<List<Object>> values) {
        this.values = values;
        return this;
    }

    public ChartLine addValuesItem(List<Object> valuesItem) {
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
        sb.append("class ChartLine {\n");

        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ChartLine} object that
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

        ChartLine model = (ChartLine) obj;

        return java.util.Objects.equals(label, model.label) &&
                java.util.Objects.equals(values, model.values);
    }

    /**
     * Returns a hash code for a {@code ChartLine}.
     *
     * @return a hash code value for a {@code ChartLine}.
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
     * Represents a line in a line chart. Attributes: label (str): The label for the line. values (List[Tuple[float, float]]): A
     * list of (x, y) coordinate pairs representing the line's data points.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ChartLineQueryParam {

        /**
         * Represents a line in a line chart. Attributes: label (str): The label for the line. values (List[Tuple[float,
         * float]]): A list of (x, y) coordinate pairs representing the line's data points.
         **/
        @jakarta.ws.rs.QueryParam("label")
        private String label;
        /**
         * Represents a line in a line chart. Attributes: label (str): The label for the line. values (List[Tuple[float,
         * float]]): A list of (x, y) coordinate pairs representing the line's data points.
         **/
        @jakarta.ws.rs.QueryParam("values")
        private List<List<Object>> values = new ArrayList<>();

        /**
         * Get label
         *
         * @return label
         **/
        @JsonProperty("label")
        public String getLabel() {
            return label;
        }

        /**
         * Set label
         **/
        public void setLabel(String label) {
            this.label = label;
        }

        public ChartLineQueryParam label(String label) {
            this.label = label;
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

        public ChartLineQueryParam values(List<List<Object>> values) {
            this.values = values;
            return this;
        }

        public ChartLineQueryParam addValuesItem(List<Object> valuesItem) {
            this.values.add(valuesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ChartLineQueryParam {\n");

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

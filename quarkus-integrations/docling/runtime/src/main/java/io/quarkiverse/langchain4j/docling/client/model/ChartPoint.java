package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a point in a scatter chart. Attributes: value (Tuple[float, float]): A (x, y) coordinate pair representing a point
 * in a chart.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChartPoint {

    private List<Object> value = new ArrayList<>();

    /**
     * Get value
     *
     * @return value
     **/
    @JsonProperty("value")
    public List<Object> getValue() {
        return value;
    }

    /**
     * Set value
     **/
    public void setValue(List<Object> value) {
        this.value = value;
    }

    public ChartPoint value(List<Object> value) {
        this.value = value;
        return this;
    }

    public ChartPoint addValueItem(Object valueItem) {
        if (this.value == null) {
            value = new ArrayList<>();
        }
        this.value.add(valueItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChartPoint {\n");

        sb.append("    value: ").append(toIndentedString(value)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ChartPoint} object that
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

        ChartPoint model = (ChartPoint) obj;

        return java.util.Objects.equals(value, model.value);
    }

    /**
     * Returns a hash code for a {@code ChartPoint}.
     *
     * @return a hash code value for a {@code ChartPoint}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(value);
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
     * Represents a point in a scatter chart. Attributes: value (Tuple[float, float]): A (x, y) coordinate pair representing a
     * point in a chart.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ChartPointQueryParam {

        /**
         * Represents a point in a scatter chart. Attributes: value (Tuple[float, float]): A (x, y) coordinate pair representing
         * a point in a chart.
         **/
        @jakarta.ws.rs.QueryParam("value")
        private List<Object> value = new ArrayList<>();

        /**
         * Get value
         *
         * @return value
         **/
        @JsonProperty("value")
        public List<Object> getValue() {
            return value;
        }

        /**
         * Set value
         **/
        public void setValue(List<Object> value) {
            this.value = value;
        }

        public ChartPointQueryParam value(List<Object> value) {
            this.value = value;
            return this;
        }

        public ChartPointQueryParam addValueItem(Object valueItem) {
            this.value.add(valueItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ChartPointQueryParam {\n");

            sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

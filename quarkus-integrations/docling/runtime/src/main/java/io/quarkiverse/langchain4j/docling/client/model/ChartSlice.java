package io.quarkiverse.langchain4j.docling.client.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a slice in a pie chart. Attributes: label (str): The label for the slice. value (float): The value represented by
 * the slice.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChartSlice {

    private String label;
    private BigDecimal value;

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

    public ChartSlice label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get value
     *
     * @return value
     **/
    @JsonProperty("value")
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Set value
     **/
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public ChartSlice value(BigDecimal value) {
        this.value = value;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChartSlice {\n");

        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ChartSlice} object that
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

        ChartSlice model = (ChartSlice) obj;

        return java.util.Objects.equals(label, model.label) &&
                java.util.Objects.equals(value, model.value);
    }

    /**
     * Returns a hash code for a {@code ChartSlice}.
     *
     * @return a hash code value for a {@code ChartSlice}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(label,
                value);
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
     * Represents a slice in a pie chart. Attributes: label (str): The label for the slice. value (float): The value represented
     * by the slice.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ChartSliceQueryParam {

        /**
         * Represents a slice in a pie chart. Attributes: label (str): The label for the slice. value (float): The value
         * represented by the slice.
         **/
        @jakarta.ws.rs.QueryParam("label")
        private String label;
        /**
         * Represents a slice in a pie chart. Attributes: label (str): The label for the slice. value (float): The value
         * represented by the slice.
         **/
        @jakarta.ws.rs.QueryParam("value")
        private BigDecimal value;

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

        public ChartSliceQueryParam label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Get value
         *
         * @return value
         **/
        @JsonProperty("value")
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Set value
         **/
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        public ChartSliceQueryParam value(BigDecimal value) {
            this.value = value;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ChartSliceQueryParam {\n");

            sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

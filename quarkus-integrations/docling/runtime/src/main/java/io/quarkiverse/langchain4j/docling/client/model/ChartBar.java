package io.quarkiverse.langchain4j.docling.client.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a bar in a bar chart. Attributes: label (str): The label for the bar. values (float): The value associated with
 * the bar.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChartBar {

    private String label;
    private BigDecimal values;

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

    public ChartBar label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get values
     *
     * @return values
     **/
    @JsonProperty("values")
    public BigDecimal getValues() {
        return values;
    }

    /**
     * Set values
     **/
    public void setValues(BigDecimal values) {
        this.values = values;
    }

    public ChartBar values(BigDecimal values) {
        this.values = values;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChartBar {\n");

        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ChartBar} object that
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

        ChartBar model = (ChartBar) obj;

        return java.util.Objects.equals(label, model.label) &&
                java.util.Objects.equals(values, model.values);
    }

    /**
     * Returns a hash code for a {@code ChartBar}.
     *
     * @return a hash code value for a {@code ChartBar}.
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
     * Represents a bar in a bar chart. Attributes: label (str): The label for the bar. values (float): The value associated
     * with the bar.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ChartBarQueryParam {

        /**
         * Represents a bar in a bar chart. Attributes: label (str): The label for the bar. values (float): The value associated
         * with the bar.
         **/
        @jakarta.ws.rs.QueryParam("label")
        private String label;
        /**
         * Represents a bar in a bar chart. Attributes: label (str): The label for the bar. values (float): The value associated
         * with the bar.
         **/
        @jakarta.ws.rs.QueryParam("values")
        private BigDecimal values;

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

        public ChartBarQueryParam label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Get values
         *
         * @return values
         **/
        @JsonProperty("values")
        public BigDecimal getValues() {
            return values;
        }

        /**
         * Set values
         **/
        public void setValues(BigDecimal values) {
            this.values = values;
        }

        public ChartBarQueryParam values(BigDecimal values) {
            this.values = values;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ChartBarQueryParam {\n");

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

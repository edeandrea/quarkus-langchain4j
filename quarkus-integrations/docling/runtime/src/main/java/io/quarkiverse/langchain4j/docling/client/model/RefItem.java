package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RefItem.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class RefItem {

    private String $ref;

    /**
     * Get $ref
     *
     * @return $ref
     **/
    @JsonProperty("$ref")
    public String get$Ref() {
        return $ref;
    }

    /**
     * Set $ref
     **/
    public void set$Ref(String $ref) {
        this.$ref = $ref;
    }

    public RefItem $ref(String $ref) {
        this.$ref = $ref;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RefItem {\n");

        sb.append("    $ref: ").append(toIndentedString($ref)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code RefItem} object that
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

        RefItem model = (RefItem) obj;

        return java.util.Objects.equals($ref, model.$ref);
    }

    /**
     * Returns a hash code for a {@code RefItem}.
     *
     * @return a hash code value for a {@code RefItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash($ref);
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
     * RefItem.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class RefItemQueryParam {

        /**
         * RefItem.
         **/
        @jakarta.ws.rs.QueryParam("$ref")
        private String $ref;

        /**
         * Get $ref
         *
         * @return $ref
         **/
        @JsonProperty("$ref")
        public String get$Ref() {
            return $ref;
        }

        /**
         * Set $ref
         **/
        public void set$Ref(String $ref) {
            this.$ref = $ref;
        }

        public RefItemQueryParam $ref(String $ref) {
            this.$ref = $ref;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RefItemQueryParam {\n");

            sb.append("    $ref: ").append(toIndentedString($ref)).append("\n");
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

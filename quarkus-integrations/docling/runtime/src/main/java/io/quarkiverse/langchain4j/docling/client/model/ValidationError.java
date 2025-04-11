package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ValidationError {

    private List<ValidationErrorLocInner> loc = new ArrayList<>();
    private String msg;
    private String type;

    /**
     * Get loc
     *
     * @return loc
     **/
    @JsonProperty("loc")
    public List<ValidationErrorLocInner> getLoc() {
        return loc;
    }

    /**
     * Set loc
     **/
    public void setLoc(List<ValidationErrorLocInner> loc) {
        this.loc = loc;
    }

    public ValidationError loc(List<ValidationErrorLocInner> loc) {
        this.loc = loc;
        return this;
    }

    public ValidationError addLocItem(ValidationErrorLocInner locItem) {
        if (this.loc == null) {
            loc = new ArrayList<>();
        }
        this.loc.add(locItem);
        return this;
    }

    /**
     * Get msg
     *
     * @return msg
     **/
    @JsonProperty("msg")
    public String getMsg() {
        return msg;
    }

    /**
     * Set msg
     **/
    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ValidationError msg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Set type
     **/
    public void setType(String type) {
        this.type = type;
    }

    public ValidationError type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ValidationError {\n");

        sb.append("    loc: ").append(toIndentedString(loc)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ValidationError} object that
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

        ValidationError model = (ValidationError) obj;

        return java.util.Objects.equals(loc, model.loc) &&
                java.util.Objects.equals(msg, model.msg) &&
                java.util.Objects.equals(type, model.type);
    }

    /**
     * Returns a hash code for a {@code ValidationError}.
     *
     * @return a hash code value for a {@code ValidationError}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(loc,
                msg,
                type);
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

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ValidationErrorQueryParam {

        @jakarta.ws.rs.QueryParam("loc")
        private List<ValidationErrorLocInner> loc = new ArrayList<>();
        @jakarta.ws.rs.QueryParam("msg")
        private String msg;
        @jakarta.ws.rs.QueryParam("type")
        private String type;

        /**
         * Get loc
         *
         * @return loc
         **/
        @JsonProperty("loc")
        public List<ValidationErrorLocInner> getLoc() {
            return loc;
        }

        /**
         * Set loc
         **/
        public void setLoc(List<ValidationErrorLocInner> loc) {
            this.loc = loc;
        }

        public ValidationErrorQueryParam loc(List<ValidationErrorLocInner> loc) {
            this.loc = loc;
            return this;
        }

        public ValidationErrorQueryParam addLocItem(ValidationErrorLocInner locItem) {
            this.loc.add(locItem);
            return this;
        }

        /**
         * Get msg
         *
         * @return msg
         **/
        @JsonProperty("msg")
        public String getMsg() {
            return msg;
        }

        /**
         * Set msg
         **/
        public void setMsg(String msg) {
            this.msg = msg;
        }

        public ValidationErrorQueryParam msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * Get type
         *
         * @return type
         **/
        @JsonProperty("type")
        public String getType() {
            return type;
        }

        /**
         * Set type
         **/
        public void setType(String type) {
            this.type = type;
        }

        public ValidationErrorQueryParam type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ValidationErrorQueryParam {\n");

            sb.append("    loc: ").append(toIndentedString(loc)).append("\n");
            sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

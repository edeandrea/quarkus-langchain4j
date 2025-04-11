package io.quarkiverse.langchain4j.docling.client.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BoundingBox.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class BoundingBox {

    private BigDecimal l;
    private BigDecimal t;
    private BigDecimal r;
    private BigDecimal b;
    private CoordOrigin coordOrigin;

    /**
     * Get l
     *
     * @return l
     **/
    @JsonProperty("l")
    public BigDecimal getL() {
        return l;
    }

    /**
     * Set l
     **/
    public void setL(BigDecimal l) {
        this.l = l;
    }

    public BoundingBox l(BigDecimal l) {
        this.l = l;
        return this;
    }

    /**
     * Get t
     *
     * @return t
     **/
    @JsonProperty("t")
    public BigDecimal getT() {
        return t;
    }

    /**
     * Set t
     **/
    public void setT(BigDecimal t) {
        this.t = t;
    }

    public BoundingBox t(BigDecimal t) {
        this.t = t;
        return this;
    }

    /**
     * Get r
     *
     * @return r
     **/
    @JsonProperty("r")
    public BigDecimal getR() {
        return r;
    }

    /**
     * Set r
     **/
    public void setR(BigDecimal r) {
        this.r = r;
    }

    public BoundingBox r(BigDecimal r) {
        this.r = r;
        return this;
    }

    /**
     * Get b
     *
     * @return b
     **/
    @JsonProperty("b")
    public BigDecimal getB() {
        return b;
    }

    /**
     * Set b
     **/
    public void setB(BigDecimal b) {
        this.b = b;
    }

    public BoundingBox b(BigDecimal b) {
        this.b = b;
        return this;
    }

    /**
     * Get coordOrigin
     *
     * @return coordOrigin
     **/
    @JsonProperty("coord_origin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CoordOrigin getCoordOrigin() {
        return coordOrigin;
    }

    /**
     * Set coordOrigin
     **/
    public void setCoordOrigin(CoordOrigin coordOrigin) {
        this.coordOrigin = coordOrigin;
    }

    public BoundingBox coordOrigin(CoordOrigin coordOrigin) {
        this.coordOrigin = coordOrigin;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BoundingBox {\n");

        sb.append("    l: ").append(toIndentedString(l)).append("\n");
        sb.append("    t: ").append(toIndentedString(t)).append("\n");
        sb.append("    r: ").append(toIndentedString(r)).append("\n");
        sb.append("    b: ").append(toIndentedString(b)).append("\n");
        sb.append("    coordOrigin: ").append(toIndentedString(coordOrigin)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code BoundingBox} object that
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

        BoundingBox model = (BoundingBox) obj;

        return java.util.Objects.equals(l, model.l) &&
                java.util.Objects.equals(t, model.t) &&
                java.util.Objects.equals(r, model.r) &&
                java.util.Objects.equals(b, model.b) &&
                java.util.Objects.equals(coordOrigin, model.coordOrigin);
    }

    /**
     * Returns a hash code for a {@code BoundingBox}.
     *
     * @return a hash code value for a {@code BoundingBox}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(l,
                t,
                r,
                b,
                coordOrigin);
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
     * BoundingBox.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class BoundingBoxQueryParam {

        /**
         * BoundingBox.
         **/
        @jakarta.ws.rs.QueryParam("l")
        private BigDecimal l;
        /**
         * BoundingBox.
         **/
        @jakarta.ws.rs.QueryParam("t")
        private BigDecimal t;
        /**
         * BoundingBox.
         **/
        @jakarta.ws.rs.QueryParam("r")
        private BigDecimal r;
        /**
         * BoundingBox.
         **/
        @jakarta.ws.rs.QueryParam("b")
        private BigDecimal b;
        /**
         * BoundingBox.
         **/
        @jakarta.ws.rs.QueryParam("coordOrigin")
        private CoordOrigin coordOrigin;

        /**
         * Get l
         *
         * @return l
         **/
        @JsonProperty("l")
        public BigDecimal getL() {
            return l;
        }

        /**
         * Set l
         **/
        public void setL(BigDecimal l) {
            this.l = l;
        }

        public BoundingBoxQueryParam l(BigDecimal l) {
            this.l = l;
            return this;
        }

        /**
         * Get t
         *
         * @return t
         **/
        @JsonProperty("t")
        public BigDecimal getT() {
            return t;
        }

        /**
         * Set t
         **/
        public void setT(BigDecimal t) {
            this.t = t;
        }

        public BoundingBoxQueryParam t(BigDecimal t) {
            this.t = t;
            return this;
        }

        /**
         * Get r
         *
         * @return r
         **/
        @JsonProperty("r")
        public BigDecimal getR() {
            return r;
        }

        /**
         * Set r
         **/
        public void setR(BigDecimal r) {
            this.r = r;
        }

        public BoundingBoxQueryParam r(BigDecimal r) {
            this.r = r;
            return this;
        }

        /**
         * Get b
         *
         * @return b
         **/
        @JsonProperty("b")
        public BigDecimal getB() {
            return b;
        }

        /**
         * Set b
         **/
        public void setB(BigDecimal b) {
            this.b = b;
        }

        public BoundingBoxQueryParam b(BigDecimal b) {
            this.b = b;
            return this;
        }

        /**
         * Get coordOrigin
         *
         * @return coordOrigin
         **/
        @JsonProperty("coord_origin")
        public CoordOrigin getCoordOrigin() {
            return coordOrigin;
        }

        /**
         * Set coordOrigin
         **/
        public void setCoordOrigin(CoordOrigin coordOrigin) {
            this.coordOrigin = coordOrigin;
        }

        public BoundingBoxQueryParam coordOrigin(CoordOrigin coordOrigin) {
            this.coordOrigin = coordOrigin;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BoundingBoxQueryParam {\n");

            sb.append("    l: ").append(toIndentedString(l)).append("\n");
            sb.append("    t: ").append(toIndentedString(t)).append("\n");
            sb.append("    r: ").append(toIndentedString(r)).append("\n");
            sb.append("    b: ").append(toIndentedString(b)).append("\n");
            sb.append("    coordOrigin: ").append(toIndentedString(coordOrigin)).append("\n");
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

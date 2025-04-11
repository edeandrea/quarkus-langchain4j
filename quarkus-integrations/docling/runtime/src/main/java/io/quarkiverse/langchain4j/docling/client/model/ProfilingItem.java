package io.quarkiverse.langchain4j.docling.client.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfilingItem {

    private ProfilingScope scope;
    private Integer count = 0;
    private List<BigDecimal> times;
    private List<OffsetDateTime> startTimestamps;

    /**
     * Get scope
     *
     * @return scope
     **/
    @JsonProperty("scope")
    public ProfilingScope getScope() {
        return scope;
    }

    /**
     * Set scope
     **/
    public void setScope(ProfilingScope scope) {
        this.scope = scope;
    }

    public ProfilingItem scope(ProfilingScope scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get count
     *
     * @return count
     **/
    @JsonProperty("count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCount() {
        return count;
    }

    /**
     * Set count
     **/
    public void setCount(Integer count) {
        this.count = count;
    }

    public ProfilingItem count(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get times
     *
     * @return times
     **/
    @JsonProperty("times")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<BigDecimal> getTimes() {
        return times;
    }

    /**
     * Set times
     **/
    public void setTimes(List<BigDecimal> times) {
        this.times = times;
    }

    public ProfilingItem times(List<BigDecimal> times) {
        this.times = times;
        return this;
    }

    public ProfilingItem addTimesItem(BigDecimal timesItem) {
        if (this.times == null) {
            times = new ArrayList<>();
        }
        this.times.add(timesItem);
        return this;
    }

    /**
     * Get startTimestamps
     *
     * @return startTimestamps
     **/
    @JsonProperty("start_timestamps")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OffsetDateTime> getStartTimestamps() {
        return startTimestamps;
    }

    /**
     * Set startTimestamps
     **/
    public void setStartTimestamps(List<OffsetDateTime> startTimestamps) {
        this.startTimestamps = startTimestamps;
    }

    public ProfilingItem startTimestamps(List<OffsetDateTime> startTimestamps) {
        this.startTimestamps = startTimestamps;
        return this;
    }

    public ProfilingItem addStartTimestampsItem(OffsetDateTime startTimestampsItem) {
        if (this.startTimestamps == null) {
            startTimestamps = new ArrayList<>();
        }
        this.startTimestamps.add(startTimestampsItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProfilingItem {\n");

        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    times: ").append(toIndentedString(times)).append("\n");
        sb.append("    startTimestamps: ").append(toIndentedString(startTimestamps)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ProfilingItem} object that
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

        ProfilingItem model = (ProfilingItem) obj;

        return java.util.Objects.equals(scope, model.scope) &&
                java.util.Objects.equals(count, model.count) &&
                java.util.Objects.equals(times, model.times) &&
                java.util.Objects.equals(startTimestamps, model.startTimestamps);
    }

    /**
     * Returns a hash code for a {@code ProfilingItem}.
     *
     * @return a hash code value for a {@code ProfilingItem}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(scope,
                count,
                times,
                startTimestamps);
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
    public static class ProfilingItemQueryParam {

        @jakarta.ws.rs.QueryParam("scope")
        private ProfilingScope scope;
        @jakarta.ws.rs.QueryParam("count")
        private Integer count = 0;
        @jakarta.ws.rs.QueryParam("times")
        private List<BigDecimal> times = null;
        @jakarta.ws.rs.QueryParam("startTimestamps")
        private List<OffsetDateTime> startTimestamps = null;

        /**
         * Get scope
         *
         * @return scope
         **/
        @JsonProperty("scope")
        public ProfilingScope getScope() {
            return scope;
        }

        /**
         * Set scope
         **/
        public void setScope(ProfilingScope scope) {
            this.scope = scope;
        }

        public ProfilingItemQueryParam scope(ProfilingScope scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Get count
         *
         * @return count
         **/
        @JsonProperty("count")
        public Integer getCount() {
            return count;
        }

        /**
         * Set count
         **/
        public void setCount(Integer count) {
            this.count = count;
        }

        public ProfilingItemQueryParam count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Get times
         *
         * @return times
         **/
        @JsonProperty("times")
        public List<BigDecimal> getTimes() {
            return times;
        }

        /**
         * Set times
         **/
        public void setTimes(List<BigDecimal> times) {
            this.times = times;
        }

        public ProfilingItemQueryParam times(List<BigDecimal> times) {
            this.times = times;
            return this;
        }

        public ProfilingItemQueryParam addTimesItem(BigDecimal timesItem) {
            this.times.add(timesItem);
            return this;
        }

        /**
         * Get startTimestamps
         *
         * @return startTimestamps
         **/
        @JsonProperty("start_timestamps")
        public List<OffsetDateTime> getStartTimestamps() {
            return startTimestamps;
        }

        /**
         * Set startTimestamps
         **/
        public void setStartTimestamps(List<OffsetDateTime> startTimestamps) {
            this.startTimestamps = startTimestamps;
        }

        public ProfilingItemQueryParam startTimestamps(List<OffsetDateTime> startTimestamps) {
            this.startTimestamps = startTimestamps;
            return this;
        }

        public ProfilingItemQueryParam addStartTimestampsItem(OffsetDateTime startTimestampsItem) {
            this.startTimestamps.add(startTimestampsItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ProfilingItemQueryParam {\n");

            sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
            sb.append("    count: ").append(toIndentedString(count)).append("\n");
            sb.append("    times: ").append(toIndentedString(times)).append("\n");
            sb.append("    startTimestamps: ").append(toIndentedString(startTimestamps)).append("\n");
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

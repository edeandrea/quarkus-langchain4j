package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskStatusResponse {

    private String taskId;
    private String taskStatus;
    private Integer taskPosition;

    /**
     * Get taskId
     *
     * @return taskId
     **/
    @JsonProperty("task_id")
    public String getTaskId() {
        return taskId;
    }

    /**
     * Set taskId
     **/
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public TaskStatusResponse taskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Get taskStatus
     *
     * @return taskStatus
     **/
    @JsonProperty("task_status")
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * Set taskStatus
     **/
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public TaskStatusResponse taskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * Get taskPosition
     *
     * @return taskPosition
     **/
    @JsonProperty("task_position")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTaskPosition() {
        return taskPosition;
    }

    /**
     * Set taskPosition
     **/
    public void setTaskPosition(Integer taskPosition) {
        this.taskPosition = taskPosition;
    }

    public TaskStatusResponse taskPosition(Integer taskPosition) {
        this.taskPosition = taskPosition;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskStatusResponse {\n");

        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    taskPosition: ").append(toIndentedString(taskPosition)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code TaskStatusResponse} object that
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

        TaskStatusResponse model = (TaskStatusResponse) obj;

        return java.util.Objects.equals(taskId, model.taskId) &&
                java.util.Objects.equals(taskStatus, model.taskStatus) &&
                java.util.Objects.equals(taskPosition, model.taskPosition);
    }

    /**
     * Returns a hash code for a {@code TaskStatusResponse}.
     *
     * @return a hash code value for a {@code TaskStatusResponse}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(taskId,
                taskStatus,
                taskPosition);
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
    public static class TaskStatusResponseQueryParam {

        @jakarta.ws.rs.QueryParam("taskId")
        private String taskId;
        @jakarta.ws.rs.QueryParam("taskStatus")
        private String taskStatus;
        @jakarta.ws.rs.QueryParam("taskPosition")
        private Integer taskPosition;

        /**
         * Get taskId
         *
         * @return taskId
         **/
        @JsonProperty("task_id")
        public String getTaskId() {
            return taskId;
        }

        /**
         * Set taskId
         **/
        public void setTaskId(String taskId) {
            this.taskId = taskId;
        }

        public TaskStatusResponseQueryParam taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * Get taskStatus
         *
         * @return taskStatus
         **/
        @JsonProperty("task_status")
        public String getTaskStatus() {
            return taskStatus;
        }

        /**
         * Set taskStatus
         **/
        public void setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
        }

        public TaskStatusResponseQueryParam taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * Get taskPosition
         *
         * @return taskPosition
         **/
        @JsonProperty("task_position")
        public Integer getTaskPosition() {
            return taskPosition;
        }

        /**
         * Set taskPosition
         **/
        public void setTaskPosition(Integer taskPosition) {
            this.taskPosition = taskPosition;
        }

        public TaskStatusResponseQueryParam taskPosition(Integer taskPosition) {
            this.taskPosition = taskPosition;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TaskStatusResponseQueryParam {\n");

            sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
            sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
            sb.append("    taskPosition: ").append(toIndentedString(taskPosition)).append("\n");
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

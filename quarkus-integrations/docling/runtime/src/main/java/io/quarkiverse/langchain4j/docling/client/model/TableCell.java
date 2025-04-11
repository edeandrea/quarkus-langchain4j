package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * TableCell.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class TableCell {

    private BoundingBox bbox;
    private Integer rowSpan = 1;
    private Integer colSpan = 1;
    private Integer startRowOffsetIdx;
    private Integer endRowOffsetIdx;
    private Integer startColOffsetIdx;
    private Integer endColOffsetIdx;
    private String text;
    private Boolean columnHeader = false;
    private Boolean rowHeader = false;
    private Boolean rowSection = false;

    /**
     * Get bbox
     *
     * @return bbox
     **/
    @JsonProperty("bbox")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BoundingBox getBbox() {
        return bbox;
    }

    /**
     * Set bbox
     **/
    public void setBbox(BoundingBox bbox) {
        this.bbox = bbox;
    }

    public TableCell bbox(BoundingBox bbox) {
        this.bbox = bbox;
        return this;
    }

    /**
     * Get rowSpan
     *
     * @return rowSpan
     **/
    @JsonProperty("row_span")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getRowSpan() {
        return rowSpan;
    }

    /**
     * Set rowSpan
     **/
    public void setRowSpan(Integer rowSpan) {
        this.rowSpan = rowSpan;
    }

    public TableCell rowSpan(Integer rowSpan) {
        this.rowSpan = rowSpan;
        return this;
    }

    /**
     * Get colSpan
     *
     * @return colSpan
     **/
    @JsonProperty("col_span")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getColSpan() {
        return colSpan;
    }

    /**
     * Set colSpan
     **/
    public void setColSpan(Integer colSpan) {
        this.colSpan = colSpan;
    }

    public TableCell colSpan(Integer colSpan) {
        this.colSpan = colSpan;
        return this;
    }

    /**
     * Get startRowOffsetIdx
     *
     * @return startRowOffsetIdx
     **/
    @JsonProperty("start_row_offset_idx")
    public Integer getStartRowOffsetIdx() {
        return startRowOffsetIdx;
    }

    /**
     * Set startRowOffsetIdx
     **/
    public void setStartRowOffsetIdx(Integer startRowOffsetIdx) {
        this.startRowOffsetIdx = startRowOffsetIdx;
    }

    public TableCell startRowOffsetIdx(Integer startRowOffsetIdx) {
        this.startRowOffsetIdx = startRowOffsetIdx;
        return this;
    }

    /**
     * Get endRowOffsetIdx
     *
     * @return endRowOffsetIdx
     **/
    @JsonProperty("end_row_offset_idx")
    public Integer getEndRowOffsetIdx() {
        return endRowOffsetIdx;
    }

    /**
     * Set endRowOffsetIdx
     **/
    public void setEndRowOffsetIdx(Integer endRowOffsetIdx) {
        this.endRowOffsetIdx = endRowOffsetIdx;
    }

    public TableCell endRowOffsetIdx(Integer endRowOffsetIdx) {
        this.endRowOffsetIdx = endRowOffsetIdx;
        return this;
    }

    /**
     * Get startColOffsetIdx
     *
     * @return startColOffsetIdx
     **/
    @JsonProperty("start_col_offset_idx")
    public Integer getStartColOffsetIdx() {
        return startColOffsetIdx;
    }

    /**
     * Set startColOffsetIdx
     **/
    public void setStartColOffsetIdx(Integer startColOffsetIdx) {
        this.startColOffsetIdx = startColOffsetIdx;
    }

    public TableCell startColOffsetIdx(Integer startColOffsetIdx) {
        this.startColOffsetIdx = startColOffsetIdx;
        return this;
    }

    /**
     * Get endColOffsetIdx
     *
     * @return endColOffsetIdx
     **/
    @JsonProperty("end_col_offset_idx")
    public Integer getEndColOffsetIdx() {
        return endColOffsetIdx;
    }

    /**
     * Set endColOffsetIdx
     **/
    public void setEndColOffsetIdx(Integer endColOffsetIdx) {
        this.endColOffsetIdx = endColOffsetIdx;
    }

    public TableCell endColOffsetIdx(Integer endColOffsetIdx) {
        this.endColOffsetIdx = endColOffsetIdx;
        return this;
    }

    /**
     * Get text
     *
     * @return text
     **/
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Set text
     **/
    public void setText(String text) {
        this.text = text;
    }

    public TableCell text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get columnHeader
     *
     * @return columnHeader
     **/
    @JsonProperty("column_header")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getColumnHeader() {
        return columnHeader;
    }

    /**
     * Set columnHeader
     **/
    public void setColumnHeader(Boolean columnHeader) {
        this.columnHeader = columnHeader;
    }

    public TableCell columnHeader(Boolean columnHeader) {
        this.columnHeader = columnHeader;
        return this;
    }

    /**
     * Get rowHeader
     *
     * @return rowHeader
     **/
    @JsonProperty("row_header")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRowHeader() {
        return rowHeader;
    }

    /**
     * Set rowHeader
     **/
    public void setRowHeader(Boolean rowHeader) {
        this.rowHeader = rowHeader;
    }

    public TableCell rowHeader(Boolean rowHeader) {
        this.rowHeader = rowHeader;
        return this;
    }

    /**
     * Get rowSection
     *
     * @return rowSection
     **/
    @JsonProperty("row_section")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRowSection() {
        return rowSection;
    }

    /**
     * Set rowSection
     **/
    public void setRowSection(Boolean rowSection) {
        this.rowSection = rowSection;
    }

    public TableCell rowSection(Boolean rowSection) {
        this.rowSection = rowSection;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableCell {\n");

        sb.append("    bbox: ").append(toIndentedString(bbox)).append("\n");
        sb.append("    rowSpan: ").append(toIndentedString(rowSpan)).append("\n");
        sb.append("    colSpan: ").append(toIndentedString(colSpan)).append("\n");
        sb.append("    startRowOffsetIdx: ").append(toIndentedString(startRowOffsetIdx)).append("\n");
        sb.append("    endRowOffsetIdx: ").append(toIndentedString(endRowOffsetIdx)).append("\n");
        sb.append("    startColOffsetIdx: ").append(toIndentedString(startColOffsetIdx)).append("\n");
        sb.append("    endColOffsetIdx: ").append(toIndentedString(endColOffsetIdx)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    columnHeader: ").append(toIndentedString(columnHeader)).append("\n");
        sb.append("    rowHeader: ").append(toIndentedString(rowHeader)).append("\n");
        sb.append("    rowSection: ").append(toIndentedString(rowSection)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code TableCell} object that
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

        TableCell model = (TableCell) obj;

        return java.util.Objects.equals(bbox, model.bbox) &&
                java.util.Objects.equals(rowSpan, model.rowSpan) &&
                java.util.Objects.equals(colSpan, model.colSpan) &&
                java.util.Objects.equals(startRowOffsetIdx, model.startRowOffsetIdx) &&
                java.util.Objects.equals(endRowOffsetIdx, model.endRowOffsetIdx) &&
                java.util.Objects.equals(startColOffsetIdx, model.startColOffsetIdx) &&
                java.util.Objects.equals(endColOffsetIdx, model.endColOffsetIdx) &&
                java.util.Objects.equals(text, model.text) &&
                java.util.Objects.equals(columnHeader, model.columnHeader) &&
                java.util.Objects.equals(rowHeader, model.rowHeader) &&
                java.util.Objects.equals(rowSection, model.rowSection);
    }

    /**
     * Returns a hash code for a {@code TableCell}.
     *
     * @return a hash code value for a {@code TableCell}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(bbox,
                rowSpan,
                colSpan,
                startRowOffsetIdx,
                endRowOffsetIdx,
                startColOffsetIdx,
                endColOffsetIdx,
                text,
                columnHeader,
                rowHeader,
                rowSection);
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
     * TableCell.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TableCellQueryParam {

        /**
         * TableCell.
         **/
        @jakarta.ws.rs.QueryParam("bbox")
        private BoundingBox bbox;
        /**
         * TableCell.
         **/
        @jakarta.ws.rs.QueryParam("rowSpan")
        private Integer rowSpan = 1;
        /**
         * TableCell.
         **/
        @jakarta.ws.rs.QueryParam("colSpan")
        private Integer colSpan = 1;
        /**
         * TableCell.
         **/
        @jakarta.ws.rs.QueryParam("startRowOffsetIdx")
        private Integer startRowOffsetIdx;
        /**
         * TableCell.
         **/
        @jakarta.ws.rs.QueryParam("endRowOffsetIdx")
        private Integer endRowOffsetIdx;
        /**
         * TableCell.
         **/
        @jakarta.ws.rs.QueryParam("startColOffsetIdx")
        private Integer startColOffsetIdx;
        /**
         * TableCell.
         **/
        @jakarta.ws.rs.QueryParam("endColOffsetIdx")
        private Integer endColOffsetIdx;
        /**
         * TableCell.
         **/
        @jakarta.ws.rs.QueryParam("text")
        private String text;
        /**
         * TableCell.
         **/
        @jakarta.ws.rs.QueryParam("columnHeader")
        private Boolean columnHeader = false;
        /**
         * TableCell.
         **/
        @jakarta.ws.rs.QueryParam("rowHeader")
        private Boolean rowHeader = false;
        /**
         * TableCell.
         **/
        @jakarta.ws.rs.QueryParam("rowSection")
        private Boolean rowSection = false;

        /**
         * Get bbox
         *
         * @return bbox
         **/
        @JsonProperty("bbox")
        public BoundingBox getBbox() {
            return bbox;
        }

        /**
         * Set bbox
         **/
        public void setBbox(BoundingBox bbox) {
            this.bbox = bbox;
        }

        public TableCellQueryParam bbox(BoundingBox bbox) {
            this.bbox = bbox;
            return this;
        }

        /**
         * Get rowSpan
         *
         * @return rowSpan
         **/
        @JsonProperty("row_span")
        public Integer getRowSpan() {
            return rowSpan;
        }

        /**
         * Set rowSpan
         **/
        public void setRowSpan(Integer rowSpan) {
            this.rowSpan = rowSpan;
        }

        public TableCellQueryParam rowSpan(Integer rowSpan) {
            this.rowSpan = rowSpan;
            return this;
        }

        /**
         * Get colSpan
         *
         * @return colSpan
         **/
        @JsonProperty("col_span")
        public Integer getColSpan() {
            return colSpan;
        }

        /**
         * Set colSpan
         **/
        public void setColSpan(Integer colSpan) {
            this.colSpan = colSpan;
        }

        public TableCellQueryParam colSpan(Integer colSpan) {
            this.colSpan = colSpan;
            return this;
        }

        /**
         * Get startRowOffsetIdx
         *
         * @return startRowOffsetIdx
         **/
        @JsonProperty("start_row_offset_idx")
        public Integer getStartRowOffsetIdx() {
            return startRowOffsetIdx;
        }

        /**
         * Set startRowOffsetIdx
         **/
        public void setStartRowOffsetIdx(Integer startRowOffsetIdx) {
            this.startRowOffsetIdx = startRowOffsetIdx;
        }

        public TableCellQueryParam startRowOffsetIdx(Integer startRowOffsetIdx) {
            this.startRowOffsetIdx = startRowOffsetIdx;
            return this;
        }

        /**
         * Get endRowOffsetIdx
         *
         * @return endRowOffsetIdx
         **/
        @JsonProperty("end_row_offset_idx")
        public Integer getEndRowOffsetIdx() {
            return endRowOffsetIdx;
        }

        /**
         * Set endRowOffsetIdx
         **/
        public void setEndRowOffsetIdx(Integer endRowOffsetIdx) {
            this.endRowOffsetIdx = endRowOffsetIdx;
        }

        public TableCellQueryParam endRowOffsetIdx(Integer endRowOffsetIdx) {
            this.endRowOffsetIdx = endRowOffsetIdx;
            return this;
        }

        /**
         * Get startColOffsetIdx
         *
         * @return startColOffsetIdx
         **/
        @JsonProperty("start_col_offset_idx")
        public Integer getStartColOffsetIdx() {
            return startColOffsetIdx;
        }

        /**
         * Set startColOffsetIdx
         **/
        public void setStartColOffsetIdx(Integer startColOffsetIdx) {
            this.startColOffsetIdx = startColOffsetIdx;
        }

        public TableCellQueryParam startColOffsetIdx(Integer startColOffsetIdx) {
            this.startColOffsetIdx = startColOffsetIdx;
            return this;
        }

        /**
         * Get endColOffsetIdx
         *
         * @return endColOffsetIdx
         **/
        @JsonProperty("end_col_offset_idx")
        public Integer getEndColOffsetIdx() {
            return endColOffsetIdx;
        }

        /**
         * Set endColOffsetIdx
         **/
        public void setEndColOffsetIdx(Integer endColOffsetIdx) {
            this.endColOffsetIdx = endColOffsetIdx;
        }

        public TableCellQueryParam endColOffsetIdx(Integer endColOffsetIdx) {
            this.endColOffsetIdx = endColOffsetIdx;
            return this;
        }

        /**
         * Get text
         *
         * @return text
         **/
        @JsonProperty("text")
        public String getText() {
            return text;
        }

        /**
         * Set text
         **/
        public void setText(String text) {
            this.text = text;
        }

        public TableCellQueryParam text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Get columnHeader
         *
         * @return columnHeader
         **/
        @JsonProperty("column_header")
        public Boolean getColumnHeader() {
            return columnHeader;
        }

        /**
         * Set columnHeader
         **/
        public void setColumnHeader(Boolean columnHeader) {
            this.columnHeader = columnHeader;
        }

        public TableCellQueryParam columnHeader(Boolean columnHeader) {
            this.columnHeader = columnHeader;
            return this;
        }

        /**
         * Get rowHeader
         *
         * @return rowHeader
         **/
        @JsonProperty("row_header")
        public Boolean getRowHeader() {
            return rowHeader;
        }

        /**
         * Set rowHeader
         **/
        public void setRowHeader(Boolean rowHeader) {
            this.rowHeader = rowHeader;
        }

        public TableCellQueryParam rowHeader(Boolean rowHeader) {
            this.rowHeader = rowHeader;
            return this;
        }

        /**
         * Get rowSection
         *
         * @return rowSection
         **/
        @JsonProperty("row_section")
        public Boolean getRowSection() {
            return rowSection;
        }

        /**
         * Set rowSection
         **/
        public void setRowSection(Boolean rowSection) {
            this.rowSection = rowSection;
        }

        public TableCellQueryParam rowSection(Boolean rowSection) {
            this.rowSection = rowSection;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TableCellQueryParam {\n");

            sb.append("    bbox: ").append(toIndentedString(bbox)).append("\n");
            sb.append("    rowSpan: ").append(toIndentedString(rowSpan)).append("\n");
            sb.append("    colSpan: ").append(toIndentedString(colSpan)).append("\n");
            sb.append("    startRowOffsetIdx: ").append(toIndentedString(startRowOffsetIdx)).append("\n");
            sb.append("    endRowOffsetIdx: ").append(toIndentedString(endRowOffsetIdx)).append("\n");
            sb.append("    startColOffsetIdx: ").append(toIndentedString(startColOffsetIdx)).append("\n");
            sb.append("    endColOffsetIdx: ").append(toIndentedString(endColOffsetIdx)).append("\n");
            sb.append("    text: ").append(toIndentedString(text)).append("\n");
            sb.append("    columnHeader: ").append(toIndentedString(columnHeader)).append("\n");
            sb.append("    rowHeader: ").append(toIndentedString(rowHeader)).append("\n");
            sb.append("    rowSection: ").append(toIndentedString(rowSection)).append("\n");
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

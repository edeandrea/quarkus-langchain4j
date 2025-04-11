package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BaseTableData.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class TableData {

    private List<TableCell> tableCells;
    private Integer numRows = 0;
    private Integer numCols = 0;
    /**
     * grid.
     **/
    private List<List<TableCell>> grid = new ArrayList<>();

    /**
     * Get tableCells
     *
     * @return tableCells
     **/
    @JsonProperty("table_cells")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TableCell> getTableCells() {
        return tableCells;
    }

    /**
     * Set tableCells
     **/
    public void setTableCells(List<TableCell> tableCells) {
        this.tableCells = tableCells;
    }

    public TableData tableCells(List<TableCell> tableCells) {
        this.tableCells = tableCells;
        return this;
    }

    public TableData addTableCellsItem(TableCell tableCellsItem) {
        if (this.tableCells == null) {
            tableCells = new ArrayList<>();
        }
        this.tableCells.add(tableCellsItem);
        return this;
    }

    /**
     * Get numRows
     *
     * @return numRows
     **/
    @JsonProperty("num_rows")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNumRows() {
        return numRows;
    }

    /**
     * Set numRows
     **/
    public void setNumRows(Integer numRows) {
        this.numRows = numRows;
    }

    public TableData numRows(Integer numRows) {
        this.numRows = numRows;
        return this;
    }

    /**
     * Get numCols
     *
     * @return numCols
     **/
    @JsonProperty("num_cols")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getNumCols() {
        return numCols;
    }

    /**
     * Set numCols
     **/
    public void setNumCols(Integer numCols) {
        this.numCols = numCols;
    }

    public TableData numCols(Integer numCols) {
        this.numCols = numCols;
        return this;
    }

    /**
     * grid.
     *
     * @return grid
     **/
    @JsonProperty("grid")
    public List<List<TableCell>> getGrid() {
        return grid;
    }

    /**
     * Set grid
     **/
    public void setGrid(List<List<TableCell>> grid) {
        this.grid = grid;
    }

    public TableData grid(List<List<TableCell>> grid) {
        this.grid = grid;
        return this;
    }

    public TableData addGridItem(List<TableCell> gridItem) {
        if (this.grid == null) {
            grid = new ArrayList<>();
        }
        this.grid.add(gridItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableData {\n");

        sb.append("    tableCells: ").append(toIndentedString(tableCells)).append("\n");
        sb.append("    numRows: ").append(toIndentedString(numRows)).append("\n");
        sb.append("    numCols: ").append(toIndentedString(numCols)).append("\n");
        sb.append("    grid: ").append(toIndentedString(grid)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code TableData} object that
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

        TableData model = (TableData) obj;

        return java.util.Objects.equals(tableCells, model.tableCells) &&
                java.util.Objects.equals(numRows, model.numRows) &&
                java.util.Objects.equals(numCols, model.numCols) &&
                java.util.Objects.equals(grid, model.grid);
    }

    /**
     * Returns a hash code for a {@code TableData}.
     *
     * @return a hash code value for a {@code TableData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(tableCells,
                numRows,
                numCols,
                grid);
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
     * BaseTableData.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class TableDataQueryParam {

        /**
         * BaseTableData.
         **/
        @jakarta.ws.rs.QueryParam("tableCells")
        private List<TableCell> tableCells = null;
        /**
         * BaseTableData.
         **/
        @jakarta.ws.rs.QueryParam("numRows")
        private Integer numRows = 0;
        /**
         * BaseTableData.
         **/
        @jakarta.ws.rs.QueryParam("numCols")
        private Integer numCols = 0;
        /**
         * BaseTableData.
         **/
        @jakarta.ws.rs.QueryParam("grid")
        private List<List<TableCell>> grid = new ArrayList<>();

        /**
         * Get tableCells
         *
         * @return tableCells
         **/
        @JsonProperty("table_cells")
        public List<TableCell> getTableCells() {
            return tableCells;
        }

        /**
         * Set tableCells
         **/
        public void setTableCells(List<TableCell> tableCells) {
            this.tableCells = tableCells;
        }

        public TableDataQueryParam tableCells(List<TableCell> tableCells) {
            this.tableCells = tableCells;
            return this;
        }

        public TableDataQueryParam addTableCellsItem(TableCell tableCellsItem) {
            this.tableCells.add(tableCellsItem);
            return this;
        }

        /**
         * Get numRows
         *
         * @return numRows
         **/
        @JsonProperty("num_rows")
        public Integer getNumRows() {
            return numRows;
        }

        /**
         * Set numRows
         **/
        public void setNumRows(Integer numRows) {
            this.numRows = numRows;
        }

        public TableDataQueryParam numRows(Integer numRows) {
            this.numRows = numRows;
            return this;
        }

        /**
         * Get numCols
         *
         * @return numCols
         **/
        @JsonProperty("num_cols")
        public Integer getNumCols() {
            return numCols;
        }

        /**
         * Set numCols
         **/
        public void setNumCols(Integer numCols) {
            this.numCols = numCols;
        }

        public TableDataQueryParam numCols(Integer numCols) {
            this.numCols = numCols;
            return this;
        }

        /**
         * grid.
         *
         * @return grid
         **/
        @JsonProperty("grid")
        public List<List<TableCell>> getGrid() {
            return grid;
        }

        /**
         * Set grid
         **/
        public void setGrid(List<List<TableCell>> grid) {
            this.grid = grid;
        }

        public TableDataQueryParam grid(List<List<TableCell>> grid) {
            this.grid = grid;
            return this;
        }

        public TableDataQueryParam addGridItem(List<TableCell> gridItem) {
            this.grid.add(gridItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TableDataQueryParam {\n");

            sb.append("    tableCells: ").append(toIndentedString(tableCells)).append("\n");
            sb.append("    numRows: ").append(toIndentedString(numRows)).append("\n");
            sb.append("    numCols: ").append(toIndentedString(numCols)).append("\n");
            sb.append("    grid: ").append(toIndentedString(grid)).append("\n");
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

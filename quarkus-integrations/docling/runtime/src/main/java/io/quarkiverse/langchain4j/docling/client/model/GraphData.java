package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GraphData.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class GraphData {

    private List<GraphCell> cells;
    private List<GraphLink> links;

    /**
     * Get cells
     *
     * @return cells
     **/
    @JsonProperty("cells")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<GraphCell> getCells() {
        return cells;
    }

    /**
     * Set cells
     **/
    public void setCells(List<GraphCell> cells) {
        this.cells = cells;
    }

    public GraphData cells(List<GraphCell> cells) {
        this.cells = cells;
        return this;
    }

    public GraphData addCellsItem(GraphCell cellsItem) {
        if (this.cells == null) {
            cells = new ArrayList<>();
        }
        this.cells.add(cellsItem);
        return this;
    }

    /**
     * Get links
     *
     * @return links
     **/
    @JsonProperty("links")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<GraphLink> getLinks() {
        return links;
    }

    /**
     * Set links
     **/
    public void setLinks(List<GraphLink> links) {
        this.links = links;
    }

    public GraphData links(List<GraphLink> links) {
        this.links = links;
        return this;
    }

    public GraphData addLinksItem(GraphLink linksItem) {
        if (this.links == null) {
            links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GraphData {\n");

        sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code GraphData} object that
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

        GraphData model = (GraphData) obj;

        return java.util.Objects.equals(cells, model.cells) &&
                java.util.Objects.equals(links, model.links);
    }

    /**
     * Returns a hash code for a {@code GraphData}.
     *
     * @return a hash code value for a {@code GraphData}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(cells,
                links);
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
     * GraphData.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class GraphDataQueryParam {

        /**
         * GraphData.
         **/
        @jakarta.ws.rs.QueryParam("cells")
        private List<GraphCell> cells = null;
        /**
         * GraphData.
         **/
        @jakarta.ws.rs.QueryParam("links")
        private List<GraphLink> links = null;

        /**
         * Get cells
         *
         * @return cells
         **/
        @JsonProperty("cells")
        public List<GraphCell> getCells() {
            return cells;
        }

        /**
         * Set cells
         **/
        public void setCells(List<GraphCell> cells) {
            this.cells = cells;
        }

        public GraphDataQueryParam cells(List<GraphCell> cells) {
            this.cells = cells;
            return this;
        }

        public GraphDataQueryParam addCellsItem(GraphCell cellsItem) {
            this.cells.add(cellsItem);
            return this;
        }

        /**
         * Get links
         *
         * @return links
         **/
        @JsonProperty("links")
        public List<GraphLink> getLinks() {
            return links;
        }

        /**
         * Set links
         **/
        public void setLinks(List<GraphLink> links) {
            this.links = links;
        }

        public GraphDataQueryParam links(List<GraphLink> links) {
            this.links = links;
            return this;
        }

        public GraphDataQueryParam addLinksItem(GraphLink linksItem) {
            this.links.add(linksItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GraphDataQueryParam {\n");

            sb.append("    cells: ").append(toIndentedString(cells)).append("\n");
            sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

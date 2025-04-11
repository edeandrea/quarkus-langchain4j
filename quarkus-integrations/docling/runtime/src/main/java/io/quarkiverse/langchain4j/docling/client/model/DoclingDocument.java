package io.quarkiverse.langchain4j.docling.client.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * DoclingDocument.
 **/
@JsonIgnoreProperties(ignoreUnknown = true)
public class DoclingDocument {

    public enum SchemaNameEnum {
        DOCLINGDOCUMENT(String.valueOf("DoclingDocument"));

        // caching enum access
        private static final java.util.EnumSet<SchemaNameEnum> values = java.util.EnumSet.allOf(SchemaNameEnum.class);

        String value;

        SchemaNameEnum(String v) {
            value = v;
        }

        @JsonValue
        public String value() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SchemaNameEnum fromString(String v) {
            for (SchemaNameEnum b : values) {
                if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + v + "'");
        }
    }

    private SchemaNameEnum schemaName = SchemaNameEnum.DOCLINGDOCUMENT;
    private String version = "1.3.0";
    private String name;
    private DocumentOrigin origin;
    private GroupItem furniture;
    private GroupItem body;
    private List<DoclingDocumentGroupsInner> groups;
    private List<DoclingDocumentTextsInner> texts;
    private List<PictureItem> pictures;
    private List<TableItem> tables;
    private List<KeyValueItem> keyValueItems;
    private List<FormItem> formItems;
    private Map<String, PageItem> pages;

    /**
     * Get schemaName
     *
     * @return schemaName
     **/
    @JsonProperty("schema_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SchemaNameEnum getSchemaName() {
        return schemaName;
    }

    /**
     * Set schemaName
     **/
    public void setSchemaName(SchemaNameEnum schemaName) {
        this.schemaName = schemaName;
    }

    public DoclingDocument schemaName(SchemaNameEnum schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     **/
    @JsonProperty("version")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVersion() {
        return version;
    }

    /**
     * Set version
     **/
    public void setVersion(String version) {
        this.version = version;
    }

    public DoclingDocument version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Set name
     **/
    public void setName(String name) {
        this.name = name;
    }

    public DoclingDocument name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get origin
     *
     * @return origin
     **/
    @JsonProperty("origin")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DocumentOrigin getOrigin() {
        return origin;
    }

    /**
     * Set origin
     **/
    public void setOrigin(DocumentOrigin origin) {
        this.origin = origin;
    }

    public DoclingDocument origin(DocumentOrigin origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get furniture
     *
     * @return furniture
     **/
    @JsonProperty("furniture")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GroupItem getFurniture() {
        return furniture;
    }

    /**
     * Set furniture
     **/
    public void setFurniture(GroupItem furniture) {
        this.furniture = furniture;
    }

    public DoclingDocument furniture(GroupItem furniture) {
        this.furniture = furniture;
        return this;
    }

    /**
     * Get body
     *
     * @return body
     **/
    @JsonProperty("body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GroupItem getBody() {
        return body;
    }

    /**
     * Set body
     **/
    public void setBody(GroupItem body) {
        this.body = body;
    }

    public DoclingDocument body(GroupItem body) {
        this.body = body;
        return this;
    }

    /**
     * Get groups
     *
     * @return groups
     **/
    @JsonProperty("groups")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DoclingDocumentGroupsInner> getGroups() {
        return groups;
    }

    /**
     * Set groups
     **/
    public void setGroups(List<DoclingDocumentGroupsInner> groups) {
        this.groups = groups;
    }

    public DoclingDocument groups(List<DoclingDocumentGroupsInner> groups) {
        this.groups = groups;
        return this;
    }

    public DoclingDocument addGroupsItem(DoclingDocumentGroupsInner groupsItem) {
        if (this.groups == null) {
            groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    /**
     * Get texts
     *
     * @return texts
     **/
    @JsonProperty("texts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DoclingDocumentTextsInner> getTexts() {
        return texts;
    }

    /**
     * Set texts
     **/
    public void setTexts(List<DoclingDocumentTextsInner> texts) {
        this.texts = texts;
    }

    public DoclingDocument texts(List<DoclingDocumentTextsInner> texts) {
        this.texts = texts;
        return this;
    }

    public DoclingDocument addTextsItem(DoclingDocumentTextsInner textsItem) {
        if (this.texts == null) {
            texts = new ArrayList<>();
        }
        this.texts.add(textsItem);
        return this;
    }

    /**
     * Get pictures
     *
     * @return pictures
     **/
    @JsonProperty("pictures")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<PictureItem> getPictures() {
        return pictures;
    }

    /**
     * Set pictures
     **/
    public void setPictures(List<PictureItem> pictures) {
        this.pictures = pictures;
    }

    public DoclingDocument pictures(List<PictureItem> pictures) {
        this.pictures = pictures;
        return this;
    }

    public DoclingDocument addPicturesItem(PictureItem picturesItem) {
        if (this.pictures == null) {
            pictures = new ArrayList<>();
        }
        this.pictures.add(picturesItem);
        return this;
    }

    /**
     * Get tables
     *
     * @return tables
     **/
    @JsonProperty("tables")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<TableItem> getTables() {
        return tables;
    }

    /**
     * Set tables
     **/
    public void setTables(List<TableItem> tables) {
        this.tables = tables;
    }

    public DoclingDocument tables(List<TableItem> tables) {
        this.tables = tables;
        return this;
    }

    public DoclingDocument addTablesItem(TableItem tablesItem) {
        if (this.tables == null) {
            tables = new ArrayList<>();
        }
        this.tables.add(tablesItem);
        return this;
    }

    /**
     * Get keyValueItems
     *
     * @return keyValueItems
     **/
    @JsonProperty("key_value_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<KeyValueItem> getKeyValueItems() {
        return keyValueItems;
    }

    /**
     * Set keyValueItems
     **/
    public void setKeyValueItems(List<KeyValueItem> keyValueItems) {
        this.keyValueItems = keyValueItems;
    }

    public DoclingDocument keyValueItems(List<KeyValueItem> keyValueItems) {
        this.keyValueItems = keyValueItems;
        return this;
    }

    public DoclingDocument addKeyValueItemsItem(KeyValueItem keyValueItemsItem) {
        if (this.keyValueItems == null) {
            keyValueItems = new ArrayList<>();
        }
        this.keyValueItems.add(keyValueItemsItem);
        return this;
    }

    /**
     * Get formItems
     *
     * @return formItems
     **/
    @JsonProperty("form_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<FormItem> getFormItems() {
        return formItems;
    }

    /**
     * Set formItems
     **/
    public void setFormItems(List<FormItem> formItems) {
        this.formItems = formItems;
    }

    public DoclingDocument formItems(List<FormItem> formItems) {
        this.formItems = formItems;
        return this;
    }

    public DoclingDocument addFormItemsItem(FormItem formItemsItem) {
        if (this.formItems == null) {
            formItems = new ArrayList<>();
        }
        this.formItems.add(formItemsItem);
        return this;
    }

    /**
     * Get pages
     *
     * @return pages
     **/
    @JsonProperty("pages")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, PageItem> getPages() {
        return pages;
    }

    /**
     * Set pages
     **/
    public void setPages(Map<String, PageItem> pages) {
        this.pages = pages;
    }

    public DoclingDocument pages(Map<String, PageItem> pages) {
        this.pages = pages;
        return this;
    }

    public DoclingDocument putPagesItem(String key, PageItem pagesItem) {
        if (this.pages == null) {
            pages = new HashMap<>();
        }
        this.pages.put(key, pagesItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DoclingDocument {\n");

        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
        sb.append("    furniture: ").append(toIndentedString(furniture)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    texts: ").append(toIndentedString(texts)).append("\n");
        sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
        sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
        sb.append("    keyValueItems: ").append(toIndentedString(keyValueItems)).append("\n");
        sb.append("    formItems: ").append(toIndentedString(formItems)).append("\n");
        sb.append("    pages: ").append(toIndentedString(pages)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code DoclingDocument} object that
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

        DoclingDocument model = (DoclingDocument) obj;

        return java.util.Objects.equals(schemaName, model.schemaName) &&
                java.util.Objects.equals(version, model.version) &&
                java.util.Objects.equals(name, model.name) &&
                java.util.Objects.equals(origin, model.origin) &&
                java.util.Objects.equals(furniture, model.furniture) &&
                java.util.Objects.equals(body, model.body) &&
                java.util.Objects.equals(groups, model.groups) &&
                java.util.Objects.equals(texts, model.texts) &&
                java.util.Objects.equals(pictures, model.pictures) &&
                java.util.Objects.equals(tables, model.tables) &&
                java.util.Objects.equals(keyValueItems, model.keyValueItems) &&
                java.util.Objects.equals(formItems, model.formItems) &&
                java.util.Objects.equals(pages, model.pages);
    }

    /**
     * Returns a hash code for a {@code DoclingDocument}.
     *
     * @return a hash code value for a {@code DoclingDocument}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(schemaName,
                version,
                name,
                origin,
                furniture,
                body,
                groups,
                texts,
                pictures,
                tables,
                keyValueItems,
                formItems,
                pages);
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
     * DoclingDocument.
     **/
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DoclingDocumentQueryParam {

        public enum SchemaNameEnum {
            DOCLINGDOCUMENT(String.valueOf("DoclingDocument"));

            // caching enum access
            private static final java.util.EnumSet<SchemaNameEnum> values = java.util.EnumSet.allOf(SchemaNameEnum.class);

            String value;

            SchemaNameEnum(String v) {
                value = v;
            }

            @JsonValue
            public String value() {
                return value;
            }

            @Override
            public String toString() {
                return String.valueOf(value);
            }

            @JsonCreator
            public static SchemaNameEnum fromString(String v) {
                for (SchemaNameEnum b : values) {
                    if (String.valueOf(b.value).equalsIgnoreCase(v)) {
                        return b;
                    }
                }
                throw new IllegalArgumentException("Unexpected value '" + v + "'");
            }
        }

        /**
         * DoclingDocument.
         **/
        private SchemaNameEnum schemaName = SchemaNameEnum.DOCLINGDOCUMENT;
        /**
         * DoclingDocument.
         **/
        @jakarta.ws.rs.QueryParam("version")
        private String version = "1.3.0";
        /**
         * DoclingDocument.
         **/
        @jakarta.ws.rs.QueryParam("name")
        private String name;
        /**
         * DoclingDocument.
         **/
        @jakarta.ws.rs.QueryParam("origin")
        private DocumentOrigin origin;
        /**
         * DoclingDocument.
         **/
        @jakarta.ws.rs.QueryParam("furniture")
        private GroupItem furniture;
        /**
         * DoclingDocument.
         **/
        @jakarta.ws.rs.QueryParam("body")
        private GroupItem body;
        /**
         * DoclingDocument.
         **/
        @jakarta.ws.rs.QueryParam("groups")
        private List<DoclingDocumentGroupsInner> groups = null;
        /**
         * DoclingDocument.
         **/
        @jakarta.ws.rs.QueryParam("texts")
        private List<DoclingDocumentTextsInner> texts = null;
        /**
         * DoclingDocument.
         **/
        @jakarta.ws.rs.QueryParam("pictures")
        private List<PictureItem> pictures = null;
        /**
         * DoclingDocument.
         **/
        @jakarta.ws.rs.QueryParam("tables")
        private List<TableItem> tables = null;
        /**
         * DoclingDocument.
         **/
        @jakarta.ws.rs.QueryParam("keyValueItems")
        private List<KeyValueItem> keyValueItems = null;
        /**
         * DoclingDocument.
         **/
        @jakarta.ws.rs.QueryParam("formItems")
        private List<FormItem> formItems = null;
        /**
         * DoclingDocument.
         **/
        @jakarta.ws.rs.QueryParam("pages")
        private Map<String, PageItem> pages = null;

        /**
         * Get schemaName
         *
         * @return schemaName
         **/
        @JsonProperty("schema_name")
        public SchemaNameEnum getSchemaName() {
            return schemaName;
        }

        /**
         * Set schemaName
         **/
        public void setSchemaName(SchemaNameEnum schemaName) {
            this.schemaName = schemaName;
        }

        public DoclingDocumentQueryParam schemaName(SchemaNameEnum schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * Get version
         *
         * @return version
         **/
        @JsonProperty("version")
        public String getVersion() {
            return version;
        }

        /**
         * Set version
         **/
        public void setVersion(String version) {
            this.version = version;
        }

        public DoclingDocumentQueryParam version(String version) {
            this.version = version;
            return this;
        }

        /**
         * Get name
         *
         * @return name
         **/
        @JsonProperty("name")
        public String getName() {
            return name;
        }

        /**
         * Set name
         **/
        public void setName(String name) {
            this.name = name;
        }

        public DoclingDocumentQueryParam name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Get origin
         *
         * @return origin
         **/
        @JsonProperty("origin")
        public DocumentOrigin getOrigin() {
            return origin;
        }

        /**
         * Set origin
         **/
        public void setOrigin(DocumentOrigin origin) {
            this.origin = origin;
        }

        public DoclingDocumentQueryParam origin(DocumentOrigin origin) {
            this.origin = origin;
            return this;
        }

        /**
         * Get furniture
         *
         * @return furniture
         **/
        @JsonProperty("furniture")
        public GroupItem getFurniture() {
            return furniture;
        }

        /**
         * Set furniture
         **/
        public void setFurniture(GroupItem furniture) {
            this.furniture = furniture;
        }

        public DoclingDocumentQueryParam furniture(GroupItem furniture) {
            this.furniture = furniture;
            return this;
        }

        /**
         * Get body
         *
         * @return body
         **/
        @JsonProperty("body")
        public GroupItem getBody() {
            return body;
        }

        /**
         * Set body
         **/
        public void setBody(GroupItem body) {
            this.body = body;
        }

        public DoclingDocumentQueryParam body(GroupItem body) {
            this.body = body;
            return this;
        }

        /**
         * Get groups
         *
         * @return groups
         **/
        @JsonProperty("groups")
        public List<DoclingDocumentGroupsInner> getGroups() {
            return groups;
        }

        /**
         * Set groups
         **/
        public void setGroups(List<DoclingDocumentGroupsInner> groups) {
            this.groups = groups;
        }

        public DoclingDocumentQueryParam groups(List<DoclingDocumentGroupsInner> groups) {
            this.groups = groups;
            return this;
        }

        public DoclingDocumentQueryParam addGroupsItem(DoclingDocumentGroupsInner groupsItem) {
            this.groups.add(groupsItem);
            return this;
        }

        /**
         * Get texts
         *
         * @return texts
         **/
        @JsonProperty("texts")
        public List<DoclingDocumentTextsInner> getTexts() {
            return texts;
        }

        /**
         * Set texts
         **/
        public void setTexts(List<DoclingDocumentTextsInner> texts) {
            this.texts = texts;
        }

        public DoclingDocumentQueryParam texts(List<DoclingDocumentTextsInner> texts) {
            this.texts = texts;
            return this;
        }

        public DoclingDocumentQueryParam addTextsItem(DoclingDocumentTextsInner textsItem) {
            this.texts.add(textsItem);
            return this;
        }

        /**
         * Get pictures
         *
         * @return pictures
         **/
        @JsonProperty("pictures")
        public List<PictureItem> getPictures() {
            return pictures;
        }

        /**
         * Set pictures
         **/
        public void setPictures(List<PictureItem> pictures) {
            this.pictures = pictures;
        }

        public DoclingDocumentQueryParam pictures(List<PictureItem> pictures) {
            this.pictures = pictures;
            return this;
        }

        public DoclingDocumentQueryParam addPicturesItem(PictureItem picturesItem) {
            this.pictures.add(picturesItem);
            return this;
        }

        /**
         * Get tables
         *
         * @return tables
         **/
        @JsonProperty("tables")
        public List<TableItem> getTables() {
            return tables;
        }

        /**
         * Set tables
         **/
        public void setTables(List<TableItem> tables) {
            this.tables = tables;
        }

        public DoclingDocumentQueryParam tables(List<TableItem> tables) {
            this.tables = tables;
            return this;
        }

        public DoclingDocumentQueryParam addTablesItem(TableItem tablesItem) {
            this.tables.add(tablesItem);
            return this;
        }

        /**
         * Get keyValueItems
         *
         * @return keyValueItems
         **/
        @JsonProperty("key_value_items")
        public List<KeyValueItem> getKeyValueItems() {
            return keyValueItems;
        }

        /**
         * Set keyValueItems
         **/
        public void setKeyValueItems(List<KeyValueItem> keyValueItems) {
            this.keyValueItems = keyValueItems;
        }

        public DoclingDocumentQueryParam keyValueItems(List<KeyValueItem> keyValueItems) {
            this.keyValueItems = keyValueItems;
            return this;
        }

        public DoclingDocumentQueryParam addKeyValueItemsItem(KeyValueItem keyValueItemsItem) {
            this.keyValueItems.add(keyValueItemsItem);
            return this;
        }

        /**
         * Get formItems
         *
         * @return formItems
         **/
        @JsonProperty("form_items")
        public List<FormItem> getFormItems() {
            return formItems;
        }

        /**
         * Set formItems
         **/
        public void setFormItems(List<FormItem> formItems) {
            this.formItems = formItems;
        }

        public DoclingDocumentQueryParam formItems(List<FormItem> formItems) {
            this.formItems = formItems;
            return this;
        }

        public DoclingDocumentQueryParam addFormItemsItem(FormItem formItemsItem) {
            this.formItems.add(formItemsItem);
            return this;
        }

        /**
         * Get pages
         *
         * @return pages
         **/
        @JsonProperty("pages")
        public Map<String, PageItem> getPages() {
            return pages;
        }

        /**
         * Set pages
         **/
        public void setPages(Map<String, PageItem> pages) {
            this.pages = pages;
        }

        public DoclingDocumentQueryParam pages(Map<String, PageItem> pages) {
            this.pages = pages;
            return this;
        }

        public DoclingDocumentQueryParam putPagesItem(String key, PageItem pagesItem) {
            this.pages.put(key, pagesItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DoclingDocumentQueryParam {\n");

            sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
            sb.append("    version: ").append(toIndentedString(version)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
            sb.append("    furniture: ").append(toIndentedString(furniture)).append("\n");
            sb.append("    body: ").append(toIndentedString(body)).append("\n");
            sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
            sb.append("    texts: ").append(toIndentedString(texts)).append("\n");
            sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
            sb.append("    tables: ").append(toIndentedString(tables)).append("\n");
            sb.append("    keyValueItems: ").append(toIndentedString(keyValueItems)).append("\n");
            sb.append("    formItems: ").append(toIndentedString(formItems)).append("\n");
            sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

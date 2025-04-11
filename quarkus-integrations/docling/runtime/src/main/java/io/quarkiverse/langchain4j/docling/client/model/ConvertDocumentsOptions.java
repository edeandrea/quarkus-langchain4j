package io.quarkiverse.langchain4j.docling.client.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConvertDocumentsOptions {

    /**
     * Input format(s) to convert from. String or list of strings. Allowed values: docx, pptx, html, image, pdf, asciidoc, md,
     * csv, xlsx, xml_uspto, xml_jats, json_docling. Optional, defaults to all formats.
     **/
    private List<InputFormat> fromFormats;
    /**
     * Output format(s) to convert to. String or list of strings. Allowed values: md, json, html, text, doctags. Optional,
     * defaults to Markdown.
     **/
    private List<OutputFormat> toFormats;
    /**
     * Image export mode for the document (in case of JSON, Markdown or HTML). Allowed values: placeholder, embedded,
     * referenced. Optional, defaults to Embedded.
     **/
    private ImageRefMode imageExportMode;
    /**
     * If enabled, the bitmap content will be processed using OCR. Boolean. Optional, defaults to true
     **/
    private Boolean doOcr = true;
    /**
     * If enabled, replace existing text with OCR-generated text over content. Boolean. Optional, defaults to false.
     **/
    private Boolean forceOcr = false;
    /**
     * The OCR engine to use. String. Allowed values: easyocr, ocrmac, rapidocr, tesserocr, tesseract. Optional, defaults to
     * easyocr.
     **/
    private OcrEnginesEnum ocrEngine;
    private List<String> ocrLang;
    /**
     * The PDF backend to use. String. Allowed values: pypdfium2, dlparse_v1, dlparse_v2, dlparse_v4. Optional, defaults to
     * dlparse_v4.
     **/
    private PdfBackend pdfBackend;
    /**
     * Mode to use for table structure, String. Allowed values: fast, accurate. Optional, defaults to fast.
     **/
    private TableFormerMode tableMode;
    /**
     * Abort on error if enabled. Boolean. Optional, defaults to false.
     **/
    private Boolean abortOnError = false;
    /**
     * Return the output as a zip file (will happen anyway if multiple files are generated). Boolean. Optional, defaults to
     * false.
     **/
    private Boolean returnAsFile = false;
    /**
     * If enabled, the table structure will be extracted. Boolean. Optional, defaults to true.
     **/
    private Boolean doTableStructure = true;
    /**
     * If enabled, images will be extracted from the document. Boolean. Optional, defaults to true.
     **/
    private Boolean includeImages = true;
    /**
     * Scale factor for images. Float. Optional, defaults to 2.0.
     **/
    private BigDecimal imagesScale = new BigDecimal("2");
    /**
     * If enabled, perform OCR code enrichment. Boolean. Optional, defaults to false.
     **/
    private Boolean doCodeEnrichment = false;
    /**
     * If enabled, perform formula OCR, return Latex code. Boolean. Optional, defaults to false.
     **/
    private Boolean doFormulaEnrichment = false;
    /**
     * If enabled, classify pictures in documents. Boolean. Optional, defaults to false.
     **/
    private Boolean doPictureClassification = false;
    /**
     * If enabled, describe pictures in documents. Boolean. Optional, defaults to false.
     **/
    private Boolean doPictureDescription = false;

    /**
     * Input format(s) to convert from. String or list of strings. Allowed values: docx, pptx, html, image, pdf, asciidoc, md,
     * csv, xlsx, xml_uspto, xml_jats, json_docling. Optional, defaults to all formats.
     *
     * @return fromFormats
     **/
    @JsonProperty("from_formats")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<InputFormat> getFromFormats() {
        return fromFormats;
    }

    /**
     * Set fromFormats
     **/
    public void setFromFormats(List<InputFormat> fromFormats) {
        this.fromFormats = fromFormats;
    }

    public ConvertDocumentsOptions fromFormats(List<InputFormat> fromFormats) {
        this.fromFormats = fromFormats;
        return this;
    }

    public ConvertDocumentsOptions addFromFormatsItem(InputFormat fromFormatsItem) {
        if (this.fromFormats == null) {
            fromFormats = new ArrayList<>(Arrays.asList(InputFormat.DOCX, InputFormat.PPTX, InputFormat.HTML, InputFormat.IMAGE,
                    InputFormat.PDF, InputFormat.ASCIIDOC, InputFormat.MD, InputFormat.CSV, InputFormat.XLSX,
                    InputFormat.XML_USPTO, InputFormat.XML_JATS, InputFormat.JSON_DOCLING));
        }
        this.fromFormats.add(fromFormatsItem);
        return this;
    }

    /**
     * Output format(s) to convert to. String or list of strings. Allowed values: md, json, html, text, doctags. Optional,
     * defaults to Markdown.
     *
     * @return toFormats
     **/
    @JsonProperty("to_formats")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OutputFormat> getToFormats() {
        return toFormats;
    }

    /**
     * Set toFormats
     **/
    public void setToFormats(List<OutputFormat> toFormats) {
        this.toFormats = toFormats;
    }

    public ConvertDocumentsOptions toFormats(List<OutputFormat> toFormats) {
        this.toFormats = toFormats;
        return this;
    }

    public ConvertDocumentsOptions addToFormatsItem(OutputFormat toFormatsItem) {
        if (this.toFormats == null) {
            toFormats = new ArrayList<>(Arrays.asList(OutputFormat.MD));
        }
        this.toFormats.add(toFormatsItem);
        return this;
    }

    /**
     * Image export mode for the document (in case of JSON, Markdown or HTML). Allowed values: placeholder, embedded,
     * referenced. Optional, defaults to Embedded.
     *
     * @return imageExportMode
     **/
    @JsonProperty("image_export_mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ImageRefMode getImageExportMode() {
        return imageExportMode;
    }

    /**
     * Set imageExportMode
     **/
    public void setImageExportMode(ImageRefMode imageExportMode) {
        this.imageExportMode = imageExportMode;
    }

    public ConvertDocumentsOptions imageExportMode(ImageRefMode imageExportMode) {
        this.imageExportMode = imageExportMode;
        return this;
    }

    /**
     * If enabled, the bitmap content will be processed using OCR. Boolean. Optional, defaults to true
     *
     * @return doOcr
     **/
    @JsonProperty("do_ocr")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDoOcr() {
        return doOcr;
    }

    /**
     * Set doOcr
     **/
    public void setDoOcr(Boolean doOcr) {
        this.doOcr = doOcr;
    }

    public ConvertDocumentsOptions doOcr(Boolean doOcr) {
        this.doOcr = doOcr;
        return this;
    }

    /**
     * If enabled, replace existing text with OCR-generated text over content. Boolean. Optional, defaults to false.
     *
     * @return forceOcr
     **/
    @JsonProperty("force_ocr")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getForceOcr() {
        return forceOcr;
    }

    /**
     * Set forceOcr
     **/
    public void setForceOcr(Boolean forceOcr) {
        this.forceOcr = forceOcr;
    }

    public ConvertDocumentsOptions forceOcr(Boolean forceOcr) {
        this.forceOcr = forceOcr;
        return this;
    }

    /**
     * The OCR engine to use. String. Allowed values: easyocr, ocrmac, rapidocr, tesserocr, tesseract. Optional, defaults to
     * easyocr.
     *
     * @return ocrEngine
     **/
    @JsonProperty("ocr_engine")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OcrEnginesEnum getOcrEngine() {
        return ocrEngine;
    }

    /**
     * Set ocrEngine
     **/
    public void setOcrEngine(OcrEnginesEnum ocrEngine) {
        this.ocrEngine = ocrEngine;
    }

    public ConvertDocumentsOptions ocrEngine(OcrEnginesEnum ocrEngine) {
        this.ocrEngine = ocrEngine;
        return this;
    }

    /**
     * Get ocrLang
     *
     * @return ocrLang
     **/
    @JsonProperty("ocr_lang")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getOcrLang() {
        return ocrLang;
    }

    /**
     * Set ocrLang
     **/
    public void setOcrLang(List<String> ocrLang) {
        this.ocrLang = ocrLang;
    }

    public ConvertDocumentsOptions ocrLang(List<String> ocrLang) {
        this.ocrLang = ocrLang;
        return this;
    }

    public ConvertDocumentsOptions addOcrLangItem(String ocrLangItem) {
        if (this.ocrLang == null) {
            ocrLang = new ArrayList<>();
        }
        this.ocrLang.add(ocrLangItem);
        return this;
    }

    /**
     * The PDF backend to use. String. Allowed values: pypdfium2, dlparse_v1, dlparse_v2, dlparse_v4. Optional, defaults to
     * dlparse_v4.
     *
     * @return pdfBackend
     **/
    @JsonProperty("pdf_backend")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PdfBackend getPdfBackend() {
        return pdfBackend;
    }

    /**
     * Set pdfBackend
     **/
    public void setPdfBackend(PdfBackend pdfBackend) {
        this.pdfBackend = pdfBackend;
    }

    public ConvertDocumentsOptions pdfBackend(PdfBackend pdfBackend) {
        this.pdfBackend = pdfBackend;
        return this;
    }

    /**
     * Mode to use for table structure, String. Allowed values: fast, accurate. Optional, defaults to fast.
     *
     * @return tableMode
     **/
    @JsonProperty("table_mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TableFormerMode getTableMode() {
        return tableMode;
    }

    /**
     * Set tableMode
     **/
    public void setTableMode(TableFormerMode tableMode) {
        this.tableMode = tableMode;
    }

    public ConvertDocumentsOptions tableMode(TableFormerMode tableMode) {
        this.tableMode = tableMode;
        return this;
    }

    /**
     * Abort on error if enabled. Boolean. Optional, defaults to false.
     *
     * @return abortOnError
     **/
    @JsonProperty("abort_on_error")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAbortOnError() {
        return abortOnError;
    }

    /**
     * Set abortOnError
     **/
    public void setAbortOnError(Boolean abortOnError) {
        this.abortOnError = abortOnError;
    }

    public ConvertDocumentsOptions abortOnError(Boolean abortOnError) {
        this.abortOnError = abortOnError;
        return this;
    }

    /**
     * Return the output as a zip file (will happen anyway if multiple files are generated). Boolean. Optional, defaults to
     * false.
     *
     * @return returnAsFile
     **/
    @JsonProperty("return_as_file")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getReturnAsFile() {
        return returnAsFile;
    }

    /**
     * Set returnAsFile
     **/
    public void setReturnAsFile(Boolean returnAsFile) {
        this.returnAsFile = returnAsFile;
    }

    public ConvertDocumentsOptions returnAsFile(Boolean returnAsFile) {
        this.returnAsFile = returnAsFile;
        return this;
    }

    /**
     * If enabled, the table structure will be extracted. Boolean. Optional, defaults to true.
     *
     * @return doTableStructure
     **/
    @JsonProperty("do_table_structure")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDoTableStructure() {
        return doTableStructure;
    }

    /**
     * Set doTableStructure
     **/
    public void setDoTableStructure(Boolean doTableStructure) {
        this.doTableStructure = doTableStructure;
    }

    public ConvertDocumentsOptions doTableStructure(Boolean doTableStructure) {
        this.doTableStructure = doTableStructure;
        return this;
    }

    /**
     * If enabled, images will be extracted from the document. Boolean. Optional, defaults to true.
     *
     * @return includeImages
     **/
    @JsonProperty("include_images")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIncludeImages() {
        return includeImages;
    }

    /**
     * Set includeImages
     **/
    public void setIncludeImages(Boolean includeImages) {
        this.includeImages = includeImages;
    }

    public ConvertDocumentsOptions includeImages(Boolean includeImages) {
        this.includeImages = includeImages;
        return this;
    }

    /**
     * Scale factor for images. Float. Optional, defaults to 2.0.
     *
     * @return imagesScale
     **/
    @JsonProperty("images_scale")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BigDecimal getImagesScale() {
        return imagesScale;
    }

    /**
     * Set imagesScale
     **/
    public void setImagesScale(BigDecimal imagesScale) {
        this.imagesScale = imagesScale;
    }

    public ConvertDocumentsOptions imagesScale(BigDecimal imagesScale) {
        this.imagesScale = imagesScale;
        return this;
    }

    /**
     * If enabled, perform OCR code enrichment. Boolean. Optional, defaults to false.
     *
     * @return doCodeEnrichment
     **/
    @JsonProperty("do_code_enrichment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDoCodeEnrichment() {
        return doCodeEnrichment;
    }

    /**
     * Set doCodeEnrichment
     **/
    public void setDoCodeEnrichment(Boolean doCodeEnrichment) {
        this.doCodeEnrichment = doCodeEnrichment;
    }

    public ConvertDocumentsOptions doCodeEnrichment(Boolean doCodeEnrichment) {
        this.doCodeEnrichment = doCodeEnrichment;
        return this;
    }

    /**
     * If enabled, perform formula OCR, return Latex code. Boolean. Optional, defaults to false.
     *
     * @return doFormulaEnrichment
     **/
    @JsonProperty("do_formula_enrichment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDoFormulaEnrichment() {
        return doFormulaEnrichment;
    }

    /**
     * Set doFormulaEnrichment
     **/
    public void setDoFormulaEnrichment(Boolean doFormulaEnrichment) {
        this.doFormulaEnrichment = doFormulaEnrichment;
    }

    public ConvertDocumentsOptions doFormulaEnrichment(Boolean doFormulaEnrichment) {
        this.doFormulaEnrichment = doFormulaEnrichment;
        return this;
    }

    /**
     * If enabled, classify pictures in documents. Boolean. Optional, defaults to false.
     *
     * @return doPictureClassification
     **/
    @JsonProperty("do_picture_classification")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDoPictureClassification() {
        return doPictureClassification;
    }

    /**
     * Set doPictureClassification
     **/
    public void setDoPictureClassification(Boolean doPictureClassification) {
        this.doPictureClassification = doPictureClassification;
    }

    public ConvertDocumentsOptions doPictureClassification(Boolean doPictureClassification) {
        this.doPictureClassification = doPictureClassification;
        return this;
    }

    /**
     * If enabled, describe pictures in documents. Boolean. Optional, defaults to false.
     *
     * @return doPictureDescription
     **/
    @JsonProperty("do_picture_description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDoPictureDescription() {
        return doPictureDescription;
    }

    /**
     * Set doPictureDescription
     **/
    public void setDoPictureDescription(Boolean doPictureDescription) {
        this.doPictureDescription = doPictureDescription;
    }

    public ConvertDocumentsOptions doPictureDescription(Boolean doPictureDescription) {
        this.doPictureDescription = doPictureDescription;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConvertDocumentsOptions {\n");

        sb.append("    fromFormats: ").append(toIndentedString(fromFormats)).append("\n");
        sb.append("    toFormats: ").append(toIndentedString(toFormats)).append("\n");
        sb.append("    imageExportMode: ").append(toIndentedString(imageExportMode)).append("\n");
        sb.append("    doOcr: ").append(toIndentedString(doOcr)).append("\n");
        sb.append("    forceOcr: ").append(toIndentedString(forceOcr)).append("\n");
        sb.append("    ocrEngine: ").append(toIndentedString(ocrEngine)).append("\n");
        sb.append("    ocrLang: ").append(toIndentedString(ocrLang)).append("\n");
        sb.append("    pdfBackend: ").append(toIndentedString(pdfBackend)).append("\n");
        sb.append("    tableMode: ").append(toIndentedString(tableMode)).append("\n");
        sb.append("    abortOnError: ").append(toIndentedString(abortOnError)).append("\n");
        sb.append("    returnAsFile: ").append(toIndentedString(returnAsFile)).append("\n");
        sb.append("    doTableStructure: ").append(toIndentedString(doTableStructure)).append("\n");
        sb.append("    includeImages: ").append(toIndentedString(includeImages)).append("\n");
        sb.append("    imagesScale: ").append(toIndentedString(imagesScale)).append("\n");
        sb.append("    doCodeEnrichment: ").append(toIndentedString(doCodeEnrichment)).append("\n");
        sb.append("    doFormulaEnrichment: ").append(toIndentedString(doFormulaEnrichment)).append("\n");
        sb.append("    doPictureClassification: ").append(toIndentedString(doPictureClassification)).append("\n");
        sb.append("    doPictureDescription: ").append(toIndentedString(doPictureDescription)).append("\n");

        sb.append("}");
        return sb.toString();
    }

    /**
     * Compares this object to the specified object. The result is
     * {@code true} if and only if the argument is not
     * {@code null} and is a {@code ConvertDocumentsOptions} object that
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

        ConvertDocumentsOptions model = (ConvertDocumentsOptions) obj;

        return java.util.Objects.equals(fromFormats, model.fromFormats) &&
                java.util.Objects.equals(toFormats, model.toFormats) &&
                java.util.Objects.equals(imageExportMode, model.imageExportMode) &&
                java.util.Objects.equals(doOcr, model.doOcr) &&
                java.util.Objects.equals(forceOcr, model.forceOcr) &&
                java.util.Objects.equals(ocrEngine, model.ocrEngine) &&
                java.util.Objects.equals(ocrLang, model.ocrLang) &&
                java.util.Objects.equals(pdfBackend, model.pdfBackend) &&
                java.util.Objects.equals(tableMode, model.tableMode) &&
                java.util.Objects.equals(abortOnError, model.abortOnError) &&
                java.util.Objects.equals(returnAsFile, model.returnAsFile) &&
                java.util.Objects.equals(doTableStructure, model.doTableStructure) &&
                java.util.Objects.equals(includeImages, model.includeImages) &&
                java.util.Objects.equals(imagesScale, model.imagesScale) &&
                java.util.Objects.equals(doCodeEnrichment, model.doCodeEnrichment) &&
                java.util.Objects.equals(doFormulaEnrichment, model.doFormulaEnrichment) &&
                java.util.Objects.equals(doPictureClassification, model.doPictureClassification) &&
                java.util.Objects.equals(doPictureDescription, model.doPictureDescription);
    }

    /**
     * Returns a hash code for a {@code ConvertDocumentsOptions}.
     *
     * @return a hash code value for a {@code ConvertDocumentsOptions}.
     **/
    @Override
    public int hashCode() {
        return java.util.Objects.hash(fromFormats,
                toFormats,
                imageExportMode,
                doOcr,
                forceOcr,
                ocrEngine,
                ocrLang,
                pdfBackend,
                tableMode,
                abortOnError,
                returnAsFile,
                doTableStructure,
                includeImages,
                imagesScale,
                doCodeEnrichment,
                doFormulaEnrichment,
                doPictureClassification,
                doPictureDescription);
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
    public static class ConvertDocumentsOptionsQueryParam {

        @jakarta.ws.rs.QueryParam("fromFormats")
        private List<InputFormat> fromFormats = null;
        @jakarta.ws.rs.QueryParam("toFormats")
        private List<OutputFormat> toFormats = null;
        @jakarta.ws.rs.QueryParam("imageExportMode")
        private ImageRefMode imageExportMode;
        @jakarta.ws.rs.QueryParam("doOcr")
        private Boolean doOcr = true;
        @jakarta.ws.rs.QueryParam("forceOcr")
        private Boolean forceOcr = false;
        @jakarta.ws.rs.QueryParam("ocrEngine")
        private OcrEnginesEnum ocrEngine;
        @jakarta.ws.rs.QueryParam("ocrLang")
        private List<String> ocrLang = null;
        @jakarta.ws.rs.QueryParam("pdfBackend")
        private PdfBackend pdfBackend;
        @jakarta.ws.rs.QueryParam("tableMode")
        private TableFormerMode tableMode;
        @jakarta.ws.rs.QueryParam("abortOnError")
        private Boolean abortOnError = false;
        @jakarta.ws.rs.QueryParam("returnAsFile")
        private Boolean returnAsFile = false;
        @jakarta.ws.rs.QueryParam("doTableStructure")
        private Boolean doTableStructure = true;
        @jakarta.ws.rs.QueryParam("includeImages")
        private Boolean includeImages = true;
        @jakarta.ws.rs.QueryParam("imagesScale")
        private BigDecimal imagesScale = new BigDecimal("2");
        @jakarta.ws.rs.QueryParam("doCodeEnrichment")
        private Boolean doCodeEnrichment = false;
        @jakarta.ws.rs.QueryParam("doFormulaEnrichment")
        private Boolean doFormulaEnrichment = false;
        @jakarta.ws.rs.QueryParam("doPictureClassification")
        private Boolean doPictureClassification = false;
        @jakarta.ws.rs.QueryParam("doPictureDescription")
        private Boolean doPictureDescription = false;

        /**
         * Input format(s) to convert from. String or list of strings. Allowed values: docx, pptx, html, image, pdf, asciidoc,
         * md, csv, xlsx, xml_uspto, xml_jats, json_docling. Optional, defaults to all formats.
         *
         * @return fromFormats
         **/
        @JsonProperty("from_formats")
        public List<InputFormat> getFromFormats() {
            return fromFormats;
        }

        /**
         * Set fromFormats
         **/
        public void setFromFormats(List<InputFormat> fromFormats) {
            this.fromFormats = fromFormats;
        }

        public ConvertDocumentsOptionsQueryParam fromFormats(List<InputFormat> fromFormats) {
            this.fromFormats = fromFormats;
            return this;
        }

        public ConvertDocumentsOptionsQueryParam addFromFormatsItem(InputFormat fromFormatsItem) {
            this.fromFormats.add(fromFormatsItem);
            return this;
        }

        /**
         * Output format(s) to convert to. String or list of strings. Allowed values: md, json, html, text, doctags. Optional,
         * defaults to Markdown.
         *
         * @return toFormats
         **/
        @JsonProperty("to_formats")
        public List<OutputFormat> getToFormats() {
            return toFormats;
        }

        /**
         * Set toFormats
         **/
        public void setToFormats(List<OutputFormat> toFormats) {
            this.toFormats = toFormats;
        }

        public ConvertDocumentsOptionsQueryParam toFormats(List<OutputFormat> toFormats) {
            this.toFormats = toFormats;
            return this;
        }

        public ConvertDocumentsOptionsQueryParam addToFormatsItem(OutputFormat toFormatsItem) {
            this.toFormats.add(toFormatsItem);
            return this;
        }

        /**
         * Image export mode for the document (in case of JSON, Markdown or HTML). Allowed values: placeholder, embedded,
         * referenced. Optional, defaults to Embedded.
         *
         * @return imageExportMode
         **/
        @JsonProperty("image_export_mode")
        public ImageRefMode getImageExportMode() {
            return imageExportMode;
        }

        /**
         * Set imageExportMode
         **/
        public void setImageExportMode(ImageRefMode imageExportMode) {
            this.imageExportMode = imageExportMode;
        }

        public ConvertDocumentsOptionsQueryParam imageExportMode(ImageRefMode imageExportMode) {
            this.imageExportMode = imageExportMode;
            return this;
        }

        /**
         * If enabled, the bitmap content will be processed using OCR. Boolean. Optional, defaults to true
         *
         * @return doOcr
         **/
        @JsonProperty("do_ocr")
        public Boolean getDoOcr() {
            return doOcr;
        }

        /**
         * Set doOcr
         **/
        public void setDoOcr(Boolean doOcr) {
            this.doOcr = doOcr;
        }

        public ConvertDocumentsOptionsQueryParam doOcr(Boolean doOcr) {
            this.doOcr = doOcr;
            return this;
        }

        /**
         * If enabled, replace existing text with OCR-generated text over content. Boolean. Optional, defaults to false.
         *
         * @return forceOcr
         **/
        @JsonProperty("force_ocr")
        public Boolean getForceOcr() {
            return forceOcr;
        }

        /**
         * Set forceOcr
         **/
        public void setForceOcr(Boolean forceOcr) {
            this.forceOcr = forceOcr;
        }

        public ConvertDocumentsOptionsQueryParam forceOcr(Boolean forceOcr) {
            this.forceOcr = forceOcr;
            return this;
        }

        /**
         * The OCR engine to use. String. Allowed values: easyocr, ocrmac, rapidocr, tesserocr, tesseract. Optional, defaults to
         * easyocr.
         *
         * @return ocrEngine
         **/
        @JsonProperty("ocr_engine")
        public OcrEnginesEnum getOcrEngine() {
            return ocrEngine;
        }

        /**
         * Set ocrEngine
         **/
        public void setOcrEngine(OcrEnginesEnum ocrEngine) {
            this.ocrEngine = ocrEngine;
        }

        public ConvertDocumentsOptionsQueryParam ocrEngine(OcrEnginesEnum ocrEngine) {
            this.ocrEngine = ocrEngine;
            return this;
        }

        /**
         * Get ocrLang
         *
         * @return ocrLang
         **/
        @JsonProperty("ocr_lang")
        public List<String> getOcrLang() {
            return ocrLang;
        }

        /**
         * Set ocrLang
         **/
        public void setOcrLang(List<String> ocrLang) {
            this.ocrLang = ocrLang;
        }

        public ConvertDocumentsOptionsQueryParam ocrLang(List<String> ocrLang) {
            this.ocrLang = ocrLang;
            return this;
        }

        public ConvertDocumentsOptionsQueryParam addOcrLangItem(String ocrLangItem) {
            this.ocrLang.add(ocrLangItem);
            return this;
        }

        /**
         * The PDF backend to use. String. Allowed values: pypdfium2, dlparse_v1, dlparse_v2, dlparse_v4. Optional, defaults to
         * dlparse_v4.
         *
         * @return pdfBackend
         **/
        @JsonProperty("pdf_backend")
        public PdfBackend getPdfBackend() {
            return pdfBackend;
        }

        /**
         * Set pdfBackend
         **/
        public void setPdfBackend(PdfBackend pdfBackend) {
            this.pdfBackend = pdfBackend;
        }

        public ConvertDocumentsOptionsQueryParam pdfBackend(PdfBackend pdfBackend) {
            this.pdfBackend = pdfBackend;
            return this;
        }

        /**
         * Mode to use for table structure, String. Allowed values: fast, accurate. Optional, defaults to fast.
         *
         * @return tableMode
         **/
        @JsonProperty("table_mode")
        public TableFormerMode getTableMode() {
            return tableMode;
        }

        /**
         * Set tableMode
         **/
        public void setTableMode(TableFormerMode tableMode) {
            this.tableMode = tableMode;
        }

        public ConvertDocumentsOptionsQueryParam tableMode(TableFormerMode tableMode) {
            this.tableMode = tableMode;
            return this;
        }

        /**
         * Abort on error if enabled. Boolean. Optional, defaults to false.
         *
         * @return abortOnError
         **/
        @JsonProperty("abort_on_error")
        public Boolean getAbortOnError() {
            return abortOnError;
        }

        /**
         * Set abortOnError
         **/
        public void setAbortOnError(Boolean abortOnError) {
            this.abortOnError = abortOnError;
        }

        public ConvertDocumentsOptionsQueryParam abortOnError(Boolean abortOnError) {
            this.abortOnError = abortOnError;
            return this;
        }

        /**
         * Return the output as a zip file (will happen anyway if multiple files are generated). Boolean. Optional, defaults to
         * false.
         *
         * @return returnAsFile
         **/
        @JsonProperty("return_as_file")
        public Boolean getReturnAsFile() {
            return returnAsFile;
        }

        /**
         * Set returnAsFile
         **/
        public void setReturnAsFile(Boolean returnAsFile) {
            this.returnAsFile = returnAsFile;
        }

        public ConvertDocumentsOptionsQueryParam returnAsFile(Boolean returnAsFile) {
            this.returnAsFile = returnAsFile;
            return this;
        }

        /**
         * If enabled, the table structure will be extracted. Boolean. Optional, defaults to true.
         *
         * @return doTableStructure
         **/
        @JsonProperty("do_table_structure")
        public Boolean getDoTableStructure() {
            return doTableStructure;
        }

        /**
         * Set doTableStructure
         **/
        public void setDoTableStructure(Boolean doTableStructure) {
            this.doTableStructure = doTableStructure;
        }

        public ConvertDocumentsOptionsQueryParam doTableStructure(Boolean doTableStructure) {
            this.doTableStructure = doTableStructure;
            return this;
        }

        /**
         * If enabled, images will be extracted from the document. Boolean. Optional, defaults to true.
         *
         * @return includeImages
         **/
        @JsonProperty("include_images")
        public Boolean getIncludeImages() {
            return includeImages;
        }

        /**
         * Set includeImages
         **/
        public void setIncludeImages(Boolean includeImages) {
            this.includeImages = includeImages;
        }

        public ConvertDocumentsOptionsQueryParam includeImages(Boolean includeImages) {
            this.includeImages = includeImages;
            return this;
        }

        /**
         * Scale factor for images. Float. Optional, defaults to 2.0.
         *
         * @return imagesScale
         **/
        @JsonProperty("images_scale")
        public BigDecimal getImagesScale() {
            return imagesScale;
        }

        /**
         * Set imagesScale
         **/
        public void setImagesScale(BigDecimal imagesScale) {
            this.imagesScale = imagesScale;
        }

        public ConvertDocumentsOptionsQueryParam imagesScale(BigDecimal imagesScale) {
            this.imagesScale = imagesScale;
            return this;
        }

        /**
         * If enabled, perform OCR code enrichment. Boolean. Optional, defaults to false.
         *
         * @return doCodeEnrichment
         **/
        @JsonProperty("do_code_enrichment")
        public Boolean getDoCodeEnrichment() {
            return doCodeEnrichment;
        }

        /**
         * Set doCodeEnrichment
         **/
        public void setDoCodeEnrichment(Boolean doCodeEnrichment) {
            this.doCodeEnrichment = doCodeEnrichment;
        }

        public ConvertDocumentsOptionsQueryParam doCodeEnrichment(Boolean doCodeEnrichment) {
            this.doCodeEnrichment = doCodeEnrichment;
            return this;
        }

        /**
         * If enabled, perform formula OCR, return Latex code. Boolean. Optional, defaults to false.
         *
         * @return doFormulaEnrichment
         **/
        @JsonProperty("do_formula_enrichment")
        public Boolean getDoFormulaEnrichment() {
            return doFormulaEnrichment;
        }

        /**
         * Set doFormulaEnrichment
         **/
        public void setDoFormulaEnrichment(Boolean doFormulaEnrichment) {
            this.doFormulaEnrichment = doFormulaEnrichment;
        }

        public ConvertDocumentsOptionsQueryParam doFormulaEnrichment(Boolean doFormulaEnrichment) {
            this.doFormulaEnrichment = doFormulaEnrichment;
            return this;
        }

        /**
         * If enabled, classify pictures in documents. Boolean. Optional, defaults to false.
         *
         * @return doPictureClassification
         **/
        @JsonProperty("do_picture_classification")
        public Boolean getDoPictureClassification() {
            return doPictureClassification;
        }

        /**
         * Set doPictureClassification
         **/
        public void setDoPictureClassification(Boolean doPictureClassification) {
            this.doPictureClassification = doPictureClassification;
        }

        public ConvertDocumentsOptionsQueryParam doPictureClassification(Boolean doPictureClassification) {
            this.doPictureClassification = doPictureClassification;
            return this;
        }

        /**
         * If enabled, describe pictures in documents. Boolean. Optional, defaults to false.
         *
         * @return doPictureDescription
         **/
        @JsonProperty("do_picture_description")
        public Boolean getDoPictureDescription() {
            return doPictureDescription;
        }

        /**
         * Set doPictureDescription
         **/
        public void setDoPictureDescription(Boolean doPictureDescription) {
            this.doPictureDescription = doPictureDescription;
        }

        public ConvertDocumentsOptionsQueryParam doPictureDescription(Boolean doPictureDescription) {
            this.doPictureDescription = doPictureDescription;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ConvertDocumentsOptionsQueryParam {\n");

            sb.append("    fromFormats: ").append(toIndentedString(fromFormats)).append("\n");
            sb.append("    toFormats: ").append(toIndentedString(toFormats)).append("\n");
            sb.append("    imageExportMode: ").append(toIndentedString(imageExportMode)).append("\n");
            sb.append("    doOcr: ").append(toIndentedString(doOcr)).append("\n");
            sb.append("    forceOcr: ").append(toIndentedString(forceOcr)).append("\n");
            sb.append("    ocrEngine: ").append(toIndentedString(ocrEngine)).append("\n");
            sb.append("    ocrLang: ").append(toIndentedString(ocrLang)).append("\n");
            sb.append("    pdfBackend: ").append(toIndentedString(pdfBackend)).append("\n");
            sb.append("    tableMode: ").append(toIndentedString(tableMode)).append("\n");
            sb.append("    abortOnError: ").append(toIndentedString(abortOnError)).append("\n");
            sb.append("    returnAsFile: ").append(toIndentedString(returnAsFile)).append("\n");
            sb.append("    doTableStructure: ").append(toIndentedString(doTableStructure)).append("\n");
            sb.append("    includeImages: ").append(toIndentedString(includeImages)).append("\n");
            sb.append("    imagesScale: ").append(toIndentedString(imagesScale)).append("\n");
            sb.append("    doCodeEnrichment: ").append(toIndentedString(doCodeEnrichment)).append("\n");
            sb.append("    doFormulaEnrichment: ").append(toIndentedString(doFormulaEnrichment)).append("\n");
            sb.append("    doPictureClassification: ").append(toIndentedString(doPictureClassification)).append("\n");
            sb.append("    doPictureDescription: ").append(toIndentedString(doPictureDescription)).append("\n");
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

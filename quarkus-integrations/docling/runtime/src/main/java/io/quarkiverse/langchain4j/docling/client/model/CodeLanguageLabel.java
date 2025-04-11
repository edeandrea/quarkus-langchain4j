package io.quarkiverse.langchain4j.docling.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Gets or Sets CodeLanguageLabelCodeLanguageLabel.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public enum CodeLanguageLabel {
    ADA(String.valueOf("Ada")),
    AWK(String.valueOf("Awk")),
    BASH(String.valueOf("Bash")),
    BC(String.valueOf("bc")),
    C(String.valueOf("C")),
    C_HASH(String.valueOf("C#")),
    C_PLUS(String.valueOf("C++")),
    CMAKE(String.valueOf("CMake")),
    COBOL(String.valueOf("COBOL")),
    CSS(String.valueOf("CSS")),
    CEYLON(String.valueOf("Ceylon")),
    CLOJURE(String.valueOf("Clojure")),
    CRYSTAL(String.valueOf("Crystal")),
    CUDA(String.valueOf("Cuda")),
    CYTHON(String.valueOf("Cython")),
    D(String.valueOf("D")),
    DART(String.valueOf("Dart")),
    DC(String.valueOf("dc")),
    DOCKERFILE(String.valueOf("Dockerfile")),
    ELIXIR(String.valueOf("Elixir")),
    ERLANG(String.valueOf("Erlang")),
    FORTRAN(String.valueOf("FORTRAN")),
    FORTH(String.valueOf("Forth")),
    GO(String.valueOf("Go")),
    HTML(String.valueOf("HTML")),
    HASKELL(String.valueOf("Haskell")),
    HAXE(String.valueOf("Haxe")),
    JAVA(String.valueOf("Java")),
    JAVASCRIPT(String.valueOf("JavaScript")),
    JULIA(String.valueOf("Julia")),
    KOTLIN(String.valueOf("Kotlin")),
    LISP(String.valueOf("Lisp")),
    LUA(String.valueOf("Lua")),
    MATLAB(String.valueOf("Matlab")),
    MOONSCRIPT(String.valueOf("MoonScript")),
    NIM(String.valueOf("Nim")),
    OCAML(String.valueOf("OCaml")),
    OBJECTIVEC(String.valueOf("ObjectiveC")),
    OCTAVE(String.valueOf("Octave")),
    PHP(String.valueOf("PHP")),
    PASCAL(String.valueOf("Pascal")),
    PERL(String.valueOf("Perl")),
    PROLOG(String.valueOf("Prolog")),
    PYTHON(String.valueOf("Python")),
    RACKET(String.valueOf("Racket")),
    RUBY(String.valueOf("Ruby")),
    RUST(String.valueOf("Rust")),
    SML(String.valueOf("SML")),
    SQL(String.valueOf("SQL")),
    SCALA(String.valueOf("Scala")),
    SCHEME(String.valueOf("Scheme")),
    SWIFT(String.valueOf("Swift")),
    TYPESCRIPT(String.valueOf("TypeScript")),
    UNKNOWN(String.valueOf("unknown")),
    VISUALBASIC(String.valueOf("VisualBasic")),
    XML(String.valueOf("XML")),
    YAML(String.valueOf("YAML"));

    // caching enum access
    private static final java.util.EnumSet<CodeLanguageLabel> values = java.util.EnumSet.allOf(CodeLanguageLabel.class);

    private String value;

    CodeLanguageLabel(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CodeLanguageLabel fromString(String text) {
        for (CodeLanguageLabel b : values) {
            if (String.valueOf(b.value).equalsIgnoreCase(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

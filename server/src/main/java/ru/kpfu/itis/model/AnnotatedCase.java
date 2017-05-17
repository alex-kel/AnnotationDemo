package ru.kpfu.itis.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.kpfu.itis.utils.AnnotationParser;

import java.util.List;

/**
 * Created by Alex on 16.05.17.
 */
public class AnnotatedCase {

    @JsonProperty("id")
    private String id;

    @JsonProperty("text")
    private String text;

    @JsonProperty("annotations")
    private List<CaseAnnotation> caseAnnotationsList;

    public AnnotatedCase(String id, String text, String annotationsText) {
        this.id = id;
        this.text = text;
        caseAnnotationsList = AnnotationParser.parse(annotationsText);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<CaseAnnotation> getCaseAnnotationsList() {
        return caseAnnotationsList;
    }

    public void setCaseAnnotationsList(List<CaseAnnotation> caseAnnotationsList) {
        this.caseAnnotationsList = caseAnnotationsList;
    }
}

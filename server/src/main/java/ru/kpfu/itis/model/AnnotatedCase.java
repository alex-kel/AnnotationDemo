package ru.kpfu.itis.model;

import ru.kpfu.itis.utils.AnnotationParser;

import java.util.List;

/**
 * Created by Alex on 16.05.17.
 */
public class AnnotatedCase {

    private String text;
    private List<CaseAnnotation> caseAnnotationsList;

    public AnnotatedCase(String text, String annotationsText) {
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

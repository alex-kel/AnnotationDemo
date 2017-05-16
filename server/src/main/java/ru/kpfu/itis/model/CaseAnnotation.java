package ru.kpfu.itis.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 16.05.17.
 */
public class CaseAnnotation {

    private String id;
    private String type;
    private List<OffsetPair> offsets;
    private String annotatedText;

    public CaseAnnotation() {
        offsets = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<OffsetPair> getOffsets() {
        return offsets;
    }

    public void setOffsets(List<OffsetPair> offsets) {
        this.offsets = offsets;
    }

    public String getAnnotatedText() {
        return annotatedText;
    }

    public void setAnnotatedText(String annotatedText) {
        this.annotatedText = annotatedText;
    }
}

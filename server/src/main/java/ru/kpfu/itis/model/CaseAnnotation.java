package ru.kpfu.itis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 16.05.17.
 */
public class CaseAnnotation {

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type;

    @JsonProperty("typeRu")
    private String typeRu;

    @JsonProperty("offsets")
    private List<OffsetPair> offsets;

    @JsonProperty("text")
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

    public String getTypeRu() {
        return typeRu;
    }

    public void setTypeRu(String typeRu) {
        this.typeRu = typeRu;
    }
}

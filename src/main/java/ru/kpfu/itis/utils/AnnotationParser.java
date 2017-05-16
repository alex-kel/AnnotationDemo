package ru.kpfu.itis.utils;

import ru.kpfu.itis.model.CaseAnnotation;
import ru.kpfu.itis.model.OffsetPair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 17.05.17.
 */
public class AnnotationParser {
    public static List<CaseAnnotation> parse(String annotationsText) {
        List<CaseAnnotation> out = new ArrayList<>();
        String[] lines = annotationsText.split("\n");
        for (String line : lines) {
            CaseAnnotation caseAnnotation = new CaseAnnotation();
            String[] annotationFields = line.split("\t");
            // Should be always 3 fields
            for (int i = 0; i < 3; i++) {
                String annotationField = annotationFields[i];
                if (i == 0) {
                    caseAnnotation.setId(annotationField);
                    continue;
                }
                if (i == 1) {
                    String[] typeAndOffsets = annotationField.split(" ", 2);
                    caseAnnotation.setType(typeAndOffsets[0]);
                    String[] offsets = typeAndOffsets[1].split(";");
                    for (String offset : offsets) {
                        String[] offsetValues = offset.split(" ");
                        OffsetPair offsetPair = new OffsetPair(Long.valueOf(offsetValues[0]), Long.valueOf(offsetValues[1]));
                        caseAnnotation.getOffsets().add(offsetPair);
                    }
                    continue;
                }
                if (i == 2) {
                    caseAnnotation.setAnnotatedText(annotationField);
                }
            }
            out.add(caseAnnotation);
        }
        return out;
    }
}

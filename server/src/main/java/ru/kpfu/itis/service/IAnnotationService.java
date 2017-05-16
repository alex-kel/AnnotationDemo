package ru.kpfu.itis.service;

import ru.kpfu.itis.model.AnnotatedCase;

import java.io.IOException;
import java.util.List;

/**
 * Created by Alex on 16.05.17.
 */
public interface IAnnotationService {

    List<String> getAllDocumentNames() throws IOException;

    AnnotatedCase getAnnotatedCaseByName(String caseName) throws IOException;
}

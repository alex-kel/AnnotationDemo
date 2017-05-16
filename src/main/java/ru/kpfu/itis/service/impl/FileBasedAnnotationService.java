package ru.kpfu.itis.service.impl;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.model.AnnotatedCase;
import ru.kpfu.itis.service.IAnnotationService;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 16.05.17.
 */
@Service
public class FileBasedAnnotationService implements IAnnotationService {

    @Value("${annotation.service.files.path}")
    private String filesPath;

    public FileBasedAnnotationService() {
    }

    @Override
    public List<String> getAllDocumentNames() throws IOException {
        List<String> out = new ArrayList<>();
        Path dirPath = Paths.get(filesPath);
        for (Path path : Files.newDirectoryStream(dirPath)) {
            String fileName = path.toFile().getName();
            if (fileName.endsWith(".txt")) {
                out.add(fileName.replace(".txt", ""));
            }
        }
        return out;
    }

    @Override
    public AnnotatedCase getAnnotatedCaseByName(String caseName) throws IOException {
        String text = getTextFromInputStream(caseName + ".txt");
        String annotationsText = getTextFromInputStream(caseName + ".ann");
        AnnotatedCase annotatedCase = new AnnotatedCase(text, annotationsText);
        return annotatedCase;
    }

    private String getTextFromInputStream(String fileName) throws IOException {
        Path path = Paths.get(filesPath + fileName);
        InputStream inputStream = new FileInputStream(path.toFile());
        String text = IOUtils.toString(inputStream, "UTF-8");
        inputStream.close();
        return text;
    }
}

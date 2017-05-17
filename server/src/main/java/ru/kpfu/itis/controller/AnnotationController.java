package ru.kpfu.itis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.itis.model.AnnotatedCase;
import ru.kpfu.itis.service.IAnnotationService;

import java.io.IOException;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Created by Alex on 16.05.17.
 */
@RestController
@RequestMapping("/api")
public class AnnotationController {

    @Autowired
    private IAnnotationService annotationService;

    @RequestMapping(value = "/annotated", method = RequestMethod.GET)
    public List<String> getListOfAnnotatedCases() {
        try {
            return annotationService.getAllDocumentNames();
        } catch (IOException e) {
            // TODO: replace with normal logging
            System.out.println("Error in retrieving document names");
            return null;
        }
    }

    @RequestMapping(value = "/annotated/{name}", method = RequestMethod.GET)
    @ResponseBody
    public AnnotatedCase getAnnotatedCase(@PathVariable("name") String name) {
        //TODO: add path variaable validation
        try {
            return annotationService.getAnnotatedCaseByName(name);
        } catch (IOException e) {
            // TODO: replace with normal logging
            System.out.println("Error in retrieving the annotated document");
            return null;
        }
    }

}

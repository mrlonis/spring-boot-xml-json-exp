package com.mrlonis.example.controller;

import static com.mrlonis.example.model.jackson.Constants.JACKSON_MAP;
import static com.mrlonis.example.model.jakarta.Constants.JAKARTA_MAP;
import static com.mrlonis.example.model.jaxb.Constants.JAXB_MAP;
import static com.mrlonis.example.util.Constants.JAKARTA;
import static com.mrlonis.example.util.Constants.JAXB;

import com.mrlonis.example.model.BaseModel;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xml")
@SuppressWarnings("rawtypes")
@Slf4j
public class XmlController {
    private static final Map<String, Map<String, Map<String, Map<String, BaseModel>>>> XML_MODELS_BY_TYPE =
            Map.of(JAXB, JAXB_MAP, JAKARTA, JAKARTA_MAP);

    @GetMapping("/{formatLibrary}")
    public BaseModel getModel(
            @PathVariable String formatLibrary,
            @RequestParam String accessType,
            @RequestParam String dateLibrary,
            @RequestParam String zoned,
            @RequestParam(required = false) String xmlAnnotationLibrary) {
        log.info(
                "XmlController: getModel(): formatLibrary: {} | dateLibrary: {} | zoned: {} | | accessType: {}, xmlAnnotationLibrary: {}",
                formatLibrary,
                dateLibrary,
                zoned,
                accessType,
                xmlAnnotationLibrary);
        if ("jackson".equals(formatLibrary)) {
            if ("jaxb".equals(xmlAnnotationLibrary)
                    || "jakarta".equals(xmlAnnotationLibrary)
                    || "jackson".equals(xmlAnnotationLibrary)) {
                return JACKSON_MAP
                        .get(xmlAnnotationLibrary)
                        .get(dateLibrary)
                        .get(zoned)
                        .get(accessType);
            }
            throw new IllegalArgumentException("Invalid xmlAnnotationLibrary: " + xmlAnnotationLibrary);
        }
        return XML_MODELS_BY_TYPE.get(formatLibrary).get(dateLibrary).get(zoned).get(accessType);
    }
}

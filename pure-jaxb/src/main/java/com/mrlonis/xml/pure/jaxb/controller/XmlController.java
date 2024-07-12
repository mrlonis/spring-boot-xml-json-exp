package com.mrlonis.xml.pure.jaxb.controller;

import com.mrlonis.xml.shared.model.BaseModel;
import com.mrlonis.xml.shared.util.FetchModelUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/xml")
@Slf4j
public class XmlController {
    @GetMapping("/{formatLibrary}")
    public BaseModel<?> getModel(
            @PathVariable String formatLibrary,
            @RequestParam String accessType,
            @RequestParam String dateLibrary,
            @RequestParam String zoned,
            @RequestParam(required = false) String xmlAnnotationLibrary,
            @RequestParam(required = false) Boolean pure) {
        return FetchModelUtil.fetchModel(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary, pure);
    }

    @PostMapping(
            value = "/deserialize",
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public BaseModel<?> deserializeModel(@RequestBody BaseModel<?> model) {
        log.info("XmlController: deserializeModel(): model.getId(): {}", model.getId());
        log.info("XmlController: deserializeModel(): model.getName(): {}", model.getName());
        log.info("XmlController: deserializeModel(): model.getAuthor(): {}", model.getAuthor());
        log.info("XmlController: deserializeModel(): model.getDate(): {}", model.getDate());
        log.info("XmlController: deserializeModel(): model.getTags(): {}", model.getTag());
        log.info("XmlController: deserializeModel(): model.hashCode(): {}", model.hashCode());
        log.info("XmlController: deserializeModel(): model.toString(): {}", model);
        return model;
    }
}

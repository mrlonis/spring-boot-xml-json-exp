package com.mrlonis.example.controller;

import com.mrlonis.example.model.BaseModel;
import com.mrlonis.example.util.FetchModelUtil;
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
    @GetMapping("/{formatLibrary}")
    public BaseModel getModel(
            @PathVariable String formatLibrary,
            @RequestParam String accessType,
            @RequestParam String dateLibrary,
            @RequestParam String zoned,
            @RequestParam(required = false) String xmlAnnotationLibrary) {
        return FetchModelUtil.fetchModel(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary);
    }
}

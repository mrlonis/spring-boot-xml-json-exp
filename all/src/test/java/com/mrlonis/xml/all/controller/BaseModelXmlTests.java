package com.mrlonis.xml.all.controller;

import static com.mrlonis.xml.shared.TestUtil.generateTestArguments;
import static com.mrlonis.xml.shared.time.TimeConstants.NO_ZONE;
import static com.mrlonis.xml.shared.time.TimeConstants.ZONED;
import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.mrlonis.xml.shared.model.BaseModel;
import com.mrlonis.xml.shared.util.FetchModelUtil;
import jakarta.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.text.StringSubstitutor;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest
@AutoConfigureMockMvc
@Slf4j
class BaseModelXmlTests {
    public static final String XML =
            "<book type=\"${className}\" id=\"1\"><title>name</title><date>2024-07-05T14:06:07.617</date><tags><tag>tag1</tag><tag>tag2</tag><tag>tag3</tag></tags></book>";
    public static final String XML_ZONED =
            "<book type=\"${className}\" id=\"1\"><title>name</title><date>2024-07-05T14:06:07.617Z</date><tags><tag>tag1</tag><tag>tag2</tag><tag>tag3</tag></tags></book>";
    private static final String XML_PATH = "/xml";

    @Autowired
    private MockMvc mockMvc;

    static Stream<Arguments> xmlTestArguments() {
        return generateTestArguments(true, true, true, true, true, true);
    }

    @ParameterizedTest
    @MethodSource("xmlTestArguments")
    void testSerialization(
            String formatLibrary, String accessType, String dateLibrary, String zoned, String xmlAnnotationLibrary)
            throws Exception {
        performGetTest(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary);
    }

    @ParameterizedTest
    @MethodSource("xmlTestArguments")
    void testDeserialization(
            String formatLibrary, String accessType, String dateLibrary, String zoned, String xmlAnnotationLibrary)
            throws Exception {
        performPostTest(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary);
    }

    private void performGetTest(
            String formatLibrary,
            String accessType,
            String dateLibrary,
            String zoned,
            @Nullable String xmlAnnotationLibrary)
            throws Exception {
        String xml;
        if (ZONED.equals(zoned)) {
            xml = XML_ZONED;
        } else {
            xml = NO_ZONE.equals(zoned) ? XML : null;
        }
        if (xml == null) {
            throw new IllegalArgumentException("Invalid zoned value: " + zoned);
        }
        BaseModel<?> model =
                FetchModelUtil.fetchModel(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary, false);
        String className = model.getClass().getName();
        className = className.substring(className.lastIndexOf('.') + 1);
        Map<String, String> valuesMap = new HashMap<>();
        valuesMap.put("className", className);
        StringSubstitutor sub = new StringSubstitutor(valuesMap);
        xml = sub.replace(xml);

        UriComponentsBuilder builder = UriComponentsBuilder.fromPath(XML_PATH + "/" + formatLibrary)
                .queryParam("accessType", accessType)
                .queryParam("dateLibrary", dateLibrary)
                .queryParam("zoned", zoned);

        if (xmlAnnotationLibrary != null) {
            builder.queryParam("xmlAnnotationLibrary", xmlAnnotationLibrary);
        }

        mockMvc.perform(get(builder.build().toUriString()).header(HttpHeaders.ACCEPT, MediaType.APPLICATION_XML_VALUE))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_XML_VALUE + ";charset=UTF-8"))
                .andExpect(content().string(equalTo(xml)));
    }

    private void performPostTest(
            String formatLibrary,
            String accessType,
            String dateLibrary,
            String zoned,
            @Nullable String xmlAnnotationLibrary)
            throws Exception {
        String xml;
        if (ZONED.equals(zoned)) {
            xml = XML_ZONED;
        } else {
            xml = NO_ZONE.equals(zoned) ? XML : null;
        }
        if (xml == null) {
            throw new IllegalArgumentException("Invalid zoned value: " + zoned);
        }

        BaseModel<?> model =
                FetchModelUtil.fetchModel(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary, false);
        String className = model.getClass().getName();
        className = className.substring(className.lastIndexOf('.') + 1);
        Map<String, String> valuesMap = new HashMap<>();
        valuesMap.put("className", className);
        StringSubstitutor sub = new StringSubstitutor(valuesMap);
        xml = sub.replace(xml);

        mockMvc.perform(post(UriComponentsBuilder.fromPath(XML_PATH + "/deserialize")
                                .build()
                                .toUriString())
                        .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_XML_VALUE)
                        .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_XML_VALUE)
                        .content(xml))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_XML_VALUE))
                .andExpect(content().string(equalTo(xml)));
    }
}

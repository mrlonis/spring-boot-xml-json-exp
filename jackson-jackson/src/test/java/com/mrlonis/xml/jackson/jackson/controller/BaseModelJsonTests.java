package com.mrlonis.xml.jackson.jackson.controller;

import static com.mrlonis.xml.shared.time.TimeConstants.FIELD;
import static com.mrlonis.xml.shared.time.TimeConstants.JACKSON;
import static com.mrlonis.xml.shared.time.TimeConstants.JAVA;
import static com.mrlonis.xml.shared.time.TimeConstants.JODA;
import static com.mrlonis.xml.shared.time.TimeConstants.NONE;
import static com.mrlonis.xml.shared.time.TimeConstants.NO_ZONE;
import static com.mrlonis.xml.shared.time.TimeConstants.PROPERTY;
import static com.mrlonis.xml.shared.time.TimeConstants.PUBLIC_MEMBER;
import static com.mrlonis.xml.shared.time.TimeConstants.ZONED;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.params.provider.Arguments.arguments;
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
class BaseModelJsonTests {
    public static final String JSON =
            "{\"type\":\"${className}\",\"id\":1,\"title\":\"name\",\"date\":\"2024-07-05T14:06:07.617\",\"tag\":[\"tag1\",\"tag2\",\"tag3\"]}";
    public static final String JSON_ZONED =
            "{\"type\":\"${className}\",\"id\":1,\"title\":\"name\",\"date\":\"2024-07-05T14:06:07.617Z\",\"tag\":[\"tag1\",\"tag2\",\"tag3\"]}";
    private static final String XML_PATH = "/xml";

    @Autowired
    private MockMvc mockMvc;

    static Stream<Arguments> jsonTestArguments() {
        return Stream.of(
                arguments(JACKSON, FIELD, JODA, ZONED, "jackson"),
                arguments(JACKSON, NONE, JODA, ZONED, "jackson"),
                arguments(JACKSON, PROPERTY, JODA, ZONED, "jackson"),
                arguments(JACKSON, PUBLIC_MEMBER, JODA, ZONED, "jackson"),
                arguments(JACKSON, FIELD, JODA, NO_ZONE, "jackson"),
                arguments(JACKSON, NONE, JODA, NO_ZONE, "jackson"),
                arguments(JACKSON, PROPERTY, JODA, NO_ZONE, "jackson"),
                arguments(JACKSON, PUBLIC_MEMBER, JODA, NO_ZONE, "jackson"),
                arguments(JACKSON, FIELD, JAVA, ZONED, "jackson"),
                arguments(JACKSON, NONE, JAVA, ZONED, "jackson"),
                arguments(JACKSON, PROPERTY, JAVA, ZONED, "jackson"),
                arguments(JACKSON, PUBLIC_MEMBER, JAVA, ZONED, "jackson"),
                arguments(JACKSON, FIELD, JAVA, NO_ZONE, "jackson"),
                arguments(JACKSON, NONE, JAVA, NO_ZONE, "jackson"),
                arguments(JACKSON, PROPERTY, JAVA, NO_ZONE, "jackson"),
                arguments(JACKSON, PUBLIC_MEMBER, JAVA, NO_ZONE, "jackson"));
    }

    @ParameterizedTest
    @MethodSource("jsonTestArguments")
    void testSerialization(
            String formatLibrary, String accessType, String dateLibrary, String zoned, String xmlAnnotationLibrary)
            throws Exception {
        performGetTest(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary);
    }

    @ParameterizedTest
    @MethodSource("jsonTestArguments")
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
        String json;
        if (ZONED.equals(zoned)) {
            json = JSON_ZONED;
        } else {
            json = NO_ZONE.equals(zoned) ? JSON : null;
        }
        if (json == null) {
            throw new IllegalArgumentException("Invalid zoned value: " + zoned);
        }
        BaseModel<?> model =
                FetchModelUtil.fetchModel(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary, false);
        String className = model.getClass().getName();
        className = className.substring(className.lastIndexOf('.') + 1);
        Map<String, String> valuesMap = new HashMap<>();
        valuesMap.put("className", className);
        StringSubstitutor sub = new StringSubstitutor(valuesMap);
        json = sub.replace(json);

        UriComponentsBuilder builder = UriComponentsBuilder.fromPath(XML_PATH + "/" + formatLibrary)
                .queryParam("accessType", accessType)
                .queryParam("dateLibrary", dateLibrary)
                .queryParam("zoned", zoned);

        if (xmlAnnotationLibrary != null) {
            builder.queryParam("xmlAnnotationLibrary", xmlAnnotationLibrary);
        }

        mockMvc.perform(get(builder.build().toUriString()).header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(content().string(equalTo(json)));
    }

    private void performPostTest(
            String formatLibrary,
            String accessType,
            String dateLibrary,
            String zoned,
            @Nullable String xmlAnnotationLibrary)
            throws Exception {
        String json;
        if (ZONED.equals(zoned)) {
            json = JSON_ZONED;
        } else {
            json = NO_ZONE.equals(zoned) ? JSON : null;
        }
        if (json == null) {
            throw new IllegalArgumentException("Invalid zoned value: " + zoned);
        }

        BaseModel<?> model =
                FetchModelUtil.fetchModel(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary, false);
        String className = model.getClass().getName();
        className = className.substring(className.lastIndexOf('.') + 1);
        Map<String, String> valuesMap = new HashMap<>();
        valuesMap.put("className", className);
        StringSubstitutor sub = new StringSubstitutor(valuesMap);
        json = sub.replace(json);

        mockMvc.perform(post(UriComponentsBuilder.fromPath(XML_PATH + "/deserialize")
                                .build()
                                .toUriString())
                        .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                        .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                        .content(json))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(content().string(equalTo(json)));
    }
}

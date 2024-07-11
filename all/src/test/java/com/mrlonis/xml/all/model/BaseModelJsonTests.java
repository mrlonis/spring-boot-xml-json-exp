package com.mrlonis.xml.all.model;

import static com.mrlonis.xml.shared.time.TimeConstants.FIELD;
import static com.mrlonis.xml.shared.time.TimeConstants.JACKSON;
import static com.mrlonis.xml.shared.time.TimeConstants.JAKARTA;
import static com.mrlonis.xml.shared.time.TimeConstants.JAVA;
import static com.mrlonis.xml.shared.time.TimeConstants.JAXB;
import static com.mrlonis.xml.shared.time.TimeConstants.JODA;
import static com.mrlonis.xml.shared.time.TimeConstants.NONE;
import static com.mrlonis.xml.shared.time.TimeConstants.NO_ZONE;
import static com.mrlonis.xml.shared.time.TimeConstants.PROPERTY;
import static com.mrlonis.xml.shared.time.TimeConstants.PUBLIC_MEMBER;
import static com.mrlonis.xml.shared.time.TimeConstants.ZONED;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.jakarta.xmlbind.JakartaXmlBindAnnotationModule;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import com.mrlonis.xml.all.util.FetchModelUtil;
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

    private final ObjectMapper xmlMapper = new ObjectMapper()
            .findAndRegisterModules()
            .registerModule(new JodaModule())
            .registerModule(new JavaTimeModule())
            .registerModule(new JaxbAnnotationModule())
            .registerModule(new JakartaXmlBindAnnotationModule());

    static Stream<Arguments> jsonTestArguments() {
        return Stream.of(
                arguments(JAXB, FIELD, JODA, ZONED, null),
                arguments(JAXB, NONE, JODA, ZONED, null),
                arguments(JAXB, PROPERTY, JODA, ZONED, null),
                arguments(JAXB, PUBLIC_MEMBER, JODA, ZONED, null),
                arguments(JAXB, FIELD, JODA, NO_ZONE, null),
                arguments(JAXB, NONE, JODA, NO_ZONE, null),
                arguments(JAXB, PROPERTY, JODA, NO_ZONE, null),
                arguments(JAXB, PUBLIC_MEMBER, JODA, NO_ZONE, null),
                arguments(JAXB, FIELD, JAVA, ZONED, null),
                arguments(JAXB, NONE, JAVA, ZONED, null),
                arguments(JAXB, PROPERTY, JAVA, ZONED, null),
                arguments(JAXB, PUBLIC_MEMBER, JAVA, ZONED, null),
                arguments(JAXB, FIELD, JAVA, NO_ZONE, null),
                arguments(JAXB, NONE, JAVA, NO_ZONE, null),
                arguments(JAXB, PROPERTY, JAVA, NO_ZONE, null),
                arguments(JAXB, PUBLIC_MEMBER, JAVA, NO_ZONE, null),
                arguments(JAKARTA, FIELD, JODA, ZONED, null),
                arguments(JAKARTA, NONE, JODA, ZONED, null),
                arguments(JAKARTA, PROPERTY, JODA, ZONED, null),
                arguments(JAKARTA, PUBLIC_MEMBER, JODA, ZONED, null),
                arguments(JAKARTA, FIELD, JODA, NO_ZONE, null),
                arguments(JAKARTA, NONE, JODA, NO_ZONE, null),
                arguments(JAKARTA, PROPERTY, JODA, NO_ZONE, null),
                arguments(JAKARTA, PUBLIC_MEMBER, JODA, NO_ZONE, null),
                arguments(JAKARTA, FIELD, JAVA, ZONED, null),
                arguments(JAKARTA, NONE, JAVA, ZONED, null),
                arguments(JAKARTA, PROPERTY, JAVA, ZONED, null),
                arguments(JAKARTA, PUBLIC_MEMBER, JAVA, ZONED, null),
                arguments(JAKARTA, FIELD, JAVA, NO_ZONE, null),
                arguments(JAKARTA, NONE, JAVA, NO_ZONE, null),
                arguments(JAKARTA, PROPERTY, JAVA, NO_ZONE, null),
                arguments(JAKARTA, PUBLIC_MEMBER, JAVA, NO_ZONE, null),
                arguments(JACKSON, FIELD, JODA, ZONED, "jaxb"),
                arguments(JACKSON, NONE, JODA, ZONED, "jaxb"),
                arguments(JACKSON, PROPERTY, JODA, ZONED, "jaxb"),
                arguments(JACKSON, PUBLIC_MEMBER, JODA, ZONED, "jaxb"),
                arguments(JACKSON, FIELD, JODA, NO_ZONE, "jaxb"),
                arguments(JACKSON, NONE, JODA, NO_ZONE, "jaxb"),
                arguments(JACKSON, PROPERTY, JODA, NO_ZONE, "jaxb"),
                arguments(JACKSON, PUBLIC_MEMBER, JODA, NO_ZONE, "jaxb"),
                arguments(JACKSON, FIELD, JAVA, ZONED, "jaxb"),
                arguments(JACKSON, NONE, JAVA, ZONED, "jaxb"),
                arguments(JACKSON, PROPERTY, JAVA, ZONED, "jaxb"),
                arguments(JACKSON, PUBLIC_MEMBER, JAVA, ZONED, "jaxb"),
                arguments(JACKSON, FIELD, JAVA, NO_ZONE, "jaxb"),
                arguments(JACKSON, NONE, JAVA, NO_ZONE, "jaxb"),
                arguments(JACKSON, PROPERTY, JAVA, NO_ZONE, "jaxb"),
                arguments(JACKSON, PUBLIC_MEMBER, JAVA, NO_ZONE, "jaxb"),
                arguments(JACKSON, FIELD, JODA, ZONED, "jakarta"),
                arguments(JACKSON, NONE, JODA, ZONED, "jakarta"),
                arguments(JACKSON, PROPERTY, JODA, ZONED, "jakarta"),
                arguments(JACKSON, PUBLIC_MEMBER, JODA, ZONED, "jakarta"),
                arguments(JACKSON, FIELD, JODA, NO_ZONE, "jakarta"),
                arguments(JACKSON, NONE, JODA, NO_ZONE, "jakarta"),
                arguments(JACKSON, PROPERTY, JODA, NO_ZONE, "jakarta"),
                arguments(JACKSON, PUBLIC_MEMBER, JODA, NO_ZONE, "jakarta"),
                arguments(JACKSON, FIELD, JAVA, ZONED, "jakarta"),
                arguments(JACKSON, NONE, JAVA, ZONED, "jakarta"),
                arguments(JACKSON, PROPERTY, JAVA, ZONED, "jakarta"),
                arguments(JACKSON, PUBLIC_MEMBER, JAVA, ZONED, "jakarta"),
                arguments(JACKSON, FIELD, JAVA, NO_ZONE, "jakarta"),
                arguments(JACKSON, NONE, JAVA, NO_ZONE, "jakarta"),
                arguments(JACKSON, PROPERTY, JAVA, NO_ZONE, "jakarta"),
                arguments(JACKSON, PUBLIC_MEMBER, JAVA, NO_ZONE, "jakarta"),
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
                FetchModelUtil.fetchModel(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary);
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
                FetchModelUtil.fetchModel(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary);
        String className = model.getClass().getName();
        className = className.substring(className.lastIndexOf('.') + 1);
        Map<String, String> valuesMap = new HashMap<>();
        valuesMap.put("className", className);
        StringSubstitutor sub = new StringSubstitutor(valuesMap);
        json = sub.replace(json);

        UriComponentsBuilder builder = UriComponentsBuilder.fromPath(XML_PATH + "/deserialize");

        if (xmlAnnotationLibrary != null) {
            builder.queryParam("xmlAnnotationLibrary", xmlAnnotationLibrary);
        }

        String requestBody = xmlMapper.writeValueAsString(model);
        log.info("Request body: {}", requestBody);

        BaseModel<?> model2 = xmlMapper.readValue(requestBody, model.getClass());
        assertEquals(model.getId(), model2.getId());
        assertEquals(model.getName(), model2.getName());
        //        assertEquals(model.getTags(), model2.getTags());
        assertNotEquals(model.getAuthor(), model2.getAuthor());

        mockMvc.perform(post(builder.build().toUriString())
                        .header(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE)
                        .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                        .content(requestBody))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(content().string(equalTo(json)));
    }
}

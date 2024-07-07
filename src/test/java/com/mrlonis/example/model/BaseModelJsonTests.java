package com.mrlonis.example.model;

import static com.mrlonis.example.util.Constants.FIELD;
import static com.mrlonis.example.util.Constants.JACKSON;
import static com.mrlonis.example.util.Constants.JAKARTA;
import static com.mrlonis.example.util.Constants.JAVA;
import static com.mrlonis.example.util.Constants.JAXB;
import static com.mrlonis.example.util.Constants.JODA;
import static com.mrlonis.example.util.Constants.NONE;
import static com.mrlonis.example.util.Constants.NO_ZONE;
import static com.mrlonis.example.util.Constants.PROPERTY;
import static com.mrlonis.example.util.Constants.PUBLIC_MEMBER;
import static com.mrlonis.example.util.Constants.ZONED;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import jakarta.annotation.Nullable;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
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
            "{\"id\":1,\"title\":\"name\",\"date\":\"2024-07-05T14:06:07.617\",\"tag\":[\"tag1\",\"tag2\",\"tag3\"]}";
    public static final String JSON_ZONED =
            "{\"id\":1,\"title\":\"name\",\"date\":\"2024-07-05T14:06:07.617Z\",\"tag\":[\"tag1\",\"tag2\",\"tag3\"]}";
    private static final String XML_PATH = "/xml";

    @Autowired
    private MockMvc mockMvc;

    static Stream<Arguments> xmlTestArguments() {
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
    @MethodSource("xmlTestArguments")
    void testSerialization(
            String formatLibrary, String accessType, String dateLibrary, String zoned, String xmlAnnotationLibrary)
            throws Exception {
        performTest(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary);
    }

    private void performTest(
            String formatLibrary,
            String accessType,
            String dateLibrary,
            String zoned,
            @Nullable String xmlAnnotationLibrary)
            throws Exception {
        String xml;
        if (ZONED.equals(zoned)) {
            xml = JSON_ZONED;
        } else {
            xml = NO_ZONE.equals(zoned) ? JSON : null;
        }
        if (xml == null) {
            throw new IllegalArgumentException("Invalid zoned value: " + zoned);
        }

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
                .andExpect(content().string(equalTo(xml)));
    }
}

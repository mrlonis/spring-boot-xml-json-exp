package com.mrlonis.xml.shared;

import static com.mrlonis.xml.shared.TestConstants.JSON;
import static com.mrlonis.xml.shared.TestConstants.JSON_ZONED;
import static com.mrlonis.xml.shared.time.TimeConstants.NO_ZONE;
import static com.mrlonis.xml.shared.time.TimeConstants.ZONED;
import static com.mrlonis.xml.shared.util.Constants.XML_PATH;
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
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.util.UriComponentsBuilder;

@Slf4j
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class BaseJsonTest {
    private MockMvc mockMvc;

    public BaseJsonTest(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    public abstract Stream<Arguments> testArguments();

    public abstract MediaType getMediaType();

    @ParameterizedTest
    @MethodSource("testArguments")
    void testSerialization(
            String formatLibrary, String accessType, String dateLibrary, String zoned, String xmlAnnotationLibrary)
            throws Exception {
        performGetTest(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary);
    }

    @ParameterizedTest
    @MethodSource("testArguments")
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

        mockMvc.perform(get(builder.build().toUriString()).header(HttpHeaders.ACCEPT, getMediaType()))
                .andExpect(status().isOk())
                .andExpect(content().contentType(getMediaType()))
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
                        .header(HttpHeaders.ACCEPT, getMediaType())
                        .header(HttpHeaders.CONTENT_TYPE, getMediaType())
                        .content(json))
                .andExpect(status().isOk())
                .andExpect(content().contentType(getMediaType()))
                .andExpect(content().string(equalTo(json)));
    }
}

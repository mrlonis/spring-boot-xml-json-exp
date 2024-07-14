package com.mrlonis.xml.shared;

import static com.mrlonis.xml.shared.TestConstants.JSON;
import static com.mrlonis.xml.shared.TestConstants.JSON_ZONED;
import static com.mrlonis.xml.shared.TestConstants.XML;
import static com.mrlonis.xml.shared.TestConstants.XML_ZONED;
import static com.mrlonis.xml.shared.time.TimeConstants.NO_ZONE;
import static com.mrlonis.xml.shared.time.TimeConstants.PURE_JAKARTA;
import static com.mrlonis.xml.shared.time.TimeConstants.PURE_JAXB;
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
public abstract class BaseXmlControllerTests {
    private final MockMvc mockMvc;

    public BaseXmlControllerTests(MockMvc mockMvc) {
        this.mockMvc = mockMvc;
    }

    public abstract Stream<Arguments> testArguments();

    @ParameterizedTest
    @MethodSource("testArguments")
    void testJsonSerialization(
            String formatLibrary, String accessType, String dateLibrary, String zoned, String xmlAnnotationLibrary)
            throws Exception {
        performGetTest(
                formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary, MediaType.APPLICATION_JSON_VALUE);
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void testJsonDeserialization(
            String formatLibrary, String accessType, String dateLibrary, String zoned, String xmlAnnotationLibrary)
            throws Exception {
        performPostTest(
                formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary, MediaType.APPLICATION_JSON_VALUE);
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void testXmlSerialization(
            String formatLibrary, String accessType, String dateLibrary, String zoned, String xmlAnnotationLibrary)
            throws Exception {
        performGetTest(
                formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary, MediaType.APPLICATION_XML_VALUE);
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void testXmlDeserialization(
            String formatLibrary, String accessType, String dateLibrary, String zoned, String xmlAnnotationLibrary)
            throws Exception {
        performPostTest(
                formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary, MediaType.APPLICATION_XML_VALUE);
    }

    private void performGetTest(
            String formatLibrary,
            String accessType,
            String dateLibrary,
            String zoned,
            @Nullable String xmlAnnotationLibrary,
            String mediaType)
            throws Exception {
        UriComponentsBuilder builder = UriComponentsBuilder.fromPath(XML_PATH + "/" + formatLibrary)
                .queryParam("accessType", accessType)
                .queryParam("dateLibrary", dateLibrary)
                .queryParam("zoned", zoned);

        if (xmlAnnotationLibrary != null) {
            builder.queryParam("xmlAnnotationLibrary", xmlAnnotationLibrary);
        }

        String json = getTestData(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary, mediaType);
        mockMvc.perform(get(builder.build().toUriString()).header(HttpHeaders.ACCEPT, mediaType))
                .andExpect(status().isOk())
                .andExpect(content()
                        .contentType(
                                MediaType.APPLICATION_XML_VALUE.equals(mediaType)
                                        ? mediaType + ";charset=UTF-8"
                                        : mediaType))
                .andExpect(content().string(equalTo(json)));
    }

    private void performPostTest(
            String formatLibrary,
            String accessType,
            String dateLibrary,
            String zoned,
            @Nullable String xmlAnnotationLibrary,
            String mediaType)
            throws Exception {
        String json = getTestData(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary, mediaType);
        var whatIsThis = mockMvc.perform(post(UriComponentsBuilder.fromPath(XML_PATH + "/deserialize")
                        .build()
                        .toUriString())
                .header(HttpHeaders.ACCEPT, mediaType)
                .header(HttpHeaders.CONTENT_TYPE, mediaType)
                .content(json));
        if (PURE_JAXB.equals(formatLibrary) || PURE_JAKARTA.equals(formatLibrary)) {
            whatIsThis.andExpect(status().isBadRequest());
            return;
        }

        whatIsThis
                .andExpect(status().isOk())
                .andExpect(content().contentType(mediaType))
                .andExpect(content().string(equalTo(json)));
    }

    private String getTestData(
            String formatLibrary,
            String accessType,
            String dateLibrary,
            String zoned,
            @Nullable String xmlAnnotationLibrary,
            String mediaType) {
        if (MediaType.APPLICATION_XML_VALUE.equals(mediaType)) {
            return getTestXml(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary);
        } else if (MediaType.APPLICATION_JSON_VALUE.equals(mediaType)) {
            return getTestJson(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary);
        } else {
            throw new IllegalArgumentException("Invalid media type: " + mediaType);
        }
    }

    private String getTestJson(
            String formatLibrary,
            String accessType,
            String dateLibrary,
            String zoned,
            @Nullable String xmlAnnotationLibrary) {
        return replaceTypeInData(
                formatLibrary,
                accessType,
                dateLibrary,
                zoned,
                xmlAnnotationLibrary,
                getDataByZone(zoned, JSON_ZONED, JSON));
    }

    private String getTestXml(
            String formatLibrary,
            String accessType,
            String dateLibrary,
            String zoned,
            @Nullable String xmlAnnotationLibrary) {
        return replaceTypeInData(
                formatLibrary,
                accessType,
                dateLibrary,
                zoned,
                xmlAnnotationLibrary,
                getDataByZone(zoned, XML_ZONED, XML));
    }

    private String getDataByZone(String zonedIndicator, String zonedData, String noZoneData) {
        String data;
        if (ZONED.equals(zonedIndicator)) {
            data = zonedData;
        } else {
            data = NO_ZONE.equals(zonedIndicator) ? noZoneData : null;
        }
        if (data == null) {
            throw new IllegalArgumentException("Invalid zoned value: " + zonedIndicator);
        }
        return data;
    }

    private String replaceTypeInData(
            String formatLibrary,
            String accessType,
            String dateLibrary,
            String zoned,
            @Nullable String xmlAnnotationLibrary,
            String stringToReplace) {
        BaseModel<?> model =
                FetchModelUtil.fetchModel(formatLibrary, accessType, dateLibrary, zoned, xmlAnnotationLibrary);
        String className = model.getClass().getName();
        className = className.substring(className.lastIndexOf('.') + 1);
        Map<String, String> valuesMap = new HashMap<>();
        valuesMap.put("className", className);
        StringSubstitutor sub = new StringSubstitutor(valuesMap);
        return sub.replace(stringToReplace);
    }
}

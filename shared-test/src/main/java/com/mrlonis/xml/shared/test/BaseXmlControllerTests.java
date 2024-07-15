package com.mrlonis.xml.shared.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import com.mrlonis.xml.shared.enums.AnnotationLibrary;
import com.mrlonis.xml.shared.enums.TimeLibrary;
import com.mrlonis.xml.shared.enums.TimeZoneIndicator;
import com.mrlonis.xml.shared.model.BaseModel;
import com.mrlonis.xml.shared.util.Constants;
import com.mrlonis.xml.shared.util.FetchModelUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.text.StringSubstitutor;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
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
            AnnotationLibrary formatLibrary, String accessType, TimeLibrary dateLibrary, TimeZoneIndicator zoned)
            throws Exception {
        performGetTest(formatLibrary, accessType, dateLibrary, zoned, MediaType.APPLICATION_JSON_VALUE);
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void testJsonDeserialization(
            AnnotationLibrary formatLibrary, String accessType, TimeLibrary dateLibrary, TimeZoneIndicator zoned)
            throws Exception {
        performPostTest(formatLibrary, accessType, dateLibrary, zoned, MediaType.APPLICATION_JSON_VALUE);
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void testXmlSerialization(
            AnnotationLibrary formatLibrary, String accessType, TimeLibrary dateLibrary, TimeZoneIndicator zoned)
            throws Exception {
        performGetTest(formatLibrary, accessType, dateLibrary, zoned, MediaType.APPLICATION_XML_VALUE);
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void testXmlDeserialization(
            AnnotationLibrary formatLibrary, String accessType, TimeLibrary dateLibrary, TimeZoneIndicator zoned)
            throws Exception {
        performPostTest(formatLibrary, accessType, dateLibrary, zoned, MediaType.APPLICATION_XML_VALUE);
    }

    private void performGetTest(
            AnnotationLibrary formatLibrary,
            String accessType,
            TimeLibrary dateLibrary,
            TimeZoneIndicator zoned,
            String mediaType)
            throws Exception {
        UriComponentsBuilder builder = UriComponentsBuilder.fromPath(Constants.XML_PATH + "/" + formatLibrary)
                .queryParam("accessType", accessType)
                .queryParam("dateLibrary", dateLibrary)
                .queryParam("zoned", zoned);

        String json = getResponseData(formatLibrary, accessType, dateLibrary, zoned, mediaType);
        mockMvc.perform(MockMvcRequestBuilders.get(builder.build().toUriString())
                        .header(HttpHeaders.ACCEPT, mediaType))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content()
                        .contentType(
                                MediaType.APPLICATION_XML_VALUE.equals(mediaType)
                                        ? mediaType + ";charset=UTF-8"
                                        : mediaType))
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo(json)));
    }

    private void performPostTest(
            AnnotationLibrary formatLibrary,
            String accessType,
            TimeLibrary dateLibrary,
            TimeZoneIndicator zoned,
            String mediaType)
            throws Exception {
        String json = getResponseData(formatLibrary, accessType, dateLibrary, zoned, mediaType);
        String jsonPost = getRequestData(formatLibrary, accessType, dateLibrary, zoned, mediaType);
        var whatIsThis = mockMvc.perform(post(Constants.XML_PATH + Constants.DESERIALIZE_PATH)
                .header(HttpHeaders.ACCEPT, mediaType)
                .header(HttpHeaders.CONTENT_TYPE, mediaType)
                .content(jsonPost));

        whatIsThis
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(mediaType))
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo(json)));
    }

    private String getResponseData(
            AnnotationLibrary formatLibrary,
            String accessType,
            TimeLibrary dateLibrary,
            TimeZoneIndicator zoned,
            String mediaType) {
        if (MediaType.APPLICATION_XML_VALUE.equals(mediaType)) {
            return getResponseTestXml(formatLibrary, accessType, dateLibrary, zoned);
        } else if (MediaType.APPLICATION_JSON_VALUE.equals(mediaType)) {
            return getResponseTestJson(formatLibrary, accessType, dateLibrary, zoned);
        } else {
            throw new IllegalArgumentException("Invalid media type: " + mediaType);
        }
    }

    private String getResponseTestJson(
            AnnotationLibrary formatLibrary, String accessType, TimeLibrary dateLibrary, TimeZoneIndicator zoned) {
        String json_zoned = TestConstants.JSON_ZONED;
        String json_no_zone = TestConstants.JSON_NO_ZONE;
        if (AnnotationLibrary.PURE_JAXB.equals(formatLibrary) || AnnotationLibrary.PURE_JAKARTA.equals(formatLibrary)) {
            json_zoned = TestConstants.JSON_ZONED_BAD;
            json_no_zone = TestConstants.JSON_NO_ZONE_BAD;
        }
        return replaceTypeInData(
                formatLibrary, accessType, dateLibrary, zoned, getDataByZone(zoned, json_zoned, json_no_zone));
    }

    private String getResponseTestXml(
            AnnotationLibrary formatLibrary, String accessType, TimeLibrary dateLibrary, TimeZoneIndicator zoned) {
        String xml_zoned = TestConstants.XML_ZONED;
        String xml_no_zone = TestConstants.XML_NO_ZONE;
        if (AnnotationLibrary.PURE_JAXB.equals(formatLibrary) || AnnotationLibrary.PURE_JAKARTA.equals(formatLibrary)) {
            xml_zoned = TestConstants.XML_ZONED_BAD;
            xml_no_zone = TestConstants.XML_NO_ZONE_BAD;
        }
        return replaceTypeInData(
                formatLibrary, accessType, dateLibrary, zoned, getDataByZone(zoned, xml_zoned, xml_no_zone));
    }

    private String getDataByZone(TimeZoneIndicator zonedIndicator, String zonedData, String noZoneData) {
        String data;
        if (TimeZoneIndicator.ZONED.equals(zonedIndicator)) {
            data = zonedData;
        } else {
            data = TimeZoneIndicator.NO_ZONE.equals(zonedIndicator) ? noZoneData : null;
        }
        if (data == null) {
            throw new IllegalArgumentException("Invalid zoned value: " + zonedIndicator);
        }
        return data;
    }

    private String replaceTypeInData(
            AnnotationLibrary formatLibrary,
            String accessType,
            TimeLibrary dateLibrary,
            TimeZoneIndicator zoned,
            String stringToReplace) {
        BaseModel<?> model = FetchModelUtil.fetchModel(formatLibrary, accessType, dateLibrary, zoned);
        String className = model.getClass().getName();
        className = className.substring(className.lastIndexOf('.') + 1);
        Map<String, String> valuesMap = new HashMap<>();
        valuesMap.put("className", className);
        StringSubstitutor sub = new StringSubstitutor(valuesMap);
        return sub.replace(stringToReplace);
    }

    private String getRequestData(
            AnnotationLibrary formatLibrary,
            String accessType,
            TimeLibrary dateLibrary,
            TimeZoneIndicator zoned,
            String mediaType) {
        if (MediaType.APPLICATION_XML_VALUE.equals(mediaType)) {
            return getRequestTestXml(formatLibrary, accessType, dateLibrary, zoned);
        } else if (MediaType.APPLICATION_JSON_VALUE.equals(mediaType)) {
            return getRequestTestJson(formatLibrary, accessType, dateLibrary, zoned);
        } else {
            throw new IllegalArgumentException("Invalid media type: " + mediaType);
        }
    }

    private String getRequestTestJson(
            AnnotationLibrary formatLibrary, String accessType, TimeLibrary dateLibrary, TimeZoneIndicator zoned) {
        String json_zoned = TestConstants.JSON_ZONED;
        String json_no_zone = TestConstants.JSON_NO_ZONE;
        if (AnnotationLibrary.PURE_JAXB.equals(formatLibrary) || AnnotationLibrary.PURE_JAKARTA.equals(formatLibrary)) {
            json_zoned = TestConstants.JSON_ZONED_BAD_POST;
            json_no_zone = TestConstants.JSON_NO_ZONE_BAD_POST;
        }
        return replaceTypeInData(
                formatLibrary, accessType, dateLibrary, zoned, getDataByZone(zoned, json_zoned, json_no_zone));
    }

    private String getRequestTestXml(
            AnnotationLibrary formatLibrary, String accessType, TimeLibrary dateLibrary, TimeZoneIndicator zoned) {
        String xml_zoned = TestConstants.XML_ZONED;
        String xml_no_zone = TestConstants.XML_NO_ZONE;
        if (AnnotationLibrary.PURE_JAXB.equals(formatLibrary) || AnnotationLibrary.PURE_JAKARTA.equals(formatLibrary)) {
            xml_zoned = TestConstants.XML_ZONED_BAD_POST;
            xml_no_zone = TestConstants.XML_NO_ZONE_BAD_POST;
        }
        return replaceTypeInData(
                formatLibrary, accessType, dateLibrary, zoned, getDataByZone(zoned, xml_zoned, xml_no_zone));
    }
}

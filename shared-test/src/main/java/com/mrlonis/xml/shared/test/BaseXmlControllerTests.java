package com.mrlonis.xml.shared.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import com.mrlonis.xml.shared.enums.AnnotationLibrary;
import com.mrlonis.xml.shared.enums.TimeLibrary;
import com.mrlonis.xml.shared.enums.TimeZoneIndicator;
import com.mrlonis.xml.shared.enums.XmlAccessorType;
import com.mrlonis.xml.shared.model.BaseModel;
import com.mrlonis.xml.shared.util.Constants;
import com.mrlonis.xml.shared.util.FetchModelUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
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

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class BaseXmlControllerTests {
    private final MockMvc mockMvc;
    private final FetchModelUtil fetchModelUtil;

    public BaseXmlControllerTests(MockMvc mockMvc, FetchModelUtil fetchModelUtil) {
        this.mockMvc = mockMvc;
        this.fetchModelUtil = fetchModelUtil;
    }

    public abstract Stream<Arguments> testArguments();

    @ParameterizedTest
    @MethodSource("testArguments")
    void testJsonSerialization(
            AnnotationLibrary formatLibrary,
            XmlAccessorType accessType,
            TimeLibrary dateLibrary,
            TimeZoneIndicator zoned)
            throws Exception {
        performGetTest(formatLibrary, accessType, dateLibrary, zoned, MediaType.APPLICATION_JSON_VALUE);
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void testJsonDeserialization(
            AnnotationLibrary formatLibrary,
            XmlAccessorType accessType,
            TimeLibrary dateLibrary,
            TimeZoneIndicator zoned)
            throws Exception {
        performPostTest(formatLibrary, accessType, dateLibrary, zoned, MediaType.APPLICATION_JSON_VALUE);
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void testXmlSerialization(
            AnnotationLibrary formatLibrary,
            XmlAccessorType accessType,
            TimeLibrary dateLibrary,
            TimeZoneIndicator zoned)
            throws Exception {
        performGetTest(formatLibrary, accessType, dateLibrary, zoned, MediaType.APPLICATION_XML_VALUE);
    }

    @ParameterizedTest
    @MethodSource("testArguments")
    void testXmlDeserialization(
            AnnotationLibrary formatLibrary,
            XmlAccessorType accessType,
            TimeLibrary dateLibrary,
            TimeZoneIndicator zoned)
            throws Exception {
        performPostTest(formatLibrary, accessType, dateLibrary, zoned, MediaType.APPLICATION_XML_VALUE);
    }

    private void performGetTest(
            AnnotationLibrary formatLibrary,
            XmlAccessorType accessType,
            TimeLibrary dateLibrary,
            TimeZoneIndicator zoned,
            String mediaType)
            throws Exception {
        UriComponentsBuilder builder = UriComponentsBuilder.fromPath(
                        Constants.XML_PATH + Constants.SLASH + formatLibrary)
                .queryParam("accessType", accessType)
                .queryParam("dateLibrary", dateLibrary)
                .queryParam("zoned", zoned);

        String json = getResponseData(formatLibrary, accessType, dateLibrary, zoned, mediaType);
        mockMvc.perform(MockMvcRequestBuilders.get(builder.build().toUriString())
                        .header(HttpHeaders.ACCEPT, mediaType))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentTypeCompatibleWith(mediaType))
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo(json)));
    }

    private void performPostTest(
            AnnotationLibrary formatLibrary,
            XmlAccessorType accessType,
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
            XmlAccessorType accessType,
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
            AnnotationLibrary formatLibrary,
            XmlAccessorType accessType,
            TimeLibrary dateLibrary,
            TimeZoneIndicator zoned) {
        return replaceTypeInData(
                formatLibrary,
                accessType,
                dateLibrary,
                zoned,
                getDataByZone(zoned, TestConstants.JSON_ZONED, TestConstants.JSON_NO_ZONE));
    }

    private String getResponseTestXml(
            AnnotationLibrary formatLibrary,
            XmlAccessorType accessType,
            TimeLibrary dateLibrary,
            TimeZoneIndicator zoned) {
        return replaceTypeInData(
                formatLibrary,
                accessType,
                dateLibrary,
                zoned,
                getDataByZone(zoned, TestConstants.XML_ZONED, TestConstants.XML_NO_ZONE));
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
            XmlAccessorType accessType,
            TimeLibrary dateLibrary,
            TimeZoneIndicator zoned,
            String stringToReplace) {
        BaseModel<?> model = fetchModelUtil.fetchModel(formatLibrary, accessType, dateLibrary, zoned);
        String className = model.getClass().getName();
        className = className.substring(className.lastIndexOf('.') + 1);
        Map<String, String> valuesMap = new HashMap<>();
        valuesMap.put("className", className);
        StringSubstitutor sub = new StringSubstitutor(valuesMap);
        return sub.replace(stringToReplace);
    }

    private String getRequestData(
            AnnotationLibrary formatLibrary,
            XmlAccessorType accessType,
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
            AnnotationLibrary formatLibrary,
            XmlAccessorType accessType,
            TimeLibrary dateLibrary,
            TimeZoneIndicator zoned) {
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
            AnnotationLibrary formatLibrary,
            XmlAccessorType accessType,
            TimeLibrary dateLibrary,
            TimeZoneIndicator zoned) {
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

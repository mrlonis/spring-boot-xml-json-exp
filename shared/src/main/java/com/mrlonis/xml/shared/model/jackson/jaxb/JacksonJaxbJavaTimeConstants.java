package com.mrlonis.xml.shared.model.jackson.jaxb;

import com.mrlonis.xml.shared.enums.TimeZoneIndicator;
import com.mrlonis.xml.shared.model.BaseModel;
import com.mrlonis.xml.shared.time.TimeConstants;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JacksonJaxbJavaTimeConstants {
    private static final JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypeField
            JACKSON_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_FIELD =
                    JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypeField.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypeNone
            JACKSON_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_NONE =
                    JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypeNone.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypeProperty
            JACKSON_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY =
                    JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypeProperty.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypePublicMember
            JACKSON_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypePublicMember.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAXB_JAVA_TIME_NO_ZONE_MAP = Map.of(
            "field", JACKSON_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_FIELD,
            "none", JACKSON_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_NONE,
            "property", JACKSON_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY,
            "public_member", JACKSON_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER);

    private static final JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypeField
            JACKSON_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_FIELD =
                    JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypeField.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypeNone
            JACKSON_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_NONE =
                    JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypeNone.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypeProperty
            JACKSON_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_PROPERTY =
                    JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypeProperty.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypePublicMember
            JACKSON_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypePublicMember.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAXB_JAVA_TIME_ZONED_MAP = Map.of(
            "field", JACKSON_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_FIELD,
            "none", JACKSON_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_NONE,
            "property", JACKSON_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_PROPERTY,
            "public_member", JACKSON_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER);

    public static final Map<TimeZoneIndicator, Map<String, BaseModel<?>>> JACKSON_JAXB_JAVA_TIME_MAP = Map.of(
            TimeZoneIndicator.ZONED,
            JACKSON_JAXB_JAVA_TIME_ZONED_MAP,
            TimeZoneIndicator.NO_ZONE,
            JACKSON_JAXB_JAVA_TIME_NO_ZONE_MAP);
}

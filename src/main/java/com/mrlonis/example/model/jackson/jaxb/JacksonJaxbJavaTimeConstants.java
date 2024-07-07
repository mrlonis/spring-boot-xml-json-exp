package com.mrlonis.example.model.jackson.jaxb;

import static com.mrlonis.example.util.Constants.AUTHOR;
import static com.mrlonis.example.util.Constants.ID;
import static com.mrlonis.example.util.Constants.JAVA_TIME_LOCAL_DATE_TIME;
import static com.mrlonis.example.util.Constants.JAVA_TIME_ZONED_DATE_TIME;
import static com.mrlonis.example.util.Constants.NAME;
import static com.mrlonis.example.util.Constants.NO_ZONE;
import static com.mrlonis.example.util.Constants.TAGS;
import static com.mrlonis.example.util.Constants.ZONED;

import com.mrlonis.example.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JacksonJaxbJavaTimeConstants {
    private static final JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypeField
            JACKSON_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_FIELD =
                    JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypeField.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypeNone
            JACKSON_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_NONE =
                    JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypeNone.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypeProperty
            JACKSON_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY =
                    JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypeProperty.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypePublicMember
            JACKSON_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tags(TAGS)
                            .build();

    private static final Map<String, BaseModel> JACKSON_JAXB_JAVA_TIME_NO_ZONE_MAP = Map.of(
            "field", JACKSON_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_FIELD,
            "none", JACKSON_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_NONE,
            "property", JACKSON_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY,
            "public_member", JACKSON_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER);

    private static final JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypeField
            JACKSON_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_FIELD =
                    JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypeField.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypeNone
            JACKSON_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_NONE =
                    JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypeNone.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypeProperty
            JACKSON_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_PROPERTY =
                    JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypeProperty.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypePublicMember
            JACKSON_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tags(TAGS)
                            .build();

    private static final Map<String, BaseModel> JACKSON_JAXB_JAVA_TIME_ZONED_MAP = Map.of(
            "field", JACKSON_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_FIELD,
            "none", JACKSON_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_NONE,
            "property", JACKSON_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_PROPERTY,
            "public_member", JACKSON_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER);

    public static final Map<String, Map<String, BaseModel>> JACKSON_JAXB_JAVA_TIME_MAP =
            Map.of(ZONED, JACKSON_JAXB_JAVA_TIME_ZONED_MAP, NO_ZONE, JACKSON_JAXB_JAVA_TIME_NO_ZONE_MAP);
}

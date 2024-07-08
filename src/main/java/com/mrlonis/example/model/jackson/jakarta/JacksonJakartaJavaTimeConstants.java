package com.mrlonis.example.model.jackson.jakarta;

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
public class JacksonJakartaJavaTimeConstants {
    private static final JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypeField
            JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_FIELD =
                    JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypeField.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypeNone
            JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_NONE =
                    JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypeNone.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypeProperty
            JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY =
                    JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypeProperty.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypePublicMember
            JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tags(TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_MAP = Map.of(
            "field", JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_FIELD,
            "none", JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_NONE,
            "property", JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY,
            "public_member", JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER);

    private static final JacksonJakartaJavaTimeModels.JacksonJakartaModelAccessTypeField
            JACKSON_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_FIELD =
                    JacksonJakartaJavaTimeModels.JacksonJakartaModelAccessTypeField.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJakartaJavaTimeModels.JacksonJakartaModelAccessTypeNone
            JACKSON_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_NONE =
                    JacksonJakartaJavaTimeModels.JacksonJakartaModelAccessTypeNone.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJakartaJavaTimeModels.JacksonJakartaModelAccessTypeProperty
            JACKSON_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_PROPERTY =
                    JacksonJakartaJavaTimeModels.JacksonJakartaModelAccessTypeProperty.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJakartaJavaTimeModels.JacksonJakartaModelAccessTypePublicMember
            JACKSON_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJakartaJavaTimeModels.JacksonJakartaModelAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tags(TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAKARTA_JAVA_TIME_ZONED_MAP = Map.of(
            "field", JACKSON_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_FIELD,
            "none", JACKSON_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_NONE,
            "property", JACKSON_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_PROPERTY,
            "public_member", JACKSON_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER);

    public static final Map<String, Map<String, BaseModel<?>>> JACKSON_JAKARTA_JAVA_TIME_MAP =
            Map.of(ZONED, JACKSON_JAKARTA_JAVA_TIME_ZONED_MAP, NO_ZONE, JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_MAP);
}

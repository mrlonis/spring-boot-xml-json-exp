package com.mrlonis.xml.shared.model.jackson.jakarta;

import com.mrlonis.xml.shared.model.BaseModel;
import com.mrlonis.xml.shared.time.TimeConstants;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JacksonJakartaJavaTimeConstants {
    private static final JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypeField
            JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_FIELD =
                    JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypeField.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypeNone
            JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_NONE =
                    JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypeNone.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypeProperty
            JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY =
                    JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypeProperty.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypePublicMember
            JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypePublicMember.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_MAP = Map.of(
            "field", JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_FIELD,
            "none", JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_NONE,
            "property", JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY,
            "public_member", JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER);

    private static final JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeZonedAccessTypeField
            JACKSON_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_FIELD =
                    JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeZonedAccessTypeField.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeZonedAccessTypeNone
            JACKSON_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_NONE =
                    JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeZonedAccessTypeNone.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeZonedAccessTypeProperty
            JACKSON_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_PROPERTY =
                    JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeZonedAccessTypeProperty.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeZonedAccessTypePublicMember
            JACKSON_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeZonedAccessTypePublicMember.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAKARTA_JAVA_TIME_ZONED_MAP = Map.of(
            "field", JACKSON_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_FIELD,
            "none", JACKSON_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_NONE,
            "property", JACKSON_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_PROPERTY,
            "public_member", JACKSON_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER);

    public static final Map<String, Map<String, BaseModel<?>>> JACKSON_JAKARTA_JAVA_TIME_MAP = Map.of(
            TimeConstants.ZONED,
            JACKSON_JAKARTA_JAVA_TIME_ZONED_MAP,
            TimeConstants.NO_ZONE,
            JACKSON_JAKARTA_JAVA_TIME_NO_ZONE_MAP);
}

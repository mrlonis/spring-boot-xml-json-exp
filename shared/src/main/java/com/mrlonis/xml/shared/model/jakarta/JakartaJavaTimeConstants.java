package com.mrlonis.xml.shared.model.jakarta;

import static com.mrlonis.xml.shared.util.Constants.AUTHOR;
import static com.mrlonis.xml.shared.util.Constants.ID;
import static com.mrlonis.xml.shared.util.Constants.JAVA_TIME_LOCAL_DATE_TIME;
import static com.mrlonis.xml.shared.util.Constants.JAVA_TIME_ZONED_DATE_TIME;
import static com.mrlonis.xml.shared.util.Constants.NAME;
import static com.mrlonis.xml.shared.util.Constants.TAGS;

import com.mrlonis.xml.shared.enums.TimeZoneIndicator;
import com.mrlonis.xml.shared.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JakartaJavaTimeConstants {
    private static final JakartaJavaTimeModels.JakartaJavaTimeNoZoneAccessTypeField
            JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_FIELD =
                    JakartaJavaTimeModels.JakartaJavaTimeNoZoneAccessTypeField.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final JakartaJavaTimeModels.JakartaJavaTimeNoZoneAccessTypeNone
            JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_NONE =
                    JakartaJavaTimeModels.JakartaJavaTimeNoZoneAccessTypeNone.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final JakartaJavaTimeModels.JakartaJavaTimeNoZoneAccessTypeProperty
            JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY =
                    JakartaJavaTimeModels.JakartaJavaTimeNoZoneAccessTypeProperty.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final JakartaJavaTimeModels.JakartaJavaTimeNoZoneAccessTypePublicMember
            JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER =
                    JakartaJavaTimeModels.JakartaJavaTimeNoZoneAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JAKARTA_JAVA_TIME_NO_ZONE_MAP = Map.of(
            "field",
            JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_FIELD,
            "none",
            JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_NONE,
            "property",
            JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY,
            "public_member",
            JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER);

    private static final JakartaJavaTimeModels.JakartaJavaTimeZonedAccessTypeField
            JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_FIELD =
                    JakartaJavaTimeModels.JakartaJavaTimeZonedAccessTypeField.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final JakartaJavaTimeModels.JakartaJavaTimeZonedAccessTypeNone
            JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_NONE =
                    JakartaJavaTimeModels.JakartaJavaTimeZonedAccessTypeNone.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final JakartaJavaTimeModels.JakartaJavaTimeZonedAccessTypeProperty
            JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_PROPERTY =
                    JakartaJavaTimeModels.JakartaJavaTimeZonedAccessTypeProperty.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final JakartaJavaTimeModels.JakartaJavaTimeZonedAccessTypePublicMember
            JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER =
                    JakartaJavaTimeModels.JakartaJavaTimeZonedAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JAKARTA_JAVA_TIME_ZONED_MAP = Map.of(
            "field",
            JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_FIELD,
            "none",
            JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_NONE,
            "property",
            JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_PROPERTY,
            "public_member",
            JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER);

    public static final Map<TimeZoneIndicator, Map<String, BaseModel<?>>> JAKARTA_JAVA_TIME_MAP = Map.of(
            TimeZoneIndicator.ZONED,
            JAKARTA_JAVA_TIME_ZONED_MAP,
            TimeZoneIndicator.NO_ZONE,
            JAKARTA_JAVA_TIME_NO_ZONE_MAP);
}

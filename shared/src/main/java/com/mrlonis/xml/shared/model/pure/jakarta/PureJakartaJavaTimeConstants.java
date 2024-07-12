package com.mrlonis.xml.shared.model.pure.jakarta;

import static com.mrlonis.xml.shared.time.TimeConstants.AUTHOR;
import static com.mrlonis.xml.shared.time.TimeConstants.ID;
import static com.mrlonis.xml.shared.time.TimeConstants.JAVA_TIME_LOCAL_DATE_TIME;
import static com.mrlonis.xml.shared.time.TimeConstants.JAVA_TIME_ZONED_DATE_TIME;
import static com.mrlonis.xml.shared.time.TimeConstants.NAME;
import static com.mrlonis.xml.shared.time.TimeConstants.NO_ZONE;
import static com.mrlonis.xml.shared.time.TimeConstants.TAGS;
import static com.mrlonis.xml.shared.time.TimeConstants.ZONED;

import com.mrlonis.xml.shared.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PureJakartaJavaTimeConstants {
    private static final PureJakartaJavaTimeModels.PureJakartaJavaTimeNoZoneAccessTypeField
            PURE_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_FIELD =
                    PureJakartaJavaTimeModels.PureJakartaJavaTimeNoZoneAccessTypeField.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJakartaJavaTimeModels.PureJakartaJavaTimeNoZoneAccessTypeNone
            PURE_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_NONE =
                    PureJakartaJavaTimeModels.PureJakartaJavaTimeNoZoneAccessTypeNone.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJakartaJavaTimeModels.PureJakartaJavaTimeNoZoneAccessTypeProperty
            PURE_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY =
                    PureJakartaJavaTimeModels.PureJakartaJavaTimeNoZoneAccessTypeProperty.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJakartaJavaTimeModels.PureJakartaJavaTimeNoZoneAccessTypePublicMember
            PURE_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER =
                    PureJakartaJavaTimeModels.PureJakartaJavaTimeNoZoneAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> PURE_JAKARTA_JAVA_TIME_NO_ZONE_MAP = Map.of(
            "field",
            PURE_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_FIELD,
            "none",
            PURE_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_NONE,
            "property",
            PURE_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY,
            "public_member",
            PURE_JAKARTA_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER);

    private static final PureJakartaJavaTimeModels.PureJakartaJavaTimeZonedAccessTypeField
            PURE_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_FIELD =
                    PureJakartaJavaTimeModels.PureJakartaJavaTimeZonedAccessTypeField.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJakartaJavaTimeModels.PureJakartaJavaTimeZonedAccessTypeNone
            PURE_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_NONE =
                    PureJakartaJavaTimeModels.PureJakartaJavaTimeZonedAccessTypeNone.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJakartaJavaTimeModels.PureJakartaJavaTimeZonedAccessTypeProperty
            PURE_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_PROPERTY =
                    PureJakartaJavaTimeModels.PureJakartaJavaTimeZonedAccessTypeProperty.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJakartaJavaTimeModels.PureJakartaJavaTimeZonedAccessTypePublicMember
            PURE_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER =
                    PureJakartaJavaTimeModels.PureJakartaJavaTimeZonedAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> PURE_JAKARTA_JAVA_TIME_ZONED_MAP = Map.of(
            "field",
            PURE_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_FIELD,
            "none",
            PURE_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_NONE,
            "property",
            PURE_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_PROPERTY,
            "public_member",
            PURE_JAKARTA_JAVA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER);

    public static final Map<String, Map<String, BaseModel<?>>> PURE_JAKARTA_JAVA_TIME_MAP =
            Map.of(ZONED, PURE_JAKARTA_JAVA_TIME_ZONED_MAP, NO_ZONE, PURE_JAKARTA_JAVA_TIME_NO_ZONE_MAP);
}

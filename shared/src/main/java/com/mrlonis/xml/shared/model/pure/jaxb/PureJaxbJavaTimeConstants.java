package com.mrlonis.xml.shared.model.pure.jaxb;

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
public class PureJaxbJavaTimeConstants {
    private static final PureJaxbJavaTimeModels.PureJaxbJavaTimeNoZoneAccessTypeField
            PURE_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_FIELD =
                    PureJaxbJavaTimeModels.PureJaxbJavaTimeNoZoneAccessTypeField.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJaxbJavaTimeModels.PureJaxbJavaTimeNoZoneAccessTypeNone
            PURE_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_NONE =
                    PureJaxbJavaTimeModels.PureJaxbJavaTimeNoZoneAccessTypeNone.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJaxbJavaTimeModels.PureJaxbJavaTimeNoZoneAccessTypeProperty
            PURE_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY =
                    PureJaxbJavaTimeModels.PureJaxbJavaTimeNoZoneAccessTypeProperty.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJaxbJavaTimeModels.PureJaxbJavaTimeNoZoneAccessTypePublicMember
            PURE_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER =
                    PureJaxbJavaTimeModels.PureJaxbJavaTimeNoZoneAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> PURE_JAXB_JAVA_TIME_NO_ZONE_MAP = Map.of(
            "field",
            PURE_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_FIELD,
            "none",
            PURE_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_NONE,
            "property",
            PURE_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY,
            "public_member",
            PURE_JAXB_JAVA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER);

    private static final PureJaxbJavaTimeModels.PureJaxbJavaTimeZonedAccessTypeField
            PURE_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_FIELD =
                    PureJaxbJavaTimeModels.PureJaxbJavaTimeZonedAccessTypeField.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJaxbJavaTimeModels.PureJaxbJavaTimeZonedAccessTypeNone
            PURE_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_NONE =
                    PureJaxbJavaTimeModels.PureJaxbJavaTimeZonedAccessTypeNone.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJaxbJavaTimeModels.PureJaxbJavaTimeZonedAccessTypeProperty
            PURE_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_PROPERTY =
                    PureJaxbJavaTimeModels.PureJaxbJavaTimeZonedAccessTypeProperty.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJaxbJavaTimeModels.PureJaxbJavaTimeZonedAccessTypePublicMember
            PURE_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER =
                    PureJaxbJavaTimeModels.PureJaxbJavaTimeZonedAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JAVA_TIME_ZONED_DATE_TIME)
                            .tag(TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> PURE_JAXB_JAVA_TIME_ZONED_MAP = Map.of(
            "field",
            PURE_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_FIELD,
            "none",
            PURE_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_NONE,
            "property",
            PURE_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_PROPERTY,
            "public_member",
            PURE_JAXB_JAVA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER);

    public static final Map<String, Map<String, BaseModel<?>>> PURE_JAXB_JAVA_TIME_MAP =
            Map.of(ZONED, PURE_JAXB_JAVA_TIME_ZONED_MAP, NO_ZONE, PURE_JAXB_JAVA_TIME_NO_ZONE_MAP);
}

package com.mrlonis.xml.shared.model.jackson.jaxb;

import com.mrlonis.xml.shared.model.BaseModel;
import com.mrlonis.xml.shared.time.TimeConstants;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JacksonJaxbJodaTimeConstants {
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeField
            JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeField.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeNone
            JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeNone.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeProperty
            JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeProperty.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypePublicMember
            JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypePublicMember.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAXB_JODA_TIME_NO_ZONE_MAP = Map.of(
            "field", JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD,
            "none", JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE,
            "property", JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY,
            "public_member", JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER);

    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeField
            JACKSON_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_FIELD =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeField.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeNone
            JACKSON_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_NONE =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeNone.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeProperty
            JACKSON_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PROPERTY =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeProperty.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypePublicMember
            JACKSON_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypePublicMember.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAXB_JODA_TIME_ZONED_MAP = Map.of(
            "field",
            JACKSON_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_FIELD,
            "none",
            JACKSON_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_NONE,
            "property",
            JACKSON_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PROPERTY,
            "public_member",
            JACKSON_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER);

    public static final Map<String, Map<String, BaseModel<?>>> JACKSON_JAXB_JODA_TIME_MAP = Map.of(
            TimeConstants.ZONED,
            JACKSON_JAXB_JODA_TIME_ZONED_MAP,
            TimeConstants.NO_ZONE,
            JACKSON_JAXB_JODA_TIME_NO_ZONE_MAP);
}
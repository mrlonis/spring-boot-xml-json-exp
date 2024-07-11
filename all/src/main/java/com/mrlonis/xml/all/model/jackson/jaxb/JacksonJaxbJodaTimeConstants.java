package com.mrlonis.xml.all.model.jackson.jaxb;

import com.mrlonis.xml.all.model.BaseModel;
import com.mrlonis.xml.all.util.Constants;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JacksonJaxbJodaTimeConstants {
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeField
            JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeField.builder()
                            .id(Constants.ID)
                            .name(Constants.NAME)
                            .author(Constants.AUTHOR)
                            .date(Constants.JODA_LOCAL_DATE_TIME)
                            .tag(Constants.TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeNone
            JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeNone.builder()
                            .id(Constants.ID)
                            .name(Constants.NAME)
                            .author(Constants.AUTHOR)
                            .date(Constants.JODA_LOCAL_DATE_TIME)
                            .tag(Constants.TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeProperty
            JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeProperty.builder()
                            .id(Constants.ID)
                            .name(Constants.NAME)
                            .author(Constants.AUTHOR)
                            .date(Constants.JODA_LOCAL_DATE_TIME)
                            .tag(Constants.TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypePublicMember
            JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypePublicMember.builder()
                            .id(Constants.ID)
                            .name(Constants.NAME)
                            .author(Constants.AUTHOR)
                            .date(Constants.JODA_LOCAL_DATE_TIME)
                            .tag(Constants.TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAXB_JODA_TIME_NO_ZONE_MAP = Map.of(
            "field", JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD,
            "none", JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE,
            "property", JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY,
            "public_member", JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER);

    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeField
            JACKSON_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_FIELD =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeField.builder()
                            .id(Constants.ID)
                            .name(Constants.NAME)
                            .author(Constants.AUTHOR)
                            .date(Constants.JODA_DATE_TIME)
                            .tag(Constants.TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeNone
            JACKSON_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_NONE =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeNone.builder()
                            .id(Constants.ID)
                            .name(Constants.NAME)
                            .author(Constants.AUTHOR)
                            .date(Constants.JODA_DATE_TIME)
                            .tag(Constants.TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeProperty
            JACKSON_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PROPERTY =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeProperty.builder()
                            .id(Constants.ID)
                            .name(Constants.NAME)
                            .author(Constants.AUTHOR)
                            .date(Constants.JODA_DATE_TIME)
                            .tag(Constants.TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypePublicMember
            JACKSON_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypePublicMember.builder()
                            .id(Constants.ID)
                            .name(Constants.NAME)
                            .author(Constants.AUTHOR)
                            .date(Constants.JODA_DATE_TIME)
                            .tag(Constants.TAGS)
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
            Constants.ZONED, JACKSON_JAXB_JODA_TIME_ZONED_MAP, Constants.NO_ZONE, JACKSON_JAXB_JODA_TIME_NO_ZONE_MAP);
}

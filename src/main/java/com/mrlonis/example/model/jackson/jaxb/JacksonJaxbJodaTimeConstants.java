package com.mrlonis.example.model.jackson.jaxb;

import static com.mrlonis.example.util.Constants.AUTHOR;
import static com.mrlonis.example.util.Constants.ID;
import static com.mrlonis.example.util.Constants.JODA_DATE_TIME;
import static com.mrlonis.example.util.Constants.JODA_LOCAL_DATE_TIME;
import static com.mrlonis.example.util.Constants.NAME;
import static com.mrlonis.example.util.Constants.NO_ZONE;
import static com.mrlonis.example.util.Constants.TAGS;
import static com.mrlonis.example.util.Constants.ZONED;

import com.mrlonis.example.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JacksonJaxbJodaTimeConstants {
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeField
            JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeField.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_LOCAL_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeNone
            JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeNone.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_LOCAL_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeProperty
            JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeProperty.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_LOCAL_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypePublicMember
            JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_LOCAL_DATE_TIME)
                            .tags(TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAXB_JODA_TIME_NO_ZONE_MAP = Map.of(
            "field", JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD,
            "none", JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE,
            "property", JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY,
            "public_member", JACKSON_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER);

    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeField
            JACKSON_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_FIELD =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeField.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeNone
            JACKSON_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_NONE =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeNone.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeProperty
            JACKSON_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PROPERTY =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeProperty.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_DATE_TIME)
                            .tags(TAGS)
                            .build();
    private static final JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypePublicMember
            JACKSON_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_DATE_TIME)
                            .tags(TAGS)
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

    public static final Map<String, Map<String, BaseModel<?>>> JACKSON_JAXB_JODA_TIME_MAP =
            Map.of(ZONED, JACKSON_JAXB_JODA_TIME_ZONED_MAP, NO_ZONE, JACKSON_JAXB_JODA_TIME_NO_ZONE_MAP);
}

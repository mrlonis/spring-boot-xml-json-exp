package com.mrlonis.xml.shared.model.jaxb;

import static com.mrlonis.xml.shared.time.TimeConstants.AUTHOR;
import static com.mrlonis.xml.shared.time.TimeConstants.ID;
import static com.mrlonis.xml.shared.time.TimeConstants.JODA_DATE_TIME;
import static com.mrlonis.xml.shared.time.TimeConstants.JODA_LOCAL_DATE_TIME;
import static com.mrlonis.xml.shared.time.TimeConstants.NAME;
import static com.mrlonis.xml.shared.time.TimeConstants.NO_ZONE;
import static com.mrlonis.xml.shared.time.TimeConstants.TAGS;
import static com.mrlonis.xml.shared.time.TimeConstants.ZONED;

import com.mrlonis.xml.shared.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JaxbJodaTimeConstants {
    private static final JaxbJodaTimeModels.JaxbJodaTimeNoZoneAccessTypeField JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD =
            JaxbJodaTimeModels.JaxbJodaTimeNoZoneAccessTypeField.builder()
                    .id(ID)
                    .name(NAME)
                    .author(AUTHOR)
                    .date(JODA_LOCAL_DATE_TIME)
                    .tag(TAGS)
                    .build();
    private static final JaxbJodaTimeModels.JaxbJodaTimeNoZoneAccessTypeNone JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE =
            JaxbJodaTimeModels.JaxbJodaTimeNoZoneAccessTypeNone.builder()
                    .id(ID)
                    .name(NAME)
                    .author(AUTHOR)
                    .date(JODA_LOCAL_DATE_TIME)
                    .tag(TAGS)
                    .build();
    private static final JaxbJodaTimeModels.JaxbJodaTimeNoZoneAccessTypeProperty
            JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY =
                    JaxbJodaTimeModels.JaxbJodaTimeNoZoneAccessTypeProperty.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final JaxbJodaTimeModels.JaxbJodaTimeNoZoneAccessTypePublicMember
            JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER =
                    JaxbJodaTimeModels.JaxbJodaTimeNoZoneAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JAXB_JODA_TIME_NO_ZONE_MAP = Map.of(
            "field",
            JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD,
            "none",
            JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE,
            "property",
            JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY,
            "public_member",
            JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER);

    private static final JaxbJodaTimeModels.JaxbJodaTimeZonedAccessTypeField JAXB_JODA_TIME_ZONED_ACCESS_TYPE_FIELD =
            JaxbJodaTimeModels.JaxbJodaTimeZonedAccessTypeField.builder()
                    .id(ID)
                    .name(NAME)
                    .author(AUTHOR)
                    .date(JODA_DATE_TIME)
                    .tag(TAGS)
                    .build();
    private static final JaxbJodaTimeModels.JaxbJodaTimeZonedAccessTypeNone JAXB_JODA_TIME_ZONED_ACCESS_TYPE_NONE =
            JaxbJodaTimeModels.JaxbJodaTimeZonedAccessTypeNone.builder()
                    .id(ID)
                    .name(NAME)
                    .author(AUTHOR)
                    .date(JODA_DATE_TIME)
                    .tag(TAGS)
                    .build();
    private static final JaxbJodaTimeModels.JaxbJodaTimeZonedAccessTypeProperty
            JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PROPERTY = JaxbJodaTimeModels.JaxbJodaTimeZonedAccessTypeProperty.builder()
                    .id(ID)
                    .name(NAME)
                    .author(AUTHOR)
                    .date(JODA_DATE_TIME)
                    .tag(TAGS)
                    .build();
    private static final JaxbJodaTimeModels.JaxbJodaTimeZonedAccessTypePublicMember
            JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER =
                    JaxbJodaTimeModels.JaxbJodaTimeZonedAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_DATE_TIME)
                            .tag(TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JAXB_JODA_TIME_ZONED_MAP = Map.of(
            "field",
            JAXB_JODA_TIME_ZONED_ACCESS_TYPE_FIELD,
            "none",
            JAXB_JODA_TIME_ZONED_ACCESS_TYPE_NONE,
            "property",
            JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PROPERTY,
            "public_member",
            JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER);

    public static final Map<String, Map<String, BaseModel<?>>> JAXB_JODA_TIME_MAP =
            Map.of(ZONED, JAXB_JODA_TIME_ZONED_MAP, NO_ZONE, JAXB_JODA_TIME_NO_ZONE_MAP);
}

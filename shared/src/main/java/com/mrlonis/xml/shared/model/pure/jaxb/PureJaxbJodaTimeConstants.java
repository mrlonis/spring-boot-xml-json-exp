package com.mrlonis.xml.shared.model.pure.jaxb;

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
public class PureJaxbJodaTimeConstants {
    private static final PureJaxbJodaTimeModels.PureJaxbJodaTimeNoZoneAccessTypeField
            PURE_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD =
                    PureJaxbJodaTimeModels.PureJaxbJodaTimeNoZoneAccessTypeField.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJaxbJodaTimeModels.PureJaxbJodaTimeNoZoneAccessTypeNone
            PURE_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE =
                    PureJaxbJodaTimeModels.PureJaxbJodaTimeNoZoneAccessTypeNone.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJaxbJodaTimeModels.PureJaxbJodaTimeNoZoneAccessTypeProperty
            PURE_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY =
                    PureJaxbJodaTimeModels.PureJaxbJodaTimeNoZoneAccessTypeProperty.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJaxbJodaTimeModels.PureJaxbJodaTimeNoZoneAccessTypePublicMember
            PURE_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER =
                    PureJaxbJodaTimeModels.PureJaxbJodaTimeNoZoneAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_LOCAL_DATE_TIME)
                            .tag(TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> PURE_JAXB_JODA_TIME_NO_ZONE_MAP = Map.of(
            "field",
            PURE_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD,
            "none",
            PURE_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE,
            "property",
            PURE_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY,
            "public_member",
            PURE_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER);

    private static final PureJaxbJodaTimeModels.PureJaxbJodaTimeZonedAccessTypeField
            PURE_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_FIELD =
                    PureJaxbJodaTimeModels.PureJaxbJodaTimeZonedAccessTypeField.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJaxbJodaTimeModels.PureJaxbJodaTimeZonedAccessTypeNone
            PURE_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_NONE =
                    PureJaxbJodaTimeModels.PureJaxbJodaTimeZonedAccessTypeNone.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJaxbJodaTimeModels.PureJaxbJodaTimeZonedAccessTypeProperty
            PURE_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PROPERTY =
                    PureJaxbJodaTimeModels.PureJaxbJodaTimeZonedAccessTypeProperty.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_DATE_TIME)
                            .tag(TAGS)
                            .build();
    private static final PureJaxbJodaTimeModels.PureJaxbJodaTimeZonedAccessTypePublicMember
            PURE_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER =
                    PureJaxbJodaTimeModels.PureJaxbJodaTimeZonedAccessTypePublicMember.builder()
                            .id(ID)
                            .name(NAME)
                            .author(AUTHOR)
                            .date(JODA_DATE_TIME)
                            .tag(TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> PURE_JAXB_JODA_TIME_ZONED_MAP = Map.of(
            "field",
            PURE_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_FIELD,
            "none",
            PURE_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_NONE,
            "property",
            PURE_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PROPERTY,
            "public_member",
            PURE_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER);

    public static final Map<String, Map<String, BaseModel<?>>> PURE_JAXB_JODA_TIME_MAP =
            Map.of(ZONED, PURE_JAXB_JODA_TIME_ZONED_MAP, NO_ZONE, PURE_JAXB_JODA_TIME_NO_ZONE_MAP);
}

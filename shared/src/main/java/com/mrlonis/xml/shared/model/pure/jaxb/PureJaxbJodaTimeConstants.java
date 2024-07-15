package com.mrlonis.xml.shared.model.pure.jaxb;

import static com.mrlonis.xml.shared.util.Constants.AUTHOR;
import static com.mrlonis.xml.shared.util.Constants.ID;
import static com.mrlonis.xml.shared.util.Constants.JODA_DATE_TIME;
import static com.mrlonis.xml.shared.util.Constants.JODA_LOCAL_DATE_TIME;
import static com.mrlonis.xml.shared.util.Constants.NAME;
import static com.mrlonis.xml.shared.util.Constants.TAGS;

import com.mrlonis.xml.shared.enums.TimeZoneIndicator;
import com.mrlonis.xml.shared.model.BaseModel;
import com.mrlonis.xml.shared.util.Constants;
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
            Constants.FIELD,
            PURE_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD,
            Constants.NONE,
            PURE_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE,
            Constants.PROPERTY,
            PURE_JAXB_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY,
            Constants.PUBLIC_MEMBER,
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
            Constants.FIELD,
            PURE_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_FIELD,
            Constants.NONE,
            PURE_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_NONE,
            Constants.PROPERTY,
            PURE_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PROPERTY,
            Constants.PUBLIC_MEMBER,
            PURE_JAXB_JODA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER);

    public static final Map<TimeZoneIndicator, Map<String, BaseModel<?>>> PURE_JAXB_JODA_TIME_MAP = Map.of(
            TimeZoneIndicator.ZONED,
            PURE_JAXB_JODA_TIME_ZONED_MAP,
            TimeZoneIndicator.NO_ZONE,
            PURE_JAXB_JODA_TIME_NO_ZONE_MAP);
}

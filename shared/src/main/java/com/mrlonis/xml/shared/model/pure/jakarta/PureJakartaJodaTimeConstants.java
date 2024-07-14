package com.mrlonis.xml.shared.model.pure.jakarta;

import com.mrlonis.xml.shared.enums.TimeZoneIndicator;
import com.mrlonis.xml.shared.model.BaseModel;
import com.mrlonis.xml.shared.time.TimeConstants;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PureJakartaJodaTimeConstants {
    private static final PureJakartaJodaTimeModels.PureJakartaJodaTimeNoZoneAccessTypeField
            PURE_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD =
                    PureJakartaJodaTimeModels.PureJakartaJodaTimeNoZoneAccessTypeField.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final PureJakartaJodaTimeModels.PureJakartaJodaTimeNoZoneAccessTypeNone
            PURE_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE =
                    PureJakartaJodaTimeModels.PureJakartaJodaTimeNoZoneAccessTypeNone.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final PureJakartaJodaTimeModels.PureJakartaJodaTimeNoZoneAccessTypeProperty
            PURE_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY =
                    PureJakartaJodaTimeModels.PureJakartaJodaTimeNoZoneAccessTypeProperty.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final PureJakartaJodaTimeModels.PureJakartaJodaTimeNoZoneAccessTypePublicMember
            PURE_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER =
                    PureJakartaJodaTimeModels.PureJakartaJodaTimeNoZoneAccessTypePublicMember.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> PURE_JAKARTA_JODA_TIME_NO_ZONE_MAP = Map.of(
            "field",
            PURE_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD,
            "none",
            PURE_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE,
            "property",
            PURE_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY,
            "public_member",
            PURE_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER);

    private static final PureJakartaJodaTimeModels.PureJakartaJodaTimeZonedAccessTypeField
            PURE_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_FIELD =
                    PureJakartaJodaTimeModels.PureJakartaJodaTimeZonedAccessTypeField.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final PureJakartaJodaTimeModels.PureJakartaJodaTimeZonedAccessTypeNone
            PURE_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_NONE =
                    PureJakartaJodaTimeModels.PureJakartaJodaTimeZonedAccessTypeNone.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final PureJakartaJodaTimeModels.PureJakartaJodaTimeZonedAccessTypeProperty
            PURE_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_PROPERTY =
                    PureJakartaJodaTimeModels.PureJakartaJodaTimeZonedAccessTypeProperty.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final PureJakartaJodaTimeModels.PureJakartaJodaTimeZonedAccessTypePublicMember
            PURE_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER =
                    PureJakartaJodaTimeModels.PureJakartaJodaTimeZonedAccessTypePublicMember.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> PURE_JAKARTA_JODA_TIME_ZONED_MAP = Map.of(
            "field",
            PURE_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_FIELD,
            "none",
            PURE_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_NONE,
            "property",
            PURE_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_PROPERTY,
            "public_member",
            PURE_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER);

    public static final Map<TimeZoneIndicator, Map<String, BaseModel<?>>> PURE_JAKARTA_JODA_TIME_MAP = Map.of(
            TimeZoneIndicator.ZONED,
            PURE_JAKARTA_JODA_TIME_ZONED_MAP,
            TimeZoneIndicator.NO_ZONE,
            PURE_JAKARTA_JODA_TIME_NO_ZONE_MAP);
}

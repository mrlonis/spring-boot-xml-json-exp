package com.mrlonis.xml.shared.model.jakarta;

import com.mrlonis.xml.shared.enums.TimeZoneIndicator;
import com.mrlonis.xml.shared.model.BaseModel;
import com.mrlonis.xml.shared.time.TimeConstants;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JakartaJodaTimeConstants {
    private static final JakartaJodaTimeModels.JakartaJodaTimeNoZoneAccessTypeField
            JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD =
                    JakartaJodaTimeModels.JakartaJodaTimeNoZoneAccessTypeField.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JakartaJodaTimeModels.JakartaJodaTimeNoZoneAccessTypeNone
            JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE =
                    JakartaJodaTimeModels.JakartaJodaTimeNoZoneAccessTypeNone.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JakartaJodaTimeModels.JakartaJodaTimeNoZoneAccessTypeProperty
            JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY =
                    JakartaJodaTimeModels.JakartaJodaTimeNoZoneAccessTypeProperty.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JakartaJodaTimeModels.JakartaJodaTimeNoZoneAccessTypePublicMember
            JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER =
                    JakartaJodaTimeModels.JakartaJodaTimeNoZoneAccessTypePublicMember.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JAKARTA_JODA_TIME_NO_ZONE_MAP = Map.of(
            "field",
            JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD,
            "none",
            JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE,
            "property",
            JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY,
            "public_member",
            JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER);

    private static final JakartaJodaTimeModels.JakartaJodaTimeZonedAccessTypeField
            JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_FIELD =
                    JakartaJodaTimeModels.JakartaJodaTimeZonedAccessTypeField.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JakartaJodaTimeModels.JakartaJodaTimeZonedAccessTypeNone
            JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_NONE =
                    JakartaJodaTimeModels.JakartaJodaTimeZonedAccessTypeNone.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JakartaJodaTimeModels.JakartaJodaTimeZonedAccessTypeProperty
            JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_PROPERTY =
                    JakartaJodaTimeModels.JakartaJodaTimeZonedAccessTypeProperty.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JakartaJodaTimeModels.JakartaJodaTimeZonedAccessTypePublicMember
            JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER =
                    JakartaJodaTimeModels.JakartaJodaTimeZonedAccessTypePublicMember.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JAKARTA_JODA_TIME_ZONED_MAP = Map.of(
            "field",
            JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_FIELD,
            "none",
            JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_NONE,
            "property",
            JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_PROPERTY,
            "public_member",
            JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER);

    public static final Map<TimeZoneIndicator, Map<String, BaseModel<?>>> JAKARTA_JODA_TIME_MAP = Map.of(
            TimeZoneIndicator.ZONED,
            JAKARTA_JODA_TIME_ZONED_MAP,
            TimeZoneIndicator.NO_ZONE,
            JAKARTA_JODA_TIME_NO_ZONE_MAP);
}

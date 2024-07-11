package com.mrlonis.xml.all.model.jackson.jakarta;

import com.mrlonis.xml.all.model.BaseModel;
import com.mrlonis.xml.shared.time.TimeConstants;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JacksonJakartaJodaTimeConstants {
    private static final JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypeField
            JACKSON_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD =
                    JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypeField.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypeNone
            JACKSON_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE =
                    JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypeNone.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypeProperty
            JACKSON_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY =
                    JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypeProperty.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypePublicMember
            JACKSON_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypePublicMember.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_LOCAL_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAKARTA_JODA_TIME_NO_ZONE_MAP = Map.of(
            "field", JACKSON_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_FIELD,
            "none", JACKSON_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_NONE,
            "property", JACKSON_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_PROPERTY,
            "public_member", JACKSON_JAKARTA_JODA_TIME_NO_ZONE_ACCESS_TYPE_PUBLIC_MEMBER);

    private static final JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypeField
            JACKSON_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_FIELD =
                    JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypeField.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypeNone
            JACKSON_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_NONE =
                    JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypeNone.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypeProperty
            JACKSON_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_PROPERTY =
                    JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypeProperty.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();
    private static final JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypePublicMember
            JACKSON_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER =
                    JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypePublicMember.builder()
                            .id(TimeConstants.ID)
                            .name(TimeConstants.NAME)
                            .author(TimeConstants.AUTHOR)
                            .date(TimeConstants.JODA_DATE_TIME)
                            .tag(TimeConstants.TAGS)
                            .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAKARTA_JODA_TIME_ZONED_MAP = Map.of(
            "field",
            JACKSON_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_FIELD,
            "none",
            JACKSON_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_NONE,
            "property",
            JACKSON_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_PROPERTY,
            "public_member",
            JACKSON_JAKARTA_JODA_TIME_ZONED_ACCESS_TYPE_PUBLIC_MEMBER);

    public static final Map<String, Map<String, BaseModel<?>>> JACKSON_JAKARTA_JODA_TIME_MAP = Map.of(
            TimeConstants.ZONED,
            JACKSON_JAKARTA_JODA_TIME_ZONED_MAP,
            TimeConstants.NO_ZONE,
            JACKSON_JAKARTA_JODA_TIME_NO_ZONE_MAP);
}

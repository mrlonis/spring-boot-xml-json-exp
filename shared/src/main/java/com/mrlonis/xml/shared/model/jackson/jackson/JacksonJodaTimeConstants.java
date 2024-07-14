package com.mrlonis.xml.shared.model.jackson.jackson;

import com.mrlonis.xml.shared.enums.TimeZoneIndicator;
import com.mrlonis.xml.shared.model.BaseModel;
import com.mrlonis.xml.shared.util.Constants;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JacksonJodaTimeConstants {
    private static final JacksonJodaTimeModels.JacksonJodaTimeNoZone JACKSON_JODA_TIME_NO_ZONE =
            JacksonJodaTimeModels.JacksonJodaTimeNoZone.builder()
                    .id(Constants.ID)
                    .name(Constants.NAME)
                    .author(Constants.AUTHOR)
                    .date(Constants.JODA_LOCAL_DATE_TIME)
                    .tag(Constants.TAGS)
                    .build();

    private static final Map<String, BaseModel<?>> JACKSON_JODA_TIME_NO_ZONE_MAP = Map.of(
            "field", JACKSON_JODA_TIME_NO_ZONE,
            "none", JACKSON_JODA_TIME_NO_ZONE,
            "property", JACKSON_JODA_TIME_NO_ZONE,
            "public_member", JACKSON_JODA_TIME_NO_ZONE);

    private static final JacksonJodaTimeModels.JacksonJodaTimeZoned JACKSON_JODA_TIME_ZONED =
            JacksonJodaTimeModels.JacksonJodaTimeZoned.builder()
                    .id(Constants.ID)
                    .name(Constants.NAME)
                    .author(Constants.AUTHOR)
                    .date(Constants.JODA_DATE_TIME)
                    .tag(Constants.TAGS)
                    .build();

    private static final Map<String, BaseModel<?>> JACKSON_JODA_TIME_ZONED_MAP = Map.of(
            "field", JACKSON_JODA_TIME_ZONED,
            "none", JACKSON_JODA_TIME_ZONED,
            "property", JACKSON_JODA_TIME_ZONED,
            "public_member", JACKSON_JODA_TIME_ZONED);

    public static final Map<TimeZoneIndicator, Map<String, BaseModel<?>>> JACKSON_JODA_TIME_MAP = Map.of(
            TimeZoneIndicator.ZONED,
            JACKSON_JODA_TIME_ZONED_MAP,
            TimeZoneIndicator.NO_ZONE,
            JACKSON_JODA_TIME_NO_ZONE_MAP);
}

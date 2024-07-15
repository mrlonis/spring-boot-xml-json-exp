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
            Constants.FIELD, JACKSON_JODA_TIME_NO_ZONE,
            Constants.NONE, JACKSON_JODA_TIME_NO_ZONE,
            Constants.PROPERTY, JACKSON_JODA_TIME_NO_ZONE,
            Constants.PUBLIC_MEMBER, JACKSON_JODA_TIME_NO_ZONE);

    private static final JacksonJodaTimeModels.JacksonJodaTimeZoned JACKSON_JODA_TIME_ZONED =
            JacksonJodaTimeModels.JacksonJodaTimeZoned.builder()
                    .id(Constants.ID)
                    .name(Constants.NAME)
                    .author(Constants.AUTHOR)
                    .date(Constants.JODA_DATE_TIME)
                    .tag(Constants.TAGS)
                    .build();

    private static final Map<String, BaseModel<?>> JACKSON_JODA_TIME_ZONED_MAP = Map.of(
            Constants.FIELD, JACKSON_JODA_TIME_ZONED,
            Constants.NONE, JACKSON_JODA_TIME_ZONED,
            Constants.PROPERTY, JACKSON_JODA_TIME_ZONED,
            Constants.PUBLIC_MEMBER, JACKSON_JODA_TIME_ZONED);

    public static final Map<TimeZoneIndicator, Map<String, BaseModel<?>>> JACKSON_JODA_TIME_MAP = Map.of(
            TimeZoneIndicator.ZONED,
            JACKSON_JODA_TIME_ZONED_MAP,
            TimeZoneIndicator.NO_ZONE,
            JACKSON_JODA_TIME_NO_ZONE_MAP);
}

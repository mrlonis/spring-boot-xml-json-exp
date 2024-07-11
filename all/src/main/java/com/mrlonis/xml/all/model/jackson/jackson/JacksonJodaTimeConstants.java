package com.mrlonis.xml.all.model.jackson.jackson;

import com.mrlonis.xml.all.model.BaseModel;
import com.mrlonis.xml.shared.time.TimeConstants;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JacksonJodaTimeConstants {
    private static final JacksonJodaTimeModels.JacksonJodaTimeNoZone JACKSON_JODA_TIME_NO_ZONE =
            JacksonJodaTimeModels.JacksonJodaTimeNoZone.builder()
                    .id(TimeConstants.ID)
                    .name(TimeConstants.NAME)
                    .author(TimeConstants.AUTHOR)
                    .date(TimeConstants.JODA_LOCAL_DATE_TIME)
                    .tag(TimeConstants.TAGS)
                    .build();

    private static final Map<String, BaseModel<?>> JACKSON_JODA_TIME_NO_ZONE_MAP = Map.of(
            "field", JACKSON_JODA_TIME_NO_ZONE,
            "none", JACKSON_JODA_TIME_NO_ZONE,
            "property", JACKSON_JODA_TIME_NO_ZONE,
            "public_member", JACKSON_JODA_TIME_NO_ZONE);

    private static final JacksonJodaTimeModels.JacksonJodaTimeZoned JACKSON_JODA_TIME_ZONED =
            JacksonJodaTimeModels.JacksonJodaTimeZoned.builder()
                    .id(TimeConstants.ID)
                    .name(TimeConstants.NAME)
                    .author(TimeConstants.AUTHOR)
                    .date(TimeConstants.JODA_DATE_TIME)
                    .tag(TimeConstants.TAGS)
                    .build();

    private static final Map<String, BaseModel<?>> JACKSON_JODA_TIME_ZONED_MAP = Map.of(
            "field", JACKSON_JODA_TIME_ZONED,
            "none", JACKSON_JODA_TIME_ZONED,
            "property", JACKSON_JODA_TIME_ZONED,
            "public_member", JACKSON_JODA_TIME_ZONED);

    public static final Map<String, Map<String, BaseModel<?>>> JACKSON_JODA_TIME_MAP = Map.of(
            TimeConstants.ZONED, JACKSON_JODA_TIME_ZONED_MAP, TimeConstants.NO_ZONE, JACKSON_JODA_TIME_NO_ZONE_MAP);
}

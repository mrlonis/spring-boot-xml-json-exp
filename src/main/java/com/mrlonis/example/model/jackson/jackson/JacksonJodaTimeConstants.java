package com.mrlonis.example.model.jackson.jackson;

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
public class JacksonJodaTimeConstants {
    private static final JacksonJodaTimeModels.JacksonJodaTimeNoZone JACKSON_JODA_TIME_NO_ZONE =
            JacksonJodaTimeModels.JacksonJodaTimeNoZone.builder()
                    .id(ID)
                    .name(NAME)
                    .author(AUTHOR)
                    .date(JODA_LOCAL_DATE_TIME)
                    .tag(TAGS)
                    .build();

    private static final Map<String, BaseModel<?>> JACKSON_JODA_TIME_NO_ZONE_MAP = Map.of(
            "field", JACKSON_JODA_TIME_NO_ZONE,
            "none", JACKSON_JODA_TIME_NO_ZONE,
            "property", JACKSON_JODA_TIME_NO_ZONE,
            "public_member", JACKSON_JODA_TIME_NO_ZONE);

    private static final JacksonJodaTimeModels.JacksonJodaTimeZoned JACKSON_JODA_TIME_ZONED =
            JacksonJodaTimeModels.JacksonJodaTimeZoned.builder()
                    .id(ID)
                    .name(NAME)
                    .author(AUTHOR)
                    .date(JODA_DATE_TIME)
                    .tag(TAGS)
                    .build();

    private static final Map<String, BaseModel<?>> JACKSON_JODA_TIME_ZONED_MAP = Map.of(
            "field", JACKSON_JODA_TIME_ZONED,
            "none", JACKSON_JODA_TIME_ZONED,
            "property", JACKSON_JODA_TIME_ZONED,
            "public_member", JACKSON_JODA_TIME_ZONED);

    public static final Map<String, Map<String, BaseModel<?>>> JACKSON_JODA_TIME_MAP =
            Map.of(ZONED, JACKSON_JODA_TIME_ZONED_MAP, NO_ZONE, JACKSON_JODA_TIME_NO_ZONE_MAP);
}

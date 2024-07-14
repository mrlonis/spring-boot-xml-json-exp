package com.mrlonis.xml.shared.model.jackson.jackson;

import com.mrlonis.xml.shared.enums.TimeZoneIndicator;
import com.mrlonis.xml.shared.model.BaseModel;
import com.mrlonis.xml.shared.time.TimeConstants;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JacksonJavaTimeConstants {
    private static final JacksonJavaTimeModels.JacksonJavaTimeNoZone JACKSON_JAVA_TIME_NO_ZONE =
            JacksonJavaTimeModels.JacksonJavaTimeNoZone.builder()
                    .id(TimeConstants.ID)
                    .name(TimeConstants.NAME)
                    .author(TimeConstants.AUTHOR)
                    .date(TimeConstants.JAVA_TIME_LOCAL_DATE_TIME)
                    .tag(TimeConstants.TAGS)
                    .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAVA_TIME_NO_ZONE_MAP = Map.of(
            "field", JACKSON_JAVA_TIME_NO_ZONE,
            "none", JACKSON_JAVA_TIME_NO_ZONE,
            "property", JACKSON_JAVA_TIME_NO_ZONE,
            "public_member", JACKSON_JAVA_TIME_NO_ZONE);

    private static final JacksonJavaTimeModels.JacksonJavaTimeZoned JACKSON_JAVA_TIME_ZONED =
            JacksonJavaTimeModels.JacksonJavaTimeZoned.builder()
                    .id(TimeConstants.ID)
                    .name(TimeConstants.NAME)
                    .author(TimeConstants.AUTHOR)
                    .date(TimeConstants.JAVA_TIME_ZONED_DATE_TIME)
                    .tag(TimeConstants.TAGS)
                    .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAVA_TIME_ZONED_MAP = Map.of(
            "field", JACKSON_JAVA_TIME_ZONED,
            "none", JACKSON_JAVA_TIME_ZONED,
            "property", JACKSON_JAVA_TIME_ZONED,
            "public_member", JACKSON_JAVA_TIME_ZONED);

    public static final Map<TimeZoneIndicator, Map<String, BaseModel<?>>> JACKSON_JAVA_TIME_MAP = Map.of(
            TimeZoneIndicator.ZONED,
            JACKSON_JAVA_TIME_ZONED_MAP,
            TimeZoneIndicator.NO_ZONE,
            JACKSON_JAVA_TIME_NO_ZONE_MAP);
}

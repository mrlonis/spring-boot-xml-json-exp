package com.mrlonis.example.model.jackson.jackson;

import static com.mrlonis.example.util.Constants.AUTHOR;
import static com.mrlonis.example.util.Constants.ID;
import static com.mrlonis.example.util.Constants.JAVA_TIME_LOCAL_DATE_TIME;
import static com.mrlonis.example.util.Constants.JAVA_TIME_ZONED_DATE_TIME;
import static com.mrlonis.example.util.Constants.NAME;
import static com.mrlonis.example.util.Constants.NO_ZONE;
import static com.mrlonis.example.util.Constants.TAGS;
import static com.mrlonis.example.util.Constants.ZONED;

import com.mrlonis.example.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JacksonJavaTimeConstants {
    private static final JacksonJavaTimeModels.JacksonJavaTimeNoZone JACKSON_JAVA_TIME_NO_ZONE =
            JacksonJavaTimeModels.JacksonJavaTimeNoZone.builder()
                    .id(ID)
                    .name(NAME)
                    .author(AUTHOR)
                    .date(JAVA_TIME_LOCAL_DATE_TIME)
                    .tags(TAGS)
                    .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAVA_TIME_NO_ZONE_MAP = Map.of(
            "field", JACKSON_JAVA_TIME_NO_ZONE,
            "none", JACKSON_JAVA_TIME_NO_ZONE,
            "property", JACKSON_JAVA_TIME_NO_ZONE,
            "public_member", JACKSON_JAVA_TIME_NO_ZONE);

    private static final JacksonJavaTimeModels.JacksonJavaTimeZoned JACKSON_JAVA_TIME_ZONED =
            JacksonJavaTimeModels.JacksonJavaTimeZoned.builder()
                    .id(ID)
                    .name(NAME)
                    .author(AUTHOR)
                    .date(JAVA_TIME_ZONED_DATE_TIME)
                    .tags(TAGS)
                    .build();

    private static final Map<String, BaseModel<?>> JACKSON_JAVA_TIME_ZONED_MAP = Map.of(
            "field", JACKSON_JAVA_TIME_ZONED,
            "none", JACKSON_JAVA_TIME_ZONED,
            "property", JACKSON_JAVA_TIME_ZONED,
            "public_member", JACKSON_JAVA_TIME_ZONED);

    public static final Map<String, Map<String, BaseModel<?>>> JACKSON_JAVA_TIME_MAP =
            Map.of(ZONED, JACKSON_JAVA_TIME_ZONED_MAP, NO_ZONE, JACKSON_JAVA_TIME_NO_ZONE_MAP);
}

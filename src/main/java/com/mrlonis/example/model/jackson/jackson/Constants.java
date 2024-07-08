package com.mrlonis.example.model.jackson.jackson;

import static com.mrlonis.example.model.jackson.jackson.JacksonJavaTimeConstants.JACKSON_JAVA_TIME_MAP;
import static com.mrlonis.example.model.jackson.jackson.JacksonJodaTimeConstants.JACKSON_JODA_TIME_MAP;
import static com.mrlonis.example.util.Constants.JAVA;
import static com.mrlonis.example.util.Constants.JODA;

import com.mrlonis.example.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {
    public static final Map<String, Map<String, Map<String, BaseModel<?>>>> JACKSON_JACKSON_MAP =
            Map.of(JODA, JACKSON_JODA_TIME_MAP, JAVA, JACKSON_JAVA_TIME_MAP);
}

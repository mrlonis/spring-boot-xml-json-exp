package com.mrlonis.example.model.jackson.jackson;

import static com.mrlonis.example.model.jackson.jakarta.JacksonJakartaJavaTimeConstants.JACKSON_JAKARTA_JAVA_TIME_MAP;
import static com.mrlonis.example.model.jackson.jakarta.JacksonJakartaJodaTimeConstants.JACKSON_JAKARTA_JODA_TIME_MAP;
import static com.mrlonis.example.util.Constants.JAVA;
import static com.mrlonis.example.util.Constants.JODA;

import com.mrlonis.example.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {
    public static final Map<String, Map<String, Map<String, BaseModel>>> JACKSON_JACKSON_MAP =
            Map.of(JODA, JACKSON_JAKARTA_JODA_TIME_MAP, JAVA, JACKSON_JAKARTA_JAVA_TIME_MAP);
}

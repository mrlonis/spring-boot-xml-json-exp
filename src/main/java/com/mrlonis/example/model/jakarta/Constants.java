package com.mrlonis.example.model.jakarta;

import static com.mrlonis.example.model.jakarta.JakartaJavaTimeConstants.JAKARTA_JAVA_TIME_MAP;
import static com.mrlonis.example.model.jakarta.JakartaJodaTimeConstants.JAKARTA_JODA_TIME_MAP;
import static com.mrlonis.example.util.Constants.JAVA;
import static com.mrlonis.example.util.Constants.JODA;

import com.mrlonis.example.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {
    public static final Map<String, Map<String, Map<String, BaseModel<?>>>> JAKARTA_MAP =
            Map.of(JODA, JAKARTA_JODA_TIME_MAP, JAVA, JAKARTA_JAVA_TIME_MAP);
}

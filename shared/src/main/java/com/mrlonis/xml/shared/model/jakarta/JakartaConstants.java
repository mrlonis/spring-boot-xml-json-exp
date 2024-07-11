package com.mrlonis.xml.shared.model.jakarta;

import static com.mrlonis.xml.shared.model.jakarta.JakartaJodaTimeConstants.JAKARTA_JODA_TIME_MAP;
import static com.mrlonis.xml.shared.time.TimeConstants.JAVA;
import static com.mrlonis.xml.shared.time.TimeConstants.JODA;

import com.mrlonis.xml.shared.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JakartaConstants {
    public static final Map<String, Map<String, Map<String, BaseModel<?>>>> JAKARTA_MAP =
            Map.of(JODA, JAKARTA_JODA_TIME_MAP, JAVA, JakartaJavaTimeConstants.JAKARTA_JAVA_TIME_MAP);
}

package com.mrlonis.xml.shared.model.jackson.jakarta;

import static com.mrlonis.xml.shared.model.jackson.jakarta.JacksonJakartaJodaTimeConstants.JACKSON_JAKARTA_JODA_TIME_MAP;

import com.mrlonis.xml.shared.model.BaseModel;
import com.mrlonis.xml.shared.time.TimeConstants;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JacksonJakartaConstants {
    public static final Map<String, Map<String, Map<String, BaseModel<?>>>> JACKSON_JAKARTA_MAP = Map.of(
            TimeConstants.JODA,
            JACKSON_JAKARTA_JODA_TIME_MAP,
            TimeConstants.JAVA,
            JacksonJakartaJavaTimeConstants.JACKSON_JAKARTA_JAVA_TIME_MAP);
}

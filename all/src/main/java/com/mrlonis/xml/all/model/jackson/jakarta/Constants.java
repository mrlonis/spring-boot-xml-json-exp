package com.mrlonis.xml.all.model.jackson.jakarta;

import static com.mrlonis.xml.all.model.jackson.jakarta.JacksonJakartaJodaTimeConstants.JACKSON_JAKARTA_JODA_TIME_MAP;

import com.mrlonis.xml.all.model.BaseModel;
import com.mrlonis.xml.shared.time.TimeConstants;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {
    public static final Map<String, Map<String, Map<String, BaseModel<?>>>> JACKSON_JAKARTA_MAP = Map.of(
            TimeConstants.JODA,
            JACKSON_JAKARTA_JODA_TIME_MAP,
            TimeConstants.JAVA,
            JacksonJakartaJavaTimeConstants.JACKSON_JAKARTA_JAVA_TIME_MAP);
}

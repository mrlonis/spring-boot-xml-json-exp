package com.mrlonis.xml.all.model.jackson.jackson;

import static com.mrlonis.xml.all.model.jackson.jackson.JacksonJodaTimeConstants.JACKSON_JODA_TIME_MAP;

import com.mrlonis.xml.all.model.BaseModel;
import com.mrlonis.xml.shared.time.TimeConstants;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {
    public static final Map<String, Map<String, Map<String, BaseModel<?>>>> JACKSON_JACKSON_MAP = Map.of(
            TimeConstants.JODA,
            JACKSON_JODA_TIME_MAP,
            TimeConstants.JAVA,
            JacksonJavaTimeConstants.JACKSON_JAVA_TIME_MAP);
}

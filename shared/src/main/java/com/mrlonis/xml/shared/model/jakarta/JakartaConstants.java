package com.mrlonis.xml.shared.model.jakarta;

import static com.mrlonis.xml.shared.model.jakarta.JakartaJodaTimeConstants.JAKARTA_JODA_TIME_MAP;

import com.mrlonis.xml.shared.enums.TimeLibrary;
import com.mrlonis.xml.shared.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JakartaConstants {
    public static final Map<TimeLibrary, Map<String, Map<String, BaseModel<?>>>> JAKARTA_MAP = Map.of(
            TimeLibrary.JODA, JAKARTA_JODA_TIME_MAP, TimeLibrary.JAVA, JakartaJavaTimeConstants.JAKARTA_JAVA_TIME_MAP);
}

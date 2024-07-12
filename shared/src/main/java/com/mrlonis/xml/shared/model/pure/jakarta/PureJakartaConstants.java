package com.mrlonis.xml.shared.model.pure.jakarta;

import static com.mrlonis.xml.shared.time.TimeConstants.JAVA;
import static com.mrlonis.xml.shared.time.TimeConstants.JODA;

import com.mrlonis.xml.shared.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PureJakartaConstants {
    public static final Map<String, Map<String, Map<String, BaseModel<?>>>> PURE_JAKARTA_MAP = Map.of(
            JODA,
            PureJakartaJodaTimeConstants.PURE_JAKARTA_JODA_TIME_MAP,
            JAVA,
            PureJakartaJavaTimeConstants.PURE_JAKARTA_JAVA_TIME_MAP);
}

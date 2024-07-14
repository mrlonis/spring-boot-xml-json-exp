package com.mrlonis.xml.shared.model.pure.jakarta;

import com.mrlonis.xml.shared.enums.TimeLibrary;
import com.mrlonis.xml.shared.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PureJakartaConstants {
    public static final Map<TimeLibrary, Map<String, Map<String, BaseModel<?>>>> PURE_JAKARTA_MAP = Map.of(
            TimeLibrary.JODA,
            PureJakartaJodaTimeConstants.PURE_JAKARTA_JODA_TIME_MAP,
            TimeLibrary.JAVA,
            PureJakartaJavaTimeConstants.PURE_JAKARTA_JAVA_TIME_MAP);
}

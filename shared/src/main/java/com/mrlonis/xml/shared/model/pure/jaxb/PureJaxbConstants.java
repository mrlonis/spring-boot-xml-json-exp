package com.mrlonis.xml.shared.model.pure.jaxb;

import static com.mrlonis.xml.shared.time.TimeConstants.JAVA;
import static com.mrlonis.xml.shared.time.TimeConstants.JODA;

import com.mrlonis.xml.shared.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PureJaxbConstants {
    public static final Map<String, Map<String, Map<String, BaseModel<?>>>> PURE_JAXB_MAP = Map.of(
            JODA,
            PureJaxbJodaTimeConstants.PURE_JAXB_JODA_TIME_MAP,
            JAVA,
            PureJaxbJavaTimeConstants.PURE_JAXB_JAVA_TIME_MAP);
}

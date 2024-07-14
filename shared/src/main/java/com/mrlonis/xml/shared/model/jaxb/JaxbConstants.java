package com.mrlonis.xml.shared.model.jaxb;

import static com.mrlonis.xml.shared.model.jaxb.JaxbJodaTimeConstants.JAXB_JODA_TIME_MAP;

import com.mrlonis.xml.shared.enums.TimeLibrary;
import com.mrlonis.xml.shared.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JaxbConstants {
    public static final Map<TimeLibrary, Map<String, Map<String, BaseModel<?>>>> JAXB_MAP =
            Map.of(TimeLibrary.JODA, JAXB_JODA_TIME_MAP, TimeLibrary.JAVA, JaxbJavaTimeConstants.JAXB_JAVA_TIME_MAP);
}

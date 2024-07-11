package com.mrlonis.xml.all.model.jaxb;

import static com.mrlonis.xml.all.model.jaxb.JaxbJodaTimeConstants.JAXB_JODA_TIME_MAP;
import static com.mrlonis.xml.shared.time.TimeConstants.JAVA;
import static com.mrlonis.xml.shared.time.TimeConstants.JODA;

import com.mrlonis.xml.all.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JaxbConstants {
    public static final Map<String, Map<String, Map<String, BaseModel<?>>>> JAXB_MAP =
            Map.of(JODA, JAXB_JODA_TIME_MAP, JAVA, JaxbJavaTimeConstants.JAXB_JAVA_TIME_MAP);
}

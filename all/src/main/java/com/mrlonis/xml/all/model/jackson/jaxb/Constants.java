package com.mrlonis.xml.all.model.jackson.jaxb;

import static com.mrlonis.xml.all.model.jackson.jaxb.JacksonJaxbJodaTimeConstants.JACKSON_JAXB_JODA_TIME_MAP;

import com.mrlonis.xml.all.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {
    public static final Map<String, Map<String, Map<String, BaseModel<?>>>> JACKSON_JAXB_MAP = Map.of(
            com.mrlonis.xml.all.util.Constants.JODA,
            JACKSON_JAXB_JODA_TIME_MAP,
            com.mrlonis.xml.all.util.Constants.JAVA,
            JacksonJaxbJavaTimeConstants.JACKSON_JAXB_JAVA_TIME_MAP);
}

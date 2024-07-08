package com.mrlonis.example.model.jackson.jaxb;

import static com.mrlonis.example.model.jackson.jaxb.JacksonJaxbJavaTimeConstants.JACKSON_JAXB_JAVA_TIME_MAP;
import static com.mrlonis.example.model.jackson.jaxb.JacksonJaxbJodaTimeConstants.JACKSON_JAXB_JODA_TIME_MAP;
import static com.mrlonis.example.util.Constants.JAVA;
import static com.mrlonis.example.util.Constants.JODA;

import com.mrlonis.example.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {
    public static final Map<String, Map<String, Map<String, BaseModel<?>>>> JACKSON_JAXB_MAP =
            Map.of(JODA, JACKSON_JAXB_JODA_TIME_MAP, JAVA, JACKSON_JAXB_JAVA_TIME_MAP);
}

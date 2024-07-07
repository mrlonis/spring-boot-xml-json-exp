package com.mrlonis.example.model.jaxb;

import static com.mrlonis.example.model.jaxb.JaxbJavaTimeConstants.JAXB_JAVA_TIME_MAP;
import static com.mrlonis.example.model.jaxb.JaxbJodaTimeConstants.JAXB_JODA_TIME_MAP;
import static com.mrlonis.example.util.Constants.JAVA;
import static com.mrlonis.example.util.Constants.JODA;

import com.mrlonis.example.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {
    public static final Map<String, Map<String, Map<String, BaseModel>>> JAXB_MAP =
            Map.of(JODA, JAXB_JODA_TIME_MAP, JAVA, JAXB_JAVA_TIME_MAP);
}

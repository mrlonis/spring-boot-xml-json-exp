package com.mrlonis.xml.all.model.jakarta;

import static com.mrlonis.xml.all.model.jakarta.JakartaJodaTimeConstants.JAKARTA_JODA_TIME_MAP;
import static com.mrlonis.xml.all.util.Constants.JAVA;
import static com.mrlonis.xml.all.util.Constants.JODA;

import com.mrlonis.xml.all.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {
    public static final Map<String, Map<String, Map<String, BaseModel<?>>>> JAKARTA_MAP =
            Map.of(JODA, JAKARTA_JODA_TIME_MAP, JAVA, JakartaJavaTimeConstants.JAKARTA_JAVA_TIME_MAP);
}

package com.mrlonis.xml.all.model.jackson;

import static com.mrlonis.xml.all.model.jackson.jackson.Constants.JACKSON_JACKSON_MAP;
import static com.mrlonis.xml.all.model.jackson.jakarta.Constants.JACKSON_JAKARTA_MAP;
import static com.mrlonis.xml.all.model.jackson.jaxb.Constants.JACKSON_JAXB_MAP;

import com.mrlonis.xml.all.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Constants {
    public static final Map<String, Map<String, Map<String, Map<String, BaseModel<?>>>>> JACKSON_MAP =
            Map.of("jaxb", JACKSON_JAXB_MAP, "jakarta", JACKSON_JAKARTA_MAP, "jackson", JACKSON_JACKSON_MAP);
}

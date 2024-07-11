package com.mrlonis.xml.shared.model.jackson;

import static com.mrlonis.xml.shared.model.jackson.jackson.JacksonJacksonConstants.JACKSON_JACKSON_MAP;
import static com.mrlonis.xml.shared.model.jackson.jakarta.JacksonJakartaConstants.JACKSON_JAKARTA_MAP;
import static com.mrlonis.xml.shared.model.jackson.jaxb.JacksonJaxbConstants.JACKSON_JAXB_MAP;

import com.mrlonis.xml.shared.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JacksonConstants {
    public static final Map<String, Map<String, Map<String, Map<String, BaseModel<?>>>>> JACKSON_MAP =
            Map.of("jaxb", JACKSON_JAXB_MAP, "jakarta", JACKSON_JAKARTA_MAP, "jackson", JACKSON_JACKSON_MAP);
}

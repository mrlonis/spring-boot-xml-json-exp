package com.mrlonis.xml.shared.util;

import static com.mrlonis.xml.shared.model.jackson.jackson.JacksonJacksonConstants.JACKSON_JACKSON_MAP;
import static com.mrlonis.xml.shared.model.jackson.jakarta.JacksonJakartaConstants.JACKSON_JAKARTA_MAP;
import static com.mrlonis.xml.shared.model.jackson.jaxb.JacksonJaxbConstants.JACKSON_JAXB_MAP;
import static com.mrlonis.xml.shared.model.pure.jakarta.PureJakartaConstants.PURE_JAKARTA_MAP;
import static com.mrlonis.xml.shared.model.pure.jaxb.PureJaxbConstants.PURE_JAXB_MAP;
import static com.mrlonis.xml.shared.time.TimeConstants.*;
import static com.mrlonis.xml.shared.time.TimeConstants.PURE_JAKARTA;

import com.mrlonis.xml.shared.model.BaseModel;
import com.mrlonis.xml.shared.model.jakarta.JakartaConstants;
import com.mrlonis.xml.shared.model.jaxb.JaxbConstants;
import java.util.Map;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Slf4j
public class FetchModelUtil {
    private static final Map<String, Map<String, Map<String, Map<String, BaseModel<?>>>>> XML_MODELS_BY_TYPE = Map.of(
            JAXB,
            JaxbConstants.JAXB_MAP,
            JAKARTA,
            JakartaConstants.JAKARTA_MAP,
            PURE_JAXB,
            PURE_JAXB_MAP,
            PURE_JAKARTA,
            PURE_JAKARTA_MAP,
            JACKSON_JAXB,
            JACKSON_JAXB_MAP,
            JACKSON_JAKARTA,
            JACKSON_JAKARTA_MAP,
            JACKSON_JACKSON,
            JACKSON_JACKSON_MAP);

    public static BaseModel<?> fetchModel(String formatLibrary, String accessType, String dateLibrary, String zoned) {
        log.info(
                "FetchModelUtil: fetchModel(): formatLibrary: {} | dateLibrary: {} | zoned: {} | | accessType: {}",
                formatLibrary,
                dateLibrary,
                zoned,
                accessType);
        return XML_MODELS_BY_TYPE.get(formatLibrary).get(dateLibrary).get(zoned).get(accessType);
    }
}

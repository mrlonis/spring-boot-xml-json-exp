package com.mrlonis.xml.all.util;

import static com.mrlonis.xml.shared.time.TimeConstants.JAKARTA;
import static com.mrlonis.xml.shared.time.TimeConstants.JAXB;

import com.mrlonis.xml.shared.model.BaseModel;
import com.mrlonis.xml.shared.model.jackson.JacksonConstants;
import com.mrlonis.xml.shared.model.jakarta.JakartaConstants;
import com.mrlonis.xml.shared.model.jaxb.JaxbConstants;
import java.util.Map;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Slf4j
public class FetchModelUtil {
    private static final Map<String, Map<String, Map<String, Map<String, BaseModel<?>>>>> XML_MODELS_BY_TYPE =
            Map.of(JAXB, JaxbConstants.JAXB_MAP, JAKARTA, JakartaConstants.JAKARTA_MAP);

    public static BaseModel<?> fetchModel(
            String formatLibrary, String accessType, String dateLibrary, String zoned, String xmlAnnotationLibrary) {
        log.info(
                "FetchModelUtil: fetchModel(): formatLibrary: {} | dateLibrary: {} | zoned: {} | | accessType: {}, xmlAnnotationLibrary: {}",
                formatLibrary,
                dateLibrary,
                zoned,
                accessType,
                xmlAnnotationLibrary);
        if ("jackson".equals(formatLibrary)) {
            if ("jaxb".equals(xmlAnnotationLibrary)
                    || "jakarta".equals(xmlAnnotationLibrary)
                    || "jackson".equals(xmlAnnotationLibrary)) {
                return JacksonConstants.JACKSON_MAP
                        .get(xmlAnnotationLibrary)
                        .get(dateLibrary)
                        .get(zoned)
                        .get(accessType);
            }
            throw new IllegalArgumentException("Invalid xmlAnnotationLibrary: " + xmlAnnotationLibrary);
        }
        return XML_MODELS_BY_TYPE.get(formatLibrary).get(dateLibrary).get(zoned).get(accessType);
    }
}

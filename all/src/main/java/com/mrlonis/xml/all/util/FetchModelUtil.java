package com.mrlonis.xml.all.util;

import static com.mrlonis.xml.all.util.Constants.JAKARTA;
import static com.mrlonis.xml.all.util.Constants.JAXB;

import com.mrlonis.xml.all.model.BaseModel;
import com.mrlonis.xml.all.model.jaxb.Constants;
import java.util.Map;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Slf4j
public class FetchModelUtil {
    private static final Map<String, Map<String, Map<String, Map<String, BaseModel<?>>>>> XML_MODELS_BY_TYPE =
            Map.of(JAXB, Constants.JAXB_MAP, JAKARTA, com.mrlonis.xml.all.model.jakarta.Constants.JAKARTA_MAP);

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
                return com.mrlonis.xml.all.model.jackson.Constants.JACKSON_MAP
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

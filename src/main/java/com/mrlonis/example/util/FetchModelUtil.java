package com.mrlonis.example.util;

import static com.mrlonis.example.model.jackson.Constants.JACKSON_MAP;
import static com.mrlonis.example.model.jakarta.Constants.JAKARTA_MAP;
import static com.mrlonis.example.model.jaxb.Constants.JAXB_MAP;
import static com.mrlonis.example.util.Constants.JAKARTA;
import static com.mrlonis.example.util.Constants.JAXB;

import com.mrlonis.example.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Slf4j
public class FetchModelUtil {
    private static final Map<String, Map<String, Map<String, Map<String, BaseModel<?>>>>> XML_MODELS_BY_TYPE =
            Map.of(JAXB, JAXB_MAP, JAKARTA, JAKARTA_MAP);

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
                return JACKSON_MAP
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

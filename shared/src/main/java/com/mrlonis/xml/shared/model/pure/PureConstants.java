package com.mrlonis.xml.shared.model.pure;

import static com.mrlonis.xml.shared.model.pure.jakarta.PureJakartaConstants.PURE_JAKARTA_MAP;
import static com.mrlonis.xml.shared.model.pure.jaxb.PureJaxbConstants.PURE_JAXB_MAP;

import com.mrlonis.xml.shared.model.BaseModel;
import java.util.Map;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PureConstants {
    public static final Map<String, Map<String, Map<String, Map<String, BaseModel<?>>>>> PURE_MAP =
            Map.of("jaxb", PURE_JAXB_MAP, "jakarta", PURE_JAKARTA_MAP);
}

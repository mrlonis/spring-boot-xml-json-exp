package com.mrlonis.xml.shared;

import static com.mrlonis.xml.shared.time.TimeConstants.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import lombok.experimental.UtilityClass;
import org.junit.jupiter.params.provider.Arguments;

@UtilityClass
public class TestUtils {
    public static Stream<Arguments> generateTestArguments(
            boolean includeJaxb,
            boolean includeJakarta,
            boolean includeJaxbJackson,
            boolean includeJakartaJackson,
            boolean includeJackson,
            boolean includePureJaxb,
            boolean includePureJakarta) {
        List<Arguments> arguments = new ArrayList<>();
        if (includeJaxb) {
            arguments.add(arguments(JAXB, FIELD, JODA, ZONED));
            arguments.add(arguments(JAXB, NONE, JODA, ZONED));
            arguments.add(arguments(JAXB, PROPERTY, JODA, ZONED));
            arguments.add(arguments(JAXB, PUBLIC_MEMBER, JODA, ZONED));
            arguments.add(arguments(JAXB, FIELD, JODA, NO_ZONE));
            arguments.add(arguments(JAXB, NONE, JODA, NO_ZONE));
            arguments.add(arguments(JAXB, PROPERTY, JODA, NO_ZONE));
            arguments.add(arguments(JAXB, PUBLIC_MEMBER, JODA, NO_ZONE));
            arguments.add(arguments(JAXB, FIELD, JAVA, ZONED));
            arguments.add(arguments(JAXB, NONE, JAVA, ZONED));
            arguments.add(arguments(JAXB, PROPERTY, JAVA, ZONED));
            arguments.add(arguments(JAXB, PUBLIC_MEMBER, JAVA, ZONED));
            arguments.add(arguments(JAXB, FIELD, JAVA, NO_ZONE));
            arguments.add(arguments(JAXB, NONE, JAVA, NO_ZONE));
            arguments.add(arguments(JAXB, PROPERTY, JAVA, NO_ZONE));
            arguments.add(arguments(JAXB, PUBLIC_MEMBER, JAVA, NO_ZONE));
        }
        if (includeJakarta) {
            arguments.add(arguments(JAKARTA, FIELD, JODA, ZONED));
            arguments.add(arguments(JAKARTA, NONE, JODA, ZONED));
            arguments.add(arguments(JAKARTA, PROPERTY, JODA, ZONED));
            arguments.add(arguments(JAKARTA, PUBLIC_MEMBER, JODA, ZONED));
            arguments.add(arguments(JAKARTA, FIELD, JODA, NO_ZONE));
            arguments.add(arguments(JAKARTA, NONE, JODA, NO_ZONE));
            arguments.add(arguments(JAKARTA, PROPERTY, JODA, NO_ZONE));
            arguments.add(arguments(JAKARTA, PUBLIC_MEMBER, JODA, NO_ZONE));
            arguments.add(arguments(JAKARTA, FIELD, JAVA, ZONED));
            arguments.add(arguments(JAKARTA, NONE, JAVA, ZONED));
            arguments.add(arguments(JAKARTA, PROPERTY, JAVA, ZONED));
            arguments.add(arguments(JAKARTA, PUBLIC_MEMBER, JAVA, ZONED));
            arguments.add(arguments(JAKARTA, FIELD, JAVA, NO_ZONE));
            arguments.add(arguments(JAKARTA, NONE, JAVA, NO_ZONE));
            arguments.add(arguments(JAKARTA, PROPERTY, JAVA, NO_ZONE));
            arguments.add(arguments(JAKARTA, PUBLIC_MEMBER, JAVA, NO_ZONE));
        }
        if (includeJaxbJackson) {
            arguments.add(arguments(JACKSON_JAXB, FIELD, JODA, ZONED));
            arguments.add(arguments(JACKSON_JAXB, NONE, JODA, ZONED));
            arguments.add(arguments(JACKSON_JAXB, PROPERTY, JODA, ZONED));
            arguments.add(arguments(JACKSON_JAXB, PUBLIC_MEMBER, JODA, ZONED));
            arguments.add(arguments(JACKSON_JAXB, FIELD, JODA, NO_ZONE));
            arguments.add(arguments(JACKSON_JAXB, NONE, JODA, NO_ZONE));
            arguments.add(arguments(JACKSON_JAXB, PROPERTY, JODA, NO_ZONE));
            arguments.add(arguments(JACKSON_JAXB, PUBLIC_MEMBER, JODA, NO_ZONE));
            arguments.add(arguments(JACKSON_JAXB, FIELD, JAVA, ZONED));
            arguments.add(arguments(JACKSON_JAXB, NONE, JAVA, ZONED));
            arguments.add(arguments(JACKSON_JAXB, PROPERTY, JAVA, ZONED));
            arguments.add(arguments(JACKSON_JAXB, PUBLIC_MEMBER, JAVA, ZONED));
            arguments.add(arguments(JACKSON_JAXB, FIELD, JAVA, NO_ZONE));
            arguments.add(arguments(JACKSON_JAXB, NONE, JAVA, NO_ZONE));
            arguments.add(arguments(JACKSON_JAXB, PROPERTY, JAVA, NO_ZONE));
            arguments.add(arguments(JACKSON_JAXB, PUBLIC_MEMBER, JAVA, NO_ZONE));
        }
        if (includeJakartaJackson) {
            arguments.add(arguments(JACKSON_JAKARTA, FIELD, JODA, ZONED));
            arguments.add(arguments(JACKSON_JAKARTA, NONE, JODA, ZONED));
            arguments.add(arguments(JACKSON_JAKARTA, PROPERTY, JODA, ZONED));
            arguments.add(arguments(JACKSON_JAKARTA, PUBLIC_MEMBER, JODA, ZONED));
            arguments.add(arguments(JACKSON_JAKARTA, FIELD, JODA, NO_ZONE));
            arguments.add(arguments(JACKSON_JAKARTA, NONE, JODA, NO_ZONE));
            arguments.add(arguments(JACKSON_JAKARTA, PROPERTY, JODA, NO_ZONE));
            arguments.add(arguments(JACKSON_JAKARTA, PUBLIC_MEMBER, JODA, NO_ZONE));
            arguments.add(arguments(JACKSON_JAKARTA, FIELD, JAVA, ZONED));
            arguments.add(arguments(JACKSON_JAKARTA, NONE, JAVA, ZONED));
            arguments.add(arguments(JACKSON_JAKARTA, PROPERTY, JAVA, ZONED));
            arguments.add(arguments(JACKSON_JAKARTA, PUBLIC_MEMBER, JAVA, ZONED));
            arguments.add(arguments(JACKSON_JAKARTA, FIELD, JAVA, NO_ZONE));
            arguments.add(arguments(JACKSON_JAKARTA, NONE, JAVA, NO_ZONE));
            arguments.add(arguments(JACKSON_JAKARTA, PROPERTY, JAVA, NO_ZONE));
            arguments.add(arguments(JACKSON_JAKARTA, PUBLIC_MEMBER, JAVA, NO_ZONE));
        }
        if (includeJackson) {
            arguments.add(arguments(JACKSON_JACKSON, FIELD, JODA, ZONED));
            arguments.add(arguments(JACKSON_JACKSON, NONE, JODA, ZONED));
            arguments.add(arguments(JACKSON_JACKSON, PROPERTY, JODA, ZONED));
            arguments.add(arguments(JACKSON_JACKSON, PUBLIC_MEMBER, JODA, ZONED));
            arguments.add(arguments(JACKSON_JACKSON, FIELD, JODA, NO_ZONE));
            arguments.add(arguments(JACKSON_JACKSON, NONE, JODA, NO_ZONE));
            arguments.add(arguments(JACKSON_JACKSON, PROPERTY, JODA, NO_ZONE));
            arguments.add(arguments(JACKSON_JACKSON, PUBLIC_MEMBER, JODA, NO_ZONE));
            arguments.add(arguments(JACKSON_JACKSON, FIELD, JAVA, ZONED));
            arguments.add(arguments(JACKSON_JACKSON, NONE, JAVA, ZONED));
            arguments.add(arguments(JACKSON_JACKSON, PROPERTY, JAVA, ZONED));
            arguments.add(arguments(JACKSON_JACKSON, PUBLIC_MEMBER, JAVA, ZONED));
            arguments.add(arguments(JACKSON_JACKSON, FIELD, JAVA, NO_ZONE));
            arguments.add(arguments(JACKSON_JACKSON, NONE, JAVA, NO_ZONE));
            arguments.add(arguments(JACKSON_JACKSON, PROPERTY, JAVA, NO_ZONE));
            arguments.add(arguments(JACKSON_JACKSON, PUBLIC_MEMBER, JAVA, NO_ZONE));
        }
        if (includePureJaxb) {
            arguments.add(arguments(PURE_JAXB, FIELD, JODA, ZONED));
            arguments.add(arguments(PURE_JAXB, NONE, JODA, ZONED));
            arguments.add(arguments(PURE_JAXB, PROPERTY, JODA, ZONED));
            arguments.add(arguments(PURE_JAXB, PUBLIC_MEMBER, JODA, ZONED));
            arguments.add(arguments(PURE_JAXB, FIELD, JODA, NO_ZONE));
            arguments.add(arguments(PURE_JAXB, NONE, JODA, NO_ZONE));
            arguments.add(arguments(PURE_JAXB, PROPERTY, JODA, NO_ZONE));
            arguments.add(arguments(PURE_JAXB, PUBLIC_MEMBER, JODA, NO_ZONE));
            arguments.add(arguments(PURE_JAXB, FIELD, JAVA, ZONED));
            arguments.add(arguments(PURE_JAXB, NONE, JAVA, ZONED));
            arguments.add(arguments(PURE_JAXB, PROPERTY, JAVA, ZONED));
            arguments.add(arguments(PURE_JAXB, PUBLIC_MEMBER, JAVA, ZONED));
            arguments.add(arguments(PURE_JAXB, FIELD, JAVA, NO_ZONE));
            arguments.add(arguments(PURE_JAXB, NONE, JAVA, NO_ZONE));
            arguments.add(arguments(PURE_JAXB, PROPERTY, JAVA, NO_ZONE));
            arguments.add(arguments(PURE_JAXB, PUBLIC_MEMBER, JAVA, NO_ZONE));
        }
        if (includePureJakarta) {
            arguments.add(arguments(PURE_JAKARTA, FIELD, JODA, ZONED));
            arguments.add(arguments(PURE_JAKARTA, NONE, JODA, ZONED));
            arguments.add(arguments(PURE_JAKARTA, PROPERTY, JODA, ZONED));
            arguments.add(arguments(PURE_JAKARTA, PUBLIC_MEMBER, JODA, ZONED));
            arguments.add(arguments(PURE_JAKARTA, FIELD, JODA, NO_ZONE));
            arguments.add(arguments(PURE_JAKARTA, NONE, JODA, NO_ZONE));
            arguments.add(arguments(PURE_JAKARTA, PROPERTY, JODA, NO_ZONE));
            arguments.add(arguments(PURE_JAKARTA, PUBLIC_MEMBER, JODA, NO_ZONE));
            arguments.add(arguments(PURE_JAKARTA, FIELD, JAVA, ZONED));
            arguments.add(arguments(PURE_JAKARTA, NONE, JAVA, ZONED));
            arguments.add(arguments(PURE_JAKARTA, PROPERTY, JAVA, ZONED));
            arguments.add(arguments(PURE_JAKARTA, PUBLIC_MEMBER, JAVA, ZONED));
            arguments.add(arguments(PURE_JAKARTA, FIELD, JAVA, NO_ZONE));
            arguments.add(arguments(PURE_JAKARTA, NONE, JAVA, NO_ZONE));
            arguments.add(arguments(PURE_JAKARTA, PROPERTY, JAVA, NO_ZONE));
            arguments.add(arguments(PURE_JAKARTA, PUBLIC_MEMBER, JAVA, NO_ZONE));
        }
        return arguments.stream();
    }
}

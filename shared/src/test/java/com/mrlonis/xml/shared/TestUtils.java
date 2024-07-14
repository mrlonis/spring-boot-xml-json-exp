package com.mrlonis.xml.shared;

import static com.mrlonis.xml.shared.time.TimeConstants.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import com.mrlonis.xml.shared.enums.AnnotationLibrary;
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
            arguments.add(arguments(AnnotationLibrary.JAXB, FIELD, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JAXB, NONE, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JAXB, PROPERTY, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JAXB, PUBLIC_MEMBER, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JAXB, FIELD, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAXB, NONE, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAXB, PROPERTY, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAXB, PUBLIC_MEMBER, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAXB, FIELD, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JAXB, NONE, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JAXB, PROPERTY, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JAXB, PUBLIC_MEMBER, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JAXB, FIELD, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAXB, NONE, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAXB, PROPERTY, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAXB, PUBLIC_MEMBER, JAVA, NO_ZONE));
        }
        if (includeJakarta) {
            arguments.add(arguments(AnnotationLibrary.JAKARTA, FIELD, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, NONE, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, PROPERTY, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, PUBLIC_MEMBER, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, FIELD, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, NONE, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, PROPERTY, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, PUBLIC_MEMBER, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, FIELD, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, NONE, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, PROPERTY, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, PUBLIC_MEMBER, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, FIELD, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, NONE, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, PROPERTY, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, PUBLIC_MEMBER, JAVA, NO_ZONE));
        }
        if (includeJaxbJackson) {
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, FIELD, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, NONE, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, PROPERTY, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, PUBLIC_MEMBER, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, FIELD, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, NONE, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, PROPERTY, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, PUBLIC_MEMBER, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, FIELD, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, NONE, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, PROPERTY, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, PUBLIC_MEMBER, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, FIELD, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, NONE, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, PROPERTY, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, PUBLIC_MEMBER, JAVA, NO_ZONE));
        }
        if (includeJakartaJackson) {
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAKARTA, FIELD, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAKARTA, NONE, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAKARTA, PROPERTY, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAKARTA, PUBLIC_MEMBER, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAKARTA, FIELD, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAKARTA, NONE, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAKARTA, PROPERTY, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAKARTA, PUBLIC_MEMBER, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAKARTA, FIELD, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAKARTA, NONE, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAKARTA, PROPERTY, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAKARTA, PUBLIC_MEMBER, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAKARTA, FIELD, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAKARTA, NONE, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAKARTA, PROPERTY, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAKARTA, PUBLIC_MEMBER, JAVA, NO_ZONE));
        }
        if (includeJackson) {
            arguments.add(arguments(AnnotationLibrary.JACKSON_JACKSON, FIELD, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JACKSON, NONE, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JACKSON, PROPERTY, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JACKSON, PUBLIC_MEMBER, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JACKSON, FIELD, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JACKSON, NONE, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JACKSON, PROPERTY, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JACKSON, PUBLIC_MEMBER, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JACKSON, FIELD, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JACKSON, NONE, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JACKSON, PROPERTY, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JACKSON, PUBLIC_MEMBER, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JACKSON, FIELD, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JACKSON, NONE, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JACKSON, PROPERTY, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JACKSON, PUBLIC_MEMBER, JAVA, NO_ZONE));
        }
        if (includePureJaxb) {
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, FIELD, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, NONE, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, PROPERTY, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, PUBLIC_MEMBER, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, FIELD, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, NONE, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, PROPERTY, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, PUBLIC_MEMBER, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, FIELD, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, NONE, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, PROPERTY, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, PUBLIC_MEMBER, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, FIELD, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, NONE, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, PROPERTY, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, PUBLIC_MEMBER, JAVA, NO_ZONE));
        }
        if (includePureJakarta) {
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, FIELD, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, NONE, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, PROPERTY, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, PUBLIC_MEMBER, JODA, ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, FIELD, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, NONE, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, PROPERTY, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, PUBLIC_MEMBER, JODA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, FIELD, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, NONE, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, PROPERTY, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, PUBLIC_MEMBER, JAVA, ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, FIELD, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, NONE, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, PROPERTY, JAVA, NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, PUBLIC_MEMBER, JAVA, NO_ZONE));
        }
        return arguments.stream();
    }
}

package com.mrlonis.xml.shared;

import static com.mrlonis.xml.shared.util.Constants.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import com.mrlonis.xml.shared.enums.AnnotationLibrary;
import com.mrlonis.xml.shared.enums.TimeLibrary;
import com.mrlonis.xml.shared.enums.TimeZoneIndicator;
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
            arguments.add(arguments(AnnotationLibrary.JAXB, FIELD, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.JAXB, NONE, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.JAXB, PROPERTY, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.JAXB, PUBLIC_MEMBER, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.JAXB, FIELD, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAXB, NONE, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAXB, PROPERTY, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.JAXB, PUBLIC_MEMBER, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAXB, FIELD, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.JAXB, NONE, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.JAXB, PROPERTY, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.JAXB, PUBLIC_MEMBER, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.JAXB, FIELD, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAXB, NONE, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAXB, PROPERTY, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.JAXB, PUBLIC_MEMBER, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
        }
        if (includeJakarta) {
            arguments.add(arguments(AnnotationLibrary.JAKARTA, FIELD, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, NONE, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, PROPERTY, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JAKARTA, PUBLIC_MEMBER, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, FIELD, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, NONE, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, PROPERTY, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.JAKARTA, PUBLIC_MEMBER, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, FIELD, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, NONE, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, PROPERTY, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JAKARTA, PUBLIC_MEMBER, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, FIELD, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, NONE, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JAKARTA, PROPERTY, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.JAKARTA, PUBLIC_MEMBER, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
        }
        if (includeJaxbJackson) {
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, FIELD, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, NONE, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JAXB, PROPERTY, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(
                    AnnotationLibrary.JACKSON_JAXB, PUBLIC_MEMBER, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JAXB, FIELD, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, NONE, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JAXB, PROPERTY, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(
                    AnnotationLibrary.JACKSON_JAXB, PUBLIC_MEMBER, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, FIELD, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, NONE, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JAXB, PROPERTY, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(
                    AnnotationLibrary.JACKSON_JAXB, PUBLIC_MEMBER, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JAXB, FIELD, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.JACKSON_JAXB, NONE, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JAXB, PROPERTY, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(
                    AnnotationLibrary.JACKSON_JAXB, PUBLIC_MEMBER, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
        }
        if (includeJakartaJackson) {
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JAKARTA, FIELD, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JAKARTA, NONE, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JAKARTA, PROPERTY, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(
                    AnnotationLibrary.JACKSON_JAKARTA, PUBLIC_MEMBER, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JAKARTA, FIELD, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JAKARTA, NONE, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(
                    AnnotationLibrary.JACKSON_JAKARTA, PROPERTY, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(
                    AnnotationLibrary.JACKSON_JAKARTA, PUBLIC_MEMBER, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JAKARTA, FIELD, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JAKARTA, NONE, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JAKARTA, PROPERTY, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(
                    AnnotationLibrary.JACKSON_JAKARTA, PUBLIC_MEMBER, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JAKARTA, FIELD, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JAKARTA, NONE, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(
                    AnnotationLibrary.JACKSON_JAKARTA, PROPERTY, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(
                    AnnotationLibrary.JACKSON_JAKARTA, PUBLIC_MEMBER, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
        }
        if (includeJackson) {
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JACKSON, FIELD, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JACKSON, NONE, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JACKSON, PROPERTY, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(
                    AnnotationLibrary.JACKSON_JACKSON, PUBLIC_MEMBER, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JACKSON, FIELD, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JACKSON, NONE, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(
                    AnnotationLibrary.JACKSON_JACKSON, PROPERTY, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(
                    AnnotationLibrary.JACKSON_JACKSON, PUBLIC_MEMBER, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JACKSON, FIELD, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JACKSON, NONE, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JACKSON, PROPERTY, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(
                    AnnotationLibrary.JACKSON_JACKSON, PUBLIC_MEMBER, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JACKSON, FIELD, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.JACKSON_JACKSON, NONE, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(
                    AnnotationLibrary.JACKSON_JACKSON, PROPERTY, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(
                    AnnotationLibrary.JACKSON_JACKSON, PUBLIC_MEMBER, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
        }
        if (includePureJaxb) {
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, FIELD, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, NONE, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, PROPERTY, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.PURE_JAXB, PUBLIC_MEMBER, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, FIELD, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, NONE, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.PURE_JAXB, PROPERTY, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.PURE_JAXB, PUBLIC_MEMBER, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, FIELD, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, NONE, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, PROPERTY, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.PURE_JAXB, PUBLIC_MEMBER, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, FIELD, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAXB, NONE, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.PURE_JAXB, PROPERTY, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.PURE_JAXB, PUBLIC_MEMBER, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
        }
        if (includePureJakarta) {
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, FIELD, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, NONE, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.PURE_JAKARTA, PROPERTY, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(
                    AnnotationLibrary.PURE_JAKARTA, PUBLIC_MEMBER, TimeLibrary.JODA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.PURE_JAKARTA, FIELD, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, NONE, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.PURE_JAKARTA, PROPERTY, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(
                    AnnotationLibrary.PURE_JAKARTA, PUBLIC_MEMBER, TimeLibrary.JODA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, FIELD, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, NONE, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.PURE_JAKARTA, PROPERTY, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(arguments(
                    AnnotationLibrary.PURE_JAKARTA, PUBLIC_MEMBER, TimeLibrary.JAVA, TimeZoneIndicator.ZONED));
            arguments.add(
                    arguments(AnnotationLibrary.PURE_JAKARTA, FIELD, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(AnnotationLibrary.PURE_JAKARTA, NONE, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(
                    arguments(AnnotationLibrary.PURE_JAKARTA, PROPERTY, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
            arguments.add(arguments(
                    AnnotationLibrary.PURE_JAKARTA, PUBLIC_MEMBER, TimeLibrary.JAVA, TimeZoneIndicator.NO_ZONE));
        }
        return arguments.stream();
    }
}

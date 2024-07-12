package com.mrlonis.xml.shared;

import static com.mrlonis.xml.shared.time.TimeConstants.FIELD;
import static com.mrlonis.xml.shared.time.TimeConstants.JACKSON;
import static com.mrlonis.xml.shared.time.TimeConstants.JAKARTA;
import static com.mrlonis.xml.shared.time.TimeConstants.JAVA;
import static com.mrlonis.xml.shared.time.TimeConstants.JAXB;
import static com.mrlonis.xml.shared.time.TimeConstants.JODA;
import static com.mrlonis.xml.shared.time.TimeConstants.NONE;
import static com.mrlonis.xml.shared.time.TimeConstants.NO_ZONE;
import static com.mrlonis.xml.shared.time.TimeConstants.PROPERTY;
import static com.mrlonis.xml.shared.time.TimeConstants.PUBLIC_MEMBER;
import static com.mrlonis.xml.shared.time.TimeConstants.ZONED;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import lombok.experimental.UtilityClass;
import org.junit.jupiter.params.provider.Arguments;

@UtilityClass
public class TestUtil {
    public static Stream<Arguments> generateTestArguments(
            boolean includeJaxb,
            boolean includeJakarta,
            boolean includeAllJackson,
            boolean includeJaxbJackson,
            boolean includeJakartaJackson,
            boolean includeJackson) {
        List<Arguments> arguments = new ArrayList<>();
        if (includeJaxb) {
            arguments.add(arguments(JAXB, FIELD, JODA, ZONED, null));
            arguments.add(arguments(JAXB, NONE, JODA, ZONED, null));
            arguments.add(arguments(JAXB, PROPERTY, JODA, ZONED, null));
            arguments.add(arguments(JAXB, PUBLIC_MEMBER, JODA, ZONED, null));
            arguments.add(arguments(JAXB, FIELD, JODA, NO_ZONE, null));
            arguments.add(arguments(JAXB, NONE, JODA, NO_ZONE, null));
            arguments.add(arguments(JAXB, PROPERTY, JODA, NO_ZONE, null));
            arguments.add(arguments(JAXB, PUBLIC_MEMBER, JODA, NO_ZONE, null));
            arguments.add(arguments(JAXB, FIELD, JAVA, ZONED, null));
            arguments.add(arguments(JAXB, NONE, JAVA, ZONED, null));
            arguments.add(arguments(JAXB, PROPERTY, JAVA, ZONED, null));
            arguments.add(arguments(JAXB, PUBLIC_MEMBER, JAVA, ZONED, null));
            arguments.add(arguments(JAXB, FIELD, JAVA, NO_ZONE, null));
            arguments.add(arguments(JAXB, NONE, JAVA, NO_ZONE, null));
            arguments.add(arguments(JAXB, PROPERTY, JAVA, NO_ZONE, null));
            arguments.add(arguments(JAXB, PUBLIC_MEMBER, JAVA, NO_ZONE, null));
        }
        if (includeJakarta) {
            arguments.add(arguments(JAKARTA, FIELD, JODA, ZONED, null));
            arguments.add(arguments(JAKARTA, NONE, JODA, ZONED, null));
            arguments.add(arguments(JAKARTA, PROPERTY, JODA, ZONED, null));
            arguments.add(arguments(JAKARTA, PUBLIC_MEMBER, JODA, ZONED, null));
            arguments.add(arguments(JAKARTA, FIELD, JODA, NO_ZONE, null));
            arguments.add(arguments(JAKARTA, NONE, JODA, NO_ZONE, null));
            arguments.add(arguments(JAKARTA, PROPERTY, JODA, NO_ZONE, null));
            arguments.add(arguments(JAKARTA, PUBLIC_MEMBER, JODA, NO_ZONE, null));
            arguments.add(arguments(JAKARTA, FIELD, JAVA, ZONED, null));
            arguments.add(arguments(JAKARTA, NONE, JAVA, ZONED, null));
            arguments.add(arguments(JAKARTA, PROPERTY, JAVA, ZONED, null));
            arguments.add(arguments(JAKARTA, PUBLIC_MEMBER, JAVA, ZONED, null));
            arguments.add(arguments(JAKARTA, FIELD, JAVA, NO_ZONE, null));
            arguments.add(arguments(JAKARTA, NONE, JAVA, NO_ZONE, null));
            arguments.add(arguments(JAKARTA, PROPERTY, JAVA, NO_ZONE, null));
            arguments.add(arguments(JAKARTA, PUBLIC_MEMBER, JAVA, NO_ZONE, null));
        }
        if (includeJaxbJackson || includeAllJackson) {
            arguments.add(arguments(JACKSON, FIELD, JODA, ZONED, "jaxb"));
            arguments.add(arguments(JACKSON, NONE, JODA, ZONED, "jaxb"));
            arguments.add(arguments(JACKSON, PROPERTY, JODA, ZONED, "jaxb"));
            arguments.add(arguments(JACKSON, PUBLIC_MEMBER, JODA, ZONED, "jaxb"));
            arguments.add(arguments(JACKSON, FIELD, JODA, NO_ZONE, "jaxb"));
            arguments.add(arguments(JACKSON, NONE, JODA, NO_ZONE, "jaxb"));
            arguments.add(arguments(JACKSON, PROPERTY, JODA, NO_ZONE, "jaxb"));
            arguments.add(arguments(JACKSON, PUBLIC_MEMBER, JODA, NO_ZONE, "jaxb"));
            arguments.add(arguments(JACKSON, FIELD, JAVA, ZONED, "jaxb"));
            arguments.add(arguments(JACKSON, NONE, JAVA, ZONED, "jaxb"));
            arguments.add(arguments(JACKSON, PROPERTY, JAVA, ZONED, "jaxb"));
            arguments.add(arguments(JACKSON, PUBLIC_MEMBER, JAVA, ZONED, "jaxb"));
            arguments.add(arguments(JACKSON, FIELD, JAVA, NO_ZONE, "jaxb"));
            arguments.add(arguments(JACKSON, NONE, JAVA, NO_ZONE, "jaxb"));
            arguments.add(arguments(JACKSON, PROPERTY, JAVA, NO_ZONE, "jaxb"));
            arguments.add(arguments(JACKSON, PUBLIC_MEMBER, JAVA, NO_ZONE, "jaxb"));
        }
        if (includeJakartaJackson || includeAllJackson) {
            arguments.add(arguments(JACKSON, FIELD, JODA, ZONED, "jakarta"));
            arguments.add(arguments(JACKSON, NONE, JODA, ZONED, "jakarta"));
            arguments.add(arguments(JACKSON, PROPERTY, JODA, ZONED, "jakarta"));
            arguments.add(arguments(JACKSON, PUBLIC_MEMBER, JODA, ZONED, "jakarta"));
            arguments.add(arguments(JACKSON, FIELD, JODA, NO_ZONE, "jakarta"));
            arguments.add(arguments(JACKSON, NONE, JODA, NO_ZONE, "jakarta"));
            arguments.add(arguments(JACKSON, PROPERTY, JODA, NO_ZONE, "jakarta"));
            arguments.add(arguments(JACKSON, PUBLIC_MEMBER, JODA, NO_ZONE, "jakarta"));
            arguments.add(arguments(JACKSON, FIELD, JAVA, ZONED, "jakarta"));
            arguments.add(arguments(JACKSON, NONE, JAVA, ZONED, "jakarta"));
            arguments.add(arguments(JACKSON, PROPERTY, JAVA, ZONED, "jakarta"));
            arguments.add(arguments(JACKSON, PUBLIC_MEMBER, JAVA, ZONED, "jakarta"));
            arguments.add(arguments(JACKSON, FIELD, JAVA, NO_ZONE, "jakarta"));
            arguments.add(arguments(JACKSON, NONE, JAVA, NO_ZONE, "jakarta"));
            arguments.add(arguments(JACKSON, PROPERTY, JAVA, NO_ZONE, "jakarta"));
            arguments.add(arguments(JACKSON, PUBLIC_MEMBER, JAVA, NO_ZONE, "jakarta"));
        }
        if (includeJackson || includeAllJackson) {
            arguments.add(arguments(JACKSON, FIELD, JODA, ZONED, "jackson"));
            arguments.add(arguments(JACKSON, NONE, JODA, ZONED, "jackson"));
            arguments.add(arguments(JACKSON, PROPERTY, JODA, ZONED, "jackson"));
            arguments.add(arguments(JACKSON, PUBLIC_MEMBER, JODA, ZONED, "jackson"));
            arguments.add(arguments(JACKSON, FIELD, JODA, NO_ZONE, "jackson"));
            arguments.add(arguments(JACKSON, NONE, JODA, NO_ZONE, "jackson"));
            arguments.add(arguments(JACKSON, PROPERTY, JODA, NO_ZONE, "jackson"));
            arguments.add(arguments(JACKSON, PUBLIC_MEMBER, JODA, NO_ZONE, "jackson"));
            arguments.add(arguments(JACKSON, FIELD, JAVA, ZONED, "jackson"));
            arguments.add(arguments(JACKSON, NONE, JAVA, ZONED, "jackson"));
            arguments.add(arguments(JACKSON, PROPERTY, JAVA, ZONED, "jackson"));
            arguments.add(arguments(JACKSON, PUBLIC_MEMBER, JAVA, ZONED, "jackson"));
            arguments.add(arguments(JACKSON, FIELD, JAVA, NO_ZONE, "jackson"));
            arguments.add(arguments(JACKSON, NONE, JAVA, NO_ZONE, "jackson"));
            arguments.add(arguments(JACKSON, PROPERTY, JAVA, NO_ZONE, "jackson"));
            arguments.add(arguments(JACKSON, PUBLIC_MEMBER, JAVA, NO_ZONE, "jackson"));
        }
        return arguments.stream();
    }
}

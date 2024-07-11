package com.mrlonis.xml.shared.time;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import lombok.experimental.UtilityClass;
import org.joda.time.DateTime;

@UtilityClass
public class TimeConstants {
    public static final String JAXB = "jaxb";
    public static final String JAKARTA = "jakarta";
    public static final String JACKSON = "jackson";
    public static final String JAVA = "java";
    public static final String JODA = "joda";
    public static final String NO_ZONE = "nozone";
    public static final String ZONED = "zoned";
    public static final String FIELD = "field";
    public static final String NONE = "none";
    public static final String PROPERTY = "property";
    public static final String PUBLIC_MEMBER = "public_member";
    public static final long ID = 1;
    public static final String NAME = "name";
    public static final String AUTHOR = "author";
    public static final String DATE_STRING = "2024-07-05T14:06:07.617";
    public static final String DATE_STRING_ZONED = String.format("%sZ", DATE_STRING);
    public static final DateTime JODA_DATE_TIME = JodaTimeUtil.unmarshalDateTime(DATE_STRING_ZONED);
    public static final org.joda.time.LocalDateTime JODA_LOCAL_DATE_TIME =
            JodaTimeUtil.unmarshalLocalDateTime(DATE_STRING_ZONED);
    public static final LocalDateTime JAVA_TIME_LOCAL_DATE_TIME =
            JavaTimeUtil.unmarshalLocalDateTime(DATE_STRING_ZONED);
    public static final ZonedDateTime JAVA_TIME_ZONED_DATE_TIME =
            JavaTimeUtil.unmarshalZonedDateTime(DATE_STRING_ZONED);
    public static final List<String> TAGS = Arrays.asList("tag1", "tag2", "tag3");
}

package com.mrlonis.example.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TimeAdapterUtil {
    public static <T> T unmarshal(String v, Class<T> type) {
        if (type == LocalDateTime.class) {
            return type.cast(JavaTimeUtil.unmarshalLocalDateTime(v));
        } else if (type == ZonedDateTime.class) {
            return type.cast(JavaTimeUtil.unmarshalZonedDateTime(v));
        } else if (type == org.joda.time.LocalDateTime.class) {
            return type.cast(JodaTimeUtil.unmarshalLocalDateTime(v));
        } else if (type == org.joda.time.DateTime.class) {
            return type.cast(JodaTimeUtil.unmarshalDateTime(v));
        }
        throw new UnsupportedOperationException("Unsupported type: " + type.getName());
    }

    public static <T> String marshal(T v) {
        if (v instanceof LocalDateTime localDateTime) {
            return JavaTimeUtil.marshalLocalDateTime(localDateTime);
        } else if (v instanceof ZonedDateTime zonedDateTime) {
            return JavaTimeUtil.marshalZonedDateTime(zonedDateTime);
        } else if (v instanceof org.joda.time.LocalDateTime jodaLocalDateTime) {
            return JodaTimeUtil.marshalLocalDateTime(jodaLocalDateTime);
        } else if (v instanceof org.joda.time.DateTime jodaDateTime) {
            return JodaTimeUtil.marshalDateTime(jodaDateTime);
        }
        throw new UnsupportedOperationException(
                "Unsupported type: " + v.getClass().getName());
    }

    public static <T> void serialize(T v, JsonGenerator gen, SerializerProvider arg2) throws IOException {
        if (v instanceof LocalDateTime localDateTime) {
            JavaTimeUtil.serializeLocalDateTime(localDateTime, gen, arg2);
            return;
        } else if (v instanceof ZonedDateTime zonedDateTime) {
            JavaTimeUtil.serializeZonedDateTime(zonedDateTime, gen, arg2);
            return;
        } else if (v instanceof org.joda.time.LocalDateTime jodaLocalDateTime) {
            JodaTimeUtil.serializeLocalDateTime(jodaLocalDateTime, gen, arg2);
            return;
        } else if (v instanceof org.joda.time.DateTime jodaDateTime) {
            JodaTimeUtil.serializeDateTime(jodaDateTime, gen, arg2);
            return;
        }
        throw new UnsupportedOperationException(
                "Unsupported type: " + v.getClass().getName());
    }

    public static <T> T deserialize(JsonParser jsonparser, DeserializationContext context, Class<T> type)
            throws IOException {
        if (type == LocalDateTime.class) {
            return type.cast(JavaTimeUtil.deserializeLocalDateTime(jsonparser, context));
        } else if (type == ZonedDateTime.class) {
            return type.cast(JavaTimeUtil.deserializeZonedDateTime(jsonparser, context));
        } else if (type == org.joda.time.LocalDateTime.class) {
            return type.cast(JodaTimeUtil.deserializeLocalDateTime(jsonparser, context));
        } else if (type == org.joda.time.DateTime.class) {
            return type.cast(JodaTimeUtil.deserializeDateTime(jsonparser, context));
        }
        throw new UnsupportedOperationException("Unsupported type: " + type.getName());
    }
}

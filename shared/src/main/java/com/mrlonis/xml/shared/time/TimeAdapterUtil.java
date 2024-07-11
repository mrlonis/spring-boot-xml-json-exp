package com.mrlonis.xml.shared.time;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import jakarta.annotation.Nullable;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Slf4j
public class TimeAdapterUtil {
    private static final String UNSUPPORTED_TYPE = "Unsupported type: ";

    public static <T> T unmarshal(String v, @Nullable Class<T> type) {
        log.info("TimeAdapterUtil: unmarshal(): v: {}, type: {}", v, type != null ? type.getName() : null);
        if (type == LocalDateTime.class) {
            return type.cast(JavaTimeUtil.unmarshalLocalDateTime(v));
        } else if (type == ZonedDateTime.class) {
            return type.cast(JavaTimeUtil.unmarshalZonedDateTime(v));
        } else if (type == org.joda.time.LocalDateTime.class) {
            return type.cast(JodaTimeUtil.unmarshalLocalDateTime(v));
        } else if (type == org.joda.time.DateTime.class) {
            return type.cast(JodaTimeUtil.unmarshalDateTime(v));
        }
        String errorMessage = UNSUPPORTED_TYPE + (type != null ? type.getName() : null);
        log.error(errorMessage);
        throw new UnsupportedOperationException(errorMessage);
    }

    public static <T> String marshal(T v) {
        log.info(
                "TimeAdapterUtil: marshal(): v: {}, v.getClass(): {}",
                v,
                v.getClass().getName());
        if (v instanceof LocalDateTime localDateTime) {
            return JavaTimeUtil.marshalLocalDateTime(localDateTime);
        } else if (v instanceof ZonedDateTime zonedDateTime) {
            return JavaTimeUtil.marshalZonedDateTime(zonedDateTime);
        } else if (v instanceof org.joda.time.LocalDateTime jodaLocalDateTime) {
            return JodaTimeUtil.marshalLocalDateTime(jodaLocalDateTime);
        } else if (v instanceof org.joda.time.DateTime jodaDateTime) {
            return JodaTimeUtil.marshalDateTime(jodaDateTime);
        }
        String errorMessage = UNSUPPORTED_TYPE + v.getClass().getName();
        log.error(errorMessage);
        throw new UnsupportedOperationException(errorMessage);
    }

    public static <T> void serialize(T v, JsonGenerator gen, SerializerProvider arg2) throws IOException {
        log.info(
                "TimeAdapterUtil: serialize(): v: {}, v.getClass(): {}",
                v,
                v.getClass().getName());
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
        String errorMessage = UNSUPPORTED_TYPE + v.getClass().getName();
        log.error(errorMessage);
        throw new UnsupportedOperationException(errorMessage);
    }

    public static <T> T deserialize(JsonParser jsonparser, DeserializationContext context, @Nullable Class<T> type)
            throws IOException {
        log.info("TimeAdapterUtil: deserialize(): type: {}", type != null ? type.getName() : null);
        if (type == LocalDateTime.class) {
            return type.cast(JavaTimeUtil.deserializeLocalDateTime(jsonparser, context));
        } else if (type == ZonedDateTime.class) {
            return type.cast(JavaTimeUtil.deserializeZonedDateTime(jsonparser, context));
        } else if (type == org.joda.time.LocalDateTime.class) {
            return type.cast(JodaTimeUtil.deserializeLocalDateTime(jsonparser, context));
        } else if (type == org.joda.time.DateTime.class) {
            return type.cast(JodaTimeUtil.deserializeDateTime(jsonparser, context));
        }
        String errorMessage = UNSUPPORTED_TYPE + (type != null ? type.getName() : null);
        log.error(errorMessage);
        throw new UnsupportedOperationException(errorMessage);
    }
}

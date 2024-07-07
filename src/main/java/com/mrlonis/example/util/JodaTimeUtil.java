package com.mrlonis.example.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

@UtilityClass
@Slf4j
public class JodaTimeUtil {
    public static final DateTimeFormatter DATE_TIME_FORMATTER = ISODateTimeFormat.dateTime();

    public static DateTime unmarshalDateTime(String v) {
        log.info("JodaTimeUtil: unmarshalDateTime(): Received value: {}", v);

        try {
            DateTime result = DateTime.parse(v);
            log.info("JodaTimeUtil: unmarshalDateTime(): Returning result: {}", result);
            return result;
        } catch (IllegalArgumentException e) {
            log.error("JodaTimeUtil: unmarshalDateTime(): Error: {}", e.getMessage());
            log.info("JodaTimeUtil: unmarshalDateTime(): Trying to parse with formatter: {}", DATE_TIME_FORMATTER);
            DateTime result = DateTime.parse(v, DATE_TIME_FORMATTER);
            log.info("JodaTimeUtil: unmarshalDateTime(): Returning result: {}", result);
            return result;
        }
    }

    public static String marshalDateTime(DateTime v) {
        return v.toString();
    }

    public static LocalDateTime unmarshalLocalDateTime(String v) {
        log.info("JodaTimeUtil: unmarshalLocalDateTime(): Received value: {}", v);

        try {
            LocalDateTime result = LocalDateTime.parse(v);
            log.info("JodaTimeUtil: unmarshalLocalDateTime(): Returning result: {}", result);
            return result;
        } catch (IllegalArgumentException e) {
            log.error("JodaTimeUtil: unmarshalLocalDateTime(): Error: {}", e.getMessage());
            log.info("JodaTimeUtil: unmarshalLocalDateTime(): Trying to parse with formatter: {}", DATE_TIME_FORMATTER);
            LocalDateTime result = LocalDateTime.parse(v, DATE_TIME_FORMATTER);
            log.info("JodaTimeUtil: unmarshalLocalDateTime(): Returning result: {}", result);
            return result;
        }
    }

    public static String marshalLocalDateTime(LocalDateTime v) {
        return v.toString();
    }

    public static DateTime deserializeDateTime(JsonParser jsonparser, DeserializationContext context)
            throws IOException {
        String v = jsonparser.getText();
        log.info("JodaTimeUtil: deserializeDateTime(): Received value: {}", v);

        try {
            DateTime result = DateTime.parse(v);
            log.info("JodaTimeUtil: deserializeDateTime(): Returning result: {}", result);
            return result;
        } catch (IllegalArgumentException e) {
            log.error("JodaTimeUtil: deserializeDateTime(): Error: {}", e.getMessage());
            log.info("JodaTimeUtil: deserializeDateTime(): Trying to parse with formatter: {}", DATE_TIME_FORMATTER);
            DateTime result = DateTime.parse(v, DATE_TIME_FORMATTER);
            log.info("JodaTimeUtil: deserializeDateTime(): Returning result: {}", result);
            return result;
        }
    }

    public static void serializeDateTime(DateTime v, JsonGenerator gen, SerializerProvider arg2) throws IOException {
        if (v == null) {
            gen.writeNull();
        } else {
            gen.writeString(v.toString());
        }
    }

    public static LocalDateTime deserializeLocalDateTime(JsonParser jsonparser, DeserializationContext context)
            throws IOException {
        String v = jsonparser.getText();
        log.info("JodaTimeUtil: deserializeLocalDateTime(): Received value: {}", v);

        try {
            LocalDateTime result = LocalDateTime.parse(v);
            log.info("JodaTimeUtil: deserializeLocalDateTime(): Returning result: {}", result);
            return result;
        } catch (IllegalArgumentException e) {
            log.error("JodaTimeUtil: deserializeLocalDateTime(): Error: {}", e.getMessage());
            log.info(
                    "JodaTimeUtil: deserializeLocalDateTime(): Trying to parse with formatter: {}",
                    DATE_TIME_FORMATTER);
            LocalDateTime result = LocalDateTime.parse(v, DATE_TIME_FORMATTER);
            log.info("JodaTimeUtil: deserializeLocalDateTime(): Returning result: {}", result);
            return result;
        }
    }

    public static void serializeLocalDateTime(LocalDateTime v, JsonGenerator gen, SerializerProvider arg2)
            throws IOException {
        if (v == null) {
            gen.writeNull();
        } else {
            gen.writeString(v.toString());
        }
    }
}

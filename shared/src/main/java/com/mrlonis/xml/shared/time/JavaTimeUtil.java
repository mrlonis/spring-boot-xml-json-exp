package com.mrlonis.xml.shared.time;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Slf4j
public class JavaTimeUtil {
    public static final DateTimeFormatter PARSE_FORMAT = DateTimeFormatter.ISO_DATE_TIME;
    public static final DateTimeFormatter ZONED_OUTPUT_FORMAT = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
    public static final DateTimeFormatter NO_ZONE_OUTPUT_FORMAT = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    public static LocalDateTime unmarshalLocalDateTime(String v) {
        log.info("unmarshalLocalDateTime(): Received value: {}", v);
        try {
            LocalDateTime result = LocalDateTime.parse(v);
            log.info("unmarshalLocalDateTime(): Returning result: {}", result);
            return result;
        } catch (DateTimeParseException e) {
            log.error("unmarshalLocalDateTime(): Error: {}", e.getMessage());
            log.info("unmarshalLocalDateTime(): Trying to parse with formatter: {}", PARSE_FORMAT);
            LocalDateTime result = LocalDateTime.parse(v, PARSE_FORMAT);
            log.info("unmarshalLocalDateTime(): Returning result: {}", result);
            return result;
        }
    }

    public static String marshalLocalDateTime(LocalDateTime v) {
        String dateString = v.format(NO_ZONE_OUTPUT_FORMAT);
        log.info("marshalLocalDateTime(): Returning value: {}", dateString);
        return dateString;
    }

    public static ZonedDateTime unmarshalZonedDateTime(String v) {
        log.info("unmarshalZonedDateTime(): Received value: {}", v);
        try {
            ZonedDateTime result = ZonedDateTime.parse(v);
            log.info("unmarshalZonedDateTime(): Returning result: {}", result);
            return result;
        } catch (DateTimeParseException e) {
            log.error("unmarshalZonedDateTime(): Error: {}", e.getMessage());
            log.info("unmarshalZonedDateTime(): Trying to parse with formatter: {}", PARSE_FORMAT);
            ZonedDateTime result = ZonedDateTime.parse(v, PARSE_FORMAT);
            log.info("unmarshalZonedDateTime(): Returning result: {}", result);
            return result;
        }
    }

    public static String marshalZonedDateTime(ZonedDateTime v) {
        String dateString = v.format(ZONED_OUTPUT_FORMAT);
        log.info("marshalZonedDateTime(): Returning value: {}", dateString);
        return dateString;
    }

    public static LocalDateTime deserializeLocalDateTime(JsonParser jsonparser, DeserializationContext context)
            throws IOException {
        String v = jsonparser.getText();
        log.info("deserializeLocalDateTime(): Received value: {}", v);
        try {
            LocalDateTime result = LocalDateTime.parse(v);
            log.info("deserializeLocalDateTime(): Returning result: {}", result);
            return result;
        } catch (DateTimeParseException e) {
            log.error("deserializeLocalDateTime(): Error: {}", e.getMessage());
            log.info("deserializeLocalDateTime(): Trying to parse with formatter: {}", PARSE_FORMAT);
            LocalDateTime result = LocalDateTime.parse(v, PARSE_FORMAT);
            log.info("deserializeLocalDateTime(): Returning result: {}", result);
            return result;
        }
    }

    public static void serializeLocalDateTime(LocalDateTime v, JsonGenerator gen, SerializerProvider arg2)
            throws IOException {
        log.info("serializeLocalDateTime(): Received value: {}", v);
        if (v == null) {
            log.info("serializeLocalDateTime(): Calling gen.writeNull()...");
            gen.writeNull();
        } else {
            String dateString = v.format(NO_ZONE_OUTPUT_FORMAT);
            log.info("serializeLocalDateTime(): Calling gen.writeString() with value: {}", dateString);
            gen.writeString(dateString);
        }
    }

    public static ZonedDateTime deserializeZonedDateTime(JsonParser jsonparser, DeserializationContext context)
            throws IOException {
        String v = jsonparser.getText();
        log.info("deserializeZonedDateTime(): Received value: {}", v);
        try {
            ZonedDateTime result = ZonedDateTime.parse(v);
            log.info("deserializeZonedDateTime(): Returning result: {}", result);
            return result;
        } catch (DateTimeParseException e) {
            log.error("deserializeZonedDateTime(): Error: {}", e.getMessage());
            log.info("deserializeZonedDateTime(): Trying to parse with formatter: {}", PARSE_FORMAT);
            ZonedDateTime result = ZonedDateTime.parse(v, PARSE_FORMAT);
            log.info("deserializeZonedDateTime(): Returning result: {}", result);
            return result;
        }
    }

    public static void serializeZonedDateTime(ZonedDateTime v, JsonGenerator gen, SerializerProvider arg2)
            throws IOException {
        log.info("serializeZonedDateTime(): Received value: {}", v);
        if (v == null) {
            log.info("serializeZonedDateTime(): Calling gen.writeNull()...");
            gen.writeNull();
        } else {
            String dateString = v.format(ZONED_OUTPUT_FORMAT);
            log.info("serializeZonedDateTime(): Calling gen.writeString() with value: {}", dateString);
            gen.writeString(dateString);
        }
    }
}

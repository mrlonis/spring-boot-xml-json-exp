package com.mrlonis.example.util;

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
    public static final DateTimeFormatter ISO_DATE_TIME_FORMATTER = DateTimeFormatter.ISO_DATE_TIME;

    public static LocalDateTime unmarshalLocalDateTime(String v) {
        log.info("JavaTimeUtil: unmarshalLocalDateTime(): Received value: {}", v);
        try {
            LocalDateTime result = LocalDateTime.parse(v);
            log.info("JavaTimeUtil: unmarshalLocalDateTime(): Returning result: {}", result);
            return result;
        } catch (DateTimeParseException e) {
            log.error("JavaTimeUtil: unmarshalLocalDateTime(): Error: {}", e.getMessage());
            log.info(
                    "JavaTimeUtil: unmarshalLocalDateTime(): Trying to parse with formatter: {}",
                    ISO_DATE_TIME_FORMATTER);
            LocalDateTime result = LocalDateTime.parse(v, ISO_DATE_TIME_FORMATTER);
            log.info("JavaTimeUtil: unmarshalLocalDateTime(): Returning result: {}", result);
            return result;
        }
    }

    public static String marshalLocalDateTime(LocalDateTime v) {
        return v.toString();
    }

    public static ZonedDateTime unmarshalZonedDateTime(String v) {
        log.info("JavaTimeUtil: unmarshalZonedDateTime(): Received value: {}", v);
        try {
            ZonedDateTime result = ZonedDateTime.parse(v);
            log.info("JavaTimeUtil: unmarshalZonedDateTime(): Returning result: {}", result);
            return result;
        } catch (DateTimeParseException e) {
            log.error("JavaTimeUtil: unmarshalZonedDateTime(): Error: {}", e.getMessage());
            log.info(
                    "JavaTimeUtil: unmarshalZonedDateTime(): Trying to parse with formatter: {}",
                    ISO_DATE_TIME_FORMATTER);
            ZonedDateTime result = ZonedDateTime.parse(v, ISO_DATE_TIME_FORMATTER);
            log.info("JavaTimeUtil: unmarshalZonedDateTime(): Returning result: {}", result);
            return result;
        }
    }

    public static String marshalZonedDateTime(ZonedDateTime v) {
        return v.toString();
    }

    public static LocalDateTime deserializeLocalDateTime(JsonParser jsonparser, DeserializationContext context)
            throws IOException {
        String v = jsonparser.getText();
        log.info("JavaTimeUtil: deserializeLocalDateTime(): Received value: {}", v);
        try {
            LocalDateTime result = LocalDateTime.parse(v);
            log.info("JavaTimeUtil: deserializeLocalDateTime(): Returning result: {}", result);
            return result;
        } catch (DateTimeParseException e) {
            log.error("JavaTimeUtil: deserializeLocalDateTime(): Error: {}", e.getMessage());
            log.info(
                    "JavaTimeUtil: deserializeLocalDateTime(): Trying to parse with formatter: {}",
                    ISO_DATE_TIME_FORMATTER);
            LocalDateTime result = LocalDateTime.parse(v, ISO_DATE_TIME_FORMATTER);
            log.info("JavaTimeUtil: deserializeLocalDateTime(): Returning result: {}", result);
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

    public static ZonedDateTime deserializeZonedDateTime(JsonParser jsonparser, DeserializationContext context)
            throws IOException {
        String v = jsonparser.getText();
        log.info("JavaTimeUtil: deserializeZonedDateTime(): Received value: {}", v);
        try {
            ZonedDateTime result = ZonedDateTime.parse(v);
            log.info("JavaTimeUtil: deserializeZonedDateTime(): Returning result: {}", result);
            return result;
        } catch (DateTimeParseException e) {
            log.error("JavaTimeUtil: deserializeZonedDateTime(): Error: {}", e.getMessage());
            log.info(
                    "JavaTimeUtil: deserializeZonedDateTime(): Trying to parse with formatter: {}",
                    ISO_DATE_TIME_FORMATTER);
            ZonedDateTime result = ZonedDateTime.parse(v, ISO_DATE_TIME_FORMATTER);
            log.info("JavaTimeUtil: deserializeZonedDateTime(): Returning result: {}", result);
            return result;
        }
    }

    public static void serializeZonedDateTime(ZonedDateTime v, JsonGenerator gen, SerializerProvider arg2)
            throws IOException {
        if (v == null) {
            gen.writeNull();
        } else {
            gen.writeString(v.toString());
        }
    }
}

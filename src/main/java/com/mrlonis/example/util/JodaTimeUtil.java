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
    public static final DateTimeFormatter PARSE_FORMAT = ISODateTimeFormat.dateTime();

    public static DateTime unmarshalDateTime(String v) {
        log.info("unmarshalDateTime(): Received value: {}", v);

        try {
            DateTime result = DateTime.parse(v);
            log.info("unmarshalDateTime(): Returning result: {}", result);
            return result;
        } catch (IllegalArgumentException e) {
            log.error("unmarshalDateTime(): Error: {}", e.getMessage());
            log.info("unmarshalDateTime(): Trying to parse with formatter: {}", PARSE_FORMAT);
            DateTime result = DateTime.parse(v, PARSE_FORMAT);
            log.info("unmarshalDateTime(): Returning result: {}", result);
            return result;
        }
    }

    public static String marshalDateTime(DateTime v) {
        String dateString = PARSE_FORMAT.print(v);
        log.info("marshalDateTime(): Returning value: {}", dateString);
        return dateString;
    }

    public static LocalDateTime unmarshalLocalDateTime(String v) {
        log.info("unmarshalLocalDateTime(): Received value: {}", v);

        try {
            LocalDateTime result = LocalDateTime.parse(v);
            log.info("unmarshalLocalDateTime(): Returning result: {}", result);
            return result;
        } catch (IllegalArgumentException e) {
            log.error("unmarshalLocalDateTime(): Error: {}", e.getMessage());
            log.info("unmarshalLocalDateTime(): Trying to parse with formatter: {}", PARSE_FORMAT);
            LocalDateTime result = LocalDateTime.parse(v, PARSE_FORMAT);
            log.info("unmarshalLocalDateTime(): Returning result: {}", result);
            return result;
        }
    }

    public static String marshalLocalDateTime(LocalDateTime v) {
        String dateString = PARSE_FORMAT.print(v);
        log.info("marshalDateTime(): Returning value: {}", dateString);
        return dateString;
    }

    public static DateTime deserializeDateTime(JsonParser jsonparser, DeserializationContext context)
            throws IOException {
        String v = jsonparser.getText();
        log.info("deserializeDateTime(): Received value: {}", v);

        try {
            DateTime result = DateTime.parse(v);
            log.info("deserializeDateTime(): Returning result: {}", result);
            return result;
        } catch (IllegalArgumentException e) {
            log.error("deserializeDateTime(): Error: {}", e.getMessage());
            log.info("deserializeDateTime(): Trying to parse with formatter: {}", PARSE_FORMAT);
            DateTime result = DateTime.parse(v, PARSE_FORMAT);
            log.info("deserializeDateTime(): Returning result: {}", result);
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
        log.info("deserializeLocalDateTime(): Received value: {}", v);

        try {
            LocalDateTime result = LocalDateTime.parse(v);
            log.info("deserializeLocalDateTime(): Returning result: {}", result);
            return result;
        } catch (IllegalArgumentException e) {
            log.error("deserializeLocalDateTime(): Error: {}", e.getMessage());
            log.info("deserializeLocalDateTime(): Trying to parse with formatter: {}", PARSE_FORMAT);
            LocalDateTime result = LocalDateTime.parse(v, PARSE_FORMAT);
            log.info("deserializeLocalDateTime(): Returning result: {}", result);
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

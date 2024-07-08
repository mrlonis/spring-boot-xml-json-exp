package com.mrlonis.example.model.jackson.jackson;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.experimental.UtilityClass;
import lombok.extern.jackson.Jacksonized;

@UtilityClass
public class JacksonJavaTimeModels {
    @JacksonXmlRootElement(localName = "book")
    @JsonPropertyOrder({"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJavaTimeNoZone extends BaseJacksonModel<LocalDateTime> {}

    @JacksonXmlRootElement(localName = "book")
    @JsonPropertyOrder({"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJavaTimeZoned extends BaseJacksonModel<ZonedDateTime> {}
}

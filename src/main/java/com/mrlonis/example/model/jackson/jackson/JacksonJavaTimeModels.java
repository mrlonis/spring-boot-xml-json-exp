package com.mrlonis.example.model.jackson.jackson;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.mrlonis.example.adapter.JacksonJavaTimeDeserializers;
import com.mrlonis.example.adapter.JacksonSerializer;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
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
    public static class JacksonJavaTimeNoZone extends BaseJacksonModel<LocalDateTime> {
        @JacksonXmlProperty
        @JsonSerialize(using = JacksonSerializer.class)
        @JsonDeserialize(using = JacksonJavaTimeDeserializers.JacksonLocalDateTimeDeserializer.class)
        @Getter(onMethod_ = {@JsonGetter})
        private LocalDateTime date;
    }

    @JacksonXmlRootElement(localName = "book")
    @JsonPropertyOrder({"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJavaTimeZoned extends BaseJacksonModel<ZonedDateTime> {
        @JacksonXmlProperty
        @JsonSerialize(using = JacksonSerializer.class)
        @JsonDeserialize(using = JacksonJavaTimeDeserializers.JacksonZonedDateTimeDeserializer.class)
        @Getter(onMethod_ = {@JsonGetter})
        private ZonedDateTime date;
    }
}

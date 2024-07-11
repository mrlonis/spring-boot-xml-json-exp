package com.mrlonis.xml.all.model.jackson.jackson;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.mrlonis.xml.all.adapter.JacksonJodaTimeDeserializers;
import com.mrlonis.xml.all.adapter.JacksonSerializer;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
import lombok.experimental.UtilityClass;
import lombok.extern.jackson.Jacksonized;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

@UtilityClass
public class JacksonJodaTimeModels {
    @JacksonXmlRootElement(localName = "book")
    @JsonPropertyOrder({"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJodaTimeNoZone extends BaseJacksonModel<LocalDateTime> {
        @JacksonXmlProperty
        @JsonSerialize(using = JacksonSerializer.class)
        @JsonDeserialize(using = JacksonJodaTimeDeserializers.JacksonLocalDateTimeDeserializer.class)
        @Getter(onMethod_ = {@JsonGetter})
        private LocalDateTime date;
    }

    @JacksonXmlRootElement(localName = "book")
    @JsonPropertyOrder({"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJodaTimeZoned extends BaseJacksonModel<DateTime> {
        @JacksonXmlProperty
        @JsonSerialize(using = JacksonSerializer.class)
        @JsonDeserialize(using = JacksonJodaTimeDeserializers.JacksonDateTimeDeserializer.class)
        @Getter(onMethod_ = {@JsonGetter})
        private DateTime date;
    }
}

package com.mrlonis.xml.all.model.jackson.jakarta;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.mrlonis.xml.shared.adapter.JakartaJavaTimeAdapters;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
import lombok.experimental.UtilityClass;
import lombok.extern.jackson.Jacksonized;

@UtilityClass
public class JacksonJakartaJavaTimeModels {
    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJakartaJavaTimeNoZoneAccessTypeField extends BaseJacksonJakartaModel<LocalDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JakartaJavaTimeAdapters.JakartaLocalDateTimeAdapter.class)
        @Getter(onMethod_ = {@JsonGetter})
        private LocalDateTime date;
    }

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJakartaJavaTimeNoZoneAccessTypeNone extends BaseJacksonJakartaModel<LocalDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JakartaJavaTimeAdapters.JakartaLocalDateTimeAdapter.class)
        @Getter(onMethod_ = {@JsonGetter})
        private LocalDateTime date;
    }

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJakartaJavaTimeNoZoneAccessTypeProperty extends BaseJacksonJakartaModel<LocalDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JakartaJavaTimeAdapters.JakartaLocalDateTimeAdapter.class)
        @Getter(onMethod_ = {@JsonGetter})
        private LocalDateTime date;
    }

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJakartaJavaTimeNoZoneAccessTypePublicMember
            extends BaseJacksonJakartaModel<LocalDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JakartaJavaTimeAdapters.JakartaLocalDateTimeAdapter.class)
        @Getter(onMethod_ = {@JsonGetter})
        private LocalDateTime date;
    }

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJakartaJavaTimeZonedAccessTypeField extends BaseJacksonJakartaModel<ZonedDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JakartaJavaTimeAdapters.JakartaZonedDateTimeAdapter.class)
        @Getter(onMethod_ = {@JsonGetter})
        private ZonedDateTime date;
    }

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJakartaJavaTimeZonedAccessTypeNone extends BaseJacksonJakartaModel<ZonedDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JakartaJavaTimeAdapters.JakartaZonedDateTimeAdapter.class)
        @Getter(onMethod_ = {@JsonGetter})
        private ZonedDateTime date;
    }

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJakartaJavaTimeZonedAccessTypeProperty extends BaseJacksonJakartaModel<ZonedDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JakartaJavaTimeAdapters.JakartaZonedDateTimeAdapter.class)
        @Getter(onMethod_ = {@JsonGetter})
        private ZonedDateTime date;
    }

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJakartaJavaTimeZonedAccessTypePublicMember
            extends BaseJacksonJakartaModel<ZonedDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JakartaJavaTimeAdapters.JakartaZonedDateTimeAdapter.class)
        @Getter(onMethod_ = {@JsonGetter})
        private ZonedDateTime date;
    }
}

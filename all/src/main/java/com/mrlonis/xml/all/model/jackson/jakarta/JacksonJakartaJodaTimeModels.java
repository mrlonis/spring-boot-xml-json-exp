package com.mrlonis.xml.all.model.jackson.jakarta;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.mrlonis.xml.all.adapter.JakartaJodaTimeAdapters;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
import lombok.experimental.UtilityClass;
import lombok.extern.jackson.Jacksonized;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

@UtilityClass
public class JacksonJakartaJodaTimeModels {
    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJakartaJodaTimeNoZoneAccessTypeField extends BaseJacksonJakartaModel<LocalDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JakartaJodaTimeAdapters.JakartaLocalDateTimeAdapter.class)
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
    public static class JacksonJakartaJodaTimeNoZoneAccessTypeNone extends BaseJacksonJakartaModel<LocalDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JakartaJodaTimeAdapters.JakartaLocalDateTimeAdapter.class)
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
    public static class JacksonJakartaJodaTimeNoZoneAccessTypeProperty extends BaseJacksonJakartaModel<LocalDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JakartaJodaTimeAdapters.JakartaLocalDateTimeAdapter.class)
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
    public static class JacksonJakartaJodaTimeNoZoneAccessTypePublicMember
            extends BaseJacksonJakartaModel<LocalDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JakartaJodaTimeAdapters.JakartaLocalDateTimeAdapter.class)
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
    public static class JacksonJakartaJodaTimeZonedAccessTypeField extends BaseJacksonJakartaModel<DateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JakartaJodaTimeAdapters.JakartaDateTimeAdapter.class)
        @Getter(onMethod_ = {@JsonGetter})
        private DateTime date;
    }

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJakartaJodaTimeZonedAccessTypeNone extends BaseJacksonJakartaModel<DateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JakartaJodaTimeAdapters.JakartaDateTimeAdapter.class)
        @Getter(onMethod_ = {@JsonGetter})
        private DateTime date;
    }

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJakartaJodaTimeZonedAccessTypeProperty extends BaseJacksonJakartaModel<DateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JakartaJodaTimeAdapters.JakartaDateTimeAdapter.class)
        @Getter(onMethod_ = {@JsonGetter})
        private DateTime date;
    }

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJakartaJodaTimeZonedAccessTypePublicMember extends BaseJacksonJakartaModel<DateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JakartaJodaTimeAdapters.JakartaDateTimeAdapter.class)
        @Getter(onMethod_ = {@JsonGetter})
        private DateTime date;
    }
}

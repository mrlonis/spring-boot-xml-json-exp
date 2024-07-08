package com.mrlonis.example.model.jackson.jaxb;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.mrlonis.example.adapter.JaxbJavaTimeAdapters;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;
import lombok.experimental.UtilityClass;
import lombok.extern.jackson.Jacksonized;

@UtilityClass
public class JacksonJaxbJavaTimeModels {
    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJaxbJavaTimeNoZoneAccessTypeField extends BaseJacksonJaxbModel<LocalDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JaxbJavaTimeAdapters.JaxbLocalDateTimeAdapter.class)
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
    public static class JacksonJaxbJavaTimeNoZoneAccessTypeNone extends BaseJacksonJaxbModel<LocalDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JaxbJavaTimeAdapters.JaxbLocalDateTimeAdapter.class)
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
    public static class JacksonJaxbJavaTimeNoZoneAccessTypeProperty extends BaseJacksonJaxbModel<LocalDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JaxbJavaTimeAdapters.JaxbLocalDateTimeAdapter.class)
        @Getter(onMethod_ = {@JsonGetter})
        private LocalDateTime date;
    }

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJaxbJavaTimeNoZoneAccessTypePublicMember extends BaseJacksonJaxbModel<LocalDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JaxbJavaTimeAdapters.JaxbLocalDateTimeAdapter.class)
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
    public static class JacksonJaxbJavaTimeZonedAccessTypeField extends BaseJacksonJaxbModel<ZonedDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JaxbJavaTimeAdapters.JaxbZonedDateTimeAdapter.class)
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
    public static class JacksonJaxbJavaTimeZonedAccessTypeNone extends BaseJacksonJaxbModel<ZonedDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JaxbJavaTimeAdapters.JaxbZonedDateTimeAdapter.class)
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
    public static class JacksonJaxbJavaTimeZonedAccessTypeProperty extends BaseJacksonJaxbModel<ZonedDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JaxbJavaTimeAdapters.JaxbZonedDateTimeAdapter.class)
        @Getter(onMethod_ = {@JsonGetter})
        private ZonedDateTime date;
    }

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class JacksonJaxbJavaTimeZonedAccessTypePublicMember extends BaseJacksonJaxbModel<ZonedDateTime> {
        @JacksonXmlProperty
        @XmlJavaTypeAdapter(JaxbJavaTimeAdapters.JaxbZonedDateTimeAdapter.class)
        @Getter(onMethod_ = {@JsonGetter})
        private ZonedDateTime date;
    }
}

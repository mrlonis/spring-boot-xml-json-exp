package com.mrlonis.xml.shared.model.pure.jakarta;

import com.mrlonis.xml.shared.adapter.JakartaJavaTimeAdapters;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.experimental.UtilityClass;
import lombok.extern.jackson.Jacksonized;

@UtilityClass
public class PureJakartaJavaTimeModels {
    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJakartaJavaTimeNoZoneAccessTypeField extends BasePureJakartaModel<LocalDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JakartaJavaTimeAdapters.JakartaLocalDateTimeAdapter.class)
        private LocalDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJakartaJavaTimeNoZoneAccessTypeNone extends BasePureJakartaModel<LocalDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JakartaJavaTimeAdapters.JakartaLocalDateTimeAdapter.class)
        private LocalDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJakartaJavaTimeNoZoneAccessTypeProperty extends BasePureJakartaModel<LocalDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JakartaJavaTimeAdapters.JakartaLocalDateTimeAdapter.class)
        private LocalDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJakartaJavaTimeNoZoneAccessTypePublicMember extends BasePureJakartaModel<LocalDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JakartaJavaTimeAdapters.JakartaLocalDateTimeAdapter.class)
        private LocalDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJakartaJavaTimeZonedAccessTypeField extends BasePureJakartaModel<ZonedDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JakartaJavaTimeAdapters.JakartaZonedDateTimeAdapter.class)
        private ZonedDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJakartaJavaTimeZonedAccessTypeNone extends BasePureJakartaModel<ZonedDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JakartaJavaTimeAdapters.JakartaZonedDateTimeAdapter.class)
        private ZonedDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJakartaJavaTimeZonedAccessTypeProperty extends BasePureJakartaModel<ZonedDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JakartaJavaTimeAdapters.JakartaZonedDateTimeAdapter.class)
        private ZonedDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJakartaJavaTimeZonedAccessTypePublicMember extends BasePureJakartaModel<ZonedDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JakartaJavaTimeAdapters.JakartaZonedDateTimeAdapter.class)
        private ZonedDateTime date;
    }
}

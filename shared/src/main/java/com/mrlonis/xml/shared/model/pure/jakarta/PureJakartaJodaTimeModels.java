package com.mrlonis.xml.shared.model.pure.jakarta;

import com.mrlonis.xml.shared.adapter.JakartaJodaTimeAdapters;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.experimental.UtilityClass;
import lombok.extern.jackson.Jacksonized;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

@UtilityClass
public class PureJakartaJodaTimeModels {
    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJakartaJodaTimeNoZoneAccessTypeField extends BasePureJakartaModel<LocalDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JakartaJodaTimeAdapters.JakartaLocalDateTimeAdapter.class)
        private LocalDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJakartaJodaTimeNoZoneAccessTypeNone extends BasePureJakartaModel<LocalDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JakartaJodaTimeAdapters.JakartaLocalDateTimeAdapter.class)
        private LocalDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJakartaJodaTimeNoZoneAccessTypeProperty extends BasePureJakartaModel<LocalDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JakartaJodaTimeAdapters.JakartaLocalDateTimeAdapter.class)
        private LocalDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJakartaJodaTimeNoZoneAccessTypePublicMember extends BasePureJakartaModel<LocalDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JakartaJodaTimeAdapters.JakartaLocalDateTimeAdapter.class)
        private LocalDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJakartaJodaTimeZonedAccessTypeField extends BasePureJakartaModel<DateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JakartaJodaTimeAdapters.JakartaDateTimeAdapter.class)
        private DateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJakartaJodaTimeZonedAccessTypeNone extends BasePureJakartaModel<DateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JakartaJodaTimeAdapters.JakartaDateTimeAdapter.class)
        private DateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJakartaJodaTimeZonedAccessTypeProperty extends BasePureJakartaModel<DateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JakartaJodaTimeAdapters.JakartaDateTimeAdapter.class)
        private DateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJakartaJodaTimeZonedAccessTypePublicMember extends BasePureJakartaModel<DateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JakartaJodaTimeAdapters.JakartaDateTimeAdapter.class)
        private DateTime date;
    }
}

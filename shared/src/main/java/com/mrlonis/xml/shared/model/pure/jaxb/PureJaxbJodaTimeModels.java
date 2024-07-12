package com.mrlonis.xml.shared.model.pure.jaxb;

import com.mrlonis.xml.shared.adapter.JaxbJodaTimeAdapters;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import lombok.experimental.UtilityClass;
import lombok.extern.jackson.Jacksonized;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

@UtilityClass
public class PureJaxbJodaTimeModels {
    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJaxbJodaTimeNoZoneAccessTypeField extends BasePureJaxbModel<LocalDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JaxbJodaTimeAdapters.JaxbLocalDateTimeAdapter.class)
        private LocalDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJaxbJodaTimeNoZoneAccessTypeNone extends BasePureJaxbModel<LocalDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JaxbJodaTimeAdapters.JaxbLocalDateTimeAdapter.class)
        private LocalDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJaxbJodaTimeNoZoneAccessTypeProperty extends BasePureJaxbModel<LocalDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JaxbJodaTimeAdapters.JaxbLocalDateTimeAdapter.class)
        private LocalDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJaxbJodaTimeNoZoneAccessTypePublicMember extends BasePureJaxbModel<LocalDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JaxbJodaTimeAdapters.JaxbLocalDateTimeAdapter.class)
        private LocalDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @ToString(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJaxbJodaTimeZonedAccessTypeField extends BasePureJaxbModel<DateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JaxbJodaTimeAdapters.JaxbDateTimeAdapter.class)
        private DateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJaxbJodaTimeZonedAccessTypeNone extends BasePureJaxbModel<DateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JaxbJodaTimeAdapters.JaxbDateTimeAdapter.class)
        private DateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJaxbJodaTimeZonedAccessTypeProperty extends BasePureJaxbModel<DateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JaxbJodaTimeAdapters.JaxbDateTimeAdapter.class)
        private DateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJaxbJodaTimeZonedAccessTypePublicMember extends BasePureJaxbModel<DateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JaxbJodaTimeAdapters.JaxbDateTimeAdapter.class)
        private DateTime date;
    }
}

package com.mrlonis.xml.shared.model.pure.jaxb;

import com.mrlonis.xml.shared.adapter.JaxbJavaTimeAdapters;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.experimental.UtilityClass;
import lombok.extern.jackson.Jacksonized;

@UtilityClass
public class PureJaxbJavaTimeModels {
    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJaxbJavaTimeNoZoneAccessTypeField extends BasePureJaxbModel<LocalDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JaxbJavaTimeAdapters.JaxbLocalDateTimeAdapter.class)
        private LocalDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJaxbJavaTimeNoZoneAccessTypeNone extends BasePureJaxbModel<LocalDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JaxbJavaTimeAdapters.JaxbLocalDateTimeAdapter.class)
        private LocalDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJaxbJavaTimeNoZoneAccessTypeProperty extends BasePureJaxbModel<LocalDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JaxbJavaTimeAdapters.JaxbLocalDateTimeAdapter.class)
        private LocalDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJaxbJavaTimeNoZoneAccessTypePublicMember extends BasePureJaxbModel<LocalDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JaxbJavaTimeAdapters.JaxbLocalDateTimeAdapter.class)
        private LocalDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJaxbJavaTimeZonedAccessTypeField extends BasePureJaxbModel<ZonedDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JaxbJavaTimeAdapters.JaxbZonedDateTimeAdapter.class)
        private ZonedDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJaxbJavaTimeZonedAccessTypeNone extends BasePureJaxbModel<ZonedDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JaxbJavaTimeAdapters.JaxbZonedDateTimeAdapter.class)
        private ZonedDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJaxbJavaTimeZonedAccessTypeProperty extends BasePureJaxbModel<ZonedDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JaxbJavaTimeAdapters.JaxbZonedDateTimeAdapter.class)
        private ZonedDateTime date;
    }

    @XmlRootElement(name = "book")
    @XmlAccessorType
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @Jacksonized
    @SuperBuilder
    public static class PureJaxbJavaTimeZonedAccessTypePublicMember extends BasePureJaxbModel<ZonedDateTime> {
        @XmlElement
        @XmlJavaTypeAdapter(JaxbJavaTimeAdapters.JaxbZonedDateTimeAdapter.class)
        private ZonedDateTime date;
    }
}

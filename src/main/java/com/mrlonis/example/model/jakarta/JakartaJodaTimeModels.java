package com.mrlonis.example.model.jakarta;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.experimental.UtilityClass;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

@UtilityClass
public class JakartaJodaTimeModels {
    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JakartaJodaTimeNoZoneAccessTypeField extends BaseJakartaModel<LocalDateTime> {}

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JakartaJodaTimeNoZoneAccessTypeNone extends BaseJakartaModel<LocalDateTime> {}

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JakartaJodaTimeNoZoneAccessTypeProperty extends BaseJakartaModel<LocalDateTime> {}

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JakartaJodaTimeNoZoneAccessTypePublicMember extends BaseJakartaModel<LocalDateTime> {}

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JakartaJodaTimeZonedAccessTypeField extends BaseJakartaModel<DateTime> {}

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JakartaJodaTimeZonedAccessTypeNone extends BaseJakartaModel<DateTime> {}

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JakartaJodaTimeZonedAccessTypeProperty extends BaseJakartaModel<DateTime> {}

    @XmlRootElement(name = "book")
    @XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JakartaJodaTimeZonedAccessTypePublicMember extends BaseJakartaModel<DateTime> {}
}

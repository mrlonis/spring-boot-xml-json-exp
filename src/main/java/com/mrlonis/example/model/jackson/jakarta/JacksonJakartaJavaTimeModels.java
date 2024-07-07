package com.mrlonis.example.model.jackson.jakarta;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JacksonJakartaJavaTimeModels {
    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JacksonJakartaJavaTimeNoZoneAccessTypeField extends BaseJacksonJakartaModel<LocalDateTime> {}

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JacksonJakartaJavaTimeNoZoneAccessTypeNone extends BaseJacksonJakartaModel<LocalDateTime> {}

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JacksonJakartaJavaTimeNoZoneAccessTypeProperty extends BaseJacksonJakartaModel<LocalDateTime> {}

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JacksonJakartaJavaTimeNoZoneAccessTypePublicMember
            extends BaseJacksonJakartaModel<LocalDateTime> {}

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JacksonJakartaModelAccessTypeField extends BaseJacksonJakartaModel<ZonedDateTime> {}

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JacksonJakartaModelAccessTypeNone extends BaseJacksonJakartaModel<ZonedDateTime> {}

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JacksonJakartaModelAccessTypeProperty extends BaseJacksonJakartaModel<ZonedDateTime> {}

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JacksonJakartaModelAccessTypePublicMember extends BaseJacksonJakartaModel<ZonedDateTime> {}
}

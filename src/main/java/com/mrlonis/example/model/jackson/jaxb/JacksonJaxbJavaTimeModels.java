package com.mrlonis.example.model.jackson.jaxb;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import lombok.experimental.UtilityClass;

@UtilityClass
public class JacksonJaxbJavaTimeModels {
    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JacksonJaxbJavaTimeNoZoneAccessTypeField extends BaseJacksonJaxbModel<LocalDateTime> {}

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JacksonJaxbJavaTimeNoZoneAccessTypeNone extends BaseJacksonJaxbModel<LocalDateTime> {}

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JacksonJaxbJavaTimeNoZoneAccessTypeProperty extends BaseJacksonJaxbModel<LocalDateTime> {}

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JacksonJaxbJavaTimeNoZoneAccessTypePublicMember extends BaseJacksonJaxbModel<LocalDateTime> {}

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JacksonJaxbJavaTimeZonedAccessTypeField extends BaseJacksonJaxbModel<ZonedDateTime> {}

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.NONE)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JacksonJaxbJavaTimeZonedAccessTypeNone extends BaseJacksonJaxbModel<ZonedDateTime> {}

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType(XmlAccessType.PROPERTY)
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JacksonJaxbJavaTimeZonedAccessTypeProperty extends BaseJacksonJaxbModel<ZonedDateTime> {}

    @JacksonXmlRootElement(localName = "book")
    @XmlAccessorType
    @XmlType(propOrder = {"id", "name", "date", "tags"})
    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder
    public static class JacksonJaxbJavaTimeZonedAccessTypePublicMember extends BaseJacksonJaxbModel<ZonedDateTime> {}
}

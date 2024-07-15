package com.mrlonis.xml.shared.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.mrlonis.xml.shared.model.jackson.jackson.JacksonJavaTimeModels;
import com.mrlonis.xml.shared.model.jackson.jackson.JacksonJodaTimeModels;
import com.mrlonis.xml.shared.model.jackson.jakarta.JacksonJakartaJavaTimeModels;
import com.mrlonis.xml.shared.model.jackson.jakarta.JacksonJakartaJodaTimeModels;
import com.mrlonis.xml.shared.model.jackson.jaxb.JacksonJaxbJavaTimeModels;
import com.mrlonis.xml.shared.model.jackson.jaxb.JacksonJaxbJodaTimeModels;
import com.mrlonis.xml.shared.model.jakarta.JakartaJavaTimeModels;
import com.mrlonis.xml.shared.model.jakarta.JakartaJodaTimeModels;
import com.mrlonis.xml.shared.model.jaxb.JaxbJavaTimeModels;
import com.mrlonis.xml.shared.model.jaxb.JaxbJodaTimeModels;
import com.mrlonis.xml.shared.model.pure.jakarta.jakarta.PureJakartaJavaTimeNoZoneAccessTypeField;
import com.mrlonis.xml.shared.model.pure.jakarta.jakarta.PureJakartaJavaTimeNoZoneAccessTypeNone;
import com.mrlonis.xml.shared.model.pure.jakarta.jakarta.PureJakartaJavaTimeNoZoneAccessTypeProperty;
import com.mrlonis.xml.shared.model.pure.jakarta.jakarta.PureJakartaJavaTimeNoZoneAccessTypePublicMember;
import com.mrlonis.xml.shared.model.pure.jakarta.jakarta.PureJakartaJavaTimeZonedAccessTypeField;
import com.mrlonis.xml.shared.model.pure.jakarta.jakarta.PureJakartaJavaTimeZonedAccessTypeNone;
import com.mrlonis.xml.shared.model.pure.jakarta.jakarta.PureJakartaJavaTimeZonedAccessTypeProperty;
import com.mrlonis.xml.shared.model.pure.jakarta.jakarta.PureJakartaJavaTimeZonedAccessTypePublicMember;
import com.mrlonis.xml.shared.model.pure.jakarta.joda.PureJakartaJodaTimeNoZoneAccessTypeField;
import com.mrlonis.xml.shared.model.pure.jakarta.joda.PureJakartaJodaTimeNoZoneAccessTypeNone;
import com.mrlonis.xml.shared.model.pure.jakarta.joda.PureJakartaJodaTimeNoZoneAccessTypeProperty;
import com.mrlonis.xml.shared.model.pure.jakarta.joda.PureJakartaJodaTimeNoZoneAccessTypePublicMember;
import com.mrlonis.xml.shared.model.pure.jakarta.joda.PureJakartaJodaTimeZonedAccessTypeField;
import com.mrlonis.xml.shared.model.pure.jakarta.joda.PureJakartaJodaTimeZonedAccessTypeNone;
import com.mrlonis.xml.shared.model.pure.jakarta.joda.PureJakartaJodaTimeZonedAccessTypeProperty;
import com.mrlonis.xml.shared.model.pure.jakarta.joda.PureJakartaJodaTimeZonedAccessTypePublicMember;
import com.mrlonis.xml.shared.model.pure.jaxb.PureJaxbJavaTimeModels;
import com.mrlonis.xml.shared.model.pure.jaxb.PureJaxbJodaTimeModels;
import java.util.List;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(
            value = JaxbJodaTimeModels.JaxbJodaTimeNoZoneAccessTypeField.class,
            name = "JaxbJodaTimeModels" + "$" + "JaxbJodaTimeNoZoneAccessTypeField"),
    @JsonSubTypes.Type(
            value = JaxbJodaTimeModels.JaxbJodaTimeNoZoneAccessTypeNone.class,
            name = "JaxbJodaTimeModels" + "$" + "JaxbJodaTimeNoZoneAccessTypeNone"),
    @JsonSubTypes.Type(
            value = JaxbJodaTimeModels.JaxbJodaTimeNoZoneAccessTypeProperty.class,
            name = "JaxbJodaTimeModels" + "$" + "JaxbJodaTimeNoZoneAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = JaxbJodaTimeModels.JaxbJodaTimeNoZoneAccessTypePublicMember.class,
            name = "JaxbJodaTimeModels" + "$" + "JaxbJodaTimeNoZoneAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = JaxbJodaTimeModels.JaxbJodaTimeZonedAccessTypeField.class,
            name = "JaxbJodaTimeModels" + "$" + "JaxbJodaTimeZonedAccessTypeField"),
    @JsonSubTypes.Type(
            value = JaxbJodaTimeModels.JaxbJodaTimeZonedAccessTypeNone.class,
            name = "JaxbJodaTimeModels" + "$" + "JaxbJodaTimeZonedAccessTypeNone"),
    @JsonSubTypes.Type(
            value = JaxbJodaTimeModels.JaxbJodaTimeZonedAccessTypeProperty.class,
            name = "JaxbJodaTimeModels" + "$" + "JaxbJodaTimeZonedAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = JaxbJodaTimeModels.JaxbJodaTimeZonedAccessTypePublicMember.class,
            name = "JaxbJodaTimeModels" + "$" + "JaxbJodaTimeZonedAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = JaxbJavaTimeModels.JaxbJavaTimeNoZoneAccessTypeField.class,
            name = "JaxbJavaTimeModels" + "$" + "JaxbJavaTimeNoZoneAccessTypeField"),
    @JsonSubTypes.Type(
            value = JaxbJavaTimeModels.JaxbJavaTimeNoZoneAccessTypeNone.class,
            name = "JaxbJavaTimeModels" + "$" + "JaxbJavaTimeNoZoneAccessTypeNone"),
    @JsonSubTypes.Type(
            value = JaxbJavaTimeModels.JaxbJavaTimeNoZoneAccessTypeProperty.class,
            name = "JaxbJavaTimeModels" + "$" + "JaxbJavaTimeNoZoneAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = JaxbJavaTimeModels.JaxbJavaTimeNoZoneAccessTypePublicMember.class,
            name = "JaxbJavaTimeModels" + "$" + "JaxbJavaTimeNoZoneAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = JaxbJavaTimeModels.JaxbJavaTimeZonedAccessTypeField.class,
            name = "JaxbJavaTimeModels" + "$" + "JaxbJavaTimeZonedAccessTypeField"),
    @JsonSubTypes.Type(
            value = JaxbJavaTimeModels.JaxbJavaTimeZonedAccessTypeNone.class,
            name = "JaxbJavaTimeModels" + "$" + "JaxbJavaTimeZonedAccessTypeNone"),
    @JsonSubTypes.Type(
            value = JaxbJavaTimeModels.JaxbJavaTimeZonedAccessTypeProperty.class,
            name = "JaxbJavaTimeModels" + "$" + "JaxbJavaTimeZonedAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = JaxbJavaTimeModels.JaxbJavaTimeZonedAccessTypePublicMember.class,
            name = "JaxbJavaTimeModels" + "$" + "JaxbJavaTimeZonedAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = JakartaJodaTimeModels.JakartaJodaTimeNoZoneAccessTypeField.class,
            name = "JakartaJodaTimeModels" + "$" + "JakartaJodaTimeNoZoneAccessTypeField"),
    @JsonSubTypes.Type(
            value = JakartaJodaTimeModels.JakartaJodaTimeNoZoneAccessTypeNone.class,
            name = "JakartaJodaTimeModels" + "$" + "JakartaJodaTimeNoZoneAccessTypeNone"),
    @JsonSubTypes.Type(
            value = JakartaJodaTimeModels.JakartaJodaTimeNoZoneAccessTypeProperty.class,
            name = "JakartaJodaTimeModels" + "$" + "JakartaJodaTimeNoZoneAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = JakartaJodaTimeModels.JakartaJodaTimeNoZoneAccessTypePublicMember.class,
            name = "JakartaJodaTimeModels" + "$" + "JakartaJodaTimeNoZoneAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = JakartaJodaTimeModels.JakartaJodaTimeZonedAccessTypeField.class,
            name = "JakartaJodaTimeModels" + "$" + "JakartaJodaTimeZonedAccessTypeField"),
    @JsonSubTypes.Type(
            value = JakartaJodaTimeModels.JakartaJodaTimeZonedAccessTypeNone.class,
            name = "JakartaJodaTimeModels" + "$" + "JakartaJodaTimeZonedAccessTypeNone"),
    @JsonSubTypes.Type(
            value = JakartaJodaTimeModels.JakartaJodaTimeZonedAccessTypeProperty.class,
            name = "JakartaJodaTimeModels" + "$" + "JakartaJodaTimeZonedAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = JakartaJodaTimeModels.JakartaJodaTimeZonedAccessTypePublicMember.class,
            name = "JakartaJodaTimeModels" + "$" + "JakartaJodaTimeZonedAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = JakartaJavaTimeModels.JakartaJavaTimeNoZoneAccessTypeField.class,
            name = "JakartaJavaTimeModels" + "$" + "JakartaJavaTimeNoZoneAccessTypeField"),
    @JsonSubTypes.Type(
            value = JakartaJavaTimeModels.JakartaJavaTimeNoZoneAccessTypeNone.class,
            name = "JakartaJavaTimeModels" + "$" + "JakartaJavaTimeNoZoneAccessTypeNone"),
    @JsonSubTypes.Type(
            value = JakartaJavaTimeModels.JakartaJavaTimeNoZoneAccessTypeProperty.class,
            name = "JakartaJavaTimeModels" + "$" + "JakartaJavaTimeNoZoneAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = JakartaJavaTimeModels.JakartaJavaTimeNoZoneAccessTypePublicMember.class,
            name = "JakartaJavaTimeModels" + "$" + "JakartaJavaTimeNoZoneAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = JakartaJavaTimeModels.JakartaJavaTimeZonedAccessTypeField.class,
            name = "JakartaJavaTimeModels" + "$" + "JakartaJavaTimeZonedAccessTypeField"),
    @JsonSubTypes.Type(
            value = JakartaJavaTimeModels.JakartaJavaTimeZonedAccessTypeNone.class,
            name = "JakartaJavaTimeModels" + "$" + "JakartaJavaTimeZonedAccessTypeNone"),
    @JsonSubTypes.Type(
            value = JakartaJavaTimeModels.JakartaJavaTimeZonedAccessTypeProperty.class,
            name = "JakartaJavaTimeModels" + "$" + "JakartaJavaTimeZonedAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = JakartaJavaTimeModels.JakartaJavaTimeZonedAccessTypePublicMember.class,
            name = "JakartaJavaTimeModels" + "$" + "JakartaJavaTimeZonedAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeField.class,
            name = "JacksonJaxbJodaTimeModels" + "$" + "JacksonJaxbJodaTimeNoZoneAccessTypeField"),
    @JsonSubTypes.Type(
            value = JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeNone.class,
            name = "JacksonJaxbJodaTimeModels" + "$" + "JacksonJaxbJodaTimeNoZoneAccessTypeNone"),
    @JsonSubTypes.Type(
            value = JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypeProperty.class,
            name = "JacksonJaxbJodaTimeModels" + "$" + "JacksonJaxbJodaTimeNoZoneAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeNoZoneAccessTypePublicMember.class,
            name = "JacksonJaxbJodaTimeModels" + "$" + "JacksonJaxbJodaTimeNoZoneAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeField.class,
            name = "JacksonJaxbJodaTimeModels" + "$" + "JacksonJaxbJodaTimeZonedAccessTypeField"),
    @JsonSubTypes.Type(
            value = JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeNone.class,
            name = "JacksonJaxbJodaTimeModels" + "$" + "JacksonJaxbJodaTimeZonedAccessTypeNone"),
    @JsonSubTypes.Type(
            value = JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypeProperty.class,
            name = "JacksonJaxbJodaTimeModels" + "$" + "JacksonJaxbJodaTimeZonedAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = JacksonJaxbJodaTimeModels.JacksonJaxbJodaTimeZonedAccessTypePublicMember.class,
            name = "JacksonJaxbJodaTimeModels" + "$" + "JacksonJaxbJodaTimeZonedAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypeField.class,
            name = "JacksonJaxbJavaTimeModels" + "$" + "JacksonJaxbJavaTimeNoZoneAccessTypeField"),
    @JsonSubTypes.Type(
            value = JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypeNone.class,
            name = "JacksonJaxbJavaTimeModels" + "$" + "JacksonJaxbJavaTimeNoZoneAccessTypeNone"),
    @JsonSubTypes.Type(
            value = JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypeProperty.class,
            name = "JacksonJaxbJavaTimeModels" + "$" + "JacksonJaxbJavaTimeNoZoneAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeNoZoneAccessTypePublicMember.class,
            name = "JacksonJaxbJavaTimeModels" + "$" + "JacksonJaxbJavaTimeNoZoneAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypeField.class,
            name = "JacksonJaxbJavaTimeModels" + "$" + "JacksonJaxbJavaTimeZonedAccessTypeField"),
    @JsonSubTypes.Type(
            value = JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypeNone.class,
            name = "JacksonJaxbJavaTimeModels" + "$" + "JacksonJaxbJavaTimeZonedAccessTypeNone"),
    @JsonSubTypes.Type(
            value = JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypeProperty.class,
            name = "JacksonJaxbJavaTimeModels" + "$" + "JacksonJaxbJavaTimeZonedAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = JacksonJaxbJavaTimeModels.JacksonJaxbJavaTimeZonedAccessTypePublicMember.class,
            name = "JacksonJaxbJavaTimeModels" + "$" + "JacksonJaxbJavaTimeZonedAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypeField.class,
            name = "JacksonJakartaJodaTimeModels" + "$" + "JacksonJakartaJodaTimeNoZoneAccessTypeField"),
    @JsonSubTypes.Type(
            value = JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypeNone.class,
            name = "JacksonJakartaJodaTimeModels" + "$" + "JacksonJakartaJodaTimeNoZoneAccessTypeNone"),
    @JsonSubTypes.Type(
            value = JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypeProperty.class,
            name = "JacksonJakartaJodaTimeModels" + "$" + "JacksonJakartaJodaTimeNoZoneAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeNoZoneAccessTypePublicMember.class,
            name = "JacksonJakartaJodaTimeModels" + "$" + "JacksonJakartaJodaTimeNoZoneAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypeField.class,
            name = "JacksonJakartaJodaTimeModels" + "$" + "JacksonJakartaJodaTimeZonedAccessTypeField"),
    @JsonSubTypes.Type(
            value = JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypeNone.class,
            name = "JacksonJakartaJodaTimeModels" + "$" + "JacksonJakartaJodaTimeZonedAccessTypeNone"),
    @JsonSubTypes.Type(
            value = JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypeProperty.class,
            name = "JacksonJakartaJodaTimeModels" + "$" + "JacksonJakartaJodaTimeZonedAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = JacksonJakartaJodaTimeModels.JacksonJakartaJodaTimeZonedAccessTypePublicMember.class,
            name = "JacksonJakartaJodaTimeModels" + "$" + "JacksonJakartaJodaTimeZonedAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypeField.class,
            name = "JacksonJakartaJavaTimeModels" + "$" + "JacksonJakartaJavaTimeNoZoneAccessTypeField"),
    @JsonSubTypes.Type(
            value = JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypeNone.class,
            name = "JacksonJakartaJavaTimeModels" + "$" + "JacksonJakartaJavaTimeNoZoneAccessTypeNone"),
    @JsonSubTypes.Type(
            value = JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypeProperty.class,
            name = "JacksonJakartaJavaTimeModels" + "$" + "JacksonJakartaJavaTimeNoZoneAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeNoZoneAccessTypePublicMember.class,
            name = "JacksonJakartaJavaTimeModels" + "$" + "JacksonJakartaJavaTimeNoZoneAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeZonedAccessTypeField.class,
            name = "JacksonJakartaJavaTimeModels" + "$" + "JacksonJakartaJavaTimeZonedAccessTypeField"),
    @JsonSubTypes.Type(
            value = JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeZonedAccessTypeNone.class,
            name = "JacksonJakartaJavaTimeModels" + "$" + "JacksonJakartaJavaTimeZonedAccessTypeNone"),
    @JsonSubTypes.Type(
            value = JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeZonedAccessTypeProperty.class,
            name = "JacksonJakartaJavaTimeModels" + "$" + "JacksonJakartaJavaTimeZonedAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = JacksonJakartaJavaTimeModels.JacksonJakartaJavaTimeZonedAccessTypePublicMember.class,
            name = "JacksonJakartaJavaTimeModels" + "$" + "JacksonJakartaJavaTimeZonedAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = JacksonJodaTimeModels.JacksonJodaTimeNoZone.class,
            name = "JacksonJodaTimeModels" + "$" + "JacksonJodaTimeNoZone"),
    @JsonSubTypes.Type(
            value = JacksonJodaTimeModels.JacksonJodaTimeZoned.class,
            name = "JacksonJodaTimeModels" + "$" + "JacksonJodaTimeZoned"),
    @JsonSubTypes.Type(
            value = JacksonJavaTimeModels.JacksonJavaTimeNoZone.class,
            name = "JacksonJavaTimeModels" + "$" + "JacksonJavaTimeNoZone"),
    @JsonSubTypes.Type(
            value = JacksonJavaTimeModels.JacksonJavaTimeZoned.class,
            name = "JacksonJavaTimeModels" + "$" + "JacksonJavaTimeZoned"),
    @JsonSubTypes.Type(
            value = PureJakartaJavaTimeNoZoneAccessTypeField.class,
            name = "PureJakartaJavaTimeNoZoneAccessTypeField"),
    @JsonSubTypes.Type(
            value = PureJakartaJavaTimeNoZoneAccessTypeNone.class,
            name = "PureJakartaJavaTimeNoZoneAccessTypeNone"),
    @JsonSubTypes.Type(
            value = PureJakartaJavaTimeNoZoneAccessTypeProperty.class,
            name = "PureJakartaJavaTimeNoZoneAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = PureJakartaJavaTimeNoZoneAccessTypePublicMember.class,
            name = "PureJakartaJavaTimeNoZoneAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = PureJakartaJavaTimeZonedAccessTypeField.class,
            name = "PureJakartaJavaTimeZonedAccessTypeField"),
    @JsonSubTypes.Type(
            value = PureJakartaJavaTimeZonedAccessTypeNone.class,
            name = "PureJakartaJavaTimeZonedAccessTypeNone"),
    @JsonSubTypes.Type(
            value = PureJakartaJavaTimeZonedAccessTypeProperty.class,
            name = "PureJakartaJavaTimeZonedAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = PureJakartaJavaTimeZonedAccessTypePublicMember.class,
            name = "PureJakartaJavaTimeZonedAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = PureJakartaJodaTimeNoZoneAccessTypeField.class,
            name = "PureJakartaJodaTimeNoZoneAccessTypeField"),
    @JsonSubTypes.Type(
            value = PureJakartaJodaTimeNoZoneAccessTypeNone.class,
            name = "PureJakartaJodaTimeNoZoneAccessTypeNone"),
    @JsonSubTypes.Type(
            value = PureJakartaJodaTimeNoZoneAccessTypeProperty.class,
            name = "PureJakartaJodaTimeNoZoneAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = PureJakartaJodaTimeNoZoneAccessTypePublicMember.class,
            name = "PureJakartaJodaTimeNoZoneAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = PureJakartaJodaTimeZonedAccessTypeField.class,
            name = "PureJakartaJodaTimeZonedAccessTypeField"),
    @JsonSubTypes.Type(
            value = PureJakartaJodaTimeZonedAccessTypeNone.class,
            name = "PureJakartaJodaTimeZonedAccessTypeNone"),
    @JsonSubTypes.Type(
            value = PureJakartaJodaTimeZonedAccessTypeProperty.class,
            name = "PureJakartaJodaTimeZonedAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = PureJakartaJodaTimeZonedAccessTypePublicMember.class,
            name = "PureJakartaJodaTimeZonedAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = PureJaxbJavaTimeModels.PureJaxbJavaTimeNoZoneAccessTypeField.class,
            name = "PureJaxbJavaTimeModels" + "$" + "PureJaxbJavaTimeNoZoneAccessTypeField"),
    @JsonSubTypes.Type(
            value = PureJaxbJavaTimeModels.PureJaxbJavaTimeNoZoneAccessTypeNone.class,
            name = "PureJaxbJavaTimeModels" + "$" + "PureJaxbJavaTimeNoZoneAccessTypeNone"),
    @JsonSubTypes.Type(
            value = PureJaxbJavaTimeModels.PureJaxbJavaTimeNoZoneAccessTypeProperty.class,
            name = "PureJaxbJavaTimeModels" + "$" + "PureJaxbJavaTimeNoZoneAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = PureJaxbJavaTimeModels.PureJaxbJavaTimeNoZoneAccessTypePublicMember.class,
            name = "PureJaxbJavaTimeModels" + "$" + "PureJaxbJavaTimeNoZoneAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = PureJaxbJavaTimeModels.PureJaxbJavaTimeZonedAccessTypeField.class,
            name = "PureJaxbJavaTimeModels" + "$" + "PureJaxbJavaTimeZonedAccessTypeField"),
    @JsonSubTypes.Type(
            value = PureJaxbJavaTimeModels.PureJaxbJavaTimeZonedAccessTypeNone.class,
            name = "PureJaxbJavaTimeModels" + "$" + "PureJaxbJavaTimeZonedAccessTypeNone"),
    @JsonSubTypes.Type(
            value = PureJaxbJavaTimeModels.PureJaxbJavaTimeZonedAccessTypeProperty.class,
            name = "PureJaxbJavaTimeModels" + "$" + "PureJaxbJavaTimeZonedAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = PureJaxbJavaTimeModels.PureJaxbJavaTimeZonedAccessTypePublicMember.class,
            name = "PureJaxbJavaTimeModels" + "$" + "PureJaxbJavaTimeZonedAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = PureJaxbJodaTimeModels.PureJaxbJodaTimeNoZoneAccessTypeField.class,
            name = "PureJaxbJodaTimeModels" + "$" + "PureJaxbJodaTimeNoZoneAccessTypeField"),
    @JsonSubTypes.Type(
            value = PureJaxbJodaTimeModels.PureJaxbJodaTimeNoZoneAccessTypeNone.class,
            name = "PureJaxbJodaTimeModels" + "$" + "PureJaxbJodaTimeNoZoneAccessTypeNone"),
    @JsonSubTypes.Type(
            value = PureJaxbJodaTimeModels.PureJaxbJodaTimeNoZoneAccessTypeProperty.class,
            name = "PureJaxbJodaTimeModels" + "$" + "PureJaxbJodaTimeNoZoneAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = PureJaxbJodaTimeModels.PureJaxbJodaTimeNoZoneAccessTypePublicMember.class,
            name = "PureJaxbJodaTimeModels" + "$" + "PureJaxbJodaTimeNoZoneAccessTypePublicMember"),
    @JsonSubTypes.Type(
            value = PureJaxbJodaTimeModels.PureJaxbJodaTimeZonedAccessTypeField.class,
            name = "PureJaxbJodaTimeModels" + "$" + "PureJaxbJodaTimeZonedAccessTypeField"),
    @JsonSubTypes.Type(
            value = PureJaxbJodaTimeModels.PureJaxbJodaTimeZonedAccessTypeNone.class,
            name = "PureJaxbJodaTimeModels" + "$" + "PureJaxbJodaTimeZonedAccessTypeNone"),
    @JsonSubTypes.Type(
            value = PureJaxbJodaTimeModels.PureJaxbJodaTimeZonedAccessTypeProperty.class,
            name = "PureJaxbJodaTimeModels" + "$" + "PureJaxbJodaTimeZonedAccessTypeProperty"),
    @JsonSubTypes.Type(
            value = PureJaxbJodaTimeModels.PureJaxbJodaTimeZonedAccessTypePublicMember.class,
            name = "PureJaxbJodaTimeModels" + "$" + "PureJaxbJodaTimeZonedAccessTypePublicMember"),
})
public interface BaseModel<T> {
    long getId();

    BaseModel<T> setId(long id);

    String getName();

    BaseModel<T> setName(String name);

    String getAuthor();

    BaseModel<T> setAuthor(String author);

    T getDate();

    BaseModel<T> setDate(T date);

    List<String> getTag();

    BaseModel<T> setTag(List<String> tags);

    boolean equals(Object o);

    int hashCode();

    String toString();
}

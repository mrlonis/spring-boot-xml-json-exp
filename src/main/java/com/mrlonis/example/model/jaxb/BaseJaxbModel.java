package com.mrlonis.example.model.jaxb;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mrlonis.example.model.BaseModel;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class BaseJaxbModel<T> implements BaseModel<T> {
    @XmlAttribute
    private long id;

    @XmlElement(name = "title")
    @JsonProperty("title")
    private String name;

    @XmlTransient
    private String author;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private List<String> tags;
}

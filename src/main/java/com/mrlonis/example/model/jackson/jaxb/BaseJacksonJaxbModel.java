package com.mrlonis.example.model.jackson.jaxb;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.mrlonis.example.adapter.JaxbTimeAdapter;
import com.mrlonis.example.model.BaseModel;
import java.util.List;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class BaseJacksonJaxbModel<T> implements BaseModel<T> {
    @JacksonXmlProperty(isAttribute = true)
    @Getter(onMethod_ = {@JsonGetter})
    private long id;

    @JacksonXmlProperty(localName = "title")
    @Getter(onMethod_ = {@JsonGetter("title")})
    private String name;

    @XmlTransient
    private String author;

    @JacksonXmlProperty
    @XmlJavaTypeAdapter(JaxbTimeAdapter.class)
    @Getter(onMethod_ = {@JsonGetter})
    private T date;

    @JacksonXmlElementWrapper(localName = "tags")
    @JacksonXmlProperty(localName = "tag")
    @Getter(onMethod_ = {@JsonGetter("tag")})
    private List<String> tags;
}

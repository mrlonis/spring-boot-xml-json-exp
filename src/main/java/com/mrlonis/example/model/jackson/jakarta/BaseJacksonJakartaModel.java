package com.mrlonis.example.model.jackson.jakarta;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.mrlonis.example.adapter.JakartaTimeAdapter;
import com.mrlonis.example.model.BaseModel;
import jakarta.xml.bind.annotation.XmlTransient;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class BaseJacksonJakartaModel<T> implements BaseModel<T> {
    @JacksonXmlProperty(isAttribute = true)
    @Getter(onMethod_ = {@JsonGetter})
    private long id;

    @JacksonXmlProperty(localName = "title")
    @Getter(onMethod_ = {@JsonGetter("title")})
    private String name;

    @XmlTransient
    private String author;

    @JacksonXmlProperty
    @XmlJavaTypeAdapter(JakartaTimeAdapter.class)
    @Getter(onMethod_ = {@JsonGetter})
    private T date;

    @JacksonXmlElementWrapper(localName = "tags")
    @JacksonXmlProperty(localName = "tag")
    @Getter(onMethod_ = {@JsonGetter("tag")})
    private List<String> tags;
}

package com.mrlonis.example.model.jackson.jackson;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.mrlonis.example.adapter.JacksonDeserializer;
import com.mrlonis.example.adapter.JacksonSerializer;
import com.mrlonis.example.model.BaseModel;
import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class BaseJacksonModel<T> implements BaseModel<T> {
    @JacksonXmlProperty(isAttribute = true)
    @Getter(onMethod_ = {@JsonGetter})
    private long id;

    @JacksonXmlProperty(localName = "title")
    @Getter(onMethod_ = {@JsonGetter("title")})
    private String name;

    @JsonIgnore
    private String author;

    @JacksonXmlProperty
    @JsonSerialize(using = JacksonSerializer.class)
    @JsonDeserialize(using = JacksonDeserializer.class)
    @Getter(onMethod_ = {@JsonGetter})
    private T date;

    @JacksonXmlElementWrapper(localName = "tags")
    @JacksonXmlProperty(localName = "tag")
    @Getter(onMethod_ = {@JsonGetter("tag")})
    private List<String> tags;
}

package com.mrlonis.xml.all.model.jackson.jackson;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.mrlonis.xml.all.model.BaseModel;
import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public abstract class BaseJacksonModel<T> implements BaseModel<T> {
    @JacksonXmlProperty(isAttribute = true)
    @Getter(onMethod_ = {@JsonGetter})
    private long id;

    @JacksonXmlProperty(localName = "title")
    @JsonProperty("title")
    private String name;

    @JsonIgnore
    private String author;

    @JacksonXmlElementWrapper(localName = "tags")
    @JacksonXmlProperty(localName = "tag")
    @Getter(onMethod_ = {@JsonGetter("tag")})
    @Setter(onMethod_ = {@JsonSetter("tag")})
    private List<String> tag;
}

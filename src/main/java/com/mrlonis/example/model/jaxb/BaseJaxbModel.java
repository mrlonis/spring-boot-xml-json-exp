package com.mrlonis.example.model.jaxb;

import com.mrlonis.example.adapter.JaxbTimeAdapter;
import com.mrlonis.example.model.BaseModel;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public abstract class BaseJaxbModel<T> implements BaseModel<T> {
    @XmlAttribute
    private long id;

    @XmlElement(name = "title")
    @Getter(onMethod_ = {@XmlElement(name = "title")})
    private String name;

    @XmlTransient
    private String author;

    @XmlElement
    @XmlJavaTypeAdapter(JaxbTimeAdapter.class)
    private T date;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private List<String> tags;
}

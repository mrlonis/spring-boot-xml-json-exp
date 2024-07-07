package com.mrlonis.example.adapter;

import com.mrlonis.example.util.TimeAdapterUtil;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import lombok.Getter;

@Getter
public class JaxbTimeAdapter<T> extends XmlAdapter<String, T> {
    private final Class<T> type;

    public JaxbTimeAdapter(Class<T> type) {
        this.type = type;
    }

    @Override
    public T unmarshal(String v) {
        return TimeAdapterUtil.unmarshal(v, this.getType());
    }

    @Override
    public String marshal(T v) {
        return TimeAdapterUtil.marshal(v);
    }
}

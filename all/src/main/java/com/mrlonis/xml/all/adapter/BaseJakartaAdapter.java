package com.mrlonis.xml.all.adapter;

import com.mrlonis.xml.all.util.TimeAdapterUtil;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j
public abstract class BaseJakartaAdapter<T> extends XmlAdapter<String, T> {
    private final Class<T> type;

    protected BaseJakartaAdapter(Class<T> type) {
        this.type = type;
    }

    @Override
    public T unmarshal(String v) {
        log.info("JaxbTimeAdapter: unmarshal(): v: {}, this.getType(): {}", v, this.getType());
        return TimeAdapterUtil.unmarshal(v, this.getType());
    }

    @Override
    public String marshal(T v) {
        log.info(
                "JaxbTimeAdapter: marshal(): v: {}, this.getType(): {}, v.getClass(): {}",
                v,
                this.getType(),
                v.getClass());
        return TimeAdapterUtil.marshal(v);
    }
}

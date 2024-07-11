package com.mrlonis.xml.shared.adapter;

import com.mrlonis.xml.shared.time.TimeAdapterUtil;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j
public abstract class BaseJaxbAdapter<T> extends XmlAdapter<String, T> {
    private final Class<T> type;

    protected BaseJaxbAdapter(Class<T> type) {
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

package com.mrlonis.example.adapter;

import com.mrlonis.example.util.TimeAdapterUtil;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Getter
@Slf4j
@NoArgsConstructor
public class JakartaTimeAdapter<T> extends XmlAdapter<String, T> {
    private Class<T> type;

    public JakartaTimeAdapter(Class<T> type) {
        this.type = type;
    }

    @Override
    public T unmarshal(String v) {
        log.info("JakartaTimeAdapter: unmarshal(): v: {}, this.getType(): {}", v, this.getType());
        return TimeAdapterUtil.unmarshal(v, this.getType());
    }

    @Override
    public String marshal(T v) {
        log.info(
                "JakartaTimeAdapter: marshal(): v: {}, this.getType(): {}, v.getClass(): {}",
                v,
                this.getType(),
                v.getClass());
        return TimeAdapterUtil.marshal(v);
    }
}

package com.mrlonis.example.adapter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.mrlonis.example.util.TimeAdapterUtil;
import java.io.IOException;
import lombok.Getter;

@Getter
public class JacksonDeserializer<T> extends JsonDeserializer<T> {
    private final Class<T> type;

    public JacksonDeserializer(Class<T> type) {
        this.type = type;
    }

    @Override
    public T deserialize(JsonParser jsonparser, DeserializationContext context) throws IOException {
        return TimeAdapterUtil.deserialize(jsonparser, context, this.getType());
    }
}

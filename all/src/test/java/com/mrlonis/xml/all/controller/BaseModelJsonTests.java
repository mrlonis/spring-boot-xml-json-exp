package com.mrlonis.xml.all.controller;

import static com.mrlonis.xml.shared.TestUtils.generateTestArguments;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.mrlonis.xml.shared.BaseJsonTest;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class BaseModelJsonTests extends BaseJsonTest {
    BaseModelJsonTests(@Autowired MockMvc mockMvc) {
        super(mockMvc);
    }

    public Stream<Arguments> testArguments() {
        return generateTestArguments(true, true, true, true, true, true);
    }

    public MediaType getMediaType() {
        return MediaType.APPLICATION_JSON;
    }

    @Test
    void contextLoads() {
        assertTrue(true);
    }
}

package com.mrlonis.xml.jackson.jackson.controller;

import static com.mrlonis.xml.shared.TestUtils.generateTestArguments;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.mrlonis.xml.shared.BaseXmlControllerTests;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class XmlControllerTests extends BaseXmlControllerTests {
    XmlControllerTests(@Autowired MockMvc mockMvc) {
        super(mockMvc);
    }

    public Stream<Arguments> testArguments() {
        return generateTestArguments(false, false, false, false, false, true);
    }

    @Test
    void contextLoads() {
        assertTrue(true);
    }
}

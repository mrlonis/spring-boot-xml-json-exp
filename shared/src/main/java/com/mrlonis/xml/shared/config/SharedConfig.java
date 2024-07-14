package com.mrlonis.xml.shared.config;

import com.mrlonis.xml.shared.controller.XmlController;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class SharedConfig {
    @Bean
    public XmlController xmlController() {
        return new XmlController();
    }
}

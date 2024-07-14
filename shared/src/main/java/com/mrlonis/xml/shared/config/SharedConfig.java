package com.mrlonis.xml.shared.config;

import com.mrlonis.xml.shared.controller.XmlController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
@Slf4j
public class SharedConfig {
    @Bean
    public XmlController xmlController() {
        log.info("SharedConfig: Creating XmlController bean");
        return new XmlController();
    }
}

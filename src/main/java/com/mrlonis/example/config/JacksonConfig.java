package com.mrlonis.example.config;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.module.jakarta.xmlbind.JakartaXmlBindAnnotationModule;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {
    /**
     * Register the JaxbAnnotationModule for Spring Boot. This module is used to add support for JAXB (javax.xml.*)
     * annotations.
     *
     * @return {@link JaxbAnnotationModule}
     */
    @Bean
    public Module jaxbAnnotationModule() {
        return new JaxbAnnotationModule();
    }

    /**
     * Register the JakartaXmlBindAnnotationModule for Spring Boot. This module is used to add support for Jakarta XML
     * Bind (jakarta.xml.bind.*) annotations.
     *
     * @return {@link JakartaXmlBindAnnotationModule}
     */
    @Bean
    public Module jakartaXmlBindAnnotationModule() {
        return new JakartaXmlBindAnnotationModule();
    }
}

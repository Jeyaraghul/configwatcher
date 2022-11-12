package com.rhlabs.configwatcher.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties( prefix = "app.data")
@Getter
@Setter
public class PropertiesConfig {
    private String test;
    private String name ;
}

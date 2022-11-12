package com.rhlabs.configwatcher.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertTest {
    
    @Value("${app.data.name}")
    private String appDataName;
    
    @GetMapping("/data")
    public String getApplicationDataName(){
        return " The Application Data name is " + appDataName;
    }
}

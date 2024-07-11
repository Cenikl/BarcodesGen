package com.cenikl.BarcodesGen.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @Value("${MY-SUPER-VARIABLE}")
    private String secret;

    @GetMapping("/health")
    public String message(){
        return "Hello world, "+ secret;
    }
}

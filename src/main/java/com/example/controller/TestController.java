package com.example.controller;

import com.example.config.StudentConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/test2")
    public StudentConfig studentConfig() {
        return new StudentConfig();
    }
}

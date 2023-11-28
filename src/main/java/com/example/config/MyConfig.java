package com.example.config;

import com.example.bean.A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public A aaa() {
        return new A();
    }
}

package com.example.controller;

import com.example.config.StudentConfig;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {

	@Resource
	private StudentConfig studentConfig;

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

	@GetMapping("/test2")
	public StudentConfig studentConfig() {
		return this.studentConfig;
	}
}

package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "student") //在配置文件中的前置头
@Component
public class StudentConfig {

	// 如何在创建这个对象的时候自动读取 application.yml 中的配置项作为字段的默认值？
	@Value("${student.name}")
	private String name;

	@Value("${student.age}")
	private int age;

	@Value("${student.sex}")
	private String sex;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "StudentConfig{" + "name='" + name + '\'' + ", age=" + age + ", sex='" + sex + '\'' + '}';
	}
}

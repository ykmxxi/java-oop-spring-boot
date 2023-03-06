package com.example.springbootpractice;

import lombok.RequiredArgsConstructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import javax.annotation.PostConstruct;

import com.example.springbootpractice.properties.MyProperties;
import com.example.springbootpractice.service.StudentService;

@RequiredArgsConstructor
@ConfigurationPropertiesScan
@SpringBootApplication
public class SpringBootPracticeApplication {

	private final MyProperties myProperties;
	private final StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPracticeApplication.class, args);
	}

	@PostConstruct
	public void init() {
		System.out.println("내 키는: " + myProperties.getHeight());
	}

}

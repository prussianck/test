package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDemoApplication {

	@RequestMapping("/")
	String home()
	{
		return "Hello Ck, It's Spring Boot Test  4444";
	}
	@RequestMapping("/another")
	String another()
	{
		return "Another Page Mapping 4444";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}


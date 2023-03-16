package com.example.log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootLoggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLoggingApplication.class, args);
	}

	@RequestMapping("log")
	public String hello()
	{
		return "hello";
	}
}

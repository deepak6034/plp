package com.capgemini.capstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.capgemini.capstore")
public class CapFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapFrontendApplication.class, args);
	}
}

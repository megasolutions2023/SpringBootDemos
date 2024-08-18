package com.megas.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.megas.security")
public class SpringSecurityWithJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityWithJpaDemoApplication.class, args);
	}

}
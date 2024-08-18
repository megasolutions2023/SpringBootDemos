package com.megas.security.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.megas.security.service.MyUserDetailsService;

import jakarta.annotation.PostConstruct;

@Component
public class DemoDataInitializer {

	@Autowired
	private MyUserDetailsService userService;

	@PostConstruct
	public void init() {
		// Add sample users
		userService.saveUser("admin", "admin@123", "ADMIN");
		userService.saveUser("user", "user@123", "USER");
		// Add more users as needed
	}
}
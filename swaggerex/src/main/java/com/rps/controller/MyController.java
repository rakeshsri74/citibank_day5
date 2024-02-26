package com.rps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rps.model.User;

@RestController
public class MyController {
	
	@GetMapping("/")
	public String entryPoint() {
		return "This is entry point";
	}
	
	@GetMapping("/api1")
	public String api1() {
		return "This is api1";
	}
	
	@GetMapping("/api2")
	public String api2() {
		return "This is api2";
	}
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return user;
	}

}

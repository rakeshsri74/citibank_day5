package com.rps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rps.config.CustomMetrics;

@RestController
public class MyController {

	private final CustomMetrics customMetrics;
	
	@Autowired
	public MyController(CustomMetrics customMetrics) {
		this.customMetrics = customMetrics;
	}
	
	@GetMapping("/example")
	public String exampleEndPoint() {
		//Do something
		customMetrics.incrementCustomCounter();
		return "Example response";
	}
}

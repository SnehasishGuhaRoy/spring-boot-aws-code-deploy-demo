package com.example.awscodedeploydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCntlr {
	
	@GetMapping("/api/hello")
	public String sayHello() {
		
		return "Hello to the AWS World";
		
	}
}

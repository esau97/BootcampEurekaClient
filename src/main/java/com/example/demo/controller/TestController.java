package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	
	@GetMapping(path="/test")
	public String myValue() {
		return "Hola mundo";
	}
	
}

package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String index() {
		return "Hello World!";
	}

    @GetMapping("/name")
	public String getName() {
		return "Nausheen here!!";
	}

}
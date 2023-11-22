package com.devapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/devapp")
public class DevappController {
	@GetMapping(value="/app")
	public String getDevapp() {
		return "Hello";
		
	}

}

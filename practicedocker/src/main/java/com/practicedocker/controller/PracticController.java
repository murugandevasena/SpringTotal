package com.practicedocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticController {
	
	@GetMapping("/gtePractice")
	public String getPractice() {
		return "this is docker practice";
		
	}

}

package com.practicedockera.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracController {
	
	@GetMapping("/get")
	public String getDetails() {
		return "This is again practice";
	}

}

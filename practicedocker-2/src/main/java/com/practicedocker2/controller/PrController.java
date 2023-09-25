package com.practicedocker2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrController {

	@GetMapping
	public String getTry() {
		return "This is another try.";
	}
}

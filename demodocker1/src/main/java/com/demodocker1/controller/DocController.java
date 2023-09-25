package com.demodocker1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doc")
public class DocController {
	@GetMapping("/get")
	public String get() {
		return "Hello World";
	}

}

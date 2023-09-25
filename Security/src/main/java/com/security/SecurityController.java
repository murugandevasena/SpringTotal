package com.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/student")
	public String getStudent() {
		return "This is My student.";
	}
	
	@GetMapping("/trainer")
	public String getTrainer() {
		return "This is My trainer.";
	}
	
	@GetMapping("/manager")
	public String getManager() {
		return "This is My manager.";
	}	
}

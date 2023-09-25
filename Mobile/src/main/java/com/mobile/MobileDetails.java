package com.mobile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MobileDetails {
	
	@Autowired
	RestTemplate rt;
	
	@GetMapping("/mobile")
	public String getMobile() {
		//String url = "http://localhost:8080/pr/get";
		String url ="http://ProductDetailsAPI/pr/get";
		String response = rt.getForObject(url, String.class);
		return response.toLowerCase();		
	}
}

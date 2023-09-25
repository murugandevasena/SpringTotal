package com.productdetails;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pr")
public class ProductDetails {
	
	@GetMapping("/get")
	public String getDetail() {
		return "Mobile details are displayed.";
	}

}

package com.flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.entity.Flipkart;
import com.flipkart.service.OrderService;

@RestController
@RequestMapping("/flip")
public class OrderController {
	@Autowired
	OrderService orderService;
	@PostMapping("/setOne")
	public String setOne(@RequestBody Flipkart flipkart) {
		return orderService.setOne(flipkart);
	}
	
	@GetMapping("/getById/{id}")
	public Flipkart getById(@PathVariable("id") int id) {
		return orderService.getById(id);
	}
	
	@GetMapping("/getCityAndName")
	public List<Object> getCityAndName() {
		return orderService.getCityAndName();
	}
	
	

}

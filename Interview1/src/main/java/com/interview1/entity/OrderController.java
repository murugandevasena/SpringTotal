package com.interview1.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	
	OrderService orderService;
	
	@PostMapping("/one")
	public String setOne(@RequestBody OrderEntity ore) {
		return orderService.setOne(ore);
	}
	
	@GetMapping("/getOne")
	public List getOne() {
		return orderService.getOne();
	}
	
	
	

}

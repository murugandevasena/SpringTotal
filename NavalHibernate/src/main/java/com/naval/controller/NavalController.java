package com.naval.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naval.entity.Naval;
import com.naval.service.NavalService;

@RestController
@RequestMapping(value="/naval")
public class NavalController {

	@Autowired
	NavalService navService;
	@PostMapping("/setOne")
	public String setOne(@RequestBody Naval naval) {
		
		return null;
		
		
	}
	
}

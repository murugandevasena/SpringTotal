package com.todayproduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todayproduct.entity.TodayProductEntity;
import com.todayproduct.exception.ProductNotFoundException;
import com.todayproduct.service.TodayProductService;

@RestController
@RequestMapping(value="tpro")
public class TodayProductController {
	@Autowired
	TodayProductService todayProductService;
	
	
	@PostMapping(value ="/setOne")
	public String setOne(@RequestBody TodayProductEntity todayProductEntity) {
		return todayProductService.setOne(todayProductEntity);	
	}
	
	@PostMapping(value ="/setMany")
	public String setMany(@RequestBody List<TodayProductEntity> todayProductEntity) {
		return todayProductService.setMany(todayProductEntity);	
	}
	
	@GetMapping("getByName/{name}")
	public List<TodayProductEntity> getByName(@PathVariable("name") String name) throws ProductNotFoundException {
		return todayProductService.getByName(name);
	}
	
	@GetMapping("getById/{id}")
	public TodayProductEntity getById(@PathVariable("id") int id)  {
		return todayProductService.getById(id);
	}

}

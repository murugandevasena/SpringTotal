package com.products.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.entity.Products;
import com.products.exception.ProductNotFoundException;
import com.products.service.ProductsService;

@RestController
@RequestMapping("/prod")
public class ProductsController {

	@Autowired
	ProductsService productsService;

	@PostMapping("/setOne")
	public String setOne(@RequestBody Products products) {

		return productsService.setOne(products);
	}
	@PostMapping("/setMany")
	public String setMany(@RequestBody List<Products> products) {

		return productsService.setMany(products);
	}
	
	@GetMapping("/getById/{id}")
	public Products getById(@PathVariable int id) throws ProductNotFoundException {

		return productsService.getById(id);
	}
	
	@GetMapping("/getAll")
	public List<Products> getAll() {

		return productsService.getAll();
	}
	
	/*Rest template example 
	 * 
	 * */
	 
	@GetMapping("/getString")
	public String getString() {
		return "Hellow world";
	}
}

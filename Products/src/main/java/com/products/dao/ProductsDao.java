package com.products.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.products.entity.Products;
import com.products.repository.ProductsRepository;

@RestController
public class ProductsDao {

	@Autowired
	ProductsRepository productsRepository;

	public String setOne(Products products) {
		// TODO Auto-generated method stub
		productsRepository.save(products);
		return "Product saved Successfully";
	}

	public String setMany(List<Products> products) {
		// TODO Auto-generated method stub
		productsRepository.saveAll(products);
		return "Products saved Successfully";
	}

	public Optional<Products> getById(int id) {
		// TODO Auto-generated method stub
		return productsRepository.findById(id);
	}

	public List<Products> getAll() {
		// TODO Auto-generated method stub
		return productsRepository.findAll();
	}
	

}

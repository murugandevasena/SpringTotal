package com.products.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.dao.ProductsDao;
import com.products.entity.Products;

@Service
public class ProductsService {

	@Autowired
	ProductsDao productsDao;
	public String setOne(Products products) {
		// TODO Auto-generated method stub
		return productsDao.setOne(products);
	}
	public String setMany(List<Products> products) {
		// TODO Auto-generated method stub
		return productsDao.setMany(products);
	}
	public Products getById(int id) {
		// TODO Auto-generated method stub
		return productsDao.getById(id).get();
	}
	public List<Products> getAll() {
		// TODO Auto-generated method stub
		return productsDao.getAll();
	}

}

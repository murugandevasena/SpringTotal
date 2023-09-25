package com.flipkart.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flipkart.entity.Flipkart;
import com.flipkart.repository.OrderRepository;
@Repository
public class OrderDao {

	@Autowired
	OrderRepository orderRepository;
	public String setOne(Flipkart flipkart) {
		// TODO Auto-generated method stub
		orderRepository.save(flipkart);
		return "one item stored saved successfully";
	}
	public Flipkart getById(int id) {
		// TODO Auto-generated method stub
		return orderRepository.findById(id).get();
	}
	public List<Object> getCityAndName() {
		// TODO Auto-generated method stub
		return orderRepository.getCityAndName();
	}
}

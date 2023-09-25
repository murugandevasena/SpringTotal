package com.flipkart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.dao.OrderDao;
import com.flipkart.entity.Flipkart;
@Service
public class OrderService {

	@Autowired
	OrderDao orderDao;
	
	public String setOne(Flipkart flipkart) {
		// TODO Auto-generated method stub
		return orderDao.setOne(flipkart);
	}

	public Flipkart getById(int id) {
		// TODO Auto-generated method stub
		return orderDao.getById(id);
	}

	public List<Object> getCityAndName() {
		// TODO Auto-generated method stub
		return orderDao.getCityAndName();
	}

}

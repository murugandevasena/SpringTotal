package com.interview1.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

	public String setOne(OrderEntity ore) {
		List<OrderEntity> ot = new ArrayList<>();
		ot.add(ore);
		return "saved successfully";
	}

	public List getOne() {
		List<OrderEntity> l1 = new ArrayList();
		l1 = getAll();
		return  l1;
	}

	private List<OrderEntity> getAll() {
		// TODO Auto-generated method stub
		return l1;  //(imagination);
	}

}

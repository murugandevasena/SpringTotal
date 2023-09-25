package com.todayproduct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todayproduct.dao.TodayProductDao;
import com.todayproduct.entity.TodayProductEntity;
import com.todayproduct.exception.ProductNotFoundException;

@Service
public class TodayProductService  {
	
	@Autowired
	TodayProductDao todayProductDao;

	public String setOne(TodayProductEntity todayProductEntity) {
		// TODO Auto-generated method stub
		return todayProductDao.setOne(todayProductEntity);
	}

	public String setMany(List<TodayProductEntity> todayProductEntity) {
		// TODO Auto-generated method stub
		return todayProductDao.setMany(todayProductEntity);
	}

	public List<TodayProductEntity> getByName(String name)  throws ProductNotFoundException {
		// TODO Auto-generated method stub
		List<TodayProductEntity> l1 = todayProductDao.getByName(name);
		if(l1.isEmpty()) {
			throw new ProductNotFoundException("Product Not found");
		}
		else {
			return todayProductDao.getByName(name); 
		}
	
		
	}

	public TodayProductEntity getById(int id) {
		// TODO Auto-generated method stub
		return todayProductDao.getById(id);
	}


	

}

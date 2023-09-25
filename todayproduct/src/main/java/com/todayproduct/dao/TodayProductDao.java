package com.todayproduct.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.todayproduct.entity.TodayProductEntity;
import com.todayproduct.repository.TodayProductRepository;

@Repository
public class TodayProductDao {
	
	@Autowired
	TodayProductRepository todayProductRepository;

	public String setOne(TodayProductEntity todayProductEntity) {
		// TODO Auto-generated method stub
		todayProductRepository.save(todayProductEntity);
		return "saved successfully";
	}

	public String setMany(List<TodayProductEntity> todayProductEntity) {
		// TODO Auto-generated method stub
		todayProductRepository.saveAll(todayProductEntity);
		return "All products saved successfully.";
	}

	public List<TodayProductEntity> getByName(String name) {
		// TODO Auto-generated method stub
		return todayProductRepository.getByName(name);
	}

	public TodayProductEntity getById(int id) {
		// TODO Auto-generated method stub
		 return todayProductRepository.findById(id).get();
	}



}

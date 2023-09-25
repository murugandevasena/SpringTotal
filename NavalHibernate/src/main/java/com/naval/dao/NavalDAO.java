package com.naval.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.naval.entity.Naval;

import jakarta.persistence.EntityManager;


@Repository
public class NavalDAO {

	@Autowired
	private EntityManager entityManager;
	
	List<Naval> get() {
		return null;
	}
	
	Naval get(int id) {
		return null;
	}
	
	void save(Naval naval) {
	}
	
	void delete(int id) {
	}
}

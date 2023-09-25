package com.naval.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naval.dao.NavalDAO;
import com.naval.entity.Naval;

@Service
public class NavalService {

	
	@Autowired
	NavalDAO navalDAO;
	
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

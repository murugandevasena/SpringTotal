package com.employeetvs.dao;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employeetvs.entity.Employee;
import com.employeetvs.repo.EmployeeRepository;

@Repository
public class EmployeeDAO {

	@Autowired
	EmployeeRepository empre;
	public String setOne(Employee emp) {
		// TODO Auto-generated method stub
		empre.save(emp);
		return "One details saved successfully";
	}
	public Employee getOne(int id) {
		// TODO Auto-generated method stub
		return empre.findById(id).get();
	}
	public List<Employee> getByAge(int age1, int age2) {
		// TODO Auto-generated method stub
		return empre.getByAge(age1,age2);
	}
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return empre.findAll();
	}

}

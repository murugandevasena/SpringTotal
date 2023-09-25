package com.employeetvs.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeetvs.dao.EmployeeDAO;
import com.employeetvs.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO emdao;
	public String setOne(Employee emp) {
		// TODO Auto-generated method stub
		return emdao.setOne(emp);
	}
	public Employee getOne(int id) throws IdNotFoundException {
		List<Employee> ls= getAll();
		for(Employee e:ls) {
			if(e.getId()!=id) {
				throw new IdNotFoundException("The Given id is not available in our record.");
			}
			else {
				return emdao.getOne(id);
			}
		}
		return emdao.getOne(id);
		
	}
	public List<Employee> getByAge(int age1, int age2) {
		// TODO Auto-generated method stub
		return emdao.getByAge(age1,age2);
	}
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return emdao.getAll();
	}

}

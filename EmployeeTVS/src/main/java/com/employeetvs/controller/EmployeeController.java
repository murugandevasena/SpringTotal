package com.employeetvs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeetvs.entity.Employee;
import com.employeetvs.service.EmployeeService;
import com.employeetvs.service.IdNotFoundException;

@RestController
@RequestMapping("/tvs")
public class EmployeeController {
	
	@Autowired
	EmployeeService es ;
	
	@PostMapping("/setOne")
	public String setOne(@RequestBody Employee emp) {
		return es.setOne(emp);
	}
	
	@GetMapping("/getOne/{id}")
	public Employee getOne(@PathVariable int id) throws IdNotFoundException {
		return es.getOne(id);
	}
	
	@GetMapping("/getByAge/{age1}/{age2}")
	public List<Employee> getByAge(@PathVariable("age1") int age1,@PathVariable ("age2") int age2){
		return es.getByAge(age1,age2);
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAll(){
		return es.getAll();
	}
}

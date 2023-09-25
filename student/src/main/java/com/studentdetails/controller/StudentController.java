package com.studentdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.studentdetails.entity.Student;
import com.studentdetails.service.StudentService;
import com.studentdetails.userdefinedexception.AgeNotEligibleException;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/setOne")
	public String setOne(@RequestBody Student student) {
		return studentService.setOne(student);
	}
	
	@PostMapping("/setMany")
	public String setMany(@RequestBody List<Student> student) {
		return studentService.setMany(student);
	}
	
	@GetMapping("/getOne/{id}")
	public Student getOne(@PathVariable int id) {
		return studentService.getOne(id);
	}
	
	@GetMapping("/getMany")
	public List<Student> getMany() {
		return studentService.getMany();
	}
	
	@PutMapping("/setOneUpdate/{id}")
	public String setOneUpdate(@RequestBody Student student,@PathVariable int id) {
		return studentService.setOneUpdate(student,id);
	}
	
	@PostMapping("/setByAbove18")
	public String setByAbove18(@RequestBody List<Student> student) throws InvalidDataAccessApiUsageException {
		
		return studentService.setByAbove18(student);
	}
	@DeleteMapping("/deleteById/{id}")
	public String deleteById (@PathVariable int id) {
		return studentService.deleteById(id);
	}
	
	

}

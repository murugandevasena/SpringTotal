package com.studentmapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmapping.entity.Student;
import com.studentmapping.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentRepository studentRepository;
	
	@PostMapping("/setOne")
	public String setOne(@RequestBody Student student) {
		studentRepository.save(student);
		return "saved successfully";
		
	}
	
	@PostMapping("/setMany")
	public String setMany(@RequestBody List<Student> student) {
		for(int i=0;i<student.size();i++) {
			studentRepository.saveAll(student).get(i);	
		}
		return "List of details saved successfully";
		
	}
	
}

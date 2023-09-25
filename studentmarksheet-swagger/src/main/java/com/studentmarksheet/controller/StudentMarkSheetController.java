package com.studentmarksheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studentmarksheet.entity.StudentMarkSheet;
import com.studentmarksheet.service.StudentMarkSheetService;

@RestController
@RequestMapping("/mark")
public class StudentMarkSheetController {
	@Autowired
	StudentMarkSheetService studentMarkSheetService;
	
	@PostMapping("/setOne")
	public String setOne(@RequestBody StudentMarkSheet studentMarkSheet) {
		return studentMarkSheetService.setOne(studentMarkSheet);
	}
	
	@PostMapping("/setMany")
	public String setmany(@RequestBody List<StudentMarkSheet> studentMarkSheet) {
		return studentMarkSheetService.setMany(studentMarkSheet);
	}
	
	@GetMapping("/getOne/{id}")
	public StudentMarkSheet getOne(@PathVariable int id) {
		return studentMarkSheetService.getOne(id);
	}
	
	@GetMapping("/getAll")
	public List<StudentMarkSheet> getAll() {
		return studentMarkSheetService.getAll();
	}
	

}

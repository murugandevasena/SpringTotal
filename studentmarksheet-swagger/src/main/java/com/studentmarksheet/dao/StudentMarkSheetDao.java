package com.studentmarksheet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentmarksheet.entity.StudentMarkSheet;
import com.studentmarksheet.repository.StudentMarkSheetRepository;
@Repository
public class StudentMarkSheetDao {

	@Autowired
	StudentMarkSheetRepository studentMarkSheetRepository;
	public String setOne(StudentMarkSheet studentMarkSheet) {
		// TODO Auto-generated method stub
		studentMarkSheetRepository.save(studentMarkSheet);
		return "Student mark details saved successfully";
	}
	public String setMany(List<StudentMarkSheet> studentMarkSheet) {
		// TODO Auto-generated method stub
		studentMarkSheetRepository.saveAll(studentMarkSheet);
		return "List of students marks got saved.";
	}
	public StudentMarkSheet getOne(int id) {
		// TODO Auto-generated method stub
		return studentMarkSheetRepository.findById(id).get();
	}
	public List<StudentMarkSheet> getAll() {
		// TODO Auto-generated method stub
		return studentMarkSheetRepository.getAll();
	}

}

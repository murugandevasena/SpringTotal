package com.studentdetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentdetails.entity.Student;
import com.studentdetails.repository.StudentRepository;
@Repository
public class StudentDao {
@Autowired
StudentRepository studentRepository;
	public String setOne(Student student) {
		// TODO Auto-generated method stub
		studentRepository.save(student);
		return "Student details saved successfully";
	}
	public String setMany(List<Student> student) {
		// TODO Auto-generated method stub
		studentRepository.saveAll(student);
		return "Students details saved successfully.";
	}
	public Student getOne(int id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}
	public List<Student> getMany() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}
	public Student setOneUpdate() {
		// TODO Auto-generated method stub
		return studentRepository.save(null);
	}
	public String setOneUpdate(Student s2) {
		// TODO Auto-generated method stub
		studentRepository.save(s2);
		return "Updated successfully.";
	}
	public String deleteById(int id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return "deleted successfully.";
	}
	
	

}

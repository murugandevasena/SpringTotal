package com.studentdetails.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentdetails.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	

}

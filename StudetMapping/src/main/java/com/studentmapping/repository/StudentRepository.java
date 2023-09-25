package com.studentmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentmapping.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>   {

	
}

package com.studentmarksheet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.studentmarksheet.entity.StudentMarkSheet;

public interface StudentMarkSheetRepository extends JpaRepository<StudentMarkSheet, Integer> {

	@Query(value ="select * from mark_sheet",nativeQuery=true)
	List<StudentMarkSheet> getAll();

}

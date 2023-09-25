package com.todayproduct.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.todayproduct.entity.TodayProductEntity;

public interface TodayProductRepository extends JpaRepository<TodayProductEntity, Integer> {

	@Query(value ="select * from today_product where name =?",nativeQuery=true)
	List<TodayProductEntity> getByName(String name);

}

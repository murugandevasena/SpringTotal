package com.flipkart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.flipkart.entity.Flipkart;

public interface OrderRepository extends JpaRepository<Flipkart, Integer>{

	@Query(value ="select fkart_order.city,fkart_product.name from fkart_order inner join fkart_product on fkart_order.id=fkart_product.fkart_order",nativeQuery = true)
	List<Object> getCityAndName();
}

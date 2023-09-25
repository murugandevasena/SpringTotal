package com.flipkart.productentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fkart_product")
public class ProductEntity {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int produId;
	private String name;
	private int price; 

	public int getProduId() {
		return produId;
	}

	public void setProduId(int produId) {
		this.produId = produId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

package com.studentmapping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Address")
public class AddressEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String city;
	private int postalCode;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public AddressEntity(int id, String city, int postalCode) {
		super();
		this.id = id;
		this.city = city;
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "AddressEntity [id=" + id + ", city=" + city + ", postalCode=" + postalCode + "]";
	}
		
}

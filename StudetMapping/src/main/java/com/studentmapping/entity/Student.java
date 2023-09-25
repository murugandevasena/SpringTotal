package com.studentmapping.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	private String firstName;
	private String lastName;
	@OneToOne(targetEntity=AddressEntity.class,cascade = CascadeType.ALL)
	@JoinColumn(name="fk_add_id",referencedColumnName="id")
	
	private AddressEntity addressEntity;
	public Student(int id, String firstName, String lastName, AddressEntity addressEntity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressEntity = addressEntity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public AddressEntity getAddressEntity() {
		return addressEntity;
	}
	public void setAddressEntity(AddressEntity addressEntity) {
		this.addressEntity = addressEntity;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", addressEntity="
				+ addressEntity + "]";
	}	
}

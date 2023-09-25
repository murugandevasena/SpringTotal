package com.employeetvs.entity;

import java.util.ArrayList;
import java.util.List;

import com.employeetvs.accountenitity.AccountEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_details")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String age;

	@OneToMany(targetEntity = AccountEntity.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "acc_id", referencedColumnName = "id")

	private List<AccountEntity> ac;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public List<AccountEntity> getAc() {
		return ac;
	}

	public void setAc(List<AccountEntity> ac) {
		this.ac = ac;
	}

}

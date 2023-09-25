package com.employeescopeofbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@Component
public class Employee {
	private String name;
	
	public Employee() {
		System.out.println("Bean is created.");
	}
	
	@Value("Murugan")
	public void setName(String name) {
		 this.name= name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
}

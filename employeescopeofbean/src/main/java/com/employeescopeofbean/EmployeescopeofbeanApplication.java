package com.employeescopeofbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EmployeescopeofbeanApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeescopeofbeanApplication.class, args);
	}
	@Autowired
	ApplicationContext ac;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello Emp");
		
	
		Employee e1 = ac.getBean(Employee.class);
		System.out.println(e1);
		Employee e2 = ac.getBean(Employee.class);
		e2.setName("ram");
		System.out.println(e2);
		Employee e3 = ac.getBean(Employee.class);
		System.out.println(e3);
		
	}

}

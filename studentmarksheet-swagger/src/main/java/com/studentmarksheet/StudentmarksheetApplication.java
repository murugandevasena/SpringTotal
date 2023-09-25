package com.studentmarksheet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info=@Info(title="StudentMarkSheetAPI",version="1.0",description="It is used get student marksheet."))
public class StudentmarksheetApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmarksheetApplication.class, args);
	}

}

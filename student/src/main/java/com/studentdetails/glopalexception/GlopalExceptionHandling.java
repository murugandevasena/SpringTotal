package com.studentdetails.glopalexception;

import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.studentdetails.userdefinedexception.AgeNotEligibleException;

@RestControllerAdvice
public class GlopalExceptionHandling {
	@ExceptionHandler(AgeNotEligibleException.class)
	public String ageNotFoundException() {
		return "Age not eligible to enroll.";
	}
	
	@ExceptionHandler(InvalidDataAccessApiUsageException.class)
	public ResponseEntity<Object> invalidDataAccessApiUsageException() {
		return new ResponseEntity<Object>("Age is not aligible to enter.", HttpStatus.BAD_REQUEST);
	}

}

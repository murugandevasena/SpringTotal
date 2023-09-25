package com.employeetvs.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlopalException {
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object> idNotFoundException() {
		return new ResponseEntity<Object>("Record not availeable",HttpStatus.BAD_REQUEST);
	}

}

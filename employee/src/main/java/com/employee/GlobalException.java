package com.employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(PasswordException.class)
	public ResponseEntity<Object> passwordException(PasswordException p){
		return new ResponseEntity<Object>(p.getStackTrace(), HttpStatus.BAD_REQUEST);
	}

}

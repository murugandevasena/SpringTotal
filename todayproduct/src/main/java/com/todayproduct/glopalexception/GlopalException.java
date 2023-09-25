package com.todayproduct.glopalexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.todayproduct.exception.ProductNotFoundException;

@RestControllerAdvice
public class GlopalException {
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<Object> productNotFoundHandler(){
		
		return new ResponseEntity<Object>("Product not found.Kindly enter the right one", HttpStatus.BAD_REQUEST);
		
	}

}

package com.studentmarksheet.glopalexception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlopalException extends Exception {
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<Object> noSuchElementException(){
		return new ResponseEntity<Object>("No such id is there.Try with right one.", HttpStatus.BAD_REQUEST);
	}

}

package com.bookpractice;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	BookImpl bookImpl;

	@PostMapping("/")
	public void addBook(@RequestBody Book book) {
		bookImpl.addBook(book);
	}
	
	@GetMapping("/getBookById/{id}")
	public Book findBookById(@PathVariable int id) {
		return bookImpl.FindBookById(id);
	}
	
	@DeleteMapping("/delete")
	public String deleteById() {
		bookImpl.deleteById();
		return "deleted successfully";
	}
}

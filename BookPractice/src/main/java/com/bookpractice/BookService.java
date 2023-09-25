package com.bookpractice;

import org.springframework.stereotype.Service;


public interface BookService {
	void addBook(Book book);
	Book FindBookById(int id);
	String deleteById();
}

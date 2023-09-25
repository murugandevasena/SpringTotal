package com.bookpractice;

import java.util.HashSet;

import org.springframework.stereotype.Service;

@Service
public class BookImpl implements BookService {

	HashSet<Book> hs = new HashSet<Book>();
	@Override
	public void addBook(Book book) {
			hs.add(book);
	}

	@Override
	public Book FindBookById(int id) {
		Book book = hs.stream().filter(x->x.getId()==id).findFirst().get();
		return book;
	}

	@Override
	public String deleteById() {
		 hs.clear();
		 return "Cleared successfully";
	}

}

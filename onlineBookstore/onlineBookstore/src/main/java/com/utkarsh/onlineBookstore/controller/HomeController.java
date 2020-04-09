package com.utkarsh.onlineBookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utkarsh.onlineBookstore.model.Book;
import com.utkarsh.onlineBookstore.repository.BookRepository;

@RestController
public class HomeController {

	@Autowired
	private BookRepository bookRepository;
	
	
	public BookRepository getBookRepository() {
		return bookRepository;
	}


	public void setBookRepository(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}


	@GetMapping("/list")
	public List<Book> getAll(){
		return bookRepository.findAll();
	}
}

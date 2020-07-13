package com.library.SpringBootLibrary.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.library.SpringBootLibrary.model.Books;
import com.library.SpringBootLibrary.service.BookService;

@RestController
public class LibraryController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/books/{id}")
	public ResponseEntity<Books> get(@PathVariable Integer id) {
		try {
			Books book =  bookService.getBook(id);
			return new ResponseEntity<Books>(book, HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<Books>(HttpStatus.NOT_FOUND);
		}
		
	}
	
}

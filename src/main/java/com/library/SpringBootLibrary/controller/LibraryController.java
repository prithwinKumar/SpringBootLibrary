package com.library.SpringBootLibrary.controller;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.library.SpringBootLibrary.model.Author;
import com.library.SpringBootLibrary.service.AuthorService;

@RestController
public class LibraryController {

	@Autowired
	private AuthorService authorService;
	
	@GetMapping("/author/{id}")
	public ResponseEntity<Author> get(@PathVariable Integer id) {
		try {
			Author book =  authorService.getAuthor(id);
			return new ResponseEntity<Author>(book, HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<Author>(HttpStatus.NOT_FOUND);
		}
		
	}
	
}

package com.library.SpringBootLibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.SpringBootLibrary.model.Books;
import com.library.SpringBootLibrary.repository.BooksRepository;


@Service
public class BookService {

	@Autowired
	private BooksRepository bookRepo;
	
	public Books getBook(Integer id) {
		return bookRepo.findById(id).get();
	}
}

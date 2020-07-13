package com.library.SpringBootLibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.SpringBootLibrary.model.Author;
import com.library.SpringBootLibrary.repository.AuthorRepository;


@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepo;
	
	public Author getAuthor(Integer id) {
		return authorRepo.findById(id).get();
	}
}
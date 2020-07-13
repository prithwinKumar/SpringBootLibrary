package com.library.SpringBootLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.SpringBootLibrary.model.Books;

public interface BooksRepository extends JpaRepository<Books, Integer>{

}

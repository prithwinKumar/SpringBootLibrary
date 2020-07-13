package com.library.SpringBootLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.SpringBootLibrary.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer>{

}

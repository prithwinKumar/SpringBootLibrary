package com.library.SpringBootLibrary.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {
	
	private Integer Id;
	private String Name;
	private Integer Pages;
	private Integer AuthorId;
	
	public Books() {
        super();
    }
	
	@Id 
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		this.Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public Integer getPages() {
		return Pages;
	}
	public void setPages(Integer pages) {
		this.Pages = pages;
	}
	public Integer getAuthorId() {
		return AuthorId;
	}
	public void setAuthorId(Integer authorId) {
		this.AuthorId = authorId;
	}

	@Override
	public String toString() {
		return "Books [Id=" + Id + ", Name=" + Name + ", Pages=" + Pages + ", AuthorId=" + AuthorId + "]";
	}
	
	
}

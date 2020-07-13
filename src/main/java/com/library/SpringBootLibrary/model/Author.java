package com.library.SpringBootLibrary.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {
	
	private Integer Id;
	private String Name;
	private String State;
	private Integer Country;
	
	public Author() {
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

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public Integer getCountry() {
		return Country;
	}

	public void setCountry(Integer country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Author [Id=" + Id + ", Name=" + Name + ", State=" + State + ", Country=" + Country + "]";
	}
	
	
}
	
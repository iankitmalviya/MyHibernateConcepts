package com.facebook.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {
 
	@Id
	@GeneratedValue
	private long id;
	
	
	private String name;
	
	public Course(String name) {
		this.name=name;
	}
	protected Course() {
		
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "\n Course [id=" + id + ", name=" + name + "]";
	}
	
}

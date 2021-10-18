package com.facebook.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
 
	@Id
	@GeneratedValue
	private long id;
	private String name;
	
	@OneToOne
	 private Passport passport;
	
	public Student(String name) {
		this.name=name;
	}
	protected Student() {
		
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
		return "\n Student [id=" + id + ", name=" + name + "]";
	}
	
}

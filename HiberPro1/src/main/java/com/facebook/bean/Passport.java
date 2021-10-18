package com.facebook.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passport {
 
	@Id
	@GeneratedValue
	private long id;
	private String number;
	
	public Passport(String number) {
		this.number=number;
	}
	protected Passport() {
		
	}

	public long getId() {
		return id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "\n Passport [id=" + id + ", number=" + number + "]";
	}
	
}

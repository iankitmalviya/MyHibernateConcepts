package com.facebook.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
 
	@Id
	@GeneratedValue
	private long id;
	
	private String description;
	private String rating;
	
	public Review(String rating,String description) {
		this.description=description;
		this.rating=rating;
	}
	protected Review() {
		
	}

	public long getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "\n Review [id=" + id + ", Rating="+ rating+ ", description=" + description + "]";
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
}

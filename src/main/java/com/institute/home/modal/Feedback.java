package com.institute.home.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Feedback {
	@Id
	 @GeneratedValue(strategy = GenerationType .AUTO)
	private int id;
	private String college;
	private String fb;
	public String getFb() {
		return fb;
	}
	public void setFb(String fb) {
		this.fb = fb;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	
}
package com.institute.home.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Faculty {
	@Id
	 @GeneratedValue(strategy = GenerationType .AUTO)
private int id;
private String facultyname;
private String qualification;
private String skillset;
private String experience;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFacultyname() {
	return facultyname;
}
public void setFacultyname(String facultyname) {
	this.facultyname = facultyname;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getSkillset() {
	return skillset;
}
public void setSkillset(String skillset) {
	this.skillset = skillset;
}
public String getExperience() {
	return experience;
}
public void setExperience(String experience) {
	this.experience = experience;
}




}

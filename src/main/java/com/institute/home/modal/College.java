package com.institute.home.modal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	 @GeneratedValue(strategy = GenerationType .AUTO)
private int id;
private String CollegeName;
private String UserName;
private String Password;
private int Phone;
private String Address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCollegeName() {
	return CollegeName;
}
public void setCollegeName(String collegeName) {
	CollegeName = collegeName;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public int getPhone() {
	return Phone;
}
public void setPhone(int phone) {
	Phone = phone;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}



}

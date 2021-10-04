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
private String Collegename;
private String Username;
private String Password;
private long Phone;
private String Address;
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCollegename() {
	return Collegename;
}
public void setCollegename(String collegename) {
	Collegename = collegename;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public long getPhone() {
	return Phone;
}
public void setPhone(long phone) {
	Phone = phone;
}



}

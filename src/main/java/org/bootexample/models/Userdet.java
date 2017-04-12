package org.bootexample.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Userdet {
	
	
@Id @GeneratedValue
private int user_id;	
private String name;
private String email;
private String contact;
private String pass;


public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}

	
}

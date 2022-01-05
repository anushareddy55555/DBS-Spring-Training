package com.dbs.beans;

public class Person {
	String username;
	String email;
	String mobile;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String username, String email, String mobile) {
		super();
		this.username = username;
		this.email = email;
		this.mobile = mobile;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [username=" + username + ", email=" + email + ", mobile=" + mobile + "]";
	}
	
	}

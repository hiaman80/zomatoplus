package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;


public class Login implements Serializable {

	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Login(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
			
}

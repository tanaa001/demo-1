package com.example.form;

import java.io.Serializable;

public class LoginItemForm implements Serializable{
	private static final long serialVersionUID = 1L;
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
}

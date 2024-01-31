package com.kavin.scalerworkshop.ProductService.model;

public class UserModel {
	
private long id;
	
	private String name;
	
	private String mail;
	
	private String password;
	
	private boolean isAdmin;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserModel(long id, String name, String mail, String password, boolean isAdmin) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.password = password;
		this.isAdmin = isAdmin;
	}

}

package com.ss.dto;

public class User {
	private Integer id;
	private String userName;
	private Integer password;
	
	public User() {}
	
	public User(Integer id, String userName, Integer password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}

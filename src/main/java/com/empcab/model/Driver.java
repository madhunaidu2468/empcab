package com.empcab.model;

public class Driver {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private int id;

	private String name;

	private String userName;

	private String password;
	

	public Driver() {
		super();
	}

	public Driver(int id) {
		this.id = id;
	}

	public Driver(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}


	public long getId() {
		return id;
	}

	public void setId(int value) {
		this.id = value;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}


}

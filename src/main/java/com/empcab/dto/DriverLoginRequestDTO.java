package com.empcab.dto;

public class DriverLoginRequestDTO {


	//@ApiModelProperty(value = "username of user", notes = "username", required = true, dataType = "String")
	private String userName;

	//@ApiModelProperty(value = "password of the user", notes = "password", required = true)
	private String password;

	public DriverLoginRequestDTO() {
		super();
	}

	public DriverLoginRequestDTO(String userName, String password) {
		super();
		this.password = password;
		this.userName = userName;
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

	@Override
	public String toString() {
		return "UserLoginRequestDTO [userName=" + userName + ", password=" + password + "]";
	}


}

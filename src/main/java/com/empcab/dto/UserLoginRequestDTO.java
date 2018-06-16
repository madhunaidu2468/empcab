package com.empcab.dto;

//@ApiModel(value = "Login Credentials", description = "User Login Credentials", discriminator = "")
public class UserLoginRequestDTO {

	//@ApiModelProperty(value = "username of user", notes = "username", required = true, dataType = "String")
	private String userName;

	//@ApiModelProperty(value = "password of the user", notes = "password", required = true)
	private String password;

	public UserLoginRequestDTO() {
		super();
	}

	public UserLoginRequestDTO(String userName, String password) {
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

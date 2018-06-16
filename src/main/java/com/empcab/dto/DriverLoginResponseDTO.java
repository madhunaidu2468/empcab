package com.empcab.dto;

import com.empcab.dto.security.AuthTokenDTO;

import io.swagger.annotations.ApiModelProperty;

public class DriverLoginResponseDTO {



	@ApiModelProperty(value = "user id of user", notes = "userId", required = true, dataType = "String")
	private long id;

	@ApiModelProperty(value = "userName of the user", notes = "name", required = true)
	private String userName;

	private AuthTokenDTO tokens;

	public DriverLoginResponseDTO() {
		super();
	}

	public DriverLoginResponseDTO(long id, String userName, AuthTokenDTO tokens) {
		super();
		this.id = id;
		this.userName = userName;
		this.tokens = tokens;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public AuthTokenDTO getTokens() {
		return tokens;
	}

	public void setTokens(AuthTokenDTO tokens) {
		this.tokens = tokens;
	}

	
	@Override
	public String toString() {
		return "UserLoginResponseDTO [id=" + id + ", userName=" + userName + ", tokens=" + tokens + "]";
	}



}

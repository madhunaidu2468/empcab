package com.empcab.model;

import java.io.Serializable;
import java.time.LocalDateTime;


public class UserToken  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int id;

	
	private User userId;

	private String accessToken;

	private String refreshToken;

	private LocalDateTime validUpto;  //NOSONAR

	public UserToken() {
		super();
	}

	public UserToken(User userId, String accessToken, String refreshToken, LocalDateTime validUpto) {
		super();
		this.userId = userId;
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.validUpto = validUpto;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public LocalDateTime getValidUpto() {
		return validUpto;
	}

	public void setValidUpto(LocalDateTime validUpto) {
		this.validUpto = validUpto;
	}

	

}

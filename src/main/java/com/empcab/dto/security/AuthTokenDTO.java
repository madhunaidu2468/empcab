package com.empcab.dto.security;

import java.time.LocalDateTime;

import com.empcab.util.CustomLocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class AuthTokenDTO {

	private String accessToken;

	private String refreshToken;

	@JsonSerialize(using = CustomLocalDateTimeSerializer.class)
	private LocalDateTime validUpto;

	public AuthTokenDTO() {
		super();
	}

	public AuthTokenDTO(String accessToken, String refreshToken, LocalDateTime validUpto) {
		super();
		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.validUpto = validUpto;
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

	@Override
	public String toString() {
		return "AuthTokenDTO [accessToken=" + accessToken + ", refreshToken=" + refreshToken + ", validUpto="
				+ validUpto + "]";
	}

}

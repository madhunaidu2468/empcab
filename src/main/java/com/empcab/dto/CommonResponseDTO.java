package com.empcab.dto;

public class CommonResponseDTO {

	private int code;

	private String message;

	private String description;

	public CommonResponseDTO(int code, String message, String description) {
		super();
		this.code = code;
		this.message = message;
		this.description = description;
	}

	public CommonResponseDTO(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public CommonResponseDTO() {
		super();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "CommonResponseDTO [code=" + code + ", message=" + message + ", description=" + description + "]";
	}

}

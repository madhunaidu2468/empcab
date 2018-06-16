package com.empcab.exception;

import org.springframework.http.HttpStatus;

public class ApplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final HttpStatus httpStatus;
	private final int httpCode;

	
	public ApplicationException(int httpCode, String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus=httpStatus;
        this.httpCode=httpCode;
    }

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public int getHttpCode() {
		return httpCode;
	}

}

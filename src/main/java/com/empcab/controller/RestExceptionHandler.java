/**
 * 
 */
package com.empcab.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.empcab.constant.HttpConstants;
import com.empcab.dto.CommonResponseDTO;
import com.empcab.exception.ApplicationException;

/**
 * @author Madhu.R
 *
 */
@ControllerAdvice
public class RestExceptionHandler {

	/**
	 * @param e
	 * @return
	 */
	@ExceptionHandler(ApplicationException.class)
	public ResponseEntity<CommonResponseDTO> handleApplicationException(ApplicationException e) {
		return new ResponseEntity<>(new CommonResponseDTO(e.getHttpCode(), e.getMessage()), e.getHttpStatus());
	}

	/**
	 * @param e
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	public ResponseEntity<CommonResponseDTO> handleAllException(Exception e) {
		return new ResponseEntity<>(new CommonResponseDTO(HttpConstants.INTERNAL_SERVER_ERROR, e.toString()),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

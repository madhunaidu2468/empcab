/**
 * 
 */
package com.empcab.service;

import com.empcab.dto.DriverLoginRequestDTO;
import com.empcab.dto.DriverLoginResponseDTO;
import com.empcab.exception.ApplicationException;

/**
 * @author Madhu.R
 *
 */
public interface DriverService {

	/**
	 * @param loginRequest
	 * @return
	 * @throws ApplicationException
	 */
	DriverLoginResponseDTO login(DriverLoginRequestDTO loginRequest) throws ApplicationException;

	/**
	 * @param userId
	 */
	void logout(int userId) throws ApplicationException;

}

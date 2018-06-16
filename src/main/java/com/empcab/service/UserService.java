/**
 * 
 */
package com.empcab.service;

import com.empcab.dto.UserLoginRequestDTO;
import com.empcab.dto.UserLoginResponseDTO;
import com.empcab.exception.ApplicationException;

/**
 * @author Madhu.R
 *
 */
public interface UserService {

	/**
	 * @param loginRequest
	 * @return
	 * @throws ApplicationException
	 */
	UserLoginResponseDTO login(UserLoginRequestDTO loginRequest) throws ApplicationException;

	/**
	 * @param userId
	 */
	void logout(int userId) throws ApplicationException;

}

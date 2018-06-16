///**
// * 
// */
package com.empcab.dao;

import java.time.LocalDateTime;

import com.empcab.dto.UserLoginRequestDTO;
import com.empcab.exception.ApplicationException;
import com.empcab.model.User;
import com.empcab.model.UserToken;

/**
 * @author Madhu.R
 *
 */

public interface UserDao {

	/**
	 * @param username
	 * @param password
	 * @return
	 * @throws ApplicationException
	 */
	User login(UserLoginRequestDTO loginRequest) throws ApplicationException;
	
	
	/**
	 * @param user
	 * @param accessToken
	 * @param refreshToken
	 * @param validUpto
	 * @throws ApplicationException
	 */
	void saveToken(User user, String accessToken, String refreshToken, LocalDateTime validUpto)
			throws ApplicationException;

	/**
	 * @param userId
	 * @param authToken
	 * @return
	 */
	UserToken getUserToken(int userId, String authToken) throws ApplicationException;

	/**
	 * @param userId
	 * @return
	 * @throws ApplicationException
	 */
	User getUserDetails(int userId) throws ApplicationException;

	/**
	 * @param userId
	 */
	void logout(int userId) throws ApplicationException;

	

}

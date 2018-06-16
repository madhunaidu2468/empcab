///**
// * 
// */
package com.empcab.dao.impl;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.empcab.constant.ErrorMsgConstants;
import com.empcab.constant.HttpConstants;
import com.empcab.dao.UserDao;
import com.empcab.dto.UserLoginRequestDTO;
import com.empcab.exception.ApplicationException;
import com.empcab.model.User;
import com.empcab.model.UserToken;

/**
 * @author Madhu.R
 *
 */

@Repository
public class UserDaoImpl extends BaseDaoImpl implements UserDao {

	@Override
	public User login(UserLoginRequestDTO loginRequest) throws ApplicationException {
		return findEntityByCriteria(User.class);
	}

	@Override
	public User getUserDetails(int userId) throws ApplicationException {
		User user = super.findEntityByCriteria(User.class);
		if (user == null) {
			throw new ApplicationException(HttpConstants.NOT_FOUND, ErrorMsgConstants.USERINVALID,
					HttpStatus.NOT_FOUND);
		}
		return user;
	}

	@Override
	public void saveToken(User user, String accessToken, String refreshToken, LocalDateTime validUpto)
			throws ApplicationException {
		UserToken token = new UserToken(user, accessToken, refreshToken, validUpto);
		super.saveObject(token);
	}

	@Override
	public UserToken getUserToken(int userId, String authToken) throws ApplicationException {
		UserToken token = super.findEntityByCriteria(UserToken.class);
		if (token != null) {
			return token;
		}
		return null;
	}

	@Override
	public void logout(int userId) throws ApplicationException {
		getUserDetails(userId);

		UserToken token = getUserToken(userId, "token");
		if (token != null) {
			token.setAccessToken(null);
			token.setRefreshToken(null);
			token.setValidUpto(null);
			super.update(token);
		}
	}

}

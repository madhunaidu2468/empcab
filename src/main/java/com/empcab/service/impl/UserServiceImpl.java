/**
 * 
 */
package com.empcab.service.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.empcab.constant.ErrorMsgConstants;
import com.empcab.constant.HttpConstants;
import com.empcab.dao.UserDao;
import com.empcab.dto.UserLoginRequestDTO;
import com.empcab.dto.UserLoginResponseDTO;
import com.empcab.dto.security.AuthTokenDTO;
import com.empcab.dto.security.AuthTokenUtil;
import com.empcab.exception.ApplicationException;
import com.empcab.model.User;
import com.empcab.service.UserService;
import com.empcab.util.CommonUtils;
import com.empcab.util.DTOMapper;

/**
 * @author Madhu.R
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Autowired
	AuthTokenUtil authTokenUtil;

	@Override
	public UserLoginResponseDTO login(UserLoginRequestDTO loginRequest) throws ApplicationException {
		User user = userDao.login(loginRequest);
		if (user == null) {
			throw new ApplicationException(HttpConstants.UNAUTHORIZED, ErrorMsgConstants.INVALIDCREDENTIALS, HttpStatus.UNAUTHORIZED);
		}

		AuthTokenDTO tokenResponse = generateUserTokens(Long.toString(user.getId()));
		userDao.saveToken(user, tokenResponse.getAccessToken(), tokenResponse.getRefreshToken(),
				tokenResponse.getValidUpto());
		UserLoginResponseDTO userResponse = (UserLoginResponseDTO) DTOMapper.map(user, new UserLoginResponseDTO());
		userResponse.setTokens(tokenResponse);
		return userResponse;
	}

	private AuthTokenDTO generateUserTokens(String userId) {
		String accessToken = authTokenUtil.generateToken(userId);
		String refreshToken = authTokenUtil.generateToken(userId);
		
		LocalDateTime expiryDate = CommonUtils.getCurrentTime().plusHours(5);
		return new AuthTokenDTO(accessToken, refreshToken, expiryDate);
	}

	@Override
	public void logout(int userId) throws ApplicationException {
		userDao.logout(userId);
	}
}

package com.empcab.service.impl;
///**
// * 
// */

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.empcab.constant.ErrorMsgConstants;
import com.empcab.constant.HttpConstants;
import com.empcab.dao.DriverDao;
import com.empcab.dto.DriverLoginRequestDTO;
import com.empcab.dto.DriverLoginResponseDTO;
import com.empcab.dto.security.AuthTokenDTO;
import com.empcab.dto.security.AuthTokenUtil;
import com.empcab.exception.ApplicationException;
import com.empcab.model.Driver;
import com.empcab.service.DriverService;
import com.empcab.util.CommonUtils;
import com.empcab.util.DTOMapper;

/**
 * @author Madhu.R
 *
 */
@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	DriverDao driverDao;

	@Autowired
	AuthTokenUtil authTokenUtil;

	@Override
	public DriverLoginResponseDTO login(DriverLoginRequestDTO loginRequest) throws ApplicationException {
		Driver driver = driverDao.login(loginRequest);
		if (driver == null) {
			throw new ApplicationException(HttpConstants.UNAUTHORIZED, ErrorMsgConstants.INVALIDCREDENTIALS, HttpStatus.UNAUTHORIZED);
		}

		AuthTokenDTO tokenResponse = generateDriverTokens(Long.toString(driver.getId()));
		driverDao.saveToken(driver, tokenResponse.getAccessToken(), tokenResponse.getRefreshToken(),
				tokenResponse.getValidUpto());
		DriverLoginResponseDTO driverResponse = (DriverLoginResponseDTO) DTOMapper.map(driver, new DriverLoginResponseDTO());
		driverResponse.setTokens(tokenResponse);
		return driverResponse;
	}

	private AuthTokenDTO generateDriverTokens(String driverId) {
		String accessToken = authTokenUtil.generateToken(driverId);
		String refreshToken = authTokenUtil.generateToken(driverId);
		
		LocalDateTime expiryDate = CommonUtils.getCurrentTime().plusHours(5);
		return new AuthTokenDTO(accessToken, refreshToken, expiryDate);
	}

	@Override
	public void logout(int driverId) throws ApplicationException {
		driverDao.logout(driverId);
	}
}

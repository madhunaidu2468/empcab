package com.empcab.dao.impl;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.empcab.dao.DriverDao;
import com.empcab.dto.DriverLoginRequestDTO;
import com.empcab.exception.ApplicationException;
import com.empcab.model.Driver;

@Repository
public class DriverDaoImpl extends BaseDaoImpl implements DriverDao {

	@Override
	public Driver login(DriverLoginRequestDTO loginRequest) throws ApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveToken(Driver driver, String accessToken, String refreshToken, LocalDateTime validUpto)
			throws ApplicationException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout(int driverId) throws ApplicationException {
		// TODO Auto-generated method stub
		
	}

}

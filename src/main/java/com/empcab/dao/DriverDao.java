package com.empcab.dao;

import java.time.LocalDateTime;

import com.empcab.dto.DriverLoginRequestDTO;
import com.empcab.exception.ApplicationException;
import com.empcab.model.Driver;

public interface DriverDao {

	Driver login(DriverLoginRequestDTO loginRequest) throws ApplicationException;

	void saveToken(Driver driver, String accessToken, String refreshToken, LocalDateTime validUpto)throws ApplicationException;

	void logout(int driverId)throws ApplicationException;

}

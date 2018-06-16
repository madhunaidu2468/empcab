package com.empcab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.empcab.constant.ControllerMappings;
import com.empcab.constant.HttpConstants;
import com.empcab.dto.CommonResponseDTO;
import com.empcab.dto.DriverLoginRequestDTO;
import com.empcab.dto.DriverLoginResponseDTO;
import com.empcab.dto.UserLoginRequestDTO;
import com.empcab.dto.UserLoginResponseDTO;
import com.empcab.exception.ApplicationException;
import com.empcab.log.AppLogger;
import com.empcab.log.LoggerFactory;
import com.empcab.service.DriverService;
import com.empcab.service.UserService;

import io.swagger.annotations.ApiParam;

@RestController
public class LoginController {

	AppLogger log = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private UserService userService;


	@Autowired
	private DriverService driverService;

	
	/**
	 * @param loginRequest
	 * @return
	 * @throws ApplicationException
	 */
	@PostMapping(ControllerMappings.LOGIN)
	public ResponseEntity<UserLoginResponseDTO> login(@RequestBody UserLoginRequestDTO loginRequest)
			throws ApplicationException {
		log.debug(this.getClass(), "login", "login for " + loginRequest.getUserName());
		UserLoginResponseDTO response = userService.login(loginRequest);
		log.info(this.getClass(), "login", "login successfully for " + loginRequest.getUserName());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	/**
	 * @param userId
	 * @return
	 * @throws ApplicationException
	 */
	@GetMapping(ControllerMappings.LOGOUT + "/{userId}")
	public ResponseEntity<CommonResponseDTO> logout(@ApiParam @PathVariable(value = "userId") int userId)
			throws ApplicationException {
		log.debug(this.getClass(), "logout", "logout for " + userId);
		userService.logout(userId);
		log.info(this.getClass(), "logout", "logout successfully for " + userId);
		return new ResponseEntity<>(new CommonResponseDTO(HttpConstants.OK, "logout successfull"), HttpStatus.OK);
	}
	
	/**
	 * @param loginRequest
	 * @return
	 * @throws ApplicationException
	 */
	@PostMapping(ControllerMappings.DRIVER+ControllerMappings.LOGIN)
	public ResponseEntity<DriverLoginResponseDTO> login(@RequestBody DriverLoginRequestDTO loginRequest)
			throws ApplicationException {
	//	log.debug(this.getClass(), "login", "login for " + loginRequest.getUserName());
		DriverLoginResponseDTO response = driverService.login(loginRequest);
	//	log.info(this.getClass(), "login", "login successfully for " + loginRequest.getUserName());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	/**
	 * @param userId
	 * @return
	 * @throws ApplicationException
	 */
	@GetMapping(ControllerMappings.DRIVER+ControllerMappings.LOGOUT + "/{userId}")
	public ResponseEntity<CommonResponseDTO> driverLogout(@ApiParam @PathVariable(value = "userId") int userId)
			throws ApplicationException {
		log.debug(this.getClass(), "logout", "logout for " + userId);
		driverService.logout(userId);
		log.info(this.getClass(), "logout", "logout successfully for " + userId);
		return new ResponseEntity<>(new CommonResponseDTO(HttpConstants.OK, "logout successfull"), HttpStatus.OK);
	}

}

/**
* 
*/
package com.empcab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.empcab.dto.CommonListResponseDTO;
import com.empcab.dto.NearbyCabRequestDTO;
import com.empcab.dto.NearbyCabResponseDTO;
import com.empcab.dto.TripRequestDTO;
import com.empcab.dto.TripResponseDTO;
import com.empcab.exception.ApplicationException;
import com.empcab.log.AppLogger;
import com.empcab.log.LoggerFactory;
import com.empcab.service.TripService;
import com.empcab.util.CommonUtils;

import io.swagger.annotations.Api;

/**
 * @author Madhu.R
 *
 */
@RestController
@RequestMapping("/trip")
@Api(value = "trip")
public class TripController {

	AppLogger log = LoggerFactory.getLogger(TripController.class);

	@Autowired
	TripService tripService;

	@RequestMapping(value = "/nearby", method = RequestMethod.POST)
	public ResponseEntity<CommonListResponseDTO<NearbyCabResponseDTO>> getNearbyList(
			@RequestBody NearbyCabRequestDTO requestDTO) throws ApplicationException {
		log.info(this.getClass(), "getNearbyList", "Get getNearby list");
		List<NearbyCabResponseDTO> nearbyListResponse = tripService.getNearbyCabs(requestDTO);
		log.info(this.getClass(), "getNearbyList", "cab list response : " + nearbyListResponse);
		return new ResponseEntity<>(CommonUtils.getCommonListDTO(nearbyListResponse), HttpStatus.OK);
	}

	@RequestMapping(value = "/start", method = RequestMethod.POST)
	public ResponseEntity<String> startTrip(@RequestBody TripRequestDTO requestDTO)
			throws ApplicationException {
		log.info(this.getClass(), "startTrip", "startTrip");
		String response = tripService.startTrip(requestDTO);
		log.info(this.getClass(), "startTrip", "startTrip" + response);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@RequestMapping(value = "/end", method = RequestMethod.POST)
	public ResponseEntity<TripResponseDTO> endTrip(@RequestBody TripRequestDTO requestDTO) throws ApplicationException {
		log.info(this.getClass(), "endTrip", "endTrip");
		TripResponseDTO response = tripService.endTrip(requestDTO);
		log.info(this.getClass(), "endTrip", "endTrip" + response);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}

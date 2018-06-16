/**
 * 
 */
package com.empcab.controller;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.empcab.constant.HttpConstants;
import com.empcab.constant.ResponseConstants;
import com.empcab.dto.CabListResponseDTO;
import com.empcab.dto.CabRequestDTO;
import com.empcab.dto.CabResponseDTO;
import com.empcab.dto.CommonListResponseDTO;
import com.empcab.dto.CommonResponseDTO;
import com.empcab.exception.ApplicationException;
import com.empcab.log.AppLogger;
import com.empcab.log.LoggerFactory;
import com.empcab.service.CabService;
import com.empcab.util.CommonUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author Madhu.R
 *
 */
@RestController
@RequestMapping("/cab")
@Api(value = "cab")
public class CabController {

	@Autowired
	CabService cabService;

	AppLogger log = LoggerFactory.getLogger(CabController.class);

	/**
	 * @param cabId
	 * @param gatewayId
	 * @return
	 * @throws ApplicationException
	 */
	@ApiOperation(value = "Add a new cab", response = String.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully created cab"),
			@ApiResponse(code = 401, message = "Invalid token/credentials"),
			@ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@PostMapping("/add")
	public ResponseEntity<CommonResponseDTO> addNewCab(@RequestBody CabRequestDTO cabRequestDTO) throws ApplicationException {
		log.debug(this.getClass(), "addNewCab", "add New cab");
		cabService.registerNewCab(cabRequestDTO);
		return new ResponseEntity<>(new CommonResponseDTO(HttpConstants.CREATED, ResponseConstants.CREATEDSUCCESSFULLY),
				HttpStatus.CREATED);
	}

	/**
	 * @param cabId
	 * @return
	 * @throws ApplicationException
	 */
	@DeleteMapping("/delete/{gatewayId}/{cabId}")
	public ResponseEntity<CommonResponseDTO> deleteCab(
			@PathVariable(value = "gatewayId", required = true) String gatewayId,
			@PathVariable(value = "cabId", required = true) String cabId) throws ApplicationException {
		log.debug(this.getClass(), "deleteCab", "Delete cab");
		cabService.deleteCab(gatewayId, cabId);
		log.info(this.getClass(), "deleteCab", "Delete cab successful" + cabId);
		return new ResponseEntity<>(new CommonResponseDTO(HttpConstants.OK, ResponseConstants.DELETEDSUCCESSFULLY),
				HttpStatus.OK);
	}

	/**
	 * @param cabId
	 * @return
	 * @throws ApplicationException
	 */
	@GetMapping("/details/{gatewayId}/{cabId}")
	public ResponseEntity<CabResponseDTO> getCabDetails(
			@PathVariable(value = "gatewayId", required = true) String gatewayId,
			@PathVariable(value = "cabId", required = true) String cabId) throws ApplicationException {
		log.debug(this.getClass(), "getCabDetails", "Get cab details");
		CabResponseDTO cabResponse = cabService.getCabDetails(gatewayId, cabId);
		log.debug(this.getClass(), "getCabDetails", "cab details response : " + cabResponse);
		return new ResponseEntity<>(cabResponse, HttpStatus.OK);
	}

	/**
	 * @param gatewayId
	 * @return
	 * @throws ApplicationException
	 */
	@GetMapping("/allids")
	public ResponseEntity<CommonListResponseDTO<String>> getCabIdList(
			@RequestParam(value = "gatewayId", required = false) String gatewayId) throws ApplicationException {
		List<String> cabList = cabService.getCabIdList(gatewayId);
		CommonUtils.checkIfListEmpty(cabList);
		return new ResponseEntity<>(new CommonListResponseDTO<String>(cabList), HttpStatus.OK);
	}

	/**
	 * @param gatewayId
	 * @param pageable
	 * @return
	 * @throws ApplicationException
	 */
	@GetMapping("/list")
	public ResponseEntity<CabListResponseDTO> getCabList(
			@RequestParam(value = "gatewayId", required = false) String gatewayId, Pageable pageable)
			throws ApplicationException {
		log.info(this.getClass(), "getCabList", "Get cab list");
		CabListResponseDTO cabListResponse = cabService.getCabList(gatewayId, pageable);
		log.info(this.getClass(), "getCabList", "cab list response : " + cabListResponse);
		return new ResponseEntity<>(cabListResponse, HttpStatus.OK);
	}

}

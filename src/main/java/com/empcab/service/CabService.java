/**
 * 
 */
package com.empcab.service;

import java.awt.print.Pageable;
import java.util.List;

import com.empcab.dto.CabListResponseDTO;
import com.empcab.dto.CabRequestDTO;
import com.empcab.dto.CabResponseDTO;

/**
 * @author Madhu.R
 *
 */
public interface CabService {
	
	void registerNewCab(CabRequestDTO cabRequestDTO);
	
	void deregisterCab();
	
	void updateDriverDetails();

	void deleteCab(String gatewayId, String cabId);

	CabResponseDTO getCabDetails(String gatewayId, String cabId);

	List<String> getCabIdList(String gatewayId);

	CabListResponseDTO getCabList(String gatewayId, Pageable pageable);
	
	

}

/**
 * 
 */
package com.empcab.service.impl;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.stereotype.Service;

import com.empcab.dto.CabListResponseDTO;
import com.empcab.dto.CabRequestDTO;
import com.empcab.dto.CabResponseDTO;
import com.empcab.service.CabService;

/**
 * @author Madhu.R
 *
 */
@Service
public class CabServiceImpl implements CabService {

public void registerNewCab(CabRequestDTO cabRequestDTO){}
	
	public void deregisterCab(){}
	
	public void updateDriverDetails(){}

	@Override
	public void deleteCab(String gatewayId, String cabId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CabResponseDTO getCabDetails(String gatewayId, String cabId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getCabIdList(String gatewayId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CabListResponseDTO getCabList(String gatewayId, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}

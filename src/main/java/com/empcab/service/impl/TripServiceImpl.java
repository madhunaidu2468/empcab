/**
 * 
 */
package com.empcab.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.empcab.dto.CabResponseDTO;
import com.empcab.dto.NearbyCabRequestDTO;
import com.empcab.dto.NearbyCabResponseDTO;
import com.empcab.dto.TripRequestDTO;
import com.empcab.dto.TripResponseDTO;
import com.empcab.service.TripService;

/**
 * @author Madhu.R
 *
 */
@Service
public class TripServiceImpl implements TripService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.test.cab.service.TripService#getNearbyCabs(com.test.cab.dto.
	 * NearbyCabRequestDTO, java.awt.print.Pageable)
	 */
	@Override
	public List<NearbyCabResponseDTO> getNearbyCabs(
			NearbyCabRequestDTO requestDTO) {

		List<NearbyCabResponseDTO> resp = new ArrayList<>();
		double lat = requestDTO.getStartLat();
		double lon = requestDTO.getStartLong();
		String type = requestDTO.getType();
		for (int i = 1; i < 5; i++) {
			NearbyCabResponseDTO response = new NearbyCabResponseDTO();
			response.setCabId(i);
			response.setLat(lat + i);
			response.setLon(lon + i);
			response.setType(type);
			resp.add(response);
		}

		return resp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.test.cab.service.TripService#startTrip(com.test.cab.dto.
	 * TripRequestDTO)
	 */
	@Override
	public String startTrip(TripRequestDTO requestDTO) {		
		return "topic1";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.test.cab.service.TripService#endTrip(com.test.cab.dto.TripRequestDTO)
	 */
	@Override
	public TripResponseDTO endTrip(TripRequestDTO requestDTO) {
		TripResponseDTO resp=new TripResponseDTO();
		resp.setCab(new CabResponseDTO(1, requestDTO.getCabType()));
		return resp;
	}

}

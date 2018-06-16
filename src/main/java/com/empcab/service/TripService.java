/**
 * 
 */
package com.empcab.service;

import java.util.List;

import com.empcab.dto.NearbyCabRequestDTO;
import com.empcab.dto.NearbyCabResponseDTO;
import com.empcab.dto.TripRequestDTO;
import com.empcab.dto.TripResponseDTO;

/**
 * @author Madhu.R
 *
 */
public interface TripService {

	List<NearbyCabResponseDTO> getNearbyCabs(NearbyCabRequestDTO requestDTO);

	String startTrip(TripRequestDTO requestDTO);

	TripResponseDTO endTrip(TripRequestDTO requestDTO);

}

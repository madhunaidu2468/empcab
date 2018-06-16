/**
 * 
 */
package com.empcab.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.empcab.constant.CommonConstants;
import com.empcab.constant.HttpConstants;
import com.empcab.dto.CommonListResponseDTO;
import com.empcab.exception.ApplicationException;

/**
 * @author Madhu.R
 *
 */
@Component
public class CommonUtils {

	private static String systemZone;

	private CommonUtils() {
	}

	public String getSystemZone() {
		return systemZone;
	}

	@Value("${system.zone}")
	public void setSystemZone(String systemZone) {
		this.systemZone = systemZone;
	}

	public static String getStatusNameFromCode(String statusCode) {
		String status;
		switch (statusCode) {
			case "0" :
				status = "INACTIVE";
				break;
			case "2" :
				status = "JOINING";
				break;
			case "3" :
				status = "LOST";
				break;
			default :
				status = "ACTIVE";
				break;
		}
		return status;
	}

	public static <T> void checkIfListEmpty(List<T> list)
			throws ApplicationException {
		if (list == null || list.isEmpty()) {
			throw new ApplicationException(HttpConstants.NO_CONTENT,
					CommonConstants.NO_CONTENT, HttpStatus.NO_CONTENT);
		}
	}

	public static LocalDateTime getCurrentTime() {
		return LocalDateTime.now(ZoneId.of(systemZone));
	}

	public static <T> CommonListResponseDTO getCommonListDTO(List<T> req) {
		return new CommonListResponseDTO<>(Arrays.asList(req));
	}

}

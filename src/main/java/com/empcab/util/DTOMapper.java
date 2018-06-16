/**
 * 
 */
package com.empcab.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;

import com.empcab.constant.HttpConstants;
import com.empcab.exception.ApplicationException;
import com.empcab.log.AppLogger;
import com.empcab.log.LoggerFactory;

/**
 * @author Madhu.R
 *
 */
public class DTOMapper {
	
	static AppLogger log = LoggerFactory.getLogger(DTOMapper.class);

	private DTOMapper(){}

	/**
	 * @param source
	 * @param target
	 * @return
	 */
	public static <T> T map(T source, T target) {
		BeanUtils.copyProperties(source, target);
		return target;
	}

	
	/**
	 * @param sourceList
	 * @param target
	 * @return
	 * @throws ApplicationException
	 */
	public static <T> List<T> mapList(List<?> sourceList, Class<T> target) throws ApplicationException {
		List<T> targetList = new ArrayList<>();

		try {
			for (Object s : sourceList) {
				T t = target.newInstance();
				BeanUtils.copyProperties(s, t);
				targetList.add(t);
			}
		} catch (InstantiationException | IllegalAccessException e) {
			log.error(DTOMapper.class, "mapList", e);
			throw new ApplicationException(HttpConstants.INTERNAL_SERVER_ERROR, "Parsing error",
					HttpStatus.INTERNAL_SERVER_ERROR);
		}

		return targetList;
	}

}

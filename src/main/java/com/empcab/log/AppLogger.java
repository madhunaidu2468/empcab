/**
 * 
 */
package com.empcab.log;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * @author Madhu.R
 *
 */
public class AppLogger {

	private org.slf4j.Logger logger;
		
	private static final String TEDLOG="TEDLog-";
	private static final Marker TEDLOGPREFIX = MarkerFactory.getMarker(TEDLOG);
	
	public <T> AppLogger(Class<T> clazz) {
		logger = org.slf4j.LoggerFactory.getLogger(clazz);
	}

	public <T> void warn(Class<T> clazz, String method, String message) {
		logger.warn(TEDLOG+clazz.getSimpleName() + ":" + method + " | " + message);
	}

	public <T> void debug(Class<T> clazz, String method, String message) {
		logger.debug(TEDLOGPREFIX, clazz.getSimpleName() + ":" + method + " | " + message);
	}

	public <T> void info(Class<T> clazz, String method, String message) {
		logger.info(TEDLOG+clazz.getSimpleName() + ":" + method + " | " + message);
	}

	public <T> void error(Class<T> clazz, String method, Exception e) {
		logger.error(TEDLOG+clazz.getSimpleName() + ":" + method + " | " + e.getMessage());
	}

}

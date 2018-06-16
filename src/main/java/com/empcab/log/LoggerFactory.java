/**
 * 
 */
package com.empcab.log;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Madhu.R
 *
 */
public class LoggerFactory {

	private static Map<String,AppLogger> loggers = new HashMap<>();
	
	private LoggerFactory(){}

	
	public static <T> AppLogger getLogger(Class<T> clazz){
		String className=clazz.getSimpleName();
		if(loggers.isEmpty() || !loggers.containsKey(className))
		{
			loggers.put(className,new AppLogger(clazz)); 
		}
		return loggers.get(className);
	}	
}

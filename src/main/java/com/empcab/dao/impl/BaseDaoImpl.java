///**
// * 
// */
package com.empcab.dao.impl;

import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

import com.empcab.exception.ApplicationException;
import com.empcab.log.AppLogger;
import com.empcab.log.LoggerFactory;

/**
 * @author Madhu.R
 *
 */

@Repository
public class BaseDaoImpl {

	AppLogger logger = LoggerFactory.getLogger(BaseDaoImpl.class);

	/**
	 * @param entity
	 * @return
	 * @throws ApplicationException
	 */
	public <T> int save(T entity) throws ApplicationException {
		return 0;}

	/**
	 * @param entity
	 * @throws ApplicationException
	 */
	public <T> void saveObject(T entity) throws ApplicationException {}

	/**
	 * @param entity
	 * @throws ApplicationException
	 */
	public <T> void update(T entity) throws ApplicationException {}

	/**
	 * @param entity
	 * @throws ApplicationException
	 */
	public <T> void hardDelete(T entity) throws ApplicationException {}

	/**
	 * @param clazz
	 * @param order
	 * @param criterions
	 * @return
	 * @throws ApplicationException
	 */
	@SuppressWarnings("unchecked")

	public <T> List<T> findByCriteria(Class<T> clazz, Order order)
			throws ApplicationException {
				return null;}

	
	/**
	 * @param clazz
	 * @param criterions
	 * @return
	 * @throws ApplicationException
	 */
	@SuppressWarnings("unchecked")
	public <T> T findEntityByCriteria(Class<T> clazz) throws ApplicationException {
		return null;}
	
	
}

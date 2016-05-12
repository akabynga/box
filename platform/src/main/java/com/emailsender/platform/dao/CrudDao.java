package com.emailsender.platform.dao;

import java.util.List;

public interface CrudDao<E> {
	/**
	 * 
	 * @param entity
	 * @return the generated key value
	 */
	Long create(E entity);

	List<E> findAll();

	E findById(Long entityId);

	/**
	 * 
	 * @param entity
	 * @return the number of rows affected
	 */
	Integer update(E entity);

	/**
	 * 
	 * @param entity
	 * @return the number of rows affected
	 */
	Integer delete(Long entityId);

}

package com.ihtc.manage_child;

import java.sql.SQLException;
import java.util.List;

public interface MyDAO<T,I> {
	
	boolean save(T entity) throws SQLException;
	boolean update(T entity) throws SQLException;
	boolean delete(I id) throws SQLException;
	T findById(I id) throws SQLException;
	List<T> findAll() throws SQLException;
	
}


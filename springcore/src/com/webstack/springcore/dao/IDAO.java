package com.webstack.springcore.dao;

import java.util.List;

public interface IDAO<T> {
	void save(T type);
	T get(Long id);
	void delete(Long id);
	void update(T type);
	List<T> list();
}

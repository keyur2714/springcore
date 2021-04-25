package com.webstack.springcore.service;

import java.util.List;

public interface IService<T> {
	void save(T type);
	T get(Long id);
	void delete(Long id);
	void update(T type);
	List<T> list();
}

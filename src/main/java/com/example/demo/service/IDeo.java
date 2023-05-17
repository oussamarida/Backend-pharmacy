package com.example.demo.service;

import java.util.List;

public interface IDeo<T> {

	void save(T o);
	void delete(T o);
	void update(T o);
	T FindById(int id);
	List<T> findAll();

}

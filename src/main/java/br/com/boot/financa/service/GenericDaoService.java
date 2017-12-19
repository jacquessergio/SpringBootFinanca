package br.com.boot.financa.service;

import java.util.List;

public interface GenericDaoService {

	public void insert(Object obj);

	public void delete(Object obj, Long id);

	public void update(Object obj, Long id);
	
	public List<Object> ready(Object obj);
}

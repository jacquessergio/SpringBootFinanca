package br.com.boot.financa.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import br.com.boot.financa.service.GenericDaoService;


@Component
public class GenericDao<T> implements GenericDaoService {
	
	
	@Override
	public void insert(Object obj) {
	
		
	}

	@Override
	public void delete(Object obj, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Object obj, Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Object> ready(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

}

package br.edu.qi.planetoffice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.repository.IGenericRepository;

@Service
public abstract class GenericService<T> implements IService<T>{

	@Autowired
	IGenericRepository<T> repository;
	
	@Override
	public Iterable<T> getAll() {
		Iterable<T> t = repository.findAll();
		return t;
	}

	@Override
	public void save(T t) {
		// TODO Auto-generated method stub
		
	}

}

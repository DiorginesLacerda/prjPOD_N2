package br.edu.qi.planetoffice.service;


import org.springframework.stereotype.Service;



@Service
public abstract class GenericService<T> implements IService<T>{

	
	
	/*
	
	@Override
	public Iterable<T> getAll() {
		Iterable<T> t = repository.findAll();
		return t;
	}

	@Override
	public void save(T t) {
		repository.save(t);
		
	}

	*/
}

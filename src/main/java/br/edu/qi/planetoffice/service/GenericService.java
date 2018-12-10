package br.edu.qi.planetoffice.service;


import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public abstract  class GenericService<T>  {

	
	private CrudRepository<T,Integer> repository;
	
	public GenericService(CrudRepository repository) {
		this.repository = repository;
	}


	public T findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void save(T t) {
		repository.save(t);
		
	}


	public boolean exists(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public Iterable<T> findAll() {
		Iterable<T> t = repository.findAll();
		return t;
		
	}

	public Iterable<T> findAll(Iterable<Serializable> ids) {
		// TODO Auto-generated method stub
		return null;
	}


	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}


	public void delete(Serializable id) {
		// TODO Auto-generated method stub
		
	}


	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}


	public void delete(Iterable<? extends T> entities) {
		// TODO Auto-generated method stub
		
	}


	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	
}

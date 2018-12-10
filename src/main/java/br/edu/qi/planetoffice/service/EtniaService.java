package br.edu.qi.planetoffice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Etnia;
import br.edu.qi.planetoffice.repository.IEtniaReposytory;

@Service
public class EtniaService implements IService<Etnia>{

	@Autowired
	IEtniaReposytory repository;
	
	@Override
	public Iterable<Etnia> getAll() {
		Iterable<Etnia> findAll = repository.findAll();
		return findAll;
	}

	@Override
	public void save(Etnia t) {
		repository.save(t);
		
	}

}

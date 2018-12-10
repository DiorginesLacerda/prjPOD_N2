package br.edu.qi.planetoffice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Curso;
import br.edu.qi.planetoffice.repository.ICursoRepository;

@Service
public class CursoService implements IService<Curso>{

	@Autowired
	ICursoRepository repository;
	
	@Override
	public Iterable<Curso> getAll() {
		Iterable<Curso> t = repository.findAll();
		return t;
	}

	@Override
	public void save(Curso t) {
		repository.save(t);
		
	}

}

package br.edu.qi.planetoffice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Aluno;
import br.edu.qi.planetoffice.repository.IAlunoRepository;

@Service
public class AlunoService implements IService<Aluno> {

	@Autowired
	IAlunoRepository repository;

	@Override
	public Iterable<Aluno> getAll() {
		Iterable<Aluno> t = repository.findAll();
		return t;
	}

	@Override
	public void save(Aluno t) {
		repository.save(t);
		
	}
	
	
}

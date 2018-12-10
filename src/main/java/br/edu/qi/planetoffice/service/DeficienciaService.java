package br.edu.qi.planetoffice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Deficiencia;
import br.edu.qi.planetoffice.repository.IDeficienciaRepository;

@Service
public class DeficienciaService implements IService<Deficiencia> {

	@Autowired
	IDeficienciaRepository repository;
	
	@Override
	public Iterable<Deficiencia> getAll() {
		Iterable<Deficiencia> t = repository.findAll();
		return t;
	}

	@Override
	public void save(Deficiencia t) {
		repository.save(t);
		
	}

}

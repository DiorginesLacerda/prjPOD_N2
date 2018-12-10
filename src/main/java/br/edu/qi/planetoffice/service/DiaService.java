package br.edu.qi.planetoffice.service;

import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Dia;
import br.edu.qi.planetoffice.repository.IDiaRepository;

@Service
public class DiaService extends GenericService<Dia>{

	public DiaService(IDiaRepository repository) {
		super(repository);
	}

}

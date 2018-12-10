package br.edu.qi.planetoffice.service;


import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Etnia;
import br.edu.qi.planetoffice.repository.IEtniaReposytory;

@Service
public class EtniaService extends GenericService<Etnia>{

	public EtniaService(IEtniaReposytory repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}
	
}

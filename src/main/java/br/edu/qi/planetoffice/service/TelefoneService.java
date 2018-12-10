package br.edu.qi.planetoffice.service;


import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Telefone;
import br.edu.qi.planetoffice.repository.ITelefoneRepository;

@Service
public class TelefoneService extends GenericService<Telefone> {

	public TelefoneService(ITelefoneRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}



}

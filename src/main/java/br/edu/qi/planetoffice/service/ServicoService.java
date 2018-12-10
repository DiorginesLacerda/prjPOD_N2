package br.edu.qi.planetoffice.service;

import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Servico;
import br.edu.qi.planetoffice.repository.IServicoRepository;

@Service
public class ServicoService  extends GenericService<Servico>{

	public ServicoService(IServicoRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	
}

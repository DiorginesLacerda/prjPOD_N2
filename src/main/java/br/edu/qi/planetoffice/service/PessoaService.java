package br.edu.qi.planetoffice.service;

import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Pessoa;
import br.edu.qi.planetoffice.repository.IPessoaRepository;

@Service
public class PessoaService extends GenericService<Pessoa>{

	public PessoaService(IPessoaRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	
}

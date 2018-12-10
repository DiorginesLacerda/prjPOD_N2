package br.edu.qi.planetoffice.service;
import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Filiacao;
import br.edu.qi.planetoffice.repository.IFiliacaoRepository;

@Service
public class FiliacaoService extends GenericService<Filiacao>{

	public FiliacaoService(IFiliacaoRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

}



package br.edu.qi.planetoffice.service;

import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.TipoFiliacao;
import br.edu.qi.planetoffice.repository.ITipoFiliacaoRepository;

@Service
public class TipoFiliacaoService extends GenericService<TipoFiliacao> {

	public TipoFiliacaoService(ITipoFiliacaoRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}



}

package br.edu.qi.planetoffice.service;

import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Produto;
import br.edu.qi.planetoffice.repository.IProdutoRepository;

@Service
public class ProdutoService extends GenericService<Produto>{

	public ProdutoService(IProdutoRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	

}

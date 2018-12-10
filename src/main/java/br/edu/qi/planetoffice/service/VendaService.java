package br.edu.qi.planetoffice.service;

import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Venda;
import br.edu.qi.planetoffice.repository.IVendaRepository;

@Service
public class VendaService extends GenericService<Venda>{

	public VendaService(IVendaRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	

}

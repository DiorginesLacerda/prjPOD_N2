package br.edu.qi.planetoffice.service;
import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Sexo;
import br.edu.qi.planetoffice.repository.ISexoRepository;

@Service
public class SexoService extends GenericService<Sexo>{

	public SexoService(ISexoRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	
}

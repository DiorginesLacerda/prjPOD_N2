package br.edu.qi.planetoffice.service;


import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Horario;
import br.edu.qi.planetoffice.repository.IHorarioRepository;

@Service
public class HorarioService extends GenericService<Horario>{

	
	public HorarioService(IHorarioRepository repository) {
		super(repository);
	}

	
	
}

package br.edu.qi.planetoffice.service;

import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Professor;
import br.edu.qi.planetoffice.repository.IProfessorRepository;

@Service
public class ProfessorService extends GenericService<Professor>{

	public ProfessorService(IProfessorRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	

}

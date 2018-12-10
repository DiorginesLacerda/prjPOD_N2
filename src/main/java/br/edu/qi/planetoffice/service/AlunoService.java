package br.edu.qi.planetoffice.service;


import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Aluno;
import br.edu.qi.planetoffice.repository.IAlunoRepository;

@Service
public class AlunoService extends GenericService<Aluno> {

	public AlunoService(IAlunoRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}



	
}

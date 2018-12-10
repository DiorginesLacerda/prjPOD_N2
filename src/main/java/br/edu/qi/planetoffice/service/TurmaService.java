package br.edu.qi.planetoffice.service;
import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Turma;
import br.edu.qi.planetoffice.repository.ITurmaRepository;

@Service
public class TurmaService extends GenericService<Turma>{

	public TurmaService(ITurmaRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}



}

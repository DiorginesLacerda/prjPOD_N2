package br.edu.qi.planetoffice.service;
import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Curso;
import br.edu.qi.planetoffice.repository.ICursoRepository;

@Service
public class CursoService extends GenericService<Curso>{

	public CursoService(ICursoRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}	

}

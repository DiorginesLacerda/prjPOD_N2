package br.edu.qi.planetoffice.service;

import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Deficiencia;
import br.edu.qi.planetoffice.repository.IDeficienciaRepository;


@Service
public class DeficienciaService extends GenericService<Deficiencia> {

	
	public DeficienciaService(IDeficienciaRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}	

}

package br.edu.qi.planetoffice.service;
import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Religiao;
import br.edu.qi.planetoffice.repository.IReligiaoRepository;

@Service
public class ReligiaoService extends GenericService<Religiao>{

	public ReligiaoService(IReligiaoRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	

}

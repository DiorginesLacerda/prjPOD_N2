package br.edu.qi.planetoffice.service;

import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Usuario;
import br.edu.qi.planetoffice.repository.IUsuarioRepository;

@Service
public class UsuarioService extends GenericService<Usuario>{

	public UsuarioService(IUsuarioRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	

}

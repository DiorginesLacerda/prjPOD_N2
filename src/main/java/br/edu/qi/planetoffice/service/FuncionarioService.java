package br.edu.qi.planetoffice.service;

import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Funcionario;
import br.edu.qi.planetoffice.repository.IFuncionarioRepository;

@Service
public class FuncionarioService extends GenericService<Funcionario>{

	public FuncionarioService(IFuncionarioRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	

}

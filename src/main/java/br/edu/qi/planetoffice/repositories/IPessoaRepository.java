package br.edu.qi.planetoffice.repositories;

import org.springframework.data.repository.CrudRepository;

import br.edu.qi.planetoffice.model.Pessoa;

public interface IPessoaRepository extends CrudRepository<Pessoa, Integer>{

}

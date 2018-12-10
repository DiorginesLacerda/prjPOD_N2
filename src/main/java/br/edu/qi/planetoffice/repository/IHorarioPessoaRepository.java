package br.edu.qi.planetoffice.repository;

import org.springframework.data.repository.CrudRepository;

import br.edu.qi.planetoffice.model.HorarioPessoa;
import br.edu.qi.planetoffice.model.HorarioPessoaId;

public interface IHorarioPessoaRepository extends CrudRepository<HorarioPessoa, HorarioPessoaId> {

}

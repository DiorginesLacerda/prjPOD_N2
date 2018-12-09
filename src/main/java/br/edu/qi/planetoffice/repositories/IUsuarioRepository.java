package br.edu.qi.planetoffice.repositories;

import org.springframework.data.repository.CrudRepository;

import br.edu.qi.planetoffice.model.Usuario;

public interface IUsuarioRepository extends CrudRepository<Usuario, Integer>{

}

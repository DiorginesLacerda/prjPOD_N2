package br.edu.qi.planetoffice.repository;

import org.springframework.data.repository.CrudRepository;

public interface IGenericRepository<T> extends CrudRepository<T,Integer>{

}

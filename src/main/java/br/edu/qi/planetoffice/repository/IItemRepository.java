package br.edu.qi.planetoffice.repository;


import org.springframework.data.repository.CrudRepository;

import br.edu.qi.planetoffice.model.Item;

public interface IItemRepository extends CrudRepository<Item,Integer>{

}

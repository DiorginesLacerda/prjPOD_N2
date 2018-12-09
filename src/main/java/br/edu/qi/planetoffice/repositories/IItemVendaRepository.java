package br.edu.qi.planetoffice.repositories;

import org.springframework.data.repository.CrudRepository;

import br.edu.qi.planetoffice.model.ItemVenda;
import br.edu.qi.planetoffice.model.ItemVendaId;

public interface IItemVendaRepository extends CrudRepository<ItemVenda, ItemVendaId>{

}

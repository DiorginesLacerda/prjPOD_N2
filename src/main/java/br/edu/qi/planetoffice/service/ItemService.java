package br.edu.qi.planetoffice.service;

import org.springframework.stereotype.Service;

import br.edu.qi.planetoffice.model.Item;
import br.edu.qi.planetoffice.repository.IItemRepository;

@Service
public class ItemService extends GenericService<Item>{

	public ItemService(IItemRepository repository) {
		super(repository);
		// TODO Auto-generated constructor stub
	}

	

}

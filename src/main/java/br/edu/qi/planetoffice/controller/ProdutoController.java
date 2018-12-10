package br.edu.qi.planetoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.qi.planetoffice.model.Item;
import br.edu.qi.planetoffice.model.Produto;
import br.edu.qi.planetoffice.service.ProdutoService;

@Controller
public class ProdutoController {
	
	@Autowired
	ProdutoService service;
	
	@RequestMapping("cadprodutos")
	public String listaProdutos(Model model) {
		Iterable<Produto> all = service.findAll();
		model.addAttribute("all", all);
		return "cadprodutos";
	}

	@RequestMapping(value="salvaprodutos", method = RequestMethod.POST)
	public String salvaProdutos(@RequestParam("descricao") String descricao,
							@RequestParam("quantidade") String quantidade,
							@RequestParam("local") String local,
							@RequestParam("valor") String valor,
							Model model) {
		
		Item item = new Item();
		item.setDescricao(descricao);
		item.setValor(Float.parseFloat(valor));
		
		Produto produto = new Produto(item, Integer.parseInt(quantidade), local);
		service.save(produto);
		
		Iterable<Produto> all = service.findAll();
		model.addAttribute("all", all);
		return "cadprodutos";
	}
}

package br.edu.qi.planetoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.qi.planetoffice.model.Deficiencia;
import br.edu.qi.planetoffice.model.Etnia;
import br.edu.qi.planetoffice.service.EtniaService;

@Controller
public class EtniaController {
	
	@Autowired
	private EtniaService service;

	@RequestMapping("cadetnias")
	public String listaEtnias(Model model) {
		Iterable<Etnia> all = service.getAll();
		model.addAttribute("all", all);
		return "cadetnias";
	}
	
	@RequestMapping(value="salvaetnias", method = RequestMethod.POST)
	public String salvadeficiencias(@RequestParam("descricao") String descricao,
			Model model) {
		
		
		Etnia etnia = new Etnia(descricao);
		service.save(etnia);
		
		Iterable<Etnia> all = service.getAll();
		model.addAttribute("all", all);
		return "cadetnias";
	}
}

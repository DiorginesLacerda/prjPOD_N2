package br.edu.qi.planetoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.qi.planetoffice.model.Dia;
import br.edu.qi.planetoffice.service.DiaService;

@Controller
public class DiaController {

	@Autowired
	DiaService service;
	
	@RequestMapping("caddias")
	public String listaDias(Model model) {
		Iterable<Dia> all = service.findAll();
		model.addAttribute("all", all);
		return "caddias";
	}
	
	@RequestMapping(value="salvadias", method = RequestMethod.POST)
	public String salvadeficiencias(@RequestParam("descricao") String descricao,
			Model model) {
		
		
		Dia dia = new Dia(descricao);
		service.save(dia);
		
		Iterable<Dia> all = service.findAll();
		model.addAttribute("all", all);
		return "caddias";
	}
}

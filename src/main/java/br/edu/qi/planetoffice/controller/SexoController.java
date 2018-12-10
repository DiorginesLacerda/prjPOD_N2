package br.edu.qi.planetoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import br.edu.qi.planetoffice.model.Sexo;
import br.edu.qi.planetoffice.service.SexoService;

@Controller
public class SexoController {

	@Autowired
	SexoService service;
	
	@RequestMapping("cadsexos")
	public String listaSexos(Model model) {
		Iterable<Sexo> all = service.findAll();
		model.addAttribute("all", all);
		return "cadsexos";
	}
	
	@RequestMapping(value="salvasexos", method = RequestMethod.POST)
	public String salvadeSexo(@RequestParam("descricao") String descricao,
			Model model) {
		
		
		Sexo sexo = new Sexo(descricao);
		service.save(sexo);
		
		Iterable<Sexo> all = service.findAll();
		model.addAttribute("all", all);
		return "cadsexos";
	}
	
}

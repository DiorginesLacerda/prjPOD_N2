package br.edu.qi.planetoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.qi.planetoffice.model.Deficiencia;
import br.edu.qi.planetoffice.service.DeficienciaService;

@Controller 
public class DeficienciaController {

	@Autowired
	private DeficienciaService service;
	
	@RequestMapping("caddeficiencias")
	public String listaDeficiencias(Model model) {
		Iterable<Deficiencia> deficiencias = service.findAll();
		model.addAttribute("deficiencias", deficiencias);
		
		return "caddeficiencias";
	}
	
	@RequestMapping(value="salvadeficiencias", method = RequestMethod.POST)
	public String salvadeficiencias(@RequestParam("descricao") String descricao,
			@RequestParam("grau") String grau,Model model) {
		
		//Tratar o inteiro
		Deficiencia deficiencia = new Deficiencia(descricao, Integer.parseInt(grau));
		
		service.save(deficiencia);
		Iterable<Deficiencia> deficiencias = service.findAll();
		model.addAttribute("deficiencias", deficiencias);
		
		return "caddeficiencias";
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}

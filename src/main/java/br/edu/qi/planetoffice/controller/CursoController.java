package br.edu.qi.planetoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.qi.planetoffice.model.Curso;
import br.edu.qi.planetoffice.service.CursoService;

@Controller
public class CursoController {

	@Autowired
	private CursoService service;
	
	@RequestMapping("cadcursos")
	public String listaEtnias(Model model) {
		Iterable<Curso> all = service.findAll();
		model.addAttribute("all", all);
		return "cadcursos";
	}
	
	@RequestMapping(value="salvacursos", method = RequestMethod.POST)
	public String salvaCursos(@RequestParam("descricao") String descricao,
			Model model) {
		
		
		Curso curso = new Curso(descricao);
		service.save(curso);
		
		Iterable<Curso> all = service.findAll();
		model.addAttribute("all", all);
		return "cadcursos";
	}
}

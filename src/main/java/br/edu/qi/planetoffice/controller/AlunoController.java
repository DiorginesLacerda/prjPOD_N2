package br.edu.qi.planetoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import br.edu.qi.planetoffice.model.Aluno;
import br.edu.qi.planetoffice.service.AlunoService;

@Controller
public class AlunoController {

	@Autowired
	private AlunoService service;
	
	@RequestMapping("cadalunos")
	public String listaAlunos(Model model) {
		//Iterable<Aluno> all = service.getAll();
		//model.addAttribute("all", all);
		return "cadaluno";
	}
	
	/*
	@RequestMapping(value="salvaaluno", method = RequestMethod.POST)
	public String salvadeficiencias(@RequestParam("descricao") String descricao,
			Model model) {
		
		
		Aluno aluno = new Aluno(descricao);
		service.save(etnia);
		
		Iterable<Etnia> all = service.getAll();
		model.addAttribute("all", all);
		return "cadetnias";
	}*/
}

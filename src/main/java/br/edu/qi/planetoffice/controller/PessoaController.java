package br.edu.qi.planetoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.qi.planetoffice.model.Etnia;
import br.edu.qi.planetoffice.model.Pessoa;
import br.edu.qi.planetoffice.model.Religiao;
import br.edu.qi.planetoffice.model.Sexo;
import br.edu.qi.planetoffice.service.PessoaService;

@Controller
public class PessoaController {
	
	@Autowired
	PessoaService service;
	
	@RequestMapping("cadpessoas")
	public String listaPessoas(Model model) {
		Iterable<Pessoa> all = service.findAll();
		model.addAttribute("all", all);
		return "cadpessoas";
	}
	
	@RequestMapping(value="salvapessoas", method = RequestMethod.POST)
	public String salvaPessoas(@RequestParam("descricao") String descricao,
							@RequestParam("quantidade") String quantidade,
							@RequestParam("local") String local,
							@RequestParam("valor") String valor,
							Model model) {
		
		//Alterar para combo
		Etnia etnia = new Etnia();
		Religiao religiao = new Religiao();
		Sexo sexo = new Sexo();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setEtnia(etnia);
		
		service.save(pessoa);
		
		Iterable<Pessoa> all = service.findAll();
		model.addAttribute("all", all);
		return "cadpessoas";
	}

}

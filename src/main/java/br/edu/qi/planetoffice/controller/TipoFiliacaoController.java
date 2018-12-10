package br.edu.qi.planetoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import br.edu.qi.planetoffice.model.TipoFiliacao;
import br.edu.qi.planetoffice.service.TipoFiliacaoService;

@Controller
public class TipoFiliacaoController {

	@Autowired
	TipoFiliacaoService service;
	
	@RequestMapping("cadetipofiliacao")
	public String listaTipoFiliacao(Model model) {
		Iterable<TipoFiliacao> all = service.findAll();
		model.addAttribute("all", all);
		return "cadetipofiliacao";
	}
	
	@RequestMapping(value="salvatipofiliacao", method = RequestMethod.POST)
	public String salvaTipoFiliacao(@RequestParam("descricao") String descricao,
			Model model) {
		
		
		TipoFiliacao tipofiliacao = new TipoFiliacao(descricao);
		service.save(tipofiliacao);
		
		Iterable<TipoFiliacao> all = service.findAll();
		model.addAttribute("all", all);
		return "cadetipofiliacao";
	}
	
	
}

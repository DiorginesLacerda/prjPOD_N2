package br.edu.qi.planetoffice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.qi.planetoffice.model.Religiao;
import br.edu.qi.planetoffice.service.ReligiaoService;

@Controller
public class ReligiaoController {

	@Autowired
	private ReligiaoService service;
	
	@RequestMapping("cadreligiao")
	public String listaReligiaos(Model model) {
		Iterable<Religiao> all = service.findAll();
		model.addAttribute("all", all);
		return "cadreligiao";
	}
	
	@RequestMapping(value="salvareligiao", method = RequestMethod.POST)
	public String salvadeReligiao(@RequestParam("descricao") String descricao,
			Model model) {
		
		
		Religiao religiao = new Religiao(descricao);
		service.save(religiao);
		
		Iterable<Religiao> all = service.findAll();
		model.addAttribute("all", all);
		return "cadreligiao";
	}
}

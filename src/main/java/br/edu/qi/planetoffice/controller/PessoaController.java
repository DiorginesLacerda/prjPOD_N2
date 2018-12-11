package br.edu.qi.planetoffice.controller;

import java.awt.List;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.qi.planetoffice.model.Deficiencia;
import br.edu.qi.planetoffice.model.Etnia;
import br.edu.qi.planetoffice.model.Pessoa;
import br.edu.qi.planetoffice.model.Religiao;
import br.edu.qi.planetoffice.model.Sexo;
import br.edu.qi.planetoffice.model.Telefone;
import br.edu.qi.planetoffice.service.DeficienciaService;
import br.edu.qi.planetoffice.service.EtniaService;
import br.edu.qi.planetoffice.service.PessoaService;
import br.edu.qi.planetoffice.service.ReligiaoService;
import br.edu.qi.planetoffice.service.SexoService;

@Controller
public class PessoaController {
	
	@Autowired
	PessoaService service;
	
	@Autowired
	EtniaService etniaService;
	
	@Autowired
	ReligiaoService religiaoService;
	
	@Autowired
	SexoService sexoService;
	
	@Autowired
	DeficienciaService deficienciaService;
	
	@RequestMapping("cadpessoas")
	public String listaPessoas(Model model) {
		Iterable<Pessoa> all = service.findAll();
		model.addAttribute("all", all);
		
		
		Iterable<Etnia> etnias = etniaService.findAll();
		Iterable<Religiao> religioes = religiaoService.findAll();
		Iterable<Sexo> sexos = sexoService.findAll();
		Iterable<Deficiencia> deficiencias = deficienciaService.findAll();
		
		
		return "cadpessoas";
	}
	
	
	
	@RequestMapping(value="salvapessoas", method = RequestMethod.POST)
	public String salvaPessoas(@RequestParam("etnia") Etnia etnia,
							@RequestParam("religiao") Religiao religiao,
							@RequestParam("sexo") Sexo sexo,
							@RequestParam("deficiencia") Integer IdDeficiencia,
							@RequestParam("cep") String cep,
							@RequestParam("logradouro") String logradouro,
							@RequestParam("nome") String nome,
							@RequestParam("nomeSocial") String nomeSocial,
							@RequestParam("telefone") Telefone telefone,
							Model model) {
		
		Set<Telefone> telefones = new HashSet<>();
		telefones.add(telefone);
		Deficiencia deficiencia = new Deficiencia();
		deficiencia.setIdDeficiencia(IdDeficiencia);
		Set<Deficiencia> deficiencias_pessoa = new HashSet<>();
		deficiencias_pessoa.add(deficiencia);
		
		
		Iterable<Pessoa> all = service.findAll();
		model.addAttribute("all", all);
		return "cadpessoas";
	}

}

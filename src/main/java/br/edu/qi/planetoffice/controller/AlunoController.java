package br.edu.qi.planetoffice.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.qi.planetoffice.model.Aluno;
import br.edu.qi.planetoffice.model.Deficiencia;
import br.edu.qi.planetoffice.model.Etnia;
import br.edu.qi.planetoffice.model.Filiacao;
import br.edu.qi.planetoffice.model.Pessoa;
import br.edu.qi.planetoffice.model.Religiao;
import br.edu.qi.planetoffice.model.Sexo;
import br.edu.qi.planetoffice.model.Telefone;
import br.edu.qi.planetoffice.model.TipoFiliacao;
import br.edu.qi.planetoffice.service.AlunoService;
import br.edu.qi.planetoffice.service.DeficienciaService;
import br.edu.qi.planetoffice.service.EtniaService;
import br.edu.qi.planetoffice.service.PessoaService;
import br.edu.qi.planetoffice.service.ReligiaoService;
import br.edu.qi.planetoffice.service.SexoService;
import br.edu.qi.planetoffice.service.TipoFiliacaoService;

@Controller
public class AlunoController {

	@Autowired
	private AlunoService service;
	
	@Autowired
	EtniaService etniaService;
	
	@Autowired
	ReligiaoService religiaoService;
	
	@Autowired
	SexoService sexoService;
	
	@Autowired
	DeficienciaService deficienciaService;
	
	@Autowired
	TipoFiliacaoService tipoFiliacaoService;
	
	@RequestMapping("cadalunos")
	public String listaAlunos(Model model) {
		Iterable<Aluno> all = service.findAll();
		
		
		Iterable<Etnia> etnias = etniaService.findAll();
		Iterable<Religiao> religioes = religiaoService.findAll();
		Iterable<Sexo> sexos = sexoService.findAll();
		Iterable<Deficiencia> deficiencias = deficienciaService.findAll();
		
		model.addAttribute("etnias", etnias);
		model.addAttribute("religioes", religioes);
		model.addAttribute("deficiencias", deficiencias);
		model.addAttribute("sexos", sexos);
		model.addAttribute("all", all);
		
		return "cadalunos";
	}
	
	
	@RequestMapping(value="salvaalunos", method = RequestMethod.POST)
	public String salvadeficiencias(@RequestParam("etnia") Etnia etnia,
						@RequestParam("religiao") Religiao religiao,
						@RequestParam("sexo") Sexo sexo,
						@RequestParam("deficiencia") Deficiencia deficiencia,
						//@RequestParam("cep") String cep,
						//@RequestParam("logradouro") String logradouro,
						@RequestParam("nome") String nome,
						@RequestParam("nomeSocial") String nomeSocial,
						@RequestParam("telefone") Telefone telefone,
						@RequestParam("tipofiliacao") TipoFiliacao tipoFiliacao,
						//@RequestParam("descFiliacao") String descFiliacao,
						@RequestParam("filiacao") Pessoa pessoaFiliacao,
						//@RequestParam("formaPagamento") String formaPagamento,
						Model model) {
		
		Filiacao filiacao = new Filiacao();
		filiacao.setTipoFiliacao(tipoFiliacao);
		//filiacao.setDescricao(descFiliacao);
		filiacao.setPessoa(pessoaFiliacao);
		Set<Filiacao> filiacoes = new HashSet<>();
		filiacoes.add(filiacao);
		
		
		Set<Telefone> telefones = new HashSet<>();
		telefones.add(telefone);
	
		Set<Deficiencia> deficiencias_pessoa = new HashSet<>();
		deficiencias_pessoa.add(deficiencia);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setFiliacaos(filiacoes);
		pessoa.setTelefones(telefones);
		pessoa.setDeficiencias(deficiencias_pessoa);
		pessoa.setEtnia(etnia);
		pessoa.setReligiao(religiao);
		pessoa.setSexo(sexo);
		//pessoa.setCep(Integer.parseInt(cep));
		//pessoa.setLogradouro(logradouro);
		pessoa.setNome(nome);
		pessoa.setNomeSocial(nomeSocial);
		
		
		Aluno aluno = new Aluno(pessoa, null);
		service.save(aluno);
		
		Iterable<Aluno> all = service.findAll();
		model.addAttribute("all", all);
		return "cadalunos";
	}
}

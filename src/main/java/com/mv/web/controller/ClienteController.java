package com.mv.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mv.domain.Pessoa;
import com.mv.domain.UF;
import com.mv.service.PessoaService;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private PessoaService pessoaService;
	
	@GetMapping("/cadastrar")
	public String cadastrar(Pessoa pessoa) {
		return "/cliente/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("pessoas", pessoaService.buscarTodos());
		return "/cliente/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Pessoa pessoa, RedirectAttributes attr) {
		pessoaService.salvar(pessoa);
		attr.addFlashAttribute("success", "Cliente inserido com sucesso.");
		return "redirect:/clientes/cadastrar";
	}	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("pessoa", pessoaService.buscarPorId(id));
		return "cliente/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(Pessoa pessoa, RedirectAttributes attr) {
		pessoaService.editar(pessoa);
		attr.addFlashAttribute("success", "Cliente editado com sucesso.");
		return "redirect:/clientes/cadastrar";
	}	
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, RedirectAttributes attr) {
		pessoaService.excluir(id);
		attr.addFlashAttribute("success", "Cliente removido com sucesso.");
		return "redirect:/clientes/listar";
	}
	
	@ModelAttribute("ufs")
	public UF[] getUFs() {
		return UF.values();
	}
}

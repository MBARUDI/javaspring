package br.sp.senai.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/aluno")
public class AlunoController {
	@GetMapping("/cadastro")
	public String novo() {
		return "/aluno/alunofrm";
	}
	
	@GetMapping("/xaxa")
	public String home(@RequestParam String nome, Model model) {
		model.addAttribute("aluno", nome);
		return "home";
	}

}

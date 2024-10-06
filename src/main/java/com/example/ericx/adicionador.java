package com.example.ericx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Adicionar")
public class adicionador {
	@Autowired
	private postService rep;

	@GetMapping
	public String mostrar(Model model) {
		model.addAttribute("postagem", new post());
		return "add";
	}

@PostMapping
public String adiciona(@ModelAttribute post postagem, Model model) {
	rep.Adicionar(postagem);
	System.out.println("Objeto adicionado");
	model.addAttribute("postagem", new post());
	return "add";
}
}

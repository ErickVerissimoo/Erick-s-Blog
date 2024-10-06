package com.example.ericx;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Home")
public class indexController {
	@Autowired
	postRepository rep;


	@GetMapping
	public String index(Model model) {
		 List <String> postagens = new ArrayList<>();

		for(String postagem : rep.AllIds()) {
			postagens.add(postagem);
		}

		model.addAttribute("Postagens", postagens);

		return "index";
	}
}

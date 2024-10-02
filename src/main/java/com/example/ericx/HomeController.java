package com.example.ericx;



import java.sql.Time;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
@Description("Controlador da página home")
public class HomeController {
	@Autowired
	post postagem;
	@Autowired
	postService servico;
	@GetMapping("/Home")
	public String index () {
		return "index";
	}
	
	@PostMapping("/Home")
	public void resposta(@RequestParam(required = true) String Titulo, @RequestParam(required = true) String body) {
	postagem.setDescricao(body);
	postagem.setTitulo(Titulo);
	LocalTime agora = LocalTime.now();
	Time time = Time.valueOf(agora);
	postagem.setHora(time);
	servico.Adicionar(postagem);
	}
}

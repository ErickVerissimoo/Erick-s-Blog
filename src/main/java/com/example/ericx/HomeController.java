package com.example.ericx;

import java.sql.Time;

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
	
	@GetMapping("/Home")
	public String index () {
		return "index";
	}
	
	@PostMapping("/Home")
	public void resposta(@RequestParam(required = false) String Titulo, @RequestParam(required = false) String body, @RequestParam(required = false) String hora) {
		
		if(Titulo!=null) {
			String titulo = Titulo;
			postagem.setTitulo(titulo);

		}
		
		if(body!= null) {
			String Body = body;
			postagem.setDescricao(Body);

		}
		if(hora !=null) {
			postagem.setHora(Time.valueOf(hora));

		}
		if(postagem.getDescricao() != null || postagem.getTitulo() !=null) {
			System.out.println("Deu certo!");
			System.out.println(postagem.getDescricao());
			
		}else {
			System.out.print("Deu errado");
		}
	}
}

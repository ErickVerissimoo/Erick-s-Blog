package com.example.ericx;

import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
@Description("Controlador da página home")
public class HomeController {
	@GetMapping("/Home")
	public String index () {
		return "index";
	}
}

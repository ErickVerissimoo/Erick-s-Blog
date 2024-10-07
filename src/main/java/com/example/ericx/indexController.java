package com.example.ericx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Home")
public class indexController {
	@Autowired
	postService rep;


	@GetMapping
	public String index(Model model) {
		

		

		model.addAttribute("Postagens", rep.todos());

		return "index";
	}
}

package com.example.ericx;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class teste {
	@Autowired
	postService rep;
	@Test
	public void testeOne() {
		var testagem = rep.todos();
		testagem.forEach((post e) -> System.out.print("\n\tTitulo: " + e.getTitulo() + "\n\tdescricao: " + e.getDescricao()));

	}
}

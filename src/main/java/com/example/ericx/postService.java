package com.example.ericx;

import java.sql.Time;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class postService {
	@Autowired
	private postRepository repositorio;

	public void Adicionar(post postagem) {
		postagem.setHora(Time.valueOf(LocalTime.now()));
		repositorio.save(postagem);
	}
	public List<String> todos() {
		return repositorio.AllIds();
	}
}

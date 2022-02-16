package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String getHello() {
		return "Hello Familia 44!";
	}
	@GetMapping("/familia44")
	public String getHello2() {
		return "A Família 44 é a melhor!";
	}
	@GetMapping("/mentalidades")
	public String getHello3() {
		return "Mentalidades: "
				+ "Mentalidade de crescimento, "
				+ "Responsabilidade pessoal, "
				+ "Persistência, "
				+ "Orientação ao futuro. "; 
	}
	@GetMapping("/habilidades")
	public String getHello4() {
		return "Habilidades: "
				+ "Trabalho em equipe, "
				+ "Proatividade, "
				+ "Comunicação, "
				+ "Orientação ao detalhe. ";
	}
}

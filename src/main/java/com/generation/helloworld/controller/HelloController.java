package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "<b>Hello Turma 68!!!</b>";
	}
	@GetMapping("/bsm")
	public String bsm() {
		return "<ul>" +
				"<h3><b>Mentalidade</b></h3>" +
                "<li>Orientação ao futuro</li>" +
                "<li>Mentalidade de Crescimento</li>" +
                "<li>Persistência</li>" +
                "<li>Responsabilidade Pessoal</li>" +
                "<br/><h3><b>Competência comportamentais</b></h3>" +
                "<li>Comunicação</li>" +
                "<li>Proatividade</li>" +
                "<li>Orientação ao detalhe</li>" +
                "<li>Trabalho em equipe</li>" +
                "</ul>";
    }
	 @GetMapping("/objetivos")
	    public String objetivos() {
	        return "<ul>" +
	                "<li>Criar um CRUD em spring </li>" +
	                "<li>Aprender melhor o uso de MySQL</li>" +
	                "<li>Boas praticas em commit de javas</li>" +
	                "</ul>";
	}
}

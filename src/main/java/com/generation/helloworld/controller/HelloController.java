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
	@GetMapping("/top")
	public String top() {
		return "<b>Hello Turma 68!!!</b>";
	}
}

package com.senacshoes.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senacshoes.api.DadosCadastroPaciente.DadosCadastroPaciente;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
	
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroPaciente dados) {
		System.out.println(dados);
	}
	
}

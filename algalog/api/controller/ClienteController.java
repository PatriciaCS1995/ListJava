package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

import lombok.var;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List <Cliente> listar () {
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("João");
		cliente1.setTelefone("47 3333-3333");
		cliente1.setEmail("joao@gmail.com");
	
		//podemos usar o var com o lombok
		var cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("11 11111-1111");
		cliente2.setEmail("maria@gmail.com");
	
	return Arrays.asList(cliente1,cliente2);
	}
	
	

}

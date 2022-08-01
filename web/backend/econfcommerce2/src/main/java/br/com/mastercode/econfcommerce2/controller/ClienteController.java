package br.com.mastercode.econfcommerce2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mastercode.econfcommerce2.model.Cliente;
import br.com.mastercode.econfcommerce2.repository.ClienteRepository;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/clientes") 
@AllArgsConstructor
@Component
public class ClienteController {
	
    @Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> list(){
		return clienteRepository.findAll();
	}
}

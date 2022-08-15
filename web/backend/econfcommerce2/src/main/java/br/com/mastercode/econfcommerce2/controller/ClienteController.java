package br.com.mastercode.econfcommerce2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.mastercode.econfcommerce2.model.Clientes;
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
	public @ResponseBody List<Clientes> list() {
        return clienteRepository.findAll();
    }

    //@RequestMapping(method = RequestMethod.POST)
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Clientes create(@RequestBody Clientes clientes) {
        // System.out.println(cliente.getName());
        return clienteRepository.save(clientes);
        // return ResponseEntity.status(HttpStatus.CREATED)
        //     .body(courseRepository.save(cliente));
    }
}

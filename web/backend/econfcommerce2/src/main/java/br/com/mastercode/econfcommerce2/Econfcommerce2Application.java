package br.com.mastercode.econfcommerce2;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import br.com.mastercode.econfcommerce2.model.Clientes;
import br.com.mastercode.econfcommerce2.repository.ClienteRepository;


@SpringBootApplication
public class Econfcommerce2Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Econfcommerce2Application.class, args);
		
		
	}
	@Bean
	CommandLineRunner initDatabase(
			ClienteRepository clienteRepository
			
			){
		return args ->{
			
			clienteRepository.deleteAll();
			Clientes c = new Clientes();
			
			

     		
     		
     		
     		
			
			c.setNome("João Albuquerque");
			c.setSenha("admin123");
            c.setCpf("12345678912");
			c.setTelefone("112323-5546");
			c.setEmail("joao@mail.com");
			c.setEndereco("Rua: do João");
			c.setEstado("SP");
			c.setCidade("Taboao da Serra");
			c.setNumCartaoC("3345-6789-x");
			c.setNumCartaoD("1245-6733-x");
			c.setSenhaCartC("34346721");
			c.setSenhaCartD("11226799");
			
			Clientes d = new Clientes();
			d.setNome("Patricia souza");
			d.setSenha("admin123");
            d.setCpf("12345678912");
			d.setTelefone("112323-5546");
			d.setEmail("patricia@mail.com");
			d.setEndereco("Rua: do Patricia");
			d.setEstado("SP");
			d.setCidade("Cotia");
			d.setNumCartaoC("3345-6789-x");
			d.setNumCartaoD("1245-6733-x");
			d.setSenhaCartC("34346721");
			d.setSenhaCartD("11226799");
			clienteRepository.save(c);
			clienteRepository.save(d);
			
			
		};
	}
	
	

}

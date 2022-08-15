package br.com.mastercode.econfcommerce2;




import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.mastercode.econfcommerce2.domain.Cliente;
import br.com.mastercode.econfcommerce2.domain.Pedido;
import br.com.mastercode.econfcommerce2.domain.Vendedor;
import br.com.mastercode.econfcommerce2.domain.enums.Perfil;
import br.com.mastercode.econfcommerce2.domain.enums.Prioridade;
import br.com.mastercode.econfcommerce2.domain.enums.Status;
import br.com.mastercode.econfcommerce2.model.Clientes;
import br.com.mastercode.econfcommerce2.repository.ClienteRepository;
import br.com.mastercode.econfcommerce2.repository.PedidoRepository;
import br.com.mastercode.econfcommerce2.repository.VendedorRepository;


@SpringBootApplication
public class Econfcommerce2Application implements CommandLineRunner {
	
	@Autowired
	private VendedorRepository vendedorRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;

	private Object cli1;
	
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
			
			Clientes e = new Clientes();
			
            e.setNome("Joana Dark");
			e.setSenha("admin333");
            e.setCpf("12345678912");
			e.setTelefone("112323-5546");
			e.setEmail("joana@mail.com");
			e.setEndereco("Rua: da Joana");
			e.setEstado("SP");
			e.setCidade("Ibirapuera");
			e.setNumCartaoC("3345-6789-x");
			e.setNumCartaoD("1245-6733-x");
			e.setSenhaCartC("34346721");
			e.setSenhaCartD("11226799");
			clienteRepository.save(c);
			clienteRepository.save(d);
			clienteRepository.save(e);
			
			Pedido vend1 = null;
			Cliente cli1 = null;
			Pedido p1  = new Pedido(null, Prioridade.MEDIA, Status.ANDAMENTO, "Pedido 01", "Primeiro Pedido", 
					vend1,cli1);

			
			
		};
	}
	@Override
	public void run(String... args) throws Exception {
		Vendedor vend1 = new Vendedor(null,"joao noronha","253.467.340-82","joao@mail.com","123");
		vend1.addPerfil(Perfil.ADMIN);
		
		//Para Evitar dar um Add toda vez
		vendedorRepository.saveAll(Arrays.asList(vend1));
		//clienteRepository.saveAll(Arrays.asList(cli1));
	   // pedidoRepository.saveAll(Arrays.asList(p1));
		
		
	}
	
	

}

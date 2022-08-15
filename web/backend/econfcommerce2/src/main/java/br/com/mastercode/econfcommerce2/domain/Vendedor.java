package br.com.mastercode.econfcommerce2.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import br.com.mastercode.econfcommerce2.domain.enums.Perfil;

@Entity
public class Vendedor extends Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//Um Vendedor Para Muitos Chamados
	@OneToMany(mappedBy = "vendedor")
	private List<Pedido> pedidos = new ArrayList<>();

	//SuperClass Gera um Codigo toda Vez que Instancia um Novo Objeto
	public Vendedor() {
		super();
		addPerfil(Perfil.CLIENTE);
	}

	public Vendedor(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
		addPerfil(Perfil.CLIENTE);
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	
	
	

}

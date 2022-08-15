package br.com.mastercode.econfcommerce2.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mastercode.econfcommerce2.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

	

}

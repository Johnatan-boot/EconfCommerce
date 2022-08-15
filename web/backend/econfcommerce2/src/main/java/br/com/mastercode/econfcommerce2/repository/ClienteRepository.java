package br.com.mastercode.econfcommerce2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mastercode.econfcommerce2.model.Clientes;

@Repository
public interface ClienteRepository extends JpaRepository<Clientes, Long>{

	

}

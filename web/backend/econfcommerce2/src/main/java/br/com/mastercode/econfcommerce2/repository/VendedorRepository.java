package br.com.mastercode.econfcommerce2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mastercode.econfcommerce2.domain.Pessoa;
import br.com.mastercode.econfcommerce2.domain.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Integer> {

}

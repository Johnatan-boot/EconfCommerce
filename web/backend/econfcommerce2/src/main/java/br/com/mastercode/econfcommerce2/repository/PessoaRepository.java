package br.com.mastercode.econfcommerce2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mastercode.econfcommerce2.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}

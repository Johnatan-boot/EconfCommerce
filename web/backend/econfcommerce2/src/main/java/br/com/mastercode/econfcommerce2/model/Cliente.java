package br.com.mastercode.econfcommerce2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("_id")
	private Long id;
	@Column(length = 200, nullable = false)
	private String nome;
	@Column(length = 200, nullable = false)
	private String cpf;
	@Column(length = 200, nullable = false)
	private String telefone;
	@Column(length = 200, nullable = false)
	private String email;
	@Column(length = 200, nullable = false)
	private String senha;
	@Column(length = 200, nullable = false)
	private String endereco;
	@Column(length = 200, nullable = false)
	private String cidade;
	@Column(length = 200, nullable = false)
	private String estado;
	@Column(length = 200, nullable = false)
	private String numCartaoC;
	@Column(length = 200, nullable = false)
	private String numCartaoD;
	@Column(length = 200, nullable = false)
	private String SenhaCartC;
	@Column(length = 200, nullable = false)
	private String SenhaCartD;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNumCartaoC() {
		return numCartaoC;
	}
	public void setNumCartaoC(String numCartaoC) {
		this.numCartaoC = numCartaoC;
	}
	public String getNumCartaoD() {
		return numCartaoD;
	}
	public void setNumCartaoD(String numCartaoD) {
		this.numCartaoD = numCartaoD;
	}
	public String getSenhaCartC() {
		return SenhaCartC;
	}
	public void setSenhaCartC(String senhaCartC) {
		SenhaCartC = senhaCartC;
	}
	public String getSenhaCartD() {
		return SenhaCartD;
	}
	public void setSenhaCartD(String senhaCartD) {
		SenhaCartD = senhaCartD;
	}

	
	

	
}

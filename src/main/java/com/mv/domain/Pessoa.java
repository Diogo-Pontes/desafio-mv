package com.mv.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@SuppressWarnings("serial")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "PESSOA")
public class Pessoa extends AbstractEntity<Long> {

	@Column(name = "NOME", nullable = false, length = 60)
	private String nome;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "DATA_INCLUSAO", nullable = false, columnDefinition = "DATE")
	private LocalDate dataInclusao;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID_ENDERECO_FK")
	private Endereco endereco;
	
	@OneToMany(mappedBy = "pessoa") 
	private List<Telefone> telefones;
	
	@OneToMany(mappedBy = "pessoa") 
	private List<Conta> contas;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(LocalDate dataInclusao) {
		this.dataInclusao = dataInclusao;
	}
	public List<Telefone> getTelefones() { 
		return telefones; 
	}
	
	public void setTelefones(List<Telefone> telefones) { 
		this.telefones = telefones; 
	}

	public List<Conta> getContas() { 
		return contas; 
	}
	
	public void setContas(List<Conta> contas) { 
		this.contas = contas; 
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}

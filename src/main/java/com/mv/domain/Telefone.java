package com.mv.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "TELEFONE")
public class Telefone extends AbstractEntity<Long> {

	@Column(name = "NUMERO", nullable = false)
	private String numero;
	
	@ManyToOne
	@JoinColumn(name = "ID_PESSOA_FK")
	private Pessoa pessoa;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}

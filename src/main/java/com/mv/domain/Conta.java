package com.mv.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "CONTA")
public class Conta extends AbstractEntity<Long> {

	@Column(name = "CODIGO", nullable = false, length = 20)
	private String codigo;
	
	@ManyToOne
	@JoinColumn(name = "ID_PESSOA_FK")
	private Pessoa pessoa;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}

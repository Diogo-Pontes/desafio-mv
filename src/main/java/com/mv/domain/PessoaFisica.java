package com.mv.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@PrimaryKeyJoinColumn(name="id")
public class PessoaFisica extends Pessoa {
	
	@Column(name = "CPF", nullable = false, length = 14)
	private String cpf;/*
						 * 
						 * @OneToOne
						 * 
						 * @JoinColumn(name = "ID_PESSOA_FK") private Pessoa pessoa;
						 */

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/*
	 * public Pessoa getPessoa() { return pessoa; }
	 * 
	 * public void setPessoa(Pessoa pessoa) { this.pessoa = pessoa; }
	 */
}

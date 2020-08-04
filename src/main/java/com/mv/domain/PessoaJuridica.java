package com.mv.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@PrimaryKeyJoinColumn(name="id")
public class PessoaJuridica extends Pessoa {
	
	@Column(name = "CNPJ", nullable = false, length = 14)
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}

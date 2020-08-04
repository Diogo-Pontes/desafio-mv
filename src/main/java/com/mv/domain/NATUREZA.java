package com.mv.domain;

public enum NATUREZA {
	D("D", "Débito"), 
	C("C", "Crédito");
	
	private String sigla;
	private String descricao;
	
	NATUREZA(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricao() {
		return descricao;
	}
	
}

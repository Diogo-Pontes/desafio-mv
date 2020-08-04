package com.mv.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "LANCAMENTO")
public class Lancamento extends AbstractEntity<Long> {

	@Column(name = "NATUREZA", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	private NATUREZA natureza;
	
	@Column(name = "DATA_INCLUSAO", nullable = false, columnDefinition = "DATE")
	private LocalDate dataInclusao;

	@Column(name = "VALOR", nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name = "ID_CONTA_FK")
	private Conta conta;
	
	@ManyToOne
	@JoinColumn(name = "ID_PESSOA_FK")
	private Pessoa pessoa;

	public NATUREZA getNatureza() {
		return natureza;
	}

	public void setNatureza(NATUREZA natureza) {
		this.natureza = natureza;
	}

	public LocalDate getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(LocalDate dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}

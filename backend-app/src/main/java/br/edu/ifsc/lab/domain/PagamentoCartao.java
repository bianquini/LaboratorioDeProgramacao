package br.edu.ifsc.lab.domain;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import br.edu.ifsc.lab.domain.enums.EstadoPagamento;

@Entity
@PrimaryKeyJoinColumn(name = "id_pagamento")
public class PagamentoCartao extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Integer parcelas;

	public PagamentoCartao() {

	}

	public PagamentoCartao(Integer id, EstadoPagamento estadoPagamento, Venda venda, Integer parcelas) {
		super(id, estadoPagamento, venda);
		this.parcelas = parcelas;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}

}

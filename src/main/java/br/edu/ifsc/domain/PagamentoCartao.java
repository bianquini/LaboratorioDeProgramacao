package br.edu.ifsc.domain;

import br.edu.ifsc.domain.enums.EstadoPagamento;

public class PagamentoCartao extends Pagamento {

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

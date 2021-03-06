package br.edu.ifsc.lab.domain;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeName;

import br.edu.ifsc.lab.domain.enums.EstadoPagamento;

/*
* Classe representando a forma de pagamento que o {@link Usuario} utilizará ao  realizar uma compra {@link Venda}
* Esta classe estende a classe {@link Pagamento}
*/

@Entity
@JsonTypeName("pagamentoAVista")
public class PagamentoAVista extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Double pagamento;

	public PagamentoAVista() {

	}

	public PagamentoAVista(Integer id, EstadoPagamento estadoPagamento, Venda venda, Double pagamento) {
		super(id, estadoPagamento, venda);
		this.pagamento = pagamento;
	}

	public Double getPagamento() {
		return pagamento;
	}

	public void setPagamento(Double pagamento) {
		this.pagamento = pagamento;
	}
}

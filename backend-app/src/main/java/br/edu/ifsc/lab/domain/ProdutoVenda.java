package br.edu.ifsc.lab.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@PrimaryKeyJoinColumn(name = "id_produto")
public class ProdutoVenda extends Produto {
	private static final long serialVersionUID = 1L;

	private Double valor;
	private String especificacoes;
	private Integer estoque;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "categoria_id")
	private Categoria categoria = new Categoria();
	
	@OneToMany(mappedBy = "id.produtoVenda")
	private Set<ItemVenda> itens = new HashSet<>();

	public ProdutoVenda() {

	}

	public Double getValor() {
		return valor;
	}

	public ProdutoVenda(Integer id, String marca, String modelo, Double valor, String especificacoes, Integer estoque,
			Categoria categoria) {
		super(id, marca, modelo);
		this.valor = valor;
		this.especificacoes = especificacoes;
		this.estoque = estoque;
		this.categoria = categoria;
	}

	public List<Venda> getVendas() {
		List<Venda> lista = new ArrayList<>();
		for (ItemVenda x : itens) {
			lista.add(x.getVenda());
		}
		return lista;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getEspecificacoes() {
		return especificacoes;
	}

	public void setEspecificacoes(String especificacoes) {
		this.especificacoes = especificacoes;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Set<ItemVenda> getItens() {
		return itens;
	}

	public void setItens(Set<ItemVenda> itens) {
		this.itens = itens;
	}

}

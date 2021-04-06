package br.com.fiap.decorator;

import java.math.BigDecimal;

public class Pedido {
	private BigDecimal valor;
	private int quantidadeItens;

	public Pedido(BigDecimal valor) {
		this.valor = valor;
		this.quantidadeItens = 1;
	}
	
	public Pedido(BigDecimal valor, int quantidade) {
		this.valor = valor;
		this.quantidadeItens = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}
	
	
	
}

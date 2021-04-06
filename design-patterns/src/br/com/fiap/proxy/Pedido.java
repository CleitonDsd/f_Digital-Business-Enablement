package br.com.fiap.proxy;

import java.math.BigDecimal;

public class Pedido implements PedidoInterface {
	private BigDecimal valor;
	private int quantidadeItens;
	public PedidoHandler handler;

	public Pedido(BigDecimal valor) {
		this.valor = valor;
		this.quantidadeItens = 1;
		this.handler = new PedidoHandler();
	}
	
	public Pedido(BigDecimal valor, int quantidade) {
		this.valor = valor;
		this.quantidadeItens = quantidade;
		this.handler = new PedidoHandler();
	}

	@Override
	public BigDecimal getValor() {
		// Simular uma demora na requisição
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return valor;
	}

	@Override
	public int getQuantidadeItens() {
		return quantidadeItens;
	}	
	
	
}

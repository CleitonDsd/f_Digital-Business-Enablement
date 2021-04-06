package br.com.fiap.proxy;

import java.math.BigDecimal;

public class PedidoProxy implements PedidoInterface{
	
	private Pedido pedidoOriginal;
	private BigDecimal valor;
	
	public PedidoProxy(Pedido pedido) {
		this.pedidoOriginal = pedido;
	}

	public BigDecimal getValor() {
		if (this.valor == null) {
			this.valor = pedidoOriginal.getValor();
		}
		return this.valor;
	}

	public int getQuantidadeItens() {
		return pedidoOriginal.getQuantidadeItens();
	}
	
}

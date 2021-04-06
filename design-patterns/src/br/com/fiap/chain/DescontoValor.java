package br.com.fiap.chain;

import java.math.BigDecimal;

import br.com.fiap.strategy.Pedido;

public class DescontoValor extends Desconto {

	public DescontoValor(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		if (pedido.getValor().compareTo(new BigDecimal("500")) > 0) {
			return pedido.getValor().multiply(new BigDecimal("0.1"));
		}
		
		return proximo.calcular(pedido);
	}
	
}

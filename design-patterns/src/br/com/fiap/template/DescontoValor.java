package br.com.fiap.template;

import java.math.BigDecimal;

import br.com.fiap.strategy.Pedido;

public class DescontoValor extends Desconto {

	public DescontoValor(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal aplicar(Pedido pedido) {
		return pedido.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	protected boolean deveAplicar(Pedido pedido) {
		return pedido.getValor().compareTo(new BigDecimal("500")) > 0;
	}
	
}

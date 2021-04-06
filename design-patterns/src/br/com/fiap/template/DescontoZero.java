package br.com.fiap.template;

import java.math.BigDecimal;

import br.com.fiap.strategy.Pedido;

public class DescontoZero extends Desconto{

	public DescontoZero() {
		super(null);
	}

	@Override
	public BigDecimal aplicar(Pedido pedido) {
		return BigDecimal.ZERO;
	}

	@Override
	protected boolean deveAplicar(Pedido pedido) {
		return true;
	}
	
}

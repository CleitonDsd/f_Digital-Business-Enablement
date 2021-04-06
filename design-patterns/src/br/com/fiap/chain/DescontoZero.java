package br.com.fiap.chain;

import java.math.BigDecimal;

import br.com.fiap.strategy.Pedido;

public class DescontoZero extends Desconto{

	public DescontoZero() {
		super(null);
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		return BigDecimal.ZERO;
	}
	
}

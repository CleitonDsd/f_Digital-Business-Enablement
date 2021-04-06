package br.com.fiap.template;

import java.math.BigDecimal;

import br.com.fiap.strategy.Pedido;

public class DescontoQtd extends Desconto{

	public DescontoQtd(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal aplicar(Pedido pedido) {
		return pedido.getValor().multiply(new BigDecimal("0.05"));
	}


	@Override
	protected boolean deveAplicar(Pedido pedido) {
		return pedido.getQuantidadeItens() > 10;
	}
	
}

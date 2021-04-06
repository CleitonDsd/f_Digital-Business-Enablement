package br.com.fiap.chain;

import java.math.BigDecimal;

import br.com.fiap.strategy.Pedido;

public class DescontoQtd extends Desconto{

	public DescontoQtd(Desconto proximo) {
		super(proximo);
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		if (pedido.getQuantidadeItens() > 10) {
			return pedido.getValor().multiply(new BigDecimal("0.05"));
		}
		
		return proximo.calcular(pedido);
	}
	
}

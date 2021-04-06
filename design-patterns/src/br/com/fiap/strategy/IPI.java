package br.com.fiap.strategy;

import java.math.BigDecimal;

public class IPI implements Imposto{

	@Override
	public BigDecimal calcular(Pedido pedido) {
		// TODO Auto-generated method stub
		return pedido.getValor().multiply(new BigDecimal("0.05"));
	}

}

package br.com.fiap.strategy;

import java.math.BigDecimal;

public interface Imposto {
	public BigDecimal calcular(Pedido pedido);
}

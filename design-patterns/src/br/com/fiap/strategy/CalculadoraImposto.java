package br.com.fiap.strategy;

import java.math.BigDecimal;

public class CalculadoraImposto {
	
	private Imposto imposto;
	
	public CalculadoraImposto(Imposto imposto) {
		this.imposto = imposto;
	}

	public BigDecimal calcular(Pedido pedido) {
		return imposto.calcular(pedido);
	}

	public void setImpost(Imposto imposto) {
		this.imposto = imposto;
	}
}

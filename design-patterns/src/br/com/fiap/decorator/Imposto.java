package br.com.fiap.decorator;

import java.math.BigDecimal;

public abstract class Imposto {
	
	protected Imposto outroImposto;
	
	public Imposto(Imposto imposto) {
		this.outroImposto = imposto;
	}
	
	public abstract BigDecimal calcular(Pedido pedido);
}

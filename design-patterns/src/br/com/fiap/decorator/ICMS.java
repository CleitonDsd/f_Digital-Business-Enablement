package br.com.fiap.decorator;

import java.math.BigDecimal;

public class ICMS extends Imposto {
	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		// TODO Auto-generated method stub
		BigDecimal valorDoImposto = pedido.getValor().multiply(new BigDecimal("0.1"));
		BigDecimal valorOutroImposto = BigDecimal.ZERO;
		
		if (outroImposto != null) {
			valorOutroImposto = outroImposto.calcular(pedido);
		}
		
		return valorDoImposto.add(valorOutroImposto);
	}
	
}

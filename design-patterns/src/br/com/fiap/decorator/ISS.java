package br.com.fiap.decorator;

import java.math.BigDecimal;

public class ISS extends Imposto {

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		// TODO Auto-generated method stub
		BigDecimal valorDoImposto = pedido.getValor().multiply(new BigDecimal("0.03"));
		BigDecimal valorOutroImposto = BigDecimal.ZERO;
		
		if (outroImposto != null) {
			valorOutroImposto = outroImposto.calcular(pedido);
		}
		
		return valorDoImposto.add(valorOutroImposto);
	}
	
	
}

package br.com.fiap.chain;

import java.math.BigDecimal;

import br.com.fiap.strategy.Pedido;

public class CalculadoraDesconto {
	public BigDecimal calcular(Pedido pedido) {
		
		Desconto cadeiaDesconto = 
				new DescontoValor( 
				new DescontoQtd( 
				new DescontoZero()));
		
		return cadeiaDesconto.calcular(pedido);
	}
}

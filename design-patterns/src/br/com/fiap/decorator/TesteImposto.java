package br.com.fiap.decorator;

import java.math.BigDecimal;

public class TesteImposto {
	public static void main(String[] args) {
		// Usando Decorator, aplicamos ICMS e IPI e ISS
		CalculadoraImposto calculadoraImposto = new CalculadoraImposto( new ICMS(new IPI(new ISS(null))));
		Pedido pedido = new Pedido(new BigDecimal("100"));
		
		BigDecimal imposto = calculadoraImposto.calcular(pedido);
		
		System.out.println(imposto);
	}
}

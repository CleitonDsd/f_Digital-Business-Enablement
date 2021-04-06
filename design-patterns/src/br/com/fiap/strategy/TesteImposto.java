package br.com.fiap.strategy;

import java.math.BigDecimal;

public class TesteImposto {
	public static void main(String[] args) {
		CalculadoraImposto calculadoraImposto = new CalculadoraImposto( new IPI());
		Pedido pedido = new Pedido(new BigDecimal("100"));
		
		BigDecimal imposto = calculadoraImposto.calcular(pedido);
		
		System.out.println(imposto);
		
		// trocar a estrat�gia
		calculadoraImposto.setImpost(new ICMS());
		imposto = calculadoraImposto.calcular(pedido);
		System.out.println(imposto);
	}
}

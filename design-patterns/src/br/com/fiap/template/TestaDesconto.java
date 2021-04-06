package br.com.fiap.template;

import java.math.BigDecimal;

import br.com.fiap.strategy.Pedido;

public class TestaDesconto {
	public static void main(String[] args) {
		CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
		
		Pedido pedido = new Pedido(new BigDecimal("100"), 15);
		
		BigDecimal desconto = calculadoraDesconto.calcular(pedido);
		
		System.out.println(desconto);
	}
}

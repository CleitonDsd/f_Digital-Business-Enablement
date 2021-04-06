package br.com.fiap.proxy;

import java.math.BigDecimal;

public class TesteSituacao {
	public static void main(String[] args) {
		Pedido pedidoOriginal = new Pedido(new BigDecimal("100"));
		PedidoInterface pedido = new PedidoProxy( pedidoOriginal );
		
		System.out.println(pedido.getValor());
		
		System.out.println("aguardando getValor() novamente...");
		
		System.out.println(pedido.getValor());
	}
}

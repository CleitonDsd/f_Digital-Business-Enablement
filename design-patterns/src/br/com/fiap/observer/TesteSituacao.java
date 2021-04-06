package br.com.fiap.observer;

import java.math.BigDecimal;

public class TesteSituacao {
	public static void main(String[] args) {
		Pedido pedido = new Pedido(new BigDecimal("100"));
		
		pedido.handler.subscribe(new EmailListener());
		pedido.handler.subscribe(new LogListener());
		
		pedido.pagar();
		pedido.entregar();
		pedido.abrirChamado();
	}
}

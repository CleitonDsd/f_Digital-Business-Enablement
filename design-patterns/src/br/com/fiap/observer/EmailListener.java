package br.com.fiap.observer;

public class EmailListener implements EventListener{

	@Override
	public void update(Pedido pedido) {
		System.out.println("Enviado email para o pedido: " + pedido.getSituacao());
	}
	
}

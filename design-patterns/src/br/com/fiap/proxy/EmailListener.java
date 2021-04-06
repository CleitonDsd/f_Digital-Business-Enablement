package br.com.fiap.proxy;

public class EmailListener implements EventListener{

	@Override
	public void update(PedidoInterface pedido) {
		System.out.println("Enviado email para o pedido: " + pedido);
	}
	
}

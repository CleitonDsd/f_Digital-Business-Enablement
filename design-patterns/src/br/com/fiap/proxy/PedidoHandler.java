package br.com.fiap.proxy;

import java.util.ArrayList;
import java.util.List;

public class PedidoHandler {
	
	private List<EventListener> listeners;
	
	public PedidoHandler( ) {
		this.listeners = new ArrayList<EventListener>();
	}
	
	public void subscribe(EventListener listener) {
		listeners.add(listener);
	}
	
	public void unsubscribe(EventListener listener) {
		listeners.remove(listener);
	}
	
	public void notify(PedidoInterface pedido) {
		// Lambda Function
		listeners.forEach(listener -> listener.update(pedido));
	}
	
}

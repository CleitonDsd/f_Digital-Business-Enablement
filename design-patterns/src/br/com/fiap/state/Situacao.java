package br.com.fiap.state;

public abstract class Situacao {
	
	/*
	 * aberto 
	 * pago
	 * entregue
	 * cancelado
	 */
	
	public abstract void abrirChamado();
	
	public void pagar(Pedido pedido) {
		throw new StateException("n�o pode transitar para pago");
	}
	
	public void entregar(Pedido pedido) {
		throw new StateException("n�o pode transitar para entregue");
	}
	
	public void cancelar(Pedido pedido) {
		throw new StateException("n�o pode transitar para cancelado");
	}
	
	public void reabrir(Pedido pedido) {
		throw new StateException("n�o pode transitar para aberto");
	}
}

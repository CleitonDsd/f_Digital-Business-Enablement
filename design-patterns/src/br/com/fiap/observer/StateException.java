package br.com.fiap.observer;

public class StateException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public StateException(String mensagem) {
		super(mensagem);
	}
}

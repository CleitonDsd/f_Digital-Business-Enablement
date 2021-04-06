package br.com.fiap.state;

public class StateException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public StateException(String mensagem) {
		super(mensagem);
	}
}

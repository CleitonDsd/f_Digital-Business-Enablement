package br.com.fiap.state;

public class Entregue extends Situacao {

	@Override
	public void abrirChamado() {
		System.out.println("Chamado para pos venda");
	}

}

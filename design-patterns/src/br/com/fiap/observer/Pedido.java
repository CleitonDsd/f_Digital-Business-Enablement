package br.com.fiap.observer;

import java.math.BigDecimal;

public class Pedido {
	private BigDecimal valor;
	private int quantidadeItens;
	private Situacao situacao;
	public PedidoHandler handler;

	public Pedido(BigDecimal valor) {
		this.valor = valor;
		this.quantidadeItens = 1;
		this.situacao = new Aberto();
		this.handler = new PedidoHandler();
	}
	
	public Pedido(BigDecimal valor, int quantidade) {
		this.valor = valor;
		this.quantidadeItens = quantidade;
		this.situacao = new Aberto();
		this.handler = new PedidoHandler();
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
		this.handler.notify(this);
	}
	
	public Situacao getSituacao() {
		return situacao;
	}
	
	public void abrirChamado() {
		this.situacao.abrirChamado();
	}
	
	public void pagar() {
		this.situacao.pagar(this);
	}
	
	public void entregar() {
		this.situacao.entregar(this);
	}
	
	public void cancelar() {
		this.situacao.cancelar(this);
	}
	
	public void reabrir() {
		this.situacao.reabrir(this);
	}
	
	
	
}

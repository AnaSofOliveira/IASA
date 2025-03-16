package jogo.maquest;

import java.util.HashMap;

public class Estado<EV> {
	
	private String nome;
	private HashMap<EV,Estado<EV>> transicoes;
	
	
	public Estado(String nome) {
		this.nome = nome;
		this.transicoes = new HashMap<EV,Estado<EV>>();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Estado<EV> transicao(EV evento, Estado<EV> estado) {
		this.transicoes.put(evento, estado);
		return this;
	}
	
	public Estado<EV> processar(EV evento) {
		return this.transicoes.get(evento);
	}
	
	public String toString() {
		return nome;

	}

}

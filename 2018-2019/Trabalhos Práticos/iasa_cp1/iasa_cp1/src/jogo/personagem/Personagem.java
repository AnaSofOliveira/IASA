package jogo.personagem;

import jogo.ambiente.Ambiente;
import jogo.personagem.comport.ComportPersonagem;
import jogo.reaccao.Accao;
import jogo.reaccao.Estimulo;

public class Personagem {
	
	private Ambiente ambiente;
	private ComportPersonagem comport;
	
	public Personagem(Ambiente ambiente) {
		this.ambiente = ambiente;
		comport = new ComportPersonagem();
	}
	
	public void executar() {
		Estimulo estimulo = this.percepcionar();
		Accao accao = this.processar(estimulo);
		this.actuar(accao);
		
		this.mostrar();
	}
	
	private Estimulo percepcionar() {
		return ambiente.getEvento();
	}
	
	private Accao processar(Estimulo estimulo) {
		return comport.activar(estimulo);
	}
	
	private void actuar (Accao accao) {
		if(accao != null) {
			accao.executar();
		}
	}
	
	private void mostrar() {
		System.out.printf("Estado: %s\n", comport.getEstado());
	}
}

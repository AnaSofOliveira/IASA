package project_java.tp1.jogo;

import project_java.tp1.ambiente.Ambiente;
import project_java.tp1.ambiente.EventoAmb;
import project_java.tp1.personagem.Personagem;

public class Jogo {
			
	
	private Ambiente ambiente;
	private Personagem personagem;
	
	public Jogo() {
		ambiente = new Ambiente();
		personagem = new Personagem(ambiente);
		
		this.executarJogo();
	}
	
	private void executarJogo() {
		EventoAmb evento = null;
		while(evento != EventoAmb.TERMINAR){
			
			personagem.executar();
			
			ambiente.evoluir();
			
			evento = ambiente.obterEvento();
			
			if (evento == EventoAmb.TERMINAR){
				return;
			}
			
		}
		
	}

}

package jogo.reaccao;

public class Reaccao implements Comportamento{

	private Estimulo estimulo;
	private Accao resposta;
	
	public Reaccao(Estimulo estimulo, Accao resposta) {
		this.estimulo = estimulo;
		this.resposta = resposta;
	}
	
	public Accao activar (Estimulo estimulo) {
		// Se o estimulo a ativar foi igual ao estimulo da Reacção, 
		// gera a accção correspondente ao par Estimulo/Resposta
		if (this.estimulo == estimulo) {
			return this.resposta;
		}else {
			return null;
		}
	}
	
}

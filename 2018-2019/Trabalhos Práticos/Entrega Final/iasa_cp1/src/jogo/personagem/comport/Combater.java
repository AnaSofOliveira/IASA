package jogo.personagem.comport;

import jogo.ambiente.AccaoAmb;
import jogo.ambiente.EventoAmb;
import jogo.reaccao.ComportHierarq;
import jogo.reaccao.Comportamento;
import jogo.reaccao.Reaccao;

public class Combater extends ComportHierarq{
	
	public Combater() {
		super(new Comportamento[] {
			new Reaccao(EventoAmb.INIMIGO, AccaoAmb.ATACAR),
			new Reaccao(EventoAmb.DERROTA, AccaoAmb.INICIAR)	
		});
	}
}

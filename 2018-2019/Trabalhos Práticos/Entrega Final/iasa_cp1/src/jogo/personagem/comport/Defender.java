package jogo.personagem.comport;

import jogo.ambiente.AccaoAmb;
import jogo.ambiente.EventoAmb;
import jogo.reaccao.ComportHierarq;
import jogo.reaccao.Comportamento;
import jogo.reaccao.Reaccao;

public class Defender extends ComportHierarq{
	
	public Defender() {
		super(new Comportamento[] {
			new Reaccao(EventoAmb.INIMIGO, AccaoAmb.DEFENDER)	
		});
	}
}

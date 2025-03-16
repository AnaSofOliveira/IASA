package jogo.personagem.comport;

import jogo.ambiente.AccaoAmb;
import jogo.ambiente.EventoAmb;
import jogo.reaccao.ComportHierarq;
import jogo.reaccao.Comportamento;
import jogo.reaccao.Reaccao;

public class Inspeccionar extends ComportHierarq{
	
	public Inspeccionar() {
		super(new Comportamento[] {
				new Reaccao(EventoAmb.INIMIGO, AccaoAmb.APROXIMAR),
				new Reaccao(EventoAmb.RUIDO, AccaoAmb.PROCURAR)
		});
	}
}

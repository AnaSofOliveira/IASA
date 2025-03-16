package project_java.tp1.comport;

import project_java.tp1.ambiente.AccaoAmb;
import project_java.tp1.ambiente.EventoAmb;

public class Patrulhar extends ComportHierarq {
	
	public Patrulhar() {
		super(new Comportamento[]{
				new Reaccao(EventoAmb.SILENCIO, AccaoAmb.PATRULHAR), 
				new Reaccao(EventoAmb.RUIDO, AccaoAmb.APROXIMAR),
				new Reaccao(EventoAmb.INIMIGO, AccaoAmb.APROXIMAR)});
	}

}

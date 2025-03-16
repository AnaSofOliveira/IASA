package project_java.tp1.comport;

import project_java.tp1.ambiente.AccaoAmb;
import project_java.tp1.ambiente.EventoAmb;

public class Combater extends ComportHierarq{
	
	public Combater() {
		super(new Comportamento[]{
				new Reaccao(EventoAmb.DERROTA, AccaoAmb.INICIAR), 
				new Reaccao(EventoAmb.INIMIGO, AccaoAmb.ATACAR)});
	}

}

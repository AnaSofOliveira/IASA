package project_java.tp1.comport;

import project_java.tp1.ambiente.AccaoAmb;
import project_java.tp1.ambiente.EventoAmb;

public class Defender extends ComportHierarq {
	
	public Defender() {
		super(new Comportamento[]{
				new Reaccao(EventoAmb.INIMIGO, AccaoAmb.DEFENDER)});
	}

}

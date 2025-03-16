package project_java.tp1.comport;


import project_java.tp1.ambiente.AccaoAmb;
import project_java.tp1.ambiente.EventoAmb;

public class Inspeccionar extends ComportHierarq {
	
	
	public Inspeccionar() {
		super(new Comportamento[]{
				new Reaccao(EventoAmb.INIMIGO, AccaoAmb.APROXIMAR), 
				new Reaccao(EventoAmb.RUIDO, AccaoAmb.PROCURAR)});
				
	}

}

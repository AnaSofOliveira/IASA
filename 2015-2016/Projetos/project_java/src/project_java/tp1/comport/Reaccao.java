package project_java.tp1.comport;

public class Reaccao implements Comportamento{
	
	private Estimulo estimulo;
	private Accao accao;
	
	public Reaccao(Estimulo estimulo, Accao accao) {
		this.estimulo = estimulo;
		this.accao = accao;
	}
	
	public Accao activar(Estimulo estimulo){
		if( estimulo == this.estimulo){
			return this.accao;
		}
		return null;
	}

}

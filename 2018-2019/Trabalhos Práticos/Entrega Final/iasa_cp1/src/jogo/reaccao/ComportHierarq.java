package jogo.reaccao;

public class ComportHierarq implements Comportamento{

	private Comportamento[] comportamentos;
	
	public ComportHierarq (Comportamento[] comportamentos){
		this.comportamentos = comportamentos;
	}
	
	public Accao activar(Estimulo estimulo) {
		//para cada elemento em "For each comportamento em comportamento", 
		//activo e gurado respossta. Se existir resposta retorno senão retorno null
		for (Comportamento comportamento : comportamentos) {
			Accao accao = comportamento.activar(estimulo);
			if(accao instanceof Accao) {
				return accao;
			}
		}
		return null; 
		
	}
}

package project_java.tp1.comport;


public class ComportHierarq implements Comportamento{

	
	private Comportamento[] comportamentos;
	
	public ComportHierarq(Comportamento[] comportamentos) {
		this.comportamentos = comportamentos;
	}
	

	@Override
	public Accao activar(Estimulo estimulo) {
		
		for(int i = 0; i < comportamentos.length; i++){
			Accao accao = comportamentos[i].activar(estimulo);
			if(accao != null){
				return accao;
			}
		}
		
		return null; // Sem qualquer accção na lista
	}
	
	

}

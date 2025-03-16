package project_java.tp1.comport;

import project_java.tp1.maqest.Estado;
import project_java.tp1.maqest.MaquinaEstados;

public class ComportMaqEst implements Comportamento{
	
	private Estado<Estimulo> estado;
	private MaquinaEstados<Estimulo> maqEst;
	private Comportamento[] comportamentos;
	
	public ComportMaqEst() {
		this.maqEst = new MaquinaEstados<Estimulo>(this.estado);
	}
	
	public Estado<Estimulo> getEstado(){
		return this.estado;
	}
	
	protected MaquinaEstados<Estimulo> iniciar(){
		//TODO
		
		
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
	
	public ComportMaqEst comport(Estado<Estimulo> estado, Comportamento comport){
		//TODO
	}

}

package project_java.tp1.maqest;

public class MaquinaEstados <EV> {
	
	private Estado<EV> estado;
	
	public MaquinaEstados(Estado<EV> estado) {
		this.estado = estado;
	}
	
	public Estado<EV> getEstado(){
		return this.estado;
	}
	
	public void processar(EV evento){
		// TODO
	}
	
}

package jogo.reaccao;

import java.util.HashMap;

import jogo.maquest.Estado;
import jogo.maquest.MaquinaEstados;

public abstract class ComportMaqEst implements Comportamento{
	
	private MaquinaEstados<Estimulo> maqEst;
	private HashMap<Estado<Estimulo>, Comportamento> comportamentos;
	
	public ComportMaqEst() {
		this.comportamentos = new HashMap<Estado<Estimulo>, Comportamento>();
		this.maqEst = iniciar();
		
	}
	
	public Estado<Estimulo> getEstado() {
		return this.maqEst.getEstado();
	}
	
	protected abstract MaquinaEstados<Estimulo> iniciar();
	
	public Accao activar(Estimulo estimulo) {
		Estado<Estimulo> estado_atual = this.maqEst.getEstado();
		Comportamento comport = this.comportamentos.get(estado_atual);
		
		Accao accao = comport.activar(estimulo);
		this.maqEst.processar(estimulo);
		
		return accao;
	}
	
	public ComportMaqEst comport(Estado<Estimulo> estado, Comportamento comport) {
		this.comportamentos.put(estado, comport); 
		return this;
	}
}

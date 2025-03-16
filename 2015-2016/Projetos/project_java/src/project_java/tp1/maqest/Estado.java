package project_java.tp1.maqest;

import java.util.HashMap;
import java.util.Map;

public class Estado<EV> {
	
	private String nome;
	private Map<EV, Estado<EV>> transicoes = new HashMap<EV, Estado<EV>>();
	
	public Estado(String nome) {
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public Estado<EV> processar(EV evento){
		//TODO
	}
	
	public Estado<EV> trans(EV evento, Estado<EV> estado){
		transicoes.put(evento, estado);
		return this;
	}
	
	public String toString(){
		return ("Estado: " + this.getNome());
	}


}

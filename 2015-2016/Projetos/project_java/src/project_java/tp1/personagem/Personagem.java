package project_java.tp1.personagem;

import project_java.tp1.ambiente.AccaoAmb;
import project_java.tp1.ambiente.Ambiente;
import project_java.tp1.ambiente.EventoAmb;
//import project_java.tp1.comport.Accao;
//import project_java.tp1.comport.Estimulo;
import project_java.tp1.maqest.MaquinaEstados;

public class Personagem {
	
	private Ambiente ambiente;
	private ComportPersonagem comportPerson;
	
	public Personagem(Ambiente ambiente) {
		this.ambiente = ambiente;
	}	

	public void executar() {
		EventoAmb estimulo = this.percepcionar();
		AccaoAmb accao = this.processar(estimulo);
		
		if(accao != null){
			this.ambiente.executarAccao(accao); // Executa ação no ambiente
			this.actuar(accao);
			this.mostrar();
		}
		
	}
	
	private EventoAmb percepcionar(){
		return this.ambiente.obterEvento();
	}
	
	private AccaoAmb processar(EventoAmb estimulo){
		// TODO Máquina de Estados Evento -> Reação
		comportPerson = new ComportPersonagem();
		comportPerson.iniciar();
		
	}
	
	private void actuar(AccaoAmb accao){
		
	}
	
	private void mostrar(){
		
	}

}

package jogo.maquest;

public class MaquinaEstados<EV> {

	private Estado<EV> estado;	

	public MaquinaEstados( Estado<EV> estado ) {
		this.estado = estado;
		
	}

	public Estado<EV> getEstado() {
		return this.estado;
	}
	
	public void processar( EV evento ) {
		Estado<EV> novoEstado = this.estado.processar(evento);
		if (novoEstado != null) {
			this.estado = novoEstado;
		}
	}
}

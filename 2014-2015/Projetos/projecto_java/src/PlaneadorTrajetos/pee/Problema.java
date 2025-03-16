package PlaneadorTrajetos.pee;

public abstract class Problema{
	
	private Operador[] operadores;
	private Estado estadoInicial;
	
	public Problema(Operador[] operadores, Estado estadoInicial) {
		this.operadores = operadores;
		this.estadoInicial = estadoInicial;
	}
	
	public Estado getEstadoInicial() {
		return estadoInicial;
	}

	public abstract boolean objectivo(Estado estado);

	public Operador[] getOperadores() {
		return operadores;
	}

}

package PlaneadorTrajetos.pee;

public class No {
	
	private Estado estado;
	private Operador operador;
	private No antecessor = null;
	
	
	public No(Estado estadoInicial) {
		estado = estadoInicial;
	}
	
	public No(Estado estadoInicial, Operador operador, No antecessor){
		this(estadoInicial);
		this.operador = operador;
		this.antecessor = antecessor;
	}

	public No getAntecessor() {
		return antecessor;
	}

	public Estado getEstado() {
		return estado;
	}
	
	public Operador getOperador() {
		return operador;
	}

}

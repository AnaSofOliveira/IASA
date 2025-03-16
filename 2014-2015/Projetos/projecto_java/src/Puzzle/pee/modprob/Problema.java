package Puzzle.pee.modprob;


public abstract class Problema <E extends Estado>{
	
	private E estadoInicial;
	private Operador<E>[] operadores;
	
	public Problema(Operador<E>[] operadores, E estadoInicial) {
		this.estadoInicial = estadoInicial;
		this.operadores = operadores;
	}
	
	public E getEstadoInicial() {
		return estadoInicial;
	}

	public Operador<E>[] getOperadores() {
		return operadores;
	}
	
	public abstract boolean objectivo(E estado);

	public abstract double heuristica(E estado);

}

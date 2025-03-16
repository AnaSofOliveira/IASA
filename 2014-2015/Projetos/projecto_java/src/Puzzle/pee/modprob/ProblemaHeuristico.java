package Puzzle.pee.modprob;

public abstract class ProblemaHeuristico<E extends Estado> extends Problema<E>{
	
	public ProblemaHeuristico(Operador<E>[] operadores, E estadoInicial) {
		super(operadores, estadoInicial);
	}

	public abstract double heuristica(E estado);

}

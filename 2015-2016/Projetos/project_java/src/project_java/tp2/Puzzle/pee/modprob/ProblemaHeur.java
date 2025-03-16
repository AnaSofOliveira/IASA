package project_java.tp2.Puzzle.pee.modprob;


/**
 * Definição geral de um problema de procura com heurística
 */
public abstract class ProblemaHeur<E extends Estado> extends Problema<E>
{	
	public ProblemaHeur(E estadoInicial, Operador[] operadores) {
		super(estadoInicial, operadores);
	}

	/**
	 * Obter heurística de um estado
	 * @param estado	Estado a avaliar
	 * @return 			Heurística do estado
	 */
	public abstract double heuristica(E estado);
}

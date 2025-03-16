package project_java.tp2.Puzzle.pee.modprob;


/**
 * Defini��o geral de um problema de procura com heur�stica
 */
public abstract class ProblemaHeur<E extends Estado> extends Problema<E>
{	
	public ProblemaHeur(E estadoInicial, Operador[] operadores) {
		super(estadoInicial, operadores);
	}

	/**
	 * Obter heur�stica de um estado
	 * @param estado	Estado a avaliar
	 * @return 			Heur�stica do estado
	 */
	public abstract double heuristica(E estado);
}

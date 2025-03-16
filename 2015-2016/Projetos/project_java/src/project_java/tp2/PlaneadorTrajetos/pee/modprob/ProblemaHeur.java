package project_java.tp2.PlaneadorTrajetos.pee.modprob;


/**
 * Defini��o geral de um problema de procura com heur�stica
 */
public abstract class ProblemaHeur extends Problema
{	
	public ProblemaHeur(Estado estadoInicial, Operador[] operadores) {
		super(estadoInicial, operadores);
	}

	/**
	 * Obter heur�stica de um estado
	 * @param estado	Estado a avaliar
	 * @return 			Heur�stica do estado
	 */
	public abstract double heuristica(Estado estado);
}

package project_java.tp2.PlaneadorTrajetos.pee.modprob;


/**
 * Definição geral de um problema de procura com heurística
 */
public abstract class ProblemaHeur extends Problema
{	
	public ProblemaHeur(Estado estadoInicial, Operador[] operadores) {
		super(estadoInicial, operadores);
	}

	/**
	 * Obter heurística de um estado
	 * @param estado	Estado a avaliar
	 * @return 			Heurística do estado
	 */
	public abstract double heuristica(Estado estado);
}

package project_java.tp2.Puzzle.pee;

import project_java.tp2.Puzzle.pee.modprob.Problema;

/**
 * Defini��o geral da funcionalidade de procura
 * em espa�os de estados
 */
public interface Procura
{

	/**
	 * Resolver problema atrav�s de procura
	 * @param problema	Problema a resolver
	 * @return			Solu��o
	 */
	Solucao resolver(Problema problema);

	/**
	 * Resolver problema atrav�s de procura com limite de profundidade
	 * @param problema	Problema a resolver
	 * @param profMax	Profundidade m�xima da procura
	 * @return			Solu��o
	 */
	Solucao resolver(Problema problema, int profMax);
}
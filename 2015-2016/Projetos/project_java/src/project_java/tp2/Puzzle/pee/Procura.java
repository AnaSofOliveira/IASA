package project_java.tp2.Puzzle.pee;

import project_java.tp2.Puzzle.pee.modprob.Problema;

/**
 * Definição geral da funcionalidade de procura
 * em espaços de estados
 */
public interface Procura
{

	/**
	 * Resolver problema através de procura
	 * @param problema	Problema a resolver
	 * @return			Solução
	 */
	Solucao resolver(Problema problema);

	/**
	 * Resolver problema através de procura com limite de profundidade
	 * @param problema	Problema a resolver
	 * @param profMax	Profundidade máxima da procura
	 * @return			Solução
	 */
	Solucao resolver(Problema problema, int profMax);
}
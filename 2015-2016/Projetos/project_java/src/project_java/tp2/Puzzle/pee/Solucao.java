package project_java.tp2.Puzzle.pee;

import java.util.Iterator;

public interface Solucao extends Iterable<PassoSolucao>
{
	@Override
	Iterator<PassoSolucao> iterator();
	
	/**
	 * Obter dimensão da solução
	 * @ret 
	 */
	int getDimensao();

	/**
	 * Obter custo da solução
	 * @return Custo da solução
	 */
	double getCusto();
}
package project_java.tp2.Puzzle.pee;

import java.util.Iterator;

public interface Solucao extends Iterable<PassoSolucao>
{
	@Override
	Iterator<PassoSolucao> iterator();
	
	/**
	 * Obter dimens�o da solu��o
	 * @ret 
	 */
	int getDimensao();

	/**
	 * Obter custo da solu��o
	 * @return Custo da solu��o
	 */
	double getCusto();
}
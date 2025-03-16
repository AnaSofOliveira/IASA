package project_java.tp2.PlaneadorTrajetos.pee;

import java.util.Iterator;

public interface Solucao extends Iterable<PassoSolucao>
{
	@Override
	Iterator<PassoSolucao> iterator();
	
	/**
	 * Obter dimensão da solução
	 * @return Dimensão da solução
	 */
	int getDimensao();

	/**
	 * Obter custo da solução
	 * @return Custo da solução
	 */
	double getCusto();
}
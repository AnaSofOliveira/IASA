package project_java.tp2.PlaneadorTrajetos.pee;

import project_java.tp2.PlaneadorTrajetos.pee.modprob.Estado;
import project_java.tp2.PlaneadorTrajetos.pee.modprob.Operador;

public interface PassoSolucao
{
	/**
	 * Obter estado do passo
	 * @return	Estado do passo
	 */
	Estado getEstado();

	/**
	 * Obter operador que produziu o estado
	 * @return	Operador de transição de estado
	 */
	Operador getOperador();

	/**
	 * Obter custo da solução até ao passo
	 * @return	Custo da solução até ao passo
	 */
	double getCusto();
}
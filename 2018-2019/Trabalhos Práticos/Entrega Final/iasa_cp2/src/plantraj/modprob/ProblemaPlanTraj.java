package plantraj.modprob;

import pee.modprob.Estado;
import pee.modprob.Operador;
import pee.modprob.Problema;

public class ProblemaPlanTraj extends Problema{
	EstadoLocalidade estadoFin;
	
	
	/*
	 * Cria um objeto ProblemaPlanTraj que representa o dom�nio do
	 * problema do planeador de trajetos
	 * 
	 * @param String locIni - Localidade Inicial
	 * @param String locFin - Localidade Final (Objetivo)
	 * @param Operador[] operadores - Operadores a serem aplicados
	 */
	public ProblemaPlanTraj(String locIni, String locFin, Operador[] operadores) {
		super(new EstadoLocalidade(locIni), operadores);
		this.estadoFin = new EstadoLocalidade(locFin);
	}

	
	/*
	 * @see pee.modprob.Problema#objectivo(pee.modprob.Estado)
	 * 
	 * Concretiza a implementa��o da fun��o supra para o dom�nio do problema
	 * 
	 * @param Estado estado - estado que ir� ser testado como objetivo
	 * 
	 * @return boolean true - @param � objetivo
	 * @return boolean false - @param n�o � objetivo
	 */
	@Override
	public boolean objectivo(Estado estado) {
		if (estado.equals(this.estadoFin)) {
			return true;
		}
		return false;
	}

	
	
}

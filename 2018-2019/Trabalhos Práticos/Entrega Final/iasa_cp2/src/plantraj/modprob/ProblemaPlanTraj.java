package plantraj.modprob;

import pee.modprob.Estado;
import pee.modprob.Operador;
import pee.modprob.Problema;

public class ProblemaPlanTraj extends Problema{
	EstadoLocalidade estadoFin;
	
	
	/*
	 * Cria um objeto ProblemaPlanTraj que representa o domínio do
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
	 * Concretiza a implementação da função supra para o domínio do problema
	 * 
	 * @param Estado estado - estado que irá ser testado como objetivo
	 * 
	 * @return boolean true - @param é objetivo
	 * @return boolean false - @param não é objetivo
	 */
	@Override
	public boolean objectivo(Estado estado) {
		if (estado.equals(this.estadoFin)) {
			return true;
		}
		return false;
	}

	
	
}

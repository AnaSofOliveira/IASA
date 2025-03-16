package project_java.tp2.PlaneadorTrajetos.plantraj.modprob;

import project_java.tp2.PlaneadorTrajetos.pee.modprob.Estado;
import project_java.tp2.PlaneadorTrajetos.pee.modprob.Problema;

/**
 * Problema de defini��o de trajecto entre duas localidades
 */
public class ProblemaPlanTraj extends Problema
{
	// Estado representante da localidade final
	private EstadoLocalidade estadoFinal;	

	/**
	 * Construtor
	 * @param locIni		Localidade inicial
	 * @param locFin		Localidade final
	 * @param operadores	Operadores de liga��o entre localidades
	 */
	public ProblemaPlanTraj(String locIni, String locFin, OperadorLigacao[] operadores) {
		super(new EstadoLocalidade(locIni), operadores);
		estadoFinal = new EstadoLocalidade(locFin);
	}

	@Override
	public boolean objectivo(Estado estado) {
		return estado.equals(estadoFinal);
	}
}

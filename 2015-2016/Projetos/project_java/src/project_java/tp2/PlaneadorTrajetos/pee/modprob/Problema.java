package project_java.tp2.PlaneadorTrajetos.pee.modprob;


/**
 * Defini��o geral de um problema de procura
 */
public abstract class Problema
{
	private Estado estadoInicial;
	private Operador[] operadores;	

	/**
	 * Obter estado inicial do problema
	 * @return estado inicial
	 */
	public Estado getEstadoInicial() {
		return estadoInicial;		
	}

	/**
	 * Obter operadores definidos para o problema
	 * @return	operadores	Operadores definidos para o problema
	 */
	public Operador[] getOperadores() {
		return operadores;
	}

	/**
	 * Construtor
	 * @param estadoInicial	Estado inicial do problema
	 * @param operadores	Operadores definidos para o problema
	 */
	public Problema(Estado estadoInicial, Operador[] operadores) {
		this.estadoInicial = estadoInicial;
		this.operadores = operadores;
	}

	/**
	 * Verificar se estado � objectivo
	 * @param 	estado	Estado a verificar
	 * @return	Objectivo (sim/n�o)
	 */
	public abstract boolean objectivo(Estado estado);
}

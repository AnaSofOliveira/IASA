package project_java.tp2.Puzzle.pee.modprob;


/**
 * Definição geral de um problema de procura
 */
public abstract class Problema<E extends Estado>
{
	private E estadoInicial;
	private Operador[] operadores;
	
	/**
	 * Construtor
	 * @param estadoInicial	Estado inicial do problema
	 * @param operadores	Operadores definidos para o problema
	 */
	public Problema(E estadoInicial, Operador[] operadores) {
		this.estadoInicial = estadoInicial;
		this.operadores = operadores;
	}

	/**
	 * Obter estado inicial do problema
	 * @return estado inicial
	 */
	public E getEstadoInicial() {
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
	 * Verificar se estado é objectivo
	 * @param 	estado	Estado a verificar
	 * @return	Objectivo (sim/não)
	 */
	public abstract boolean objectivo(E estado);
}

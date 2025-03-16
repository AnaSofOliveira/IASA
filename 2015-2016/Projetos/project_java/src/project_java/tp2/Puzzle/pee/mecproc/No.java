package project_java.tp2.Puzzle.pee.mecproc;

import project_java.tp2.Puzzle.pee.PassoSolucao;
import project_java.tp2.Puzzle.pee.modprob.Estado;
import project_java.tp2.Puzzle.pee.modprob.Operador;


/**
 * N� da �rvore de procura
 */
public class No implements PassoSolucao
{
	private Estado estado = null;
	private Operador operador = null;
	private No antecessor = null;
	private int profundidade = 0;
	private double custo = 0;
	
	public Estado getEstado() {
		return estado;
	}

	public Operador getOperador() {
		return operador;
	}

	public No getAntecessor() {
		return antecessor;
	}
	
	public int getProfundidade() {
		return profundidade;
	}

	public double getCusto() {
		return custo;
	}

	/**
	 * Construtor
	 * @param estado	Estado associado
	 */
	public No(Estado estado) {
		this.estado = estado;
	}

	/**
	 * Construtor
	 * @param estado		Estado associado
	 * @param operador		Operador que gerou o estado
	 * @param antecessor	N� antecessor
	 */
	public No(Estado estado, Operador operador, No antecessor) {
		this(estado);
		this.operador = operador;
		this.antecessor = antecessor;
		// Definir profundidade e custo do n�
		profundidade = antecessor.getProfundidade() + 1;
		custo = antecessor.getCusto() + operador.custo(antecessor.getEstado(), estado);
	}
}

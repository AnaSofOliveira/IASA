package project_java.tp2.PlaneadorTrajetos.pee.mecproc;

import project_java.tp2.PlaneadorTrajetos.pee.PassoSolucao;
import project_java.tp2.PlaneadorTrajetos.pee.modprob.Estado;
import project_java.tp2.PlaneadorTrajetos.pee.modprob.Operador;


/**
 * Nó da árvore de procura
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
	 * @param estado2	Estado associado
	 */
	public No(Estado estado2) {
		this.estado = estado2;
	}

	/**
	 * Construtor
	 * @param estado		Estado associado
	 * @param operador		Operador que gerou o estado
	 * @param antecessor	Nó antecessor
	 */
	public No(Estado estado, Operador operador, No antecessor) {
		this(estado);
		this.operador = operador;
		this.antecessor = antecessor;
		// Definir profundidade e custo do nó
		profundidade = antecessor.getProfundidade() + 1;
		custo = antecessor.getCusto() + operador.custo(antecessor.getEstado(), estado);
	}
}

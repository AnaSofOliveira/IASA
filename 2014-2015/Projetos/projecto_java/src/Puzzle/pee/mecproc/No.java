package Puzzle.pee.mecproc;

import Puzzle.pee.modprob.Estado;
import Puzzle.pee.modprob.Operador;

public class No<E extends Estado> {
	
	private E estado;
	private Operador<E> operador = null;
	private No<E> antecessor = null;
	private int profundidade;
	private double custo;
	
	
	public No(E estadoInicial) {
		estado = estadoInicial;
		profundidade = 0;
		custo = 0;
	}
	
	public No(E estadoInicial, Operador<E> operador, No<E> antecessor){
		this(estadoInicial);
		this.operador = operador;
		this.antecessor = antecessor;
		profundidade += antecessor.getProfundidade() + 1;
		custo += antecessor.getCusto() + operador.custo(antecessor.getEstado(), estadoInicial);
	}

	public E getEstado() {
		return estado;
	}
	
	public Operador<E> getOperador() {
		return operador;
	}
	
	public No<E> getAntecessor() {
		return antecessor;
	}

	public int getProfundidade() {
		return profundidade;
	}
	
	public double getCusto(){
		return custo;
	}

}

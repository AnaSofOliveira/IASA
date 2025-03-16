package pee.mecproc;

import pee.PassoSolucao;
import pee.modprob.Estado;
import pee.modprob.Operador;

public class No implements PassoSolucao{
	
	private Estado estado;
	private Operador operador;
	private No antecessor;
	
	private int profundidade = 0;
	private double custo = 0;
	
	public No( Estado estado ) {
		this.estado = estado;
	}
	
	
	public No( Estado estado, Operador operador, No antecessor ) {
		this(estado);
		this.operador = operador;
		this.antecessor = antecessor;
		this.profundidade = this.antecessor.profundidade + 1;
		this.custo = this.antecessor.getCusto() + this.operador.custo(this.antecessor.getEstado(), this.getEstado());
	}
	
	
	public Estado getEstado() {
		return this.estado;
	}
	
	
	public Operador getOperador() {
		return this.operador;
	}
	
	public No getAntecessor() {
		return this.antecessor;
	}
	
	
	public int getProfundidade() {
		return this.profundidade;
	}
	

	public double getCusto() {
		return this.custo;
	}


}

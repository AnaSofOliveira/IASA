package pee;

import pee.modprob.Estado;
import pee.modprob.Operador;

public abstract interface PassoSolucao {
	
	public abstract Estado getEstado();
	
	public abstract Operador getOperador();
	
	public abstract double getCusto();

}

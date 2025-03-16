package pee.modprob;

public abstract interface Operador {
	
	// Transição de estado
	public Estado aplicar( Estado estado );

	public float custo( Estado estado, Estado estadoSuc );

}
package pee;

import java.util.Iterator;

public abstract interface Solucao extends Iterable<PassoSolucao> {

	@Override
	abstract  Iterator<PassoSolucao> iterator();
	
	public abstract int getDimensao();
	
	public abstract double getCusto();
}

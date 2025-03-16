package Puzzle.pee.melhorprim;

import Puzzle.pee.mecproc.No;
import Puzzle.pee.modprob.Estado;
import Puzzle.pee.modprob.Problema;

public class ProcCustoUnif<E extends Estado> extends ProcMelhorPrim<E, Problema<E>> {

	@Override
	public double f(No<E> no) {
		return (no.getCusto());
	}
	
	
}

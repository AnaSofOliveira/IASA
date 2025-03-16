package Puzzle.pee.melhorprim;

import Puzzle.pee.mecproc.No;
import Puzzle.pee.modprob.Estado;
import Puzzle.pee.modprob.ProblemaHeuristico;

public class ProcAA<E extends Estado> extends ProcMelhorPrim<E, ProblemaHeuristico<E>> {
	
	@Override
	public double f(No<E> no){
		return (no.getCusto() + problema.heuristica(no.getEstado()));
	}

}

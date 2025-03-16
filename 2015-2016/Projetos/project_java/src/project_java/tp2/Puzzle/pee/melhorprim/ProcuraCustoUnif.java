package project_java.tp2.Puzzle.pee.melhorprim;

import project_java.tp2.Puzzle.pee.mecproc.No;
import project_java.tp2.Puzzle.pee.modprob.Estado;
import project_java.tp2.Puzzle.pee.modprob.Problema;

public class ProcuraCustoUnif<E extends Estado> extends ProcuraMelhorPrim<E, Problema<E>>{

	@Override
	public double f(No no) {
		return (no.getCusto());
	}

	
}

package pee.melhorprim;

import pee.mecproc.No;
import pee.modprob.ProblemaHeur;

public class ProcuraSofrega extends ProcuraMelhorPrim<ProblemaHeur>{

	@Override
	protected double f(No no) {
		// considera o custo at� ao n� objetivo
		return this.problema.heuristica(no.getEstado());
	}

	
	
}

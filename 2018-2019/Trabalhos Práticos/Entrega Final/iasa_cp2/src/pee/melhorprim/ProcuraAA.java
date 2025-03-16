package pee.melhorprim;

import pee.mecproc.No;
import pee.modprob.ProblemaHeur;

public class ProcuraAA extends ProcuraMelhorPrim<ProblemaHeur>{

	@Override
	protected double f(No no) {
		return no.getCusto() + this.problema.heuristica(no.getEstado());
	}

}

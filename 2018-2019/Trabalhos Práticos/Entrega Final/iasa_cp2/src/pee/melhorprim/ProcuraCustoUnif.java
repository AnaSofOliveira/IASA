package pee.melhorprim;

import pee.modprob.Problema;
import pee.Procura;
import pee.mecproc.No;
import pee.melhorprim.ProcuraMelhorPrim;

public class ProcuraCustoUnif extends ProcuraMelhorPrim<Problema> implements Procura{
	
	protected double f(No no) {
		return no.getCusto();
	}
	

}

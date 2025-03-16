package pee.melhorprim;

import pee.Solucao;
import pee.modprob.ProblemaHeur;

public interface ProcuraHeur {
	
	public abstract Solucao resolver(ProblemaHeur problema);

	public abstract Solucao resolver(ProblemaHeur problema, int profMax);
}

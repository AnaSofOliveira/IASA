package pee.prof;

import pee.Procura;
import pee.Solucao;
import pee.modprob.Problema;

public class ProcProfIter extends ProcuraProf implements Procura{
	
	private int incProf;
	
	public ProcProfIter(int incProf) {
		this.incProf = incProf;
	}
	
	public int getIncProf() {
		return this.incProf;
	}
	
	public void setIncProf(int incProf) {
		this.incProf = incProf;
	}
	
	public Solucao resolver(Problema problema, int profMax) {
		// Com a profundidade, desde a profundidade inicial até prof max, com incremento de incProf:
		//	faço resolver
		
		for (int prof = incProf; prof <= profMax; prof=prof + incProf) {
			Solucao solucao = super.resolver(problema, prof);
			if (solucao != null) {
				return solucao;
			}
		}return null;
	}
	
}

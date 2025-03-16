package Puzzle.pee.prof;

import Puzzle.pee.mecproc.Solucao;
import Puzzle.pee.modprob.Estado;
import Puzzle.pee.modprob.Problema;

public class ProcProfIter<E extends Estado> extends ProcProf<E> {
	
	public Solucao<E> procurar(Problema<E> problema, int maxProf){
		return this.procurar(problema, maxProf, 1);
	}
	
	public Solucao<E> procurar(Problema<E> problema, int maxProf, int incProf){
		Solucao<E> solucao;
		
		for( int maxProfIter = incProf; maxProfIter <= maxProf; maxProfIter += incProf){
			solucao = super.procurar(problema, maxProfIter);
			if(solucao != null){
				return solucao;
			}
		}
		return null;
	}
}

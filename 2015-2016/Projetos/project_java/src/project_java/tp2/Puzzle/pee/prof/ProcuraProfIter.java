package project_java.tp2.Puzzle.pee.prof;

import project_java.tp2.Puzzle.pee.Solucao;
import project_java.tp2.Puzzle.pee.modprob.Problema;

public class ProcuraProfIter extends ProcuraProf{

	
	public Solucao procurar(Problema problema, int maxProf){
		return this.procurar(problema, maxProf, 1);
	}
	
	public Solucao procurar(Problema problema, int maxProf, int incrementoProf){
		Solucao solucao;
		
		for( int maxProfIter = incrementoProf; maxProfIter <= maxProf; maxProfIter += incrementoProf){
			solucao = super.resolver(problema, maxProfIter);
			
			if (solucao != null){
				return solucao;
			}
		}
		return null;
	}
}

package respuzzle.modprob;

import pee.modprob.Estado;
import pee.modprob.Operador;
import pee.modprob.Problema;
import pee.modprob.ProblemaHeur;
import puzzle.Puzzle;

public class ProblemaPuzzle extends ProblemaHeur{
	
	EstadoPuzzle estadoFinal;
	

	public ProblemaPuzzle(EstadoPuzzle estadoInicial, EstadoPuzzle estadoFinal, Operador[] operadores) {
		super(estadoInicial, operadores);
		this.estadoFinal = estadoFinal;
	}

	@Override
	public boolean objectivo(Estado estado) {
		// TODO Dúvida - arg deveria ser EstadoPuzzle
		if(estado.equals(this.estadoFinal)) {
			return true;
		}return false;
	}

	@Override
	public double heuristica(Estado estado) {
		// TODO Rever
		Puzzle puzzle = ((EstadoPuzzle)estado).getPuzzle();
		Puzzle puzzleFinal = this.estadoFinal.getPuzzle();
		
		return puzzleFinal.distManhattan(puzzle);
		//return puzzleFinal.numPecasForaLugar(puzzle);
	}

}

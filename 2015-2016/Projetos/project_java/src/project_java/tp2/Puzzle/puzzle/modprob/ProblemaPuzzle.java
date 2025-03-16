package project_java.tp2.Puzzle.puzzle.modprob;

import project_java.tp2.Puzzle.pee.modprob.ProblemaHeur;
import puzzle.Puzzle;

public class ProblemaPuzzle extends ProblemaHeur<EstadoPuzzle>{
	
	private EstadoPuzzle estadoFinal;
	
	public ProblemaPuzzle(Puzzle puzzleInicial, Puzzle puzzleFinal, OperadorMoverPosVazia[] operadores) {
		super(new EstadoPuzzle(puzzleInicial), operadores);
		this.estadoFinal = new EstadoPuzzle(puzzleFinal);
	}

	@Override
	public double heuristica(EstadoPuzzle estado) {
		Puzzle puzzleFinal = estadoFinal.getPuzzle();
		Puzzle puzzle = estado.getPuzzle();
		
		return puzzleFinal.distManhattan(puzzle);
//		return puzzleFinal.numPecasForaLugar(puzzle);
	}

	@Override
	public boolean objectivo(EstadoPuzzle estado) {
		return estado.equals(estadoFinal);
	}

}

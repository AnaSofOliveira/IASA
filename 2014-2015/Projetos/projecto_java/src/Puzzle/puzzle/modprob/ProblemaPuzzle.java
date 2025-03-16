package Puzzle.puzzle.modprob;

import Puzzle.pee.modprob.ProblemaHeuristico;
import puzzle.Puzzle;

public class ProblemaPuzzle extends ProblemaHeuristico<EstadoPuzzle>{
	
	private EstadoPuzzle estadoPuzzleFinal;

	public ProblemaPuzzle(Puzzle puzzleIni, Puzzle puzzleFin, OperadorMoverPosVazia[] operadores) {
		super(operadores, new EstadoPuzzle(puzzleIni));
		this.estadoPuzzleFinal = new EstadoPuzzle(puzzleFin);
	}

	@Override
	public boolean objectivo(EstadoPuzzle estadoPuzzle) {
		return estadoPuzzle.equals(estadoPuzzleFinal);
	}
	
	@Override
	public double heuristica(EstadoPuzzle estado){
		Puzzle puzzleFin = estadoPuzzleFinal.getPuzzle();
		Puzzle puzzle = estado.getPuzzle();
		
//		return puzzleFin.distManhattan(puzzle);
		return puzzleFin.numPecasForaLugar(puzzle);
	}
}

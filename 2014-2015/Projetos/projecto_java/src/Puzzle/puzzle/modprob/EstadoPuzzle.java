package Puzzle.puzzle.modprob;

import Puzzle.pee.modprob.Estado;
import puzzle.Puzzle;


public class EstadoPuzzle extends Estado {
	
	public Puzzle puzzle;

	public EstadoPuzzle(Puzzle puzzleIni) {
		this.puzzle = puzzleIni;
	}
	
	public Puzzle getPuzzle() {
		return puzzle;
	}

	@Override
	public int hashCode() {
		return puzzle.hashCode();
	}
	
	public String toString(){
		return puzzle.toString();
	}
	
}

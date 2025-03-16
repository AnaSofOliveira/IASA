package project_java.tp2.Puzzle.puzzle.modprob;

import project_java.tp2.Puzzle.pee.modprob.Estado;
import puzzle.Puzzle;

public class EstadoPuzzle extends Estado{
	
	private Puzzle puzzle;

	public EstadoPuzzle(Puzzle puzzle) {
		this.puzzle  = puzzle;
	}
	
	public Puzzle getPuzzle(){
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

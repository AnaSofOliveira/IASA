package respuzzle.modprob;

import pee.modprob.Estado;
import puzzle.Puzzle;

public class EstadoPuzzle extends Estado{
	
	private Puzzle puzzle;
	
	public EstadoPuzzle(int [][] puzzle) {
		this.puzzle = new Puzzle(puzzle);
	}
	
	public Puzzle getPuzzle() {
		return this.puzzle;
	}

	@Override
	public int hashCode() {
		return this.puzzle.hashCode();
	}
	
	public String toString() {
		return this.puzzle.toString();
	}
	

}

package Puzzle.puzzle.modprob;

import Puzzle.pee.modprob.Operador;
import puzzle.Puzzle;
import puzzle.Puzzle.Movimento;

public class OperadorMoverPosVazia implements Operador<EstadoPuzzle>{
	
	private Movimento mov;
	private final double custo = 1;
	
	public OperadorMoverPosVazia(Movimento mov){
		this.mov = mov;
	}
	
	@Override
	public EstadoPuzzle aplicar(EstadoPuzzle estado){
		Puzzle puzzle = estado.getPuzzle();
		Puzzle novoPuzzle = puzzle.movimentar(mov);
		
		if (novoPuzzle != null)
			return new EstadoPuzzle(novoPuzzle);
		
		return null;
	}

	@Override
	public double custo(EstadoPuzzle estado, EstadoPuzzle estadoSuc) {	
		return custo;
	}
}

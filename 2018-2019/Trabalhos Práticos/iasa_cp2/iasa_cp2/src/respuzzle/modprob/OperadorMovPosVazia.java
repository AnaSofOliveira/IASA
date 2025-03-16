package respuzzle.modprob;

import pee.modprob.Estado;
import pee.modprob.Operador;
import puzzle.Puzzle;
import puzzle.Puzzle.Movimento;

public class OperadorMovPosVazia implements Operador{
	
	private Movimento mov;
	
	public OperadorMovPosVazia(Movimento mov) {
		this.mov = mov;
	}

	@Override
	public Estado aplicar(Estado estado) {
		Puzzle puzzle = ((EstadoPuzzle) estado).getPuzzle();
		Puzzle novoPuzzle = puzzle.movimentar(this.mov);
		
		if (novoPuzzle != null) {
			return new EstadoPuzzle(novoPuzzle.getTabuleiro());
		}return null;
	}

	@Override
	public float custo(Estado estado, Estado estadoSuc) {
		// Cada movimentação da peça vazia tem custo de 1
		return 1;
	}

}

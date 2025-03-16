package project_java.tp2.Puzzle.puzzle.modprob;

import project_java.tp2.Puzzle.pee.modprob.Operador;
import puzzle.Puzzle;
import puzzle.Puzzle.Movimento;

public class OperadorMoverPosVazia implements Operador<EstadoPuzzle>{
	
	private Movimento mov;
	private float custo;

	public OperadorMoverPosVazia(Movimento mov) {
		this.mov =  mov;
		this.custo = 1;
	}

	@Override
	public EstadoPuzzle aplicar(EstadoPuzzle estado) {
		Puzzle novoPuzzle = estado.getPuzzle().movimentar(this.mov);
		
		if(novoPuzzle != null){
			return (new EstadoPuzzle(novoPuzzle));
		}
		return null;
	}


	@Override
	public float custo(EstadoPuzzle estado, EstadoPuzzle estadoSuc) {
		
		return this.custo;
	}

	
	
}

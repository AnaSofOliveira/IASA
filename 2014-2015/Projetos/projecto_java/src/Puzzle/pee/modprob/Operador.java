package Puzzle.pee.modprob;
import Puzzle.pee.modprob.Estado;

public interface Operador<E extends Estado> {
	
	E aplicar(E estado);
	
	double custo(E estado, E estadoSuc);

}

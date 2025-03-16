package project_java.tp2.Puzzle.pee.melhorprim;

import java.util.Comparator;

import project_java.tp2.Puzzle.pee.mecproc.MecanismoProcura;
import project_java.tp2.Puzzle.pee.mecproc.No;
import project_java.tp2.Puzzle.pee.mecproc.mem.MemoriaPrioridade;
import project_java.tp2.Puzzle.pee.mecproc.mem.MemoriaProcura;
import project_java.tp2.Puzzle.pee.modprob.Estado;
import project_java.tp2.Puzzle.pee.modprob.Problema;

public abstract class ProcuraMelhorPrim<E extends Estado, P extends Problema<E>> extends MecanismoProcura<P> implements Comparator<No>{

	@Override
	protected MemoriaProcura iniciarMemoria() {
		return new MemoriaPrioridade(this);
	}
	
	public abstract double f(No no);
	
	@Override
	public int compare(No no1, No no2) {
		return Double.compare(f(no1), f(no2));
	}

}

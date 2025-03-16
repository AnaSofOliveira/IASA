package Puzzle.pee.melhorprim;

import java.util.Comparator;

import Puzzle.pee.mecproc.MecanismoProcura;
import Puzzle.pee.mecproc.No;
import Puzzle.pee.mecproc.mem.MemoriaPrioridade;
import Puzzle.pee.mecproc.mem.MemoriaProcura;
import Puzzle.pee.modprob.Estado;
import Puzzle.pee.modprob.Problema;


public abstract class ProcMelhorPrim<E extends Estado, P extends Problema<E>> extends MecanismoProcura<E, P> implements Comparator<No<E>> {

	protected MemoriaProcura<E> inserirMemoria(){
		return new MemoriaPrioridade<E>(this);
	}
	
	public abstract double f(No<E> no);
	
	@Override
	public int compare(No<E> no1, No<E> no2) {
		return Double.compare(f(no1), f(no2));
	}
	
}

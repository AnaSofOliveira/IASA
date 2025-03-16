package Puzzle.pee.mecproc.mem;

import java.util.Comparator;
import java.util.PriorityQueue;

import Puzzle.pee.modprob.Estado;
import Puzzle.pee.mecproc.No;

public class MemoriaPrioridade<E extends Estado> extends MemoriaProcura<E>{
	
	public MemoriaPrioridade(Comparator<No<E>> comparador){
		super(new PriorityQueue<No<E>>(1, comparador));
	}
}

package Puzzle.pee.mecproc.mem;

import java.util.LinkedList;

import Puzzle.pee.modprob.Estado;
import Puzzle.pee.mecproc.No;

public class MemoriaFIFO<E extends Estado> extends MemoriaProcura<E>{
	
	public MemoriaFIFO(){
		super(new LinkedList<No<E>>());
	}

}

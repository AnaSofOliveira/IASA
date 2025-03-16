package Puzzle.pee.mecproc.mem;

import java.util.Collections;
import java.util.LinkedList;

import Puzzle.pee.modprob.Estado;
import Puzzle.pee.mecproc.No;

public class MemoriaLIFO<E extends Estado> extends MemoriaProcura<E> {
	
	public MemoriaLIFO(){
		super(Collections.asLifoQueue(new LinkedList<No<E>>()));
	}
}

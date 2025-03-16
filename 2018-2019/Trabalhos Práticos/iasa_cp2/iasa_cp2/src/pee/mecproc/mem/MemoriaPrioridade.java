package pee.mecproc.mem;

import java.util.Comparator;
import java.util.PriorityQueue;

import pee.mecproc.No;

public class MemoriaPrioridade extends MemoriaProcura{

	public MemoriaPrioridade(Comparator<No> comparador) {
		//primeiro parametro corresponde ao tamanho por omissão da lista
		super(new PriorityQueue<No>(1, comparador));
	}

}

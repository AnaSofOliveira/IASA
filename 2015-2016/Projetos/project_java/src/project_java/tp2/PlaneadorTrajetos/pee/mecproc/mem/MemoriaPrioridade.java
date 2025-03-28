package project_java.tp2.PlaneadorTrajetos.pee.mecproc.mem;

import java.util.Comparator;
import java.util.PriorityQueue;

import project_java.tp2.PlaneadorTrajetos.pee.mecproc.No;

public class MemoriaPrioridade extends MemoriaProcura
{
	public MemoriaPrioridade(Comparator<No> comparador) {
		super(new PriorityQueue<No>(1, comparador));
	}
}

package pee.melhorprim;

import java.util.Comparator;

import pee.mecproc.MecanismoProcura;
import pee.mecproc.No;
import pee.mecproc.mem.MemoriaPrioridade;
import pee.mecproc.mem.MemoriaProcura;
import pee.modprob.Problema;

public abstract class ProcuraMelhorPrim<P extends Problema> extends MecanismoProcura<P> implements Comparator<No>{

	@Override
	protected MemoriaProcura iniciarMemoria() {
		return new MemoriaPrioridade(this);
	}
	
	public int compare (No o1, No o2) {
		// A classe Double consegue efetuar a comparação entre 2 doubles(função f de cada um dos nós)
		return Double.compare(f(o1), f(o2));
	}
	
	protected abstract double f(No no);
}

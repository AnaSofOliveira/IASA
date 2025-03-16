package Puzzle.pee.prof;

import Puzzle.pee.mecproc.MecanismoProcura;
import Puzzle.pee.mecproc.mem.MemoriaLIFO;
import Puzzle.pee.mecproc.mem.MemoriaProcura;
import Puzzle.pee.modprob.Estado;
import Puzzle.pee.modprob.Problema;

public class ProcProf<E extends Estado> extends MecanismoProcura<E, Problema<E>> {
	
	@Override
	protected MemoriaProcura<E> inserirMemoria(){
		return new MemoriaLIFO<E>();
	}

}

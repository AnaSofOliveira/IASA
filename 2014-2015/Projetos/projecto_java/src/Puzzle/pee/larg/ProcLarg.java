package Puzzle.pee.larg;

import Puzzle.pee.mecproc.MecanismoProcura;
import Puzzle.pee.mecproc.mem.MemoriaFIFO;
import Puzzle.pee.mecproc.mem.MemoriaProcura;
import Puzzle.pee.modprob.Estado;
import Puzzle.pee.modprob.Problema;

public class ProcLarg<E extends Estado> extends MecanismoProcura<E, Problema<E>> {
	
	protected MemoriaProcura<E> inserirMemoria(){
		return new MemoriaFIFO<E>();
	}
}

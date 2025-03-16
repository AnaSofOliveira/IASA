package project_java.tp2.Puzzle.pee.prof;

import project_java.tp2.Puzzle.pee.Procura;
import project_java.tp2.Puzzle.pee.mecproc.MecanismoProcura;
import project_java.tp2.Puzzle.pee.mecproc.mem.MemoriaLIFO;
import project_java.tp2.Puzzle.pee.mecproc.mem.MemoriaProcura;
import project_java.tp2.Puzzle.pee.modprob.Problema;

/**
 * Mecanismo de procura em profundidade
 */
public class ProcuraProf
				extends MecanismoProcura<Problema>
				implements Procura
{
	@Override
	protected MemoriaProcura iniciarMemoria() {
		return new MemoriaLIFO();
	}
}

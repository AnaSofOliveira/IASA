package project_java.tp2.Puzzle.pee.larg;

import project_java.tp2.Puzzle.pee.Procura;
import project_java.tp2.Puzzle.pee.mecproc.MecanismoProcura;
import project_java.tp2.Puzzle.pee.mecproc.mem.MemoriaFIFO;
import project_java.tp2.Puzzle.pee.mecproc.mem.MemoriaProcura;
import project_java.tp2.Puzzle.pee.modprob.Problema;

/**
 * Mecanismo de procura em largura
 */
public class ProcuraLarg
				extends MecanismoProcura<Problema>
				implements Procura
{
	@Override
	protected MemoriaProcura iniciarMemoria() {
		return new MemoriaFIFO();
	}
}

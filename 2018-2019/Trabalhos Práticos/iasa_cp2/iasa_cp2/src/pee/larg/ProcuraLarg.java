package pee.larg;

import pee.Procura;
import pee.mecproc.MecanismoProcura;
import pee.mecproc.mem.MemoriaFIFO;
import pee.mecproc.mem.MemoriaProcura;
import pee.modprob.Problema;

public class ProcuraLarg extends MecanismoProcura<Problema> implements Procura {
	
	/*
	 * @see pee.mecproc.MecanismoProcura#iniciarMemoria()
	 * 
	 * 
	 */
	@Override
	public MemoriaProcura iniciarMemoria() {
		return new MemoriaFIFO();
	}

}

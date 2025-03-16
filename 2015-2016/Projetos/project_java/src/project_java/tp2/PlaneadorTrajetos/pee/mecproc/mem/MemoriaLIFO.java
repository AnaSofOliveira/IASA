package project_java.tp2.PlaneadorTrajetos.pee.mecproc.mem;

import java.util.Collections;
import java.util.LinkedList;

import project_java.tp2.PlaneadorTrajetos.pee.mecproc.No;

public class MemoriaLIFO extends MemoriaProcura
{
	public MemoriaLIFO() {
		super(Collections.asLifoQueue(new LinkedList<No>()));
	}
}

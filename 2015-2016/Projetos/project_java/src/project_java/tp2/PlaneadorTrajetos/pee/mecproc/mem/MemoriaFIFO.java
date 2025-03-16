package project_java.tp2.PlaneadorTrajetos.pee.mecproc.mem;

import java.util.LinkedList;

import project_java.tp2.PlaneadorTrajetos.pee.mecproc.No;

public class MemoriaFIFO extends MemoriaProcura 
{
	public MemoriaFIFO() {
		super(new LinkedList<No>());
	}
}

package project_java.tp2.Puzzle.pee.mecproc.mem;

import java.util.Collections;
import java.util.LinkedList;

import project_java.tp2.Puzzle.pee.mecproc.No;

public class MemoriaLIFO extends MemoriaProcura
{
	public MemoriaLIFO() {
		super(Collections.asLifoQueue(new LinkedList<No>()));
	}
}

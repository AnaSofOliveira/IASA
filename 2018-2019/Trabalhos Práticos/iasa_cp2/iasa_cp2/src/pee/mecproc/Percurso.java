package pee.mecproc;

import java.util.Iterator;
import java.util.LinkedList;

import pee.PassoSolucao;
import pee.Solucao;

public class Percurso implements Solucao{
	
	private LinkedList<PassoSolucao> percurso = new LinkedList<PassoSolucao>();
	
	
	public int getDimensao() {
		return percurso.size();
	}
	
	public double getCusto() {
		if (percurso.isEmpty()) {
			return 0;
		}
		return percurso.getLast().getCusto();
	}
	
	@Override
	public Iterator<PassoSolucao> iterator() {
		return percurso.iterator();
	}
	
	public void juntarInicio (No no) {
		percurso.addFirst(no);
	}

	
}

package project_java.tp2.PlaneadorTrajetos.pee.mecproc;

import java.util.Iterator;
import java.util.LinkedList;

import project_java.tp2.PlaneadorTrajetos.pee.PassoSolucao;
import project_java.tp2.PlaneadorTrajetos.pee.Solucao;

/**
 * Solução de um problema (sequência ordenada de nós)
 */
public class Percurso implements Solucao
{
	// Percurso de nós do estado inicial a um estado objectivo
	private LinkedList<PassoSolucao> percurso = new LinkedList<PassoSolucao>();

	@Override
	public Iterator<PassoSolucao> iterator() {
		return percurso.iterator();
	}
	
	@Override
	public int getDimensao() {
		return percurso.size();
	}
	
	@Override
	public double getCusto() {
		if(percurso.isEmpty())
			return 0;
		return percurso.getLast().getCusto();
	}
	
	/**
	 * Juntar nó no início da solução
	 * @param no	Nó a inserir
	 */
	public void juntarInicio(No no) {
		percurso.addFirst(no);		
	}
}

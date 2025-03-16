package project_java.tp2.PlaneadorTrajetos.pee.mecproc;

import java.util.Iterator;
import java.util.LinkedList;

import project_java.tp2.PlaneadorTrajetos.pee.PassoSolucao;
import project_java.tp2.PlaneadorTrajetos.pee.Solucao;

/**
 * Solu��o de um problema (sequ�ncia ordenada de n�s)
 */
public class Percurso implements Solucao
{
	// Percurso de n�s do estado inicial a um estado objectivo
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
	 * Juntar n� no in�cio da solu��o
	 * @param no	N� a inserir
	 */
	public void juntarInicio(No no) {
		percurso.addFirst(no);		
	}
}

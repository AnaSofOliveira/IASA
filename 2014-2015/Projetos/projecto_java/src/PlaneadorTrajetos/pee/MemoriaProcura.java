package PlaneadorTrajetos.pee;

import java.util.LinkedList;

public class MemoriaProcura {
	
	private LinkedList<No> fronteira = new LinkedList<No>();
	
	public void limpar() {
		fronteira.clear();
	}

	public void inserir(No no) {
		fronteira.add(no);		
	}

	public boolean fronteiraVazia() {
		return fronteira.isEmpty();
	}

	public No remover() {
		return fronteira.remove();
	}
	
	
}

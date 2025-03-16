package Puzzle.pee.mecproc;

import java.util.Iterator;
import java.util.LinkedList;

import Puzzle.pee.modprob.Estado;

public class Solucao<E extends Estado> implements Iterable<No<E>>{
	
	public LinkedList<No<E>> percurso;
	
	public Solucao() {
		percurso = new LinkedList<No<E>>();
	}
	
	public void juntarAoIncio(No<E> noTemp){
		percurso.addFirst(noTemp);
	} 
	
	public Iterator<No<E>> iterator(){
		return percurso.iterator();
	}
}

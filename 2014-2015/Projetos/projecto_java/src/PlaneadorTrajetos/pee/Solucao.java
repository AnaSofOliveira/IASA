package PlaneadorTrajetos.pee;

import java.util.Iterator;
import java.util.LinkedList;

public class Solucao implements Iterable<No>{
	
	public LinkedList<No> percurso;
	
	public Solucao() {
		percurso = new LinkedList<No>();
	}
	
	public void juntarAoIncio(No no){
		percurso.addFirst(no);
	} 
	
	public Iterator<No> iterator(){
		return percurso.iterator();
	}
}

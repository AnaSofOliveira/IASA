package pee.mecproc.mem;

import java.util.HashMap;
import java.util.Queue;

import pee.mecproc.No;
import pee.modprob.Estado;

public class MemoriaProcura {
	
	private int maxFront = 0;
	protected Queue<No> fronteira;
	protected HashMap<Estado, No> explorados = new HashMap<Estado, No>();
	
	public MemoriaProcura( Queue<No> fronteira){
		this.fronteira = fronteira;
	}
	
	public void limpar () {
		this.maxFront = 0;
		this.fronteira.clear();
		this.explorados.clear();
	}
	
	public void inserir( No no ) {
		// obter estado do n�
		Estado estado = no.getEstado();
		// Obter n� nos explorados que se refere ao estado acima
		No noMem = this.explorados.get(estado);
		
		//Se n� == null: insiro na fronteira e atualizo os explorados
		//Se custo n� < custo n� em mem: insiro na fronteira e atualizo os explorados
		
		// no tern�rio "Se n� em mem�ria for null ? passa condi��o : senao devolve resultado da condicao"
		if (noMem == null ? true : no.getCusto() < noMem.getCusto()) {
			this.fronteira.add(no); 
			this.explorados.put(estado, no);
			
			if(fronteira.size() > this.maxFront) {
				this.maxFront = fronteira.size();
			}
		}
	}
		
	public No remover() {
		return this.fronteira.poll();
		
	}

	public boolean fronteiraVazia() {
		return this.fronteira.isEmpty();
		
	}

	public int getMaxFront() {
		return maxFront;
	}

}

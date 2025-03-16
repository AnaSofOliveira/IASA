package Puzzle.pee.mecproc;

import Puzzle.pee.mecproc.mem.MemoriaProcura;
import Puzzle.pee.modprob.Estado;
import Puzzle.pee.modprob.Operador;
import Puzzle.pee.modprob.Problema;

public abstract class MecanismoProcura<E extends Estado, P extends Problema<E>>{
	
	private MemoriaProcura<E> memoriaProcura;
	protected P problema;
	public int nroExpacoes = 0;
	public int nroMaxFront = 0;
	
	public MecanismoProcura(){
		memoriaProcura = inserirMemoria();
	}
	
	protected abstract MemoriaProcura<E> inserirMemoria();

	public Solucao<E> procurar(P problema){
		return this.procurar(problema, Integer.MAX_VALUE); // Máximo valor possível de um inteiro
	}
	
	public Solucao<E> procurar(P problema, int maxProf){ 
		this.problema = problema;
		
		memoriaProcura.limpar();
		E estadoInicial = problema.getEstadoInicial();
		No<E> noInicial = new No<E>(estadoInicial);
		memoriaProcura.inserir(noInicial);
		
		while(!memoriaProcura.fronteiraVazia()){
			No<E> no = memoriaProcura.remover();
			E estado = no.getEstado();
			boolean resultado = problema.objectivo(estado); 
			
			if (resultado){
				return gerarSolucao(no);
			}else{
				if (no.getProfundidade() < maxProf)
					nroExpacoes += 1; // Expande +1 nó
					expandir(no);
			}
		}
		return null;
	}

	private void expandir(No<E> no) {
		
		E estado = no.getEstado();
		Operador<E>[] operadores = problema.getOperadores();
		
		for (Operador<E> operador : operadores){
			E estadoSuc = operador.aplicar(estado);
			
			if(estadoSuc != null){
				nroMaxFront += 1; // Expande +1 no sucessor do no atual
				No<E> noSuc = new No<E>(estadoSuc, operador, no);
				memoriaProcura.inserir(noSuc);
			}
		}
	}

	private Solucao<E> gerarSolucao(No<E> no) {
		
		Solucao<E> solucao = new Solucao<E>();
		E estado = no.getEstado();
		No<E> antecessor = no.getAntecessor();
		Operador<E> operador = no.getOperador();
		
		No<E> noTemp = new No<E>(estado, operador, antecessor);
		
		while(noTemp != null){
			solucao.juntarAoIncio(noTemp);
			
			noTemp = noTemp.getAntecessor();
		}
		
		return solucao;
	}
}

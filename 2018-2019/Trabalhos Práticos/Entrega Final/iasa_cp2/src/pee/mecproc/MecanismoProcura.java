package pee.mecproc;

import pee.Solucao;
import pee.mecproc.mem.MemoriaProcura;
import pee.modprob.Estado;
import pee.modprob.Operador;
import pee.modprob.Problema;

public abstract class MecanismoProcura <P extends Problema>{
	private MemoriaProcura memoriaProcura;
	protected P problema;
	protected int expandidos = 0;

	public MecanismoProcura() {
		this.memoriaProcura = iniciarMemoria();
	}
	
	
	protected abstract MemoriaProcura iniciarMemoria();
	
	
	public Solucao resolver( P problema ) {
		return this.resolver(problema, Integer.MAX_VALUE);
	}
	
	
	public Solucao resolver( P problema , int profMax) {
		this.problema = problema;
		this.memoriaProcura.limpar();
		
		No no_inicial = new No(this.problema.getEstadoInicial());
		this.memoriaProcura.inserir(no_inicial);
		
		while (!this.memoriaProcura.fronteiraVazia()) {
			No no = this.memoriaProcura.remover();
			
			if (this.problema.objectivo(no.getEstado())) {
				return gerarSolucao(no);
			}else {
				if(no.getProfundidade() < profMax) {
					expandir(no);
				}
			}
		}return null;
	}
	
	
	private void expandir( No no ) {
		Estado estado = no.getEstado();
		Operador[] operadores = this.problema.getOperadores();
		
		for (Operador operador : operadores) {
			Estado estadoSuc = operador.aplicar(estado);
			
			if (estadoSuc != null) {
				No noSuc = new No(estadoSuc, operador, no);
				this.memoriaProcura.inserir(noSuc);
			}
		}expandidos++;
		
	}
	
	
	private Solucao gerarSolucao( No noFinal ) {
		Percurso percurso = new Percurso();
		No no = noFinal;
		
		while (no != null) {
			percurso.juntarInicio(no);
			no = no.getAntecessor();
		}
		System.out.println("Max Fronteira: " + this.memoriaProcura.getMaxFront());
		System.out.println("Nós Expandidos: " + this.expandidos);
		return percurso;
	}
}

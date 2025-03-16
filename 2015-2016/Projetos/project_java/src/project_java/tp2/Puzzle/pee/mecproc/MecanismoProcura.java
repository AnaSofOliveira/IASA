package project_java.tp2.Puzzle.pee.mecproc;

import project_java.tp2.Puzzle.pee.Solucao;
import project_java.tp2.Puzzle.pee.mecproc.mem.MemoriaProcura;
import project_java.tp2.Puzzle.pee.modprob.Estado;
import project_java.tp2.Puzzle.pee.modprob.Operador;
import project_java.tp2.Puzzle.pee.modprob.Problema;

/**
 * Mecanismo de procura em espaços de estados
 */
public abstract class MecanismoProcura<P extends Problema>
{
	/** Memória de procura (definição geral) */
	private MemoriaProcura memoriaProcura;
	/** Problema associado à procura */
	protected P problema;
	
	public MemoriaProcura getMemoriaProcura() {
		return memoriaProcura;
	}

	/**
	 * Construtor
	 */
	public MecanismoProcura() {
		memoriaProcura = iniciarMemoria();
	}

    /**
     * Iniciar memória de procura
     * @return	Memória de procura
     */
    protected abstract MemoriaProcura iniciarMemoria();

	/**
	 * Procurar solução com limite de profundidade
	 * @param problema	Problema a resolver
	 * @param profMax	Profundidade máxima da procura
	 * @return			Solução
	 */
	public Solucao resolver(P problema, int profMax) {
		this.problema = problema;
	    memoriaProcura.limpar();
        No noInicial = new No(problema.getEstadoInicial());
        memoriaProcura.inserir(noInicial);
        while(!memoriaProcura.fronteiraVazia()) {
            No no = memoriaProcura.remover();
            if(problema.objectivo(no.getEstado()))
                return gerarSolucao(no);
            else {
            	if(no.getProfundidade() < profMax)
            		expandir(no);
            }
        }
        return null;
    }    

	/**
	 * Procurar solução
	 * @param problema	Problema a resolver
	 * @return			Solução
	 */
	public Solucao resolver(P problema) {
    	return resolver(problema, Integer.MAX_VALUE);
    }

	/**
	 * Expandir nó por aplicação dos operadores definidos no problema
	 * @param no	Nó a expandir
	 */
	private void expandir(No no) {
		Estado estado = no.getEstado();
        for(Operador operador : problema.getOperadores()) {
        	Estado estadoSuc = operador.aplicar(estado);
            if(estadoSuc != null) { 
        		No noSuc = new No(estadoSuc, operador, no);
        		memoriaProcura.inserir(noSuc);
            }
        }
    }

	/**
	 * Gerar solução do nó inicial até ao nó final
	 * @param no_final	Nó final da solução
	 * @return			Solução
	 */
	private Solucao gerarSolucao(No noFinal) {
		Percurso percurso = new Percurso();
        No no = noFinal;
        while(no != null){
        	percurso.juntarInicio(no);
            no = no.getAntecessor();
        }
        return percurso;
	}
}

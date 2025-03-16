package project_java.tp2.Puzzle.pee.mecproc;

import project_java.tp2.Puzzle.pee.Solucao;
import project_java.tp2.Puzzle.pee.mecproc.mem.MemoriaProcura;
import project_java.tp2.Puzzle.pee.modprob.Estado;
import project_java.tp2.Puzzle.pee.modprob.Operador;
import project_java.tp2.Puzzle.pee.modprob.Problema;

/**
 * Mecanismo de procura em espa�os de estados
 */
public abstract class MecanismoProcura<P extends Problema>
{
	/** Mem�ria de procura (defini��o geral) */
	private MemoriaProcura memoriaProcura;
	/** Problema associado � procura */
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
     * Iniciar mem�ria de procura
     * @return	Mem�ria de procura
     */
    protected abstract MemoriaProcura iniciarMemoria();

	/**
	 * Procurar solu��o com limite de profundidade
	 * @param problema	Problema a resolver
	 * @param profMax	Profundidade m�xima da procura
	 * @return			Solu��o
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
	 * Procurar solu��o
	 * @param problema	Problema a resolver
	 * @return			Solu��o
	 */
	public Solucao resolver(P problema) {
    	return resolver(problema, Integer.MAX_VALUE);
    }

	/**
	 * Expandir n� por aplica��o dos operadores definidos no problema
	 * @param no	N� a expandir
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
	 * Gerar solu��o do n� inicial at� ao n� final
	 * @param no_final	N� final da solu��o
	 * @return			Solu��o
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
